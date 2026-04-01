package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class s21 implements f71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts2 f14478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wg0 f14479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j2.x1 f14480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final js1 f14481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ty2 f14482f;

    public s21(Context context, ts2 ts2Var, wg0 wg0Var, j2.x1 x1Var, js1 js1Var, ty2 ty2Var) {
        this.f14477a = context;
        this.f14478b = ts2Var;
        this.f14479c = wg0Var;
        this.f14480d = x1Var;
        this.f14481e = js1Var;
        this.f14482f = ty2Var;
    }

    @Override // com.google.android.gms.internal.ads.f71
    public final void U(ks2 ks2Var) {
    }

    @Override // com.google.android.gms.internal.ads.f71
    public final void g0(ya0 ya0Var) {
        if (((Boolean) h2.y.c().b(ns.N3)).booleanValue()) {
            j2.x1 x1Var = this.f14480d;
            Context context = this.f14477a;
            wg0 wg0Var = this.f14479c;
            ts2 ts2Var = this.f14478b;
            ty2 ty2Var = this.f14482f;
            g2.t.c().c(context, wg0Var, ts2Var.f15304f, x1Var.o(), ty2Var);
        }
        this.f14481e.r();
    }
}
