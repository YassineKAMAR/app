package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class xp2 implements mb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f17416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bo0 f17417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final va2 f17418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final yq2 f17419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private nt f17420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ty2 f17421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final rs2 f17422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private x3.d f17423i;

    public xp2(Context context, Executor executor, bo0 bo0Var, va2 va2Var, yq2 yq2Var, rs2 rs2Var) {
        this.f17415a = context;
        this.f17416b = executor;
        this.f17417c = bo0Var;
        this.f17418d = va2Var;
        this.f17422h = rs2Var;
        this.f17419e = yq2Var;
        this.f17421g = bo0Var.D();
    }

    @Override // com.google.android.gms.internal.ads.mb2
    public final boolean a(h2.r4 r4Var, String str, jb2 jb2Var, kb2 kb2Var) {
        ce1 ce1VarN;
        qy2 qy2Var;
        if (str == null) {
            qg0.d("Ad unit ID should not be null for interstitial ad.");
            this.f17416b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.rp2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14274a.g();
                }
            });
            return false;
        }
        if (j()) {
            return false;
        }
        if (((Boolean) h2.y.c().b(ns.F8)).booleanValue() && r4Var.f22257f) {
            this.f17417c.p().n(true);
        }
        h2.w4 w4Var = ((qp2) jb2Var).f13585a;
        rs2 rs2Var = this.f17422h;
        rs2Var.J(str);
        rs2Var.I(w4Var);
        rs2Var.e(r4Var);
        Context context = this.f17415a;
        ts2 ts2VarG = rs2Var.g();
        ey2 ey2VarB = dy2.b(context, py2.f(ts2VarG), 4, r4Var);
        if (((Boolean) h2.y.c().b(ns.W7)).booleanValue()) {
            be1 be1VarL = this.f17417c.l();
            n31 n31Var = new n31();
            n31Var.e(this.f17415a);
            n31Var.i(ts2VarG);
            be1VarL.f(n31Var.j());
            ca1 ca1Var = new ca1();
            ca1Var.m(this.f17418d, this.f17416b);
            ca1Var.n(this.f17418d, this.f17416b);
            be1VarL.r(ca1Var.q());
            be1VarL.j(new c92(this.f17420f));
            ce1VarN = be1VarL.o();
        } else {
            ca1 ca1Var2 = new ca1();
            yq2 yq2Var = this.f17419e;
            if (yq2Var != null) {
                ca1Var2.h(yq2Var, this.f17416b);
                ca1Var2.i(this.f17419e, this.f17416b);
                ca1Var2.e(this.f17419e, this.f17416b);
            }
            be1 be1VarL2 = this.f17417c.l();
            n31 n31Var2 = new n31();
            n31Var2.e(this.f17415a);
            n31Var2.i(ts2VarG);
            be1VarL2.f(n31Var2.j());
            ca1Var2.m(this.f17418d, this.f17416b);
            ca1Var2.h(this.f17418d, this.f17416b);
            ca1Var2.i(this.f17418d, this.f17416b);
            ca1Var2.e(this.f17418d, this.f17416b);
            ca1Var2.d(this.f17418d, this.f17416b);
            ca1Var2.o(this.f17418d, this.f17416b);
            ca1Var2.n(this.f17418d, this.f17416b);
            ca1Var2.l(this.f17418d, this.f17416b);
            ca1Var2.f(this.f17418d, this.f17416b);
            be1VarL2.r(ca1Var2.q());
            be1VarL2.j(new c92(this.f17420f));
            ce1VarN = be1VarL2.o();
        }
        ce1 ce1Var = ce1VarN;
        if (((Boolean) bu.f6041c.e()).booleanValue()) {
            qy2 qy2VarD = ce1Var.d();
            qy2VarD.h(4);
            qy2VarD.b(r4Var.f22267p);
            qy2Var = qy2VarD;
        } else {
            qy2Var = null;
        }
        w01 w01VarA = ce1Var.a();
        x3.d dVarI = w01VarA.i(w01VarA.j());
        this.f17423i = dVarI;
        zf3.r(dVarI, new wp2(this, kb2Var, qy2Var, ey2VarB, ce1Var), this.f17416b);
        return true;
    }

    final /* synthetic */ void g() {
        this.f17418d.A(vt2.d(6, null, null));
    }

    public final void h(nt ntVar) {
        this.f17420f = ntVar;
    }

    @Override // com.google.android.gms.internal.ads.mb2
    public final boolean j() {
        x3.d dVar = this.f17423i;
        return (dVar == null || dVar.isDone()) ? false : true;
    }
}
