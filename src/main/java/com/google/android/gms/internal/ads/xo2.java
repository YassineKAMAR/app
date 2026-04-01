package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class xo2 implements lp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m31 f17411a;

    @Override // com.google.android.gms.internal.ads.lp2
    public final /* bridge */ /* synthetic */ x3.d a(mp2 mp2Var, kp2 kp2Var, Object obj) {
        return c(mp2Var, kp2Var, null);
    }

    @Override // com.google.android.gms.internal.ads.lp2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized m31 p() {
        return this.f17411a;
    }

    public final synchronized x3.d c(mp2 mp2Var, kp2 kp2Var, m31 m31Var) {
        w01 w01VarK;
        if (m31Var != null) {
            this.f17411a = m31Var;
        } else {
            this.f17411a = (m31) kp2Var.a(mp2Var.f11440b).o();
        }
        w01VarK = this.f17411a.k();
        return w01VarK.i(w01VarK.j());
    }
}
