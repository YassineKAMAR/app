package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f2174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0029b f2175c;

    public interface a {
    }

    /* JADX INFO: renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0029b {
        void onActionProviderVisibilityChanged(boolean z7);
    }

    public b(Context context) {
        this.f2173a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f2175c = null;
        this.f2174b = null;
    }

    public void i(a aVar) {
        this.f2174b = aVar;
    }

    public void j(InterfaceC0029b interfaceC0029b) {
        if (this.f2175c != null && interfaceC0029b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2175c = interfaceC0029b;
    }
}
