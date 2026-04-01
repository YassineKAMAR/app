package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class j3 extends e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f9453b;

    public j3(q0 q0Var, long j8) {
        super(q0Var);
        uu1.d(q0Var.n() >= j8);
        this.f9453b = j8;
    }

    @Override // com.google.android.gms.internal.ads.e1, com.google.android.gms.internal.ads.q0
    public final long m() {
        return super.m() - this.f9453b;
    }

    @Override // com.google.android.gms.internal.ads.e1, com.google.android.gms.internal.ads.q0
    public final long n() {
        return super.n() - this.f9453b;
    }

    @Override // com.google.android.gms.internal.ads.e1, com.google.android.gms.internal.ads.q0
    public final long p() {
        return super.p() - this.f9453b;
    }
}
