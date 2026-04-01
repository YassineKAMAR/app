package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class gr2 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ kb2 f8468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ qy2 f8469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ey2 f8470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ir2 f8471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ jr2 f8472e;

    gr2(jr2 jr2Var, kb2 kb2Var, qy2 qy2Var, ey2 ey2Var, ir2 ir2Var) {
        this.f8472e = jr2Var;
        this.f8468a = kb2Var;
        this.f8469b = qy2Var;
        this.f8470c = ey2Var;
        this.f8471d = ir2Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        qy2 qy2Var;
        pm1 pm1Var = (pm1) this.f8472e.f9767e.p();
        final h2.z2 z2VarB = pm1Var == null ? vt2.b(th, null) : pm1Var.k().a(th);
        synchronized (this.f8472e) {
            if (pm1Var != null) {
                pm1Var.a().A(z2VarB);
                this.f8472e.f9764b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.dr2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6875a.f8472e.f9766d.A(z2VarB);
                    }
                });
            } else {
                this.f8472e.f9766d.A(z2VarB);
                this.f8472e.k(this.f8471d).o().k().c().o();
            }
            pt2.b(z2VarB.f22383a, th, "RewardedAdLoader.onFailure");
            this.f8468a.j();
            if (!((Boolean) bu.f6041c.e()).booleanValue() || (qy2Var = this.f8469b) == null) {
                ty2 ty2Var = this.f8472e.f9769g;
                ey2 ey2Var = this.f8470c;
                ey2Var.w(z2VarB);
                ey2Var.E0(th);
                ey2Var.C0(false);
                ty2Var.b(ey2Var.u());
            } else {
                qy2Var.c(z2VarB);
                ey2 ey2Var2 = this.f8470c;
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
        jm1 jm1Var = (jm1) obj;
        synchronized (this.f8472e) {
            jm1Var.e().d(this.f8472e.f9766d);
            this.f8468a.b(jm1Var);
            jr2 jr2Var = this.f8472e;
            Executor executor = jr2Var.f9764b;
            final yq2 yq2Var = jr2Var.f9766d;
            yq2Var.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.fr2
                @Override // java.lang.Runnable
                public final void run() {
                    yq2Var.B();
                }
            });
            this.f8472e.f9766d.h();
            if (!((Boolean) bu.f6041c.e()).booleanValue() || (qy2Var = this.f8469b) == null) {
                ty2 ty2Var = this.f8472e.f9769g;
                ey2 ey2Var = this.f8470c;
                ey2Var.D0(jm1Var.g().f10323b);
                ey2Var.h(jm1Var.c().q());
                ey2Var.C0(true);
                ty2Var.b(ey2Var.u());
            } else {
                qy2Var.f(jm1Var.g().f10323b);
                qy2Var.e(jm1Var.c().q());
                ey2 ey2Var2 = this.f8470c;
                ey2Var2.C0(true);
                qy2Var.a(ey2Var2);
                qy2Var.g();
            }
        }
    }
}
