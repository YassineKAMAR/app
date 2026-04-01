package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class cr0 implements gr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zp0 f6449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jr0 f6450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f6451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f6452d;

    /* synthetic */ cr0(zp0 zp0Var, jr0 jr0Var, br0 br0Var) {
        this.f6449a = zp0Var;
        this.f6450b = jr0Var;
    }

    @Override // com.google.android.gms.internal.ads.gr1
    public final /* synthetic */ gr1 a(String str) {
        str.getClass();
        this.f6452d = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.gr1
    public final /* bridge */ /* synthetic */ gr1 b(long j8) {
        this.f6451c = Long.valueOf(j8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.gr1
    public final hr1 l() {
        r84.c(this.f6451c, Long.class);
        r84.c(this.f6452d, String.class);
        return new er0(this.f6449a, this.f6450b, this.f6451c, this.f6452d, null);
    }
}
