package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class p62 extends k62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bo0 f12756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n31 f12757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c92 f12758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ea1 f12759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v62 f12760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c32 f12761f;

    public p62(bo0 bo0Var, n31 n31Var, c92 c92Var, ea1 ea1Var, v62 v62Var, c32 c32Var) {
        this.f12756a = bo0Var;
        this.f12757b = n31Var;
        this.f12758c = c92Var;
        this.f12759d = ea1Var;
        this.f12760e = v62Var;
        this.f12761f = c32Var;
    }

    @Override // com.google.android.gms.internal.ads.k62
    protected final x3.d c(ts2 ts2Var, Bundle bundle, wr2 wr2Var, ks2 ks2Var) {
        n31 n31Var = this.f12757b;
        n31Var.i(ts2Var);
        n31Var.f(bundle);
        n31Var.g(new h31(ks2Var, wr2Var, this.f12760e));
        if (((Boolean) h2.y.c().b(ns.f12160p3)).booleanValue()) {
            this.f12757b.d(this.f12761f);
        }
        bo0 bo0Var = this.f12756a;
        n31 n31Var2 = this.f12757b;
        be1 be1VarL = bo0Var.l();
        be1VarL.f(n31Var2.j());
        be1VarL.r(this.f12759d);
        be1VarL.j(this.f12758c);
        w01 w01VarA = be1VarL.n().a();
        return w01VarA.i(w01VarA.j());
    }
}
