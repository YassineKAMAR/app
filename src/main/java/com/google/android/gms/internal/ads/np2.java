package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class np2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f11972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f11973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f11974c;

    public np2(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f11972a = w84Var;
        this.f11973b = w84Var2;
        this.f11974c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lp2 k() {
        Context context = (Context) this.f11972a.k();
        du2 du2Var = (du2) this.f11973b.k();
        wu2 wu2Var = (wu2) this.f11974c.k();
        rf0 rf0VarO = ((Boolean) h2.y.c().b(ns.f12145n6)).booleanValue() ? g2.t.q().h().o() : g2.t.q().h().r();
        boolean z7 = false;
        if (rf0VarO != null && rf0VarO.h()) {
            z7 = true;
        }
        if (((Integer) h2.y.c().b(ns.D6)).intValue() > 0) {
            if (!((Boolean) h2.y.c().b(ns.f12136m6)).booleanValue() || z7) {
                vu2 vu2VarA = wu2Var.a(mu2.AppOpen, context, du2Var, new mo2(new jo2()));
                yo2 yo2Var = new yo2(new xo2());
                iu2 iu2Var = vu2VarA.f16477a;
                lg3 lg3Var = eh0.f7322a;
                return new oo2(yo2Var, new uo2(iu2Var, lg3Var), vu2VarA.f16478b, vu2VarA.f16477a.j().f13146h, lg3Var);
            }
        }
        return new xo2();
    }
}
