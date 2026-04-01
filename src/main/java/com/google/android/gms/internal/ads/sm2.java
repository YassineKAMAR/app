package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class sm2 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ kb2 f14765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ qy2 f14766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ey2 f14767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ um2 f14768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ vm2 f14769e;

    sm2(vm2 vm2Var, kb2 kb2Var, qy2 qy2Var, ey2 ey2Var, um2 um2Var) {
        this.f14769e = vm2Var;
        this.f14765a = kb2Var;
        this.f14766b = qy2Var;
        this.f14767c = ey2Var;
        this.f14768d = um2Var;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.m31, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        qy2 qy2Var;
        tw0 tw0Var = (tw0) this.f14769e.f16360e.p();
        final h2.z2 z2VarB = tw0Var == null ? vt2.b(th, null) : tw0Var.k().a(th);
        synchronized (this.f14769e) {
            this.f14769e.f16365j = null;
            if (tw0Var != null) {
                tw0Var.l().A(z2VarB);
                if (((Boolean) h2.y.c().b(ns.V7)).booleanValue()) {
                    this.f14769e.f16357b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.rm2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f14225a.f14769e.f16359d.A(z2VarB);
                        }
                    });
                }
            } else {
                this.f14769e.f16359d.A(z2VarB);
                this.f14769e.m(this.f14768d).o().k().c().o();
            }
            pt2.b(z2VarB.f22383a, th, "AppOpenAdLoader.onFailure");
            this.f14765a.j();
            if (!((Boolean) bu.f6041c.e()).booleanValue() || (qy2Var = this.f14766b) == null) {
                ty2 ty2Var = this.f14769e.f16363h;
                ey2 ey2Var = this.f14767c;
                ey2Var.w(z2VarB);
                ey2Var.E0(th);
                ey2Var.C0(false);
                ty2Var.b(ey2Var.u());
            } else {
                qy2Var.c(z2VarB);
                ey2 ey2Var2 = this.f14767c;
                ey2Var2.E0(th);
                ey2Var2.C0(false);
                qy2Var.a(ey2Var2);
                qy2Var.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        qy2 qy2Var;
        nz0 nz0Var = (nz0) obj;
        synchronized (this.f14769e) {
            this.f14769e.f16365j = null;
            if (((Boolean) h2.y.c().b(ns.V7)).booleanValue()) {
                nz0Var.e().b(this.f14769e.f16359d);
            }
            this.f14765a.b(nz0Var);
            if (!((Boolean) bu.f6041c.e()).booleanValue() || (qy2Var = this.f14766b) == null) {
                ty2 ty2Var = this.f14769e.f16363h;
                ey2 ey2Var = this.f14767c;
                ey2Var.D0(nz0Var.g().f10323b);
                ey2Var.h(nz0Var.c().q());
                ey2Var.C0(true);
                ty2Var.b(ey2Var.u());
            } else {
                qy2Var.f(nz0Var.g().f10323b);
                qy2Var.e(nz0Var.c().q());
                ey2 ey2Var2 = this.f14767c;
                ey2Var2.C0(true);
                qy2Var.a(ey2Var2);
                qy2Var.g();
            }
        }
    }
}
