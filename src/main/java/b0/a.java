package b0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import b0.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f3254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f3255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Cursor f3256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f3257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f3258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected C0054a f3259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected DataSetObserver f3260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected b0.b f3261h;

    /* JADX INFO: renamed from: b0.a$a, reason: collision with other inner class name */
    private class C0054a extends ContentObserver {
        C0054a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z7) {
            a.this.h();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f3254a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f3254a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z7) {
        e(context, cursor, z7 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor cursorI = i(cursor);
        if (cursorI != null) {
            cursorI.close();
        }
    }

    @Override // b0.b.a
    public Cursor b() {
        return this.f3256c;
    }

    public abstract CharSequence convertToString(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    void e(Context context, Cursor cursor, int i8) {
        b bVar;
        if ((i8 & 1) == 1) {
            i8 |= 2;
            this.f3255b = true;
        } else {
            this.f3255b = false;
        }
        boolean z7 = cursor != null;
        this.f3256c = cursor;
        this.f3254a = z7;
        this.f3257d = context;
        this.f3258e = z7 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i8 & 2) == 2) {
            this.f3259f = new C0054a();
            bVar = new b();
        } else {
            bVar = null;
            this.f3259f = null;
        }
        this.f3260g = bVar;
        if (z7) {
            C0054a c0054a = this.f3259f;
            if (c0054a != null) {
                cursor.registerContentObserver(c0054a);
            }
            DataSetObserver dataSetObserver = this.f3260g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f3254a || (cursor = this.f3256c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i8, View view, ViewGroup viewGroup) {
        if (!this.f3254a) {
            return null;
        }
        this.f3256c.moveToPosition(i8);
        if (view == null) {
            view = f(this.f3257d, this.f3256c, viewGroup);
        }
        d(view, this.f3257d, this.f3256c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f3261h == null) {
            this.f3261h = new b0.b(this);
        }
        return this.f3261h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i8) {
        Cursor cursor;
        if (!this.f3254a || (cursor = this.f3256c) == null) {
            return null;
        }
        cursor.moveToPosition(i8);
        return this.f3256c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        Cursor cursor;
        if (this.f3254a && (cursor = this.f3256c) != null && cursor.moveToPosition(i8)) {
            return this.f3256c.getLong(this.f3258e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        if (!this.f3254a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f3256c.moveToPosition(i8)) {
            if (view == null) {
                view = g(this.f3257d, this.f3256c, viewGroup);
            }
            d(view, this.f3257d, this.f3256c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i8);
    }

    protected void h() {
        Cursor cursor;
        if (!this.f3255b || (cursor = this.f3256c) == null || cursor.isClosed()) {
            return;
        }
        this.f3254a = this.f3256c.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f3256c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0054a c0054a = this.f3259f;
            if (c0054a != null) {
                cursor2.unregisterContentObserver(c0054a);
            }
            DataSetObserver dataSetObserver = this.f3260g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3256c = cursor;
        if (cursor != null) {
            C0054a c0054a2 = this.f3259f;
            if (c0054a2 != null) {
                cursor.registerContentObserver(c0054a2);
            }
            DataSetObserver dataSetObserver2 = this.f3260g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f3258e = cursor.getColumnIndexOrThrow("_id");
            this.f3254a = true;
            notifyDataSetChanged();
        } else {
            this.f3258e = -1;
            this.f3254a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
