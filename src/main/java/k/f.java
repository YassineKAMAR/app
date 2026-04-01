package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class f extends d implements SubMenu {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x.c f24172e;

    f(Context context, x.c cVar) {
        super(context, cVar);
        this.f24172e = cVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f24172e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return c(this.f24172e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i8) {
        this.f24172e.setHeaderIcon(i8);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f24172e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i8) {
        this.f24172e.setHeaderTitle(i8);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f24172e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f24172e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i8) {
        this.f24172e.setIcon(i8);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f24172e.setIcon(drawable);
        return this;
    }
}
