package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p.h;

/* JADX INFO: loaded from: classes.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f24157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h<x.b, MenuItem> f24158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h<x.c, SubMenu> f24159c;

    b(Context context) {
        this.f24157a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof x.b)) {
            return menuItem;
        }
        x.b bVar = (x.b) menuItem;
        if (this.f24158b == null) {
            this.f24158b = new h<>();
        }
        MenuItem menuItem2 = this.f24158b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f24157a, bVar);
        this.f24158b.put(bVar, cVar);
        return cVar;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof x.c)) {
            return subMenu;
        }
        x.c cVar = (x.c) subMenu;
        if (this.f24159c == null) {
            this.f24159c = new h<>();
        }
        SubMenu subMenu2 = this.f24159c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        f fVar = new f(this.f24157a, cVar);
        this.f24159c.put(cVar, fVar);
        return fVar;
    }

    final void e() {
        h<x.b, MenuItem> hVar = this.f24158b;
        if (hVar != null) {
            hVar.clear();
        }
        h<x.c, SubMenu> hVar2 = this.f24159c;
        if (hVar2 != null) {
            hVar2.clear();
        }
    }

    final void f(int i8) {
        if (this.f24158b == null) {
            return;
        }
        int i9 = 0;
        while (i9 < this.f24158b.size()) {
            if (this.f24158b.j(i9).getGroupId() == i8) {
                this.f24158b.l(i9);
                i9--;
            }
            i9++;
        }
    }

    final void g(int i8) {
        if (this.f24158b == null) {
            return;
        }
        for (int i9 = 0; i9 < this.f24158b.size(); i9++) {
            if (this.f24158b.j(i9).getItemId() == i8) {
                this.f24158b.l(i9);
                return;
            }
        }
    }
}
