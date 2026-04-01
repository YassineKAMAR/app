package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class m21 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f11131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f11132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f11133c;

    public m21(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f11131a = w84Var;
        this.f11132b = w84Var2;
        this.f11133c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        mp1 mp1Var = (mp1) this.f11131a.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return ((Boolean) h2.y.c().b(ns.r8)).booleanValue() ? new yb1((pz1) this.f11133c.k(), lg3Var) : new yb1(mp1Var, lg3Var);
    }
}
