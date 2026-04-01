package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class sp1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f14779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f14780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f14781c;

    public sp1(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f14779a = w84Var;
        this.f14780b = w84Var2;
        this.f14781c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        op1 op1Var = (op1) this.f14779a.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return ((Boolean) h2.y.c().b(ns.r8)).booleanValue() ? new yb1((rz1) this.f14781c.k(), lg3Var) : new yb1(op1Var, lg3Var);
    }
}
