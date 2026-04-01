package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class rp1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f14271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f14272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f14273c;

    public rp1(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f14271a = w84Var;
        this.f14272b = w84Var2;
        this.f14273c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        op1 op1Var = (op1) this.f14271a.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return ((Boolean) h2.y.c().b(ns.r8)).booleanValue() ? new yb1((rz1) this.f14273c.k(), lg3Var) : new yb1(op1Var, lg3Var);
    }
}
