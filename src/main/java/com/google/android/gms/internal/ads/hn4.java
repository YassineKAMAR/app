package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class hn4 implements lo4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lo4 f8863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f8864b;

    public hn4(lo4 lo4Var, long j8) {
        this.f8863a = lo4Var;
        this.f8864b = j8;
    }

    @Override // com.google.android.gms.internal.ads.lo4
    public final int a(nc4 nc4Var, q94 q94Var, int i8) {
        int iA = this.f8863a.a(nc4Var, q94Var, i8);
        if (iA != -4) {
            return iA;
        }
        q94Var.f13364f += this.f8864b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.lo4
    public final int b(long j8) {
        return this.f8863a.b(j8 - this.f8864b);
    }

    public final lo4 c() {
        return this.f8863a;
    }

    @Override // com.google.android.gms.internal.ads.lo4
    public final boolean m() {
        return this.f8863a.m();
    }

    @Override // com.google.android.gms.internal.ads.lo4
    public final void p() {
        this.f8863a.p();
    }
}
