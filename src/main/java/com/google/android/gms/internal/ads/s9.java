package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class s9 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kx2 f14568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq2 f14569b = new dq2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14570c;

    public s9(int i8, kx2 kx2Var, int i9) {
        this.f14570c = i8;
        this.f14568a = kx2Var;
    }

    @Override // com.google.android.gms.internal.ads.z
    public final y a(q0 q0Var, long j8) {
        int iA;
        int iA2;
        long jN = q0Var.n();
        int iMin = (int) Math.min(112800L, q0Var.p() - jN);
        this.f14569b.d(iMin);
        ((f0) q0Var).L(this.f14569b.i(), 0, iMin, false);
        dq2 dq2Var = this.f14569b;
        int iM = dq2Var.m();
        long j9 = -1;
        long j10 = -9223372036854775807L;
        long j11 = -1;
        while (dq2Var.j() >= 188 && (iA2 = (iA = ea.a(dq2Var.i(), dq2Var.l(), iM)) + 188) <= iM) {
            long jB = ea.b(dq2Var, iA, this.f14570c);
            if (jB != -9223372036854775807L) {
                long jB2 = this.f14568a.b(jB);
                if (jB2 <= j8) {
                    j11 = iA;
                    if (100000 + jB2 <= j8) {
                        j10 = jB2;
                    }
                } else if (j10 == -9223372036854775807L) {
                    return y.d(jB2, jN);
                }
                return y.e(jN + j11);
            }
            dq2Var.g(iA2);
            j9 = iA2;
        }
        return j10 != -9223372036854775807L ? y.f(j10, jN + j9) : y.f17524d;
    }

    @Override // com.google.android.gms.internal.ads.z
    public final void k() {
        byte[] bArr = nz2.f12305f;
        int length = bArr.length;
        this.f14569b.e(bArr, 0);
    }
}
