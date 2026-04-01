package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class n21 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f11623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f11624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f11625c;

    public n21(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f11623a = w84Var;
        this.f11624b = w84Var2;
        this.f11625c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        mp1 mp1Var = (mp1) this.f11623a.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return ((Boolean) h2.y.c().b(ns.r8)).booleanValue() ? new yb1((pz1) this.f11625c.k(), lg3Var) : new yb1(mp1Var, lg3Var);
    }
}
