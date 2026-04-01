package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class rz1 implements f71, v51, j41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lx2 f14386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mx2 f14387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dg0 f14388c;

    public rz1(lx2 lx2Var, mx2 mx2Var, dg0 dg0Var) {
        this.f14386a = lx2Var;
        this.f14387b = mx2Var;
        this.f14388c = dg0Var;
    }

    @Override // com.google.android.gms.internal.ads.j41
    public final void A(h2.z2 z2Var) {
        lx2 lx2Var = this.f14386a;
        lx2Var.a("action", "ftl");
        lx2Var.a("ftl", String.valueOf(z2Var.f22383a));
        lx2Var.a("ed", z2Var.f22385c);
        this.f14387b.a(this.f14386a);
    }

    @Override // com.google.android.gms.internal.ads.v51
    public final void B() {
        lx2 lx2Var = this.f14386a;
        lx2Var.a("action", "loaded");
        this.f14387b.a(lx2Var);
    }

    @Override // com.google.android.gms.internal.ads.f71
    public final void U(ks2 ks2Var) {
        this.f14386a.h(ks2Var, this.f14388c);
    }

    @Override // com.google.android.gms.internal.ads.f71
    public final void g0(ya0 ya0Var) {
        this.f14386a.i(ya0Var.f17708a);
    }
}
