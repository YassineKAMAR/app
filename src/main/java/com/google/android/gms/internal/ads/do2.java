package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class do2 implements mb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f6833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bo0 f6834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final va2 f6835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final za2 f6836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewGroup f6837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private nt f6838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z61 f6839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ty2 f6840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i91 f6841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final rs2 f6842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private x3.d f6843l;

    public do2(Context context, Executor executor, h2.w4 w4Var, bo0 bo0Var, va2 va2Var, za2 za2Var, rs2 rs2Var, i91 i91Var) {
        this.f6832a = context;
        this.f6833b = executor;
        this.f6834c = bo0Var;
        this.f6835d = va2Var;
        this.f6836e = za2Var;
        this.f6842k = rs2Var;
        this.f6839h = bo0Var.k();
        this.f6840i = bo0Var.D();
        this.f6837f = new FrameLayout(context);
        this.f6841j = i91Var;
        rs2Var.I(w4Var);
    }

    @Override // com.google.android.gms.internal.ads.mb2
    public final boolean a(h2.r4 r4Var, String str, jb2 jb2Var, kb2 kb2Var) {
        gy0 gy0VarJ;
        gx0 gx0Var;
        qy2 qy2Var;
        if (str == null) {
            qg0.d("Ad unit ID should not be null for banner ad.");
            this.f6833b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.yn2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17864a.m();
                }
            });
            return false;
        }
        if (j()) {
            return false;
        }
        if (((Boolean) h2.y.c().b(ns.F8)).booleanValue() && r4Var.f22257f) {
            this.f6834c.p().n(true);
        }
        rs2 rs2Var = this.f6842k;
        rs2Var.J(str);
        rs2Var.e(r4Var);
        Context context = this.f6832a;
        ts2 ts2VarG = rs2Var.g();
        ey2 ey2VarB = dy2.b(context, py2.f(ts2VarG), 3, r4Var);
        if (((Boolean) pu.f13132e.e()).booleanValue() && this.f6842k.x().f22361k) {
            va2 va2Var = this.f6835d;
            if (va2Var != null) {
                va2Var.A(vt2.d(7, null, null));
            }
            return false;
        }
        if (((Boolean) h2.y.c().b(ns.U7)).booleanValue()) {
            gy0VarJ = this.f6834c.j();
            n31 n31Var = new n31();
            n31Var.e(this.f6832a);
            n31Var.i(ts2VarG);
            gy0VarJ.k(n31Var.j());
            ca1 ca1Var = new ca1();
            ca1Var.m(this.f6835d, this.f6833b);
            ca1Var.n(this.f6835d, this.f6833b);
            gy0VarJ.h(ca1Var.q());
            gy0VarJ.i(new c92(this.f6838g));
            gy0VarJ.c(new te1(bh1.f5789h, null));
            gy0VarJ.e(new fz0(this.f6839h, this.f6841j));
            gx0Var = new gx0(this.f6837f);
        } else {
            gy0VarJ = this.f6834c.j();
            n31 n31Var2 = new n31();
            n31Var2.e(this.f6832a);
            n31Var2.i(ts2VarG);
            gy0VarJ.k(n31Var2.j());
            ca1 ca1Var2 = new ca1();
            ca1Var2.m(this.f6835d, this.f6833b);
            ca1Var2.d(this.f6835d, this.f6833b);
            ca1Var2.d(this.f6836e, this.f6833b);
            ca1Var2.o(this.f6835d, this.f6833b);
            ca1Var2.g(this.f6835d, this.f6833b);
            ca1Var2.h(this.f6835d, this.f6833b);
            ca1Var2.i(this.f6835d, this.f6833b);
            ca1Var2.e(this.f6835d, this.f6833b);
            ca1Var2.n(this.f6835d, this.f6833b);
            ca1Var2.l(this.f6835d, this.f6833b);
            gy0VarJ.h(ca1Var2.q());
            gy0VarJ.i(new c92(this.f6838g));
            gy0VarJ.c(new te1(bh1.f5789h, null));
            gy0VarJ.e(new fz0(this.f6839h, this.f6841j));
            gx0Var = new gx0(this.f6837f);
        }
        gy0VarJ.b(gx0Var);
        hy0 hy0VarS = gy0VarJ.o();
        if (((Boolean) bu.f6041c.e()).booleanValue()) {
            qy2 qy2VarF = hy0VarS.f();
            qy2VarF.h(3);
            qy2VarF.b(r4Var.f22267p);
            qy2Var = qy2VarF;
        } else {
            qy2Var = null;
        }
        w01 w01VarD = hy0VarS.d();
        x3.d dVarI = w01VarD.i(w01VarD.j());
        this.f6843l = dVarI;
        zf3.r(dVarI, new co2(this, kb2Var, qy2Var, ey2VarB, hy0VarS), this.f6833b);
        return true;
    }

    public final ViewGroup c() {
        return this.f6837f;
    }

    public final rs2 h() {
        return this.f6842k;
    }

    @Override // com.google.android.gms.internal.ads.mb2
    public final boolean j() {
        x3.d dVar = this.f6843l;
        return (dVar == null || dVar.isDone()) ? false : true;
    }

    final /* synthetic */ void m() {
        this.f6835d.A(vt2.d(6, null, null));
    }

    public final void n() {
        this.f6839h.A0(this.f6841j.a());
    }

    public final void o(h2.c0 c0Var) {
        this.f6836e.a(c0Var);
    }

    public final void p(a71 a71Var) {
        this.f6839h.w0(a71Var, this.f6833b);
    }

    public final void q(nt ntVar) {
        this.f6838g = ntVar;
    }

    public final boolean r() {
        Object parent = this.f6837f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        g2.t.r();
        return j2.k2.v(view, view.getContext());
    }
}
