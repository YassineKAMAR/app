package z2;

import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes.dex */
final class f0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f27706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f27707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ g0 f27708c;

    f0(g0 g0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f27708c = g0Var;
        this.f27706a = lifecycleCallback;
        this.f27707b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g0 g0Var = this.f27708c;
        if (g0Var.f27723m0 > 0) {
            this.f27706a.f(g0Var.f27724n0 != null ? g0Var.f27724n0.getBundle(this.f27707b) : null);
        }
        if (this.f27708c.f27723m0 >= 2) {
            this.f27706a.j();
        }
        if (this.f27708c.f27723m0 >= 3) {
            this.f27706a.h();
        }
        if (this.f27708c.f27723m0 >= 4) {
            this.f27706a.k();
        }
        if (this.f27708c.f27723m0 >= 5) {
            this.f27706a.g();
        }
    }
}
