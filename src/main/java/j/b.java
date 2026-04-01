package j;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f23810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23811b;

    public interface a {
        boolean a(b bVar, Menu menu);

        void b(b bVar);

        boolean c(b bVar, MenuItem menuItem);

        boolean d(b bVar, Menu menu);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f23810a;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f23811b;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i8);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f23810a = obj;
    }

    public abstract void q(int i8);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z7) {
        this.f23811b = z7;
    }
}
