package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class op1 implements f71, v51, j41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zp1 f12591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jq1 f12592b;

    public op1(zp1 zp1Var, jq1 jq1Var) {
        this.f12591a = zp1Var;
        this.f12592b = jq1Var;
    }

    @Override // com.google.android.gms.internal.ads.j41
    public final void A(h2.z2 z2Var) {
        this.f12591a.a().put("action", "ftl");
        this.f12591a.a().put("ftl", String.valueOf(z2Var.f22383a));
        this.f12591a.a().put("ed", z2Var.f22385c);
        this.f12592b.f(this.f12591a.a());
    }

    @Override // com.google.android.gms.internal.ads.v51
    public final void B() {
        this.f12591a.a().put("action", "loaded");
        this.f12592b.f(this.f12591a.a());
    }

    @Override // com.google.android.gms.internal.ads.f71
    public final void U(ks2 ks2Var) {
        this.f12591a.b(ks2Var);
    }

    @Override // com.google.android.gms.internal.ads.f71
    public final void g0(ya0 ya0Var) {
        this.f12591a.c(ya0Var.f17708a);
    }
}
