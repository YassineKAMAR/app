package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LayoutInflater f520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ExpandedMenuView f522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j.a f526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    a f527i;

    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f528a = -1;

        public a() {
            a();
        }

        void a() {
            g gVarV = c.this.f521c.v();
            if (gVarV != null) {
                ArrayList<g> arrayListZ = c.this.f521c.z();
                int size = arrayListZ.size();
                for (int i8 = 0; i8 < size; i8++) {
                    if (arrayListZ.get(i8) == gVarV) {
                        this.f528a = i8;
                        return;
                    }
                }
            }
            this.f528a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i8) {
            ArrayList<g> arrayListZ = c.this.f521c.z();
            int i9 = i8 + c.this.f523e;
            int i10 = this.f528a;
            if (i10 >= 0 && i9 >= i10) {
                i9++;
            }
            return arrayListZ.get(i9);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f521c.z().size() - c.this.f523e;
            return this.f528a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return i8;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f520b.inflate(cVar.f525g, viewGroup, false);
            }
            ((k.a) view).d(getItem(i8), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(int i8, int i9) {
        this.f525g = i8;
        this.f524f = i9;
    }

    public c(Context context, int i8) {
        this(i8, 0);
        this.f519a = context;
        this.f520b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f527i == null) {
            this.f527i = new a();
        }
        return this.f527i;
    }

    public k b(ViewGroup viewGroup) {
        if (this.f522d == null) {
            this.f522d = (ExpandedMenuView) this.f520b.inflate(e.g.f21192g, viewGroup, false);
            if (this.f527i == null) {
                this.f527i = new a();
            }
            this.f522d.setAdapter((ListAdapter) this.f527i);
            this.f522d.setOnItemClickListener(this);
        }
        return this.f522d;
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z7) {
        j.a aVar = this.f526h;
        if (aVar != null) {
            aVar.c(eVar, z7);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z7) {
        a aVar = this.f527i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f526h = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(android.content.Context r3, androidx.appcompat.view.menu.e r4) {
        /*
            r2 = this;
            int r0 = r2.f524f
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f524f
            r0.<init>(r3, r1)
            r2.f519a = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f520b = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f519a
            if (r0 == 0) goto L23
            r2.f519a = r3
            android.view.LayoutInflater r0 = r2.f520b
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f521c = r4
            androidx.appcompat.view.menu.c$a r3 = r2.f527i
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.c.i(android.content.Context, androidx.appcompat.view.menu.e):void");
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).b(null);
        j.a aVar = this.f526h;
        if (aVar == null) {
            return true;
        }
        aVar.d(mVar);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
        this.f521c.M(this.f527i.getItem(i8), this, 0);
    }
}
