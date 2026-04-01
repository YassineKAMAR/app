package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class yo2 implements lp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lp2 f17867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m31 f17868b;

    public yo2(lp2 lp2Var) {
        this.f17867a = lp2Var;
    }

    @Override // com.google.android.gms.internal.ads.lp2
    public final /* bridge */ /* synthetic */ x3.d a(mp2 mp2Var, kp2 kp2Var, Object obj) {
        return c(mp2Var, kp2Var, null);
    }

    @Override // com.google.android.gms.internal.ads.lp2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized m31 p() {
        return this.f17868b;
    }

    public final synchronized x3.d c(mp2 mp2Var, kp2 kp2Var, m31 m31Var) {
        this.f17868b = m31Var;
        if (mp2Var.f11439a == null) {
            return ((xo2) this.f17867a).c(mp2Var, kp2Var, m31Var);
        }
        w01 w01VarK = m31Var.k();
        return w01VarK.i(w01VarK.k(zf3.h(mp2Var.f11439a)));
    }
}
