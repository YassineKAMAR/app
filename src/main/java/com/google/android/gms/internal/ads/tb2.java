package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class tb2 implements mb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rs2 f15042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bo0 f15043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f15044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ib2 f15045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ty2 f15046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c01 f15047f;

    public tb2(bo0 bo0Var, Context context, ib2 ib2Var, rs2 rs2Var) {
        this.f15043b = bo0Var;
        this.f15044c = context;
        this.f15045d = ib2Var;
        this.f15042a = rs2Var;
        this.f15046e = bo0Var.D();
        rs2Var.L(ib2Var.d());
    }

    @Override // com.google.android.gms.internal.ads.mb2
    public final boolean a(h2.r4 r4Var, String str, jb2 jb2Var, kb2 kb2Var) {
        qy2 qy2Var;
        Executor executorC;
        Runnable runnable;
        g2.t.r();
        if (j2.k2.g(this.f15044c) && r4Var.f22270s == null) {
            qg0.d("Failed to load the ad because app ID is missing.");
            executorC = this.f15043b.c();
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.ob2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12438a.e();
                }
            };
        } else {
            if (str != null) {
                pt2.a(this.f15044c, r4Var.f22257f);
                if (((Boolean) h2.y.c().b(ns.F8)).booleanValue() && r4Var.f22257f) {
                    this.f15043b.p().n(true);
                }
                int i8 = ((nb2) jb2Var).f11809a;
                rs2 rs2Var = this.f15042a;
                rs2Var.e(r4Var);
                rs2Var.Q(i8);
                Context context = this.f15044c;
                ts2 ts2VarG = rs2Var.g();
                ey2 ey2VarB = dy2.b(context, py2.f(ts2VarG), 8, r4Var);
                h2.a1 a1Var = ts2VarG.f15312n;
                if (a1Var != null) {
                    this.f15045d.d().G(a1Var);
                }
                xe1 xe1VarM = this.f15043b.m();
                n31 n31Var = new n31();
                n31Var.e(this.f15044c);
                n31Var.i(ts2VarG);
                xe1VarM.t(n31Var.j());
                ca1 ca1Var = new ca1();
                ca1Var.n(this.f15045d.d(), this.f15043b.c());
                xe1VarM.l(ca1Var.q());
                xe1VarM.c(this.f15045d.c());
                xe1VarM.b(new gx0(null));
                ye1 ye1VarQ = xe1VarM.q();
                if (((Boolean) bu.f6041c.e()).booleanValue()) {
                    qy2 qy2VarE = ye1VarQ.e();
                    qy2VarE.h(8);
                    qy2VarE.b(r4Var.f22267p);
                    qy2Var = qy2VarE;
                } else {
                    qy2Var = null;
                }
                this.f15043b.B().c(1);
                lg3 lg3Var = eh0.f7322a;
                r84.b(lg3Var);
                ScheduledExecutorService scheduledExecutorServiceD = this.f15043b.d();
                w01 w01VarA = ye1VarQ.a();
                c01 c01Var = new c01(lg3Var, scheduledExecutorServiceD, w01VarA.i(w01VarA.j()));
                this.f15047f = c01Var;
                c01Var.e(new sb2(this, kb2Var, qy2Var, ey2VarB, ye1VarQ));
                return true;
            }
            qg0.d("Ad unit ID should not be null for NativeAdLoader.");
            executorC = this.f15043b.c();
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.pb2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12811a.f();
                }
            };
        }
        executorC.execute(runnable);
        return false;
    }

    final /* synthetic */ void e() {
        this.f15045d.a().A(vt2.d(4, null, null));
    }

    final /* synthetic */ void f() {
        this.f15045d.a().A(vt2.d(6, null, null));
    }

    @Override // com.google.android.gms.internal.ads.mb2
    public final boolean j() {
        c01 c01Var = this.f15047f;
        return c01Var != null && c01Var.f();
    }
}
