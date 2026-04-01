package z2;

import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes.dex */
final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f27697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f27698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ e0 f27699c;

    d0(e0 e0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f27699c = e0Var;
        this.f27697a = lifecycleCallback;
        this.f27698b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0 e0Var = this.f27699c;
        if (e0Var.f27702b > 0) {
            this.f27697a.f(e0Var.f27703c != null ? e0Var.f27703c.getBundle(this.f27698b) : null);
        }
        if (this.f27699c.f27702b >= 2) {
            this.f27697a.j();
        }
        if (this.f27699c.f27702b >= 3) {
            this.f27697a.h();
        }
        if (this.f27699c.f27702b >= 4) {
            this.f27697a.k();
        }
        if (this.f27699c.f27702b >= 5) {
            this.f27697a.g();
        }
    }
}
