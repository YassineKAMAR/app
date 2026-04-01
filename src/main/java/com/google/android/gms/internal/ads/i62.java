package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class i62 extends k62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bo0 f9074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final te1 f9075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n31 f9076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ea1 f9077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v62 f9078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c32 f9079f;

    public i62(bo0 bo0Var, te1 te1Var, n31 n31Var, ea1 ea1Var, v62 v62Var, c32 c32Var) {
        this.f9074a = bo0Var;
        this.f9075b = te1Var;
        this.f9076c = n31Var;
        this.f9077d = ea1Var;
        this.f9078e = v62Var;
        this.f9079f = c32Var;
    }

    @Override // com.google.android.gms.internal.ads.k62
    protected final x3.d c(ts2 ts2Var, Bundle bundle, wr2 wr2Var, ks2 ks2Var) {
        n31 n31Var = this.f9076c;
        n31Var.i(ts2Var);
        n31Var.f(bundle);
        n31Var.g(new h31(ks2Var, wr2Var, this.f9078e));
        if (((Boolean) h2.y.c().b(ns.f12160p3)).booleanValue()) {
            this.f9076c.d(this.f9079f);
        }
        bo0 bo0Var = this.f9074a;
        n31 n31Var2 = this.f9076c;
        xe1 xe1VarM = bo0Var.m();
        xe1VarM.t(n31Var2.j());
        xe1VarM.l(this.f9077d);
        xe1VarM.c(this.f9075b);
        xe1VarM.b(new gx0(null));
        w01 w01VarA = xe1VarM.q().a();
        return w01VarA.i(w01VarA.j());
    }
}
