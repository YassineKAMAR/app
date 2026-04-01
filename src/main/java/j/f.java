package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import j.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f23824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f23825b;

    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f23826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f23827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList<f> f23828c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final p.h<Menu, Menu> f23829d = new p.h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f23827b = context;
            this.f23826a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f23829d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            k.d dVar = new k.d(this.f23827b, (x.a) menu);
            this.f23829d.put(menu, dVar);
            return dVar;
        }

        @Override // j.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f23826a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // j.b.a
        public void b(b bVar) {
            this.f23826a.onDestroyActionMode(e(bVar));
        }

        @Override // j.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f23826a.onActionItemClicked(e(bVar), new k.c(this.f23827b, (x.b) menuItem));
        }

        @Override // j.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f23826a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f23828c.size();
            for (int i8 = 0; i8 < size; i8++) {
                f fVar = this.f23828c.get(i8);
                if (fVar != null && fVar.f23825b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f23827b, bVar);
            this.f23828c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f23824a = context;
        this.f23825b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f23825b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f23825b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new k.d(this.f23824a, (x.a) this.f23825b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f23825b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f23825b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f23825b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f23825b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f23825b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f23825b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f23825b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f23825b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i8) {
        this.f23825b.n(i8);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f23825b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f23825b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i8) {
        this.f23825b.q(i8);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f23825b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z7) {
        this.f23825b.s(z7);
    }
}
