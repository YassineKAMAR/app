package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class up1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f15792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f15793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f15794c;

    public up1(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f15792a = w84Var;
        this.f15793b = w84Var2;
        this.f15794c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        hq1 hq1Var = (hq1) this.f15792a.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return ((Boolean) h2.y.c().b(ns.r8)).booleanValue() ? new yb1((yz1) this.f15794c.k(), lg3Var) : new yb1(hq1Var, lg3Var);
    }
}
