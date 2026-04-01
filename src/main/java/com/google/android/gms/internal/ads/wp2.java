package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class wp2 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ kb2 f16845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ qy2 f16846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ey2 f16847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ce1 f16848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ xp2 f16849e;

    wp2(xp2 xp2Var, kb2 kb2Var, qy2 qy2Var, ey2 ey2Var, ce1 ce1Var) {
        this.f16849e = xp2Var;
        this.f16845a = kb2Var;
        this.f16846b = qy2Var;
        this.f16847c = ey2Var;
        this.f16848d = ce1Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        qy2 qy2Var;
        final h2.z2 z2VarA = this.f16848d.a().a(th);
        synchronized (this.f16849e) {
            this.f16849e.f17423i = null;
            this.f16848d.b().A(z2VarA);
            if (((Boolean) h2.y.c().b(ns.W7)).booleanValue()) {
                this.f16849e.f17416b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.sp2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f14782a.f16849e.f17418d.A(z2VarA);
                    }
                });
                this.f16849e.f17416b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.tp2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15211a.f16849e.f17419e.A(z2VarA);
                    }
                });
            }
            pt2.b(z2VarA.f22383a, th, "InterstitialAdLoader.onFailure");
            this.f16845a.j();
            if (!((Boolean) bu.f6041c.e()).booleanValue() || (qy2Var = this.f16846b) == null) {
                ty2 ty2Var = this.f16849e.f17421g;
                ey2 ey2Var = this.f16847c;
                ey2Var.w(z2VarA);
                ey2Var.E0(th);
                ey2Var.C0(false);
                ty2Var.b(ey2Var.u());
            } else {
                qy2Var.c(z2VarA);
                ey2 ey2Var2 = this.f16847c;
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
        ad1 ad1Var = (ad1) obj;
        synchronized (this.f16849e) {
            this.f16849e.f17423i = null;
            fs fsVar = ns.W7;
            if (((Boolean) h2.y.c().b(fsVar)).booleanValue()) {
                q81 q81VarE = ad1Var.e();
                q81VarE.a(this.f16849e.f17418d);
                q81VarE.d(this.f16849e.f17419e);
            }
            this.f16845a.b(ad1Var);
            if (((Boolean) h2.y.c().b(fsVar)).booleanValue()) {
                this.f16849e.f17416b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.up2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15795a.f16849e.f17418d.B();
                    }
                });
                this.f16849e.f17416b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.vp2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16410a.f16849e.f17419e.B();
                    }
                });
            }
            if (!((Boolean) bu.f6041c.e()).booleanValue() || (qy2Var = this.f16846b) == null) {
                ty2 ty2Var = this.f16849e.f17421g;
                ey2 ey2Var = this.f16847c;
                ey2Var.D0(ad1Var.g().f10323b);
                ey2Var.h(ad1Var.c().q());
                ey2Var.C0(true);
                ty2Var.b(ey2Var.u());
            } else {
                qy2Var.f(ad1Var.g().f10323b);
                qy2Var.e(ad1Var.c().q());
                ey2 ey2Var2 = this.f16847c;
                ey2Var2.C0(true);
                qy2Var.a(ey2Var2);
                qy2Var.g();
            }
        }
    }
}
