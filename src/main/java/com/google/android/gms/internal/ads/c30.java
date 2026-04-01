package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class c30 implements nh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ m30 f6121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ey2 f6122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ n30 f6123c;

    c30(n30 n30Var, m30 m30Var, ey2 ey2Var) {
        this.f6123c = n30Var;
        this.f6121a = m30Var;
        this.f6122b = ey2Var;
    }

    @Override // com.google.android.gms.internal.ads.nh0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        synchronized (this.f6123c.f11649a) {
            this.f6123c.f11657i = 0;
            n30 n30Var = this.f6123c;
            if (n30Var.f11656h != null && this.f6121a != n30Var.f11656h) {
                j2.v1.k("New JS engine is loaded, marking previous one as destroyable.");
                this.f6123c.f11656h.g();
            }
            this.f6123c.f11656h = this.f6121a;
            if (((Boolean) bu.f6042d.e()).booleanValue()) {
                n30 n30Var2 = this.f6123c;
                if (n30Var2.f11653e != null) {
                    ty2 ty2Var = n30Var2.f11653e;
                    ey2 ey2Var = this.f6122b;
                    ey2Var.C0(true);
                    ty2Var.b(ey2Var.u());
                }
            }
        }
    }
}
