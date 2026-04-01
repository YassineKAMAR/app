package j;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import j.b;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends b implements e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f23817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ActionBarContextView f23818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b.a f23819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference<View> f23820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f23823i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z7) {
        this.f23817c = context;
        this.f23818d = actionBarContextView;
        this.f23819e = aVar;
        androidx.appcompat.view.menu.e eVarS = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.f23823i = eVarS;
        eVarS.R(this);
        this.f23822h = z7;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f23819e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f23818d.l();
    }

    @Override // j.b
    public void c() {
        if (this.f23821g) {
            return;
        }
        this.f23821g = true;
        this.f23818d.sendAccessibilityEvent(32);
        this.f23819e.b(this);
    }

    @Override // j.b
    public View d() {
        WeakReference<View> weakReference = this.f23820f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // j.b
    public Menu e() {
        return this.f23823i;
    }

    @Override // j.b
    public MenuInflater f() {
        return new g(this.f23818d.getContext());
    }

    @Override // j.b
    public CharSequence g() {
        return this.f23818d.getSubtitle();
    }

    @Override // j.b
    public CharSequence i() {
        return this.f23818d.getTitle();
    }

    @Override // j.b
    public void k() {
        this.f23819e.d(this, this.f23823i);
    }

    @Override // j.b
    public boolean l() {
        return this.f23818d.j();
    }

    @Override // j.b
    public void m(View view) {
        this.f23818d.setCustomView(view);
        this.f23820f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // j.b
    public void n(int i8) {
        o(this.f23817c.getString(i8));
    }

    @Override // j.b
    public void o(CharSequence charSequence) {
        this.f23818d.setSubtitle(charSequence);
    }

    @Override // j.b
    public void q(int i8) {
        r(this.f23817c.getString(i8));
    }

    @Override // j.b
    public void r(CharSequence charSequence) {
        this.f23818d.setTitle(charSequence);
    }

    @Override // j.b
    public void s(boolean z7) {
        super.s(z7);
        this.f23818d.setTitleOptional(z7);
    }
}
