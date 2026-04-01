package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class l62 extends k62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bo0 f10469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n31 f10470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ea1 f10471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v62 f10472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c32 f10473e;

    l62(bo0 bo0Var, n31 n31Var, ea1 ea1Var, v62 v62Var, c32 c32Var) {
        this.f10469a = bo0Var;
        this.f10470b = n31Var;
        this.f10471c = ea1Var;
        this.f10472d = v62Var;
        this.f10473e = c32Var;
    }

    @Override // com.google.android.gms.internal.ads.k62
    protected final x3.d c(ts2 ts2Var, Bundle bundle, wr2 wr2Var, ks2 ks2Var) {
        n31 n31Var = this.f10470b;
        n31Var.i(ts2Var);
        n31Var.f(bundle);
        n31Var.g(new h31(ks2Var, wr2Var, this.f10472d));
        if (((Boolean) h2.y.c().b(ns.f12160p3)).booleanValue()) {
            this.f10470b.d(this.f10473e);
        }
        bo0 bo0Var = this.f10469a;
        n31 n31Var2 = this.f10470b;
        ww0 ww0VarI = bo0Var.i();
        ww0VarI.a(n31Var2.j());
        ww0VarI.d(this.f10471c);
        w01 w01VarK = ww0VarI.m().k();
        return w01VarK.i(w01VarK.j());
    }
}
