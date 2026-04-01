package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class r62 extends k62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bo0 f13950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n31 f13951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ea1 f13952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v62 f13953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ls2 f13954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c32 f13955f;

    public r62(bo0 bo0Var, n31 n31Var, ea1 ea1Var, ls2 ls2Var, v62 v62Var, c32 c32Var) {
        this.f13950a = bo0Var;
        this.f13951b = n31Var;
        this.f13952c = ea1Var;
        this.f13954e = ls2Var;
        this.f13953d = v62Var;
        this.f13955f = c32Var;
    }

    @Override // com.google.android.gms.internal.ads.k62
    protected final x3.d c(ts2 ts2Var, Bundle bundle, wr2 wr2Var, ks2 ks2Var) {
        ls2 ls2Var;
        n31 n31Var = this.f13951b;
        n31Var.i(ts2Var);
        n31Var.f(bundle);
        n31Var.g(new h31(ks2Var, wr2Var, this.f13953d));
        if (((Boolean) h2.y.c().b(ns.f12151o3)).booleanValue() && (ls2Var = this.f13954e) != null) {
            this.f13951b.h(ls2Var);
        }
        if (((Boolean) h2.y.c().b(ns.f12160p3)).booleanValue()) {
            this.f13951b.d(this.f13955f);
        }
        bo0 bo0Var = this.f13950a;
        n31 n31Var2 = this.f13951b;
        om1 om1VarN = bo0Var.n();
        om1VarN.a(n31Var2.j());
        om1VarN.d(this.f13952c);
        w01 w01VarK = om1VarN.m().k();
        return w01VarK.i(w01VarK.j());
    }
}
