package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class d30 implements lh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ m30 f6550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ey2 f6551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ n30 f6552c;

    d30(n30 n30Var, m30 m30Var, ey2 ey2Var) {
        this.f6552c = n30Var;
        this.f6550a = m30Var;
        this.f6551b = ey2Var;
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final void j() {
        synchronized (this.f6552c.f11649a) {
            this.f6552c.f11657i = 1;
            j2.v1.k("Failed loading new engine. Marking new engine destroyable.");
            this.f6550a.g();
            if (((Boolean) bu.f6042d.e()).booleanValue()) {
                n30 n30Var = this.f6552c;
                if (n30Var.f11653e != null) {
                    ty2 ty2Var = n30Var.f11653e;
                    ey2 ey2Var = this.f6551b;
                    ey2Var.e("Failed loading new engine");
                    ey2Var.C0(false);
                    ty2Var.b(ey2Var.u());
                }
            }
        }
    }
}
