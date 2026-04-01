package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class y92 extends h2.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gb2 f17701a;

    public y92(Context context, bo0 bo0Var, rs2 rs2Var, bh1 bh1Var, h2.f0 f0Var) {
        ib2 ib2Var = new ib2(bh1Var, bo0Var.C());
        ib2Var.e(f0Var);
        this.f17701a = new gb2(new tb2(bo0Var, context, ib2Var, rs2Var), rs2Var.i());
    }

    @Override // h2.l0
    public final void k1(h2.r4 r4Var) {
        this.f17701a.d(r4Var, 1);
    }

    @Override // h2.l0
    public final synchronized String m() {
        return this.f17701a.a();
    }

    @Override // h2.l0
    public final synchronized String n() {
        return this.f17701a.b();
    }

    @Override // h2.l0
    public final synchronized void o5(h2.r4 r4Var, int i8) {
        this.f17701a.d(r4Var, i8);
    }

    @Override // h2.l0
    public final synchronized boolean r() {
        return this.f17701a.e();
    }
}
