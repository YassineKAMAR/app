package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class sb2 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ kb2 f14595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ qy2 f14596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ey2 f14597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ye1 f14598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ tb2 f14599e;

    sb2(tb2 tb2Var, kb2 kb2Var, qy2 qy2Var, ey2 ey2Var, ye1 ye1Var) {
        this.f14599e = tb2Var;
        this.f14595a = kb2Var;
        this.f14596b = qy2Var;
        this.f14597c = ey2Var;
        this.f14598d = ye1Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        qy2 qy2Var;
        final h2.z2 z2VarA = this.f14598d.a().a(th);
        this.f14598d.b().A(z2VarA);
        this.f14599e.f15043b.c().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.rb2
            @Override // java.lang.Runnable
            public final void run() {
                this.f14034a.f14599e.f15045d.a().A(z2VarA);
            }
        });
        pt2.b(z2VarA.f22383a, th, "NativeAdLoader.onFailure");
        this.f14595a.j();
        if (((Boolean) bu.f6041c.e()).booleanValue() && (qy2Var = this.f14596b) != null) {
            qy2Var.c(z2VarA);
            ey2 ey2Var = this.f14597c;
            ey2Var.E0(th);
            ey2Var.C0(false);
            qy2Var.a(ey2Var);
            qy2Var.g();
            return;
        }
        tb2 tb2Var = this.f14599e;
        ey2 ey2Var2 = this.f14597c;
        ty2 ty2Var = tb2Var.f15046e;
        ey2Var2.w(z2VarA);
        ey2Var2.E0(th);
        ey2Var2.C0(false);
        ty2Var.b(ey2Var2.u());
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        qy2 qy2Var;
        nz0 nz0Var = (nz0) obj;
        synchronized (this.f14599e) {
            nz0Var.e().a(this.f14599e.f15045d.d());
            this.f14595a.b(nz0Var);
            this.f14599e.f15043b.c().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qb2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13389a.f14599e.f15045d.b().B();
                }
            });
            if (!((Boolean) bu.f6041c.e()).booleanValue() || (qy2Var = this.f14596b) == null) {
                ty2 ty2Var = this.f14599e.f15046e;
                ey2 ey2Var = this.f14597c;
                ey2Var.D0(nz0Var.g().f10323b);
                ey2Var.h(nz0Var.c().q());
                ey2Var.C0(true);
                ty2Var.b(ey2Var.u());
            } else {
                qy2Var.f(nz0Var.g().f10323b);
                qy2Var.e(nz0Var.c().q());
                ey2 ey2Var2 = this.f14597c;
                ey2Var2.C0(true);
                qy2Var.a(ey2Var2);
                qy2Var.g();
            }
        }
    }
}
