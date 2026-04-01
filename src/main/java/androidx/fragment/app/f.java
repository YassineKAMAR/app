package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.a0;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<?> f2430a;

    private f(h<?> hVar) {
        this.f2430a = hVar;
    }

    public static f b(h<?> hVar) {
        return new f((h) androidx.core.util.f.c(hVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        h<?> hVar = this.f2430a;
        hVar.f2436e.o(hVar, hVar, fragment);
    }

    public void c() {
        this.f2430a.f2436e.x();
    }

    public void d(Configuration configuration) {
        this.f2430a.f2436e.y(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f2430a.f2436e.z(menuItem);
    }

    public void f() {
        this.f2430a.f2436e.A();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f2430a.f2436e.B(menu, menuInflater);
    }

    public void h() {
        this.f2430a.f2436e.C();
    }

    public void i() {
        this.f2430a.f2436e.E();
    }

    public void j(boolean z7) {
        this.f2430a.f2436e.F(z7);
    }

    public boolean k(MenuItem menuItem) {
        return this.f2430a.f2436e.U(menuItem);
    }

    public void l(Menu menu) {
        this.f2430a.f2436e.V(menu);
    }

    public void m() {
        this.f2430a.f2436e.X();
    }

    public void n(boolean z7) {
        this.f2430a.f2436e.Y(z7);
    }

    public boolean o(Menu menu) {
        return this.f2430a.f2436e.Z(menu);
    }

    public void p() {
        this.f2430a.f2436e.b0();
    }

    public void q() {
        this.f2430a.f2436e.c0();
    }

    public void r() {
        this.f2430a.f2436e.e0();
    }

    public boolean s() {
        return this.f2430a.f2436e.k0();
    }

    public Fragment t(String str) {
        return this.f2430a.f2436e.p0(str);
    }

    public i u() {
        return this.f2430a.f2436e;
    }

    public void v() {
        this.f2430a.f2436e.R0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2430a.f2436e.onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        h<?> hVar = this.f2430a;
        if (!(hVar instanceof a0)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        hVar.f2436e.b1(parcelable);
    }

    public Parcelable y() {
        return this.f2430a.f2436e.d1();
    }
}
