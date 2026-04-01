package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class n62 extends k62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bo0 f11698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n31 f11699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c92 f11700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ea1 f11701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final te1 f11702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z61 f11703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewGroup f11704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i91 f11705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final v62 f11706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c32 f11707j;

    public n62(bo0 bo0Var, n31 n31Var, c92 c92Var, ea1 ea1Var, te1 te1Var, z61 z61Var, ViewGroup viewGroup, i91 i91Var, v62 v62Var, c32 c32Var) {
        this.f11698a = bo0Var;
        this.f11699b = n31Var;
        this.f11700c = c92Var;
        this.f11701d = ea1Var;
        this.f11702e = te1Var;
        this.f11703f = z61Var;
        this.f11704g = viewGroup;
        this.f11705h = i91Var;
        this.f11706i = v62Var;
        this.f11707j = c32Var;
    }

    @Override // com.google.android.gms.internal.ads.k62
    protected final x3.d c(ts2 ts2Var, Bundle bundle, wr2 wr2Var, ks2 ks2Var) {
        n31 n31Var = this.f11699b;
        n31Var.i(ts2Var);
        n31Var.f(bundle);
        n31Var.g(new h31(ks2Var, wr2Var, this.f11706i));
        if (((Boolean) h2.y.c().b(ns.f12160p3)).booleanValue()) {
            this.f11699b.d(this.f11707j);
        }
        bo0 bo0Var = this.f11698a;
        n31 n31Var2 = this.f11699b;
        gy0 gy0VarJ = bo0Var.j();
        gy0VarJ.k(n31Var2.j());
        gy0VarJ.h(this.f11701d);
        gy0VarJ.i(this.f11700c);
        gy0VarJ.c(this.f11702e);
        gy0VarJ.e(new fz0(this.f11703f, this.f11705h));
        gy0VarJ.b(new gx0(this.f11704g));
        w01 w01VarD = gy0VarJ.s().d();
        return w01VarD.i(w01VarD.j());
    }
}
