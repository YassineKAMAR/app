package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class tn4 implements lo4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ xn4 f15180b;

    public tn4(xn4 xn4Var, int i8) {
        this.f15180b = xn4Var;
        this.f15179a = i8;
    }

    @Override // com.google.android.gms.internal.ads.lo4
    public final int a(nc4 nc4Var, q94 q94Var, int i8) {
        return this.f15180b.P(this.f15179a, nc4Var, q94Var, i8);
    }

    @Override // com.google.android.gms.internal.ads.lo4
    public final int b(long j8) {
        return this.f15180b.Q(this.f15179a, j8);
    }

    @Override // com.google.android.gms.internal.ads.lo4
    public final boolean m() {
        return this.f15180b.D(this.f15179a);
    }

    @Override // com.google.android.gms.internal.ads.lo4
    public final void p() {
        this.f15180b.B(this.f15179a);
    }
}
