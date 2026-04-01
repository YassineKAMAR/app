package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class d6 implements b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f6587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f6590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f6591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long[] f6592f;

    private d6(long j8, int i8, long j9, long j10, long[] jArr) {
        this.f6587a = j8;
        this.f6588b = i8;
        this.f6589c = j9;
        this.f6592f = jArr;
        this.f6590d = j10;
        this.f6591e = j10 != -1 ? j8 + j10 : -1L;
    }

    public static d6 b(long j8, long j9, k1 k1Var, dq2 dq2Var) {
        int iX;
        int i8 = k1Var.f9870g;
        int i9 = k1Var.f9867d;
        int iO = dq2Var.o();
        if ((iO & 1) != 1 || (iX = dq2Var.x()) == 0) {
            return null;
        }
        int i10 = iO & 6;
        long jD = nz2.D(iX, ((long) i8) * 1000000, i9);
        if (i10 != 6) {
            return new d6(j9, k1Var.f9866c, jD, -1L, null);
        }
        long jC = dq2Var.C();
        long[] jArr = new long[100];
        for (int i11 = 0; i11 < 100; i11++) {
            jArr[i11] = dq2Var.u();
        }
        if (j8 != -1) {
            long j10 = j9 + jC;
            if (j8 != j10) {
                pf2.f("XingSeeker", "XING data size mismatch: " + j8 + ", " + j10);
            }
        }
        return new d6(j9, k1Var.f9866c, jD, jC, jArr);
    }

    private final long c(int i8) {
        return (this.f6589c * ((long) i8)) / 100;
    }

    @Override // com.google.android.gms.internal.ads.b6
    public final long a(long j8) {
        if (!o()) {
            return 0L;
        }
        long j9 = j8 - this.f6587a;
        if (j9 <= this.f6588b) {
            return 0L;
        }
        long[] jArr = this.f6592f;
        uu1.b(jArr);
        double d8 = (j9 * 256.0d) / this.f6590d;
        int iO = nz2.o(jArr, (long) d8, true, true);
        long jC = c(iO);
        long j10 = jArr[iO];
        int i8 = iO + 1;
        long jC2 = c(i8);
        return jC + Math.round((j10 == (iO == 99 ? 256L : jArr[i8]) ? 0.0d : (d8 - j10) / (r0 - j10)) * (jC2 - jC));
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final long j() {
        return this.f6589c;
    }

    @Override // com.google.android.gms.internal.ads.b6
    public final long l() {
        return this.f6591e;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final boolean o() {
        return this.f6592f != null;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final o1 p(long j8) {
        if (!o()) {
            r1 r1Var = new r1(0L, this.f6587a + ((long) this.f6588b));
            return new o1(r1Var, r1Var);
        }
        long jMax = Math.max(0L, Math.min(j8, this.f6589c));
        double d8 = (jMax * 100.0d) / this.f6589c;
        double d9 = 0.0d;
        if (d8 > 0.0d) {
            if (d8 >= 100.0d) {
                d9 = 256.0d;
            } else {
                int i8 = (int) d8;
                long[] jArr = this.f6592f;
                uu1.b(jArr);
                double d10 = jArr[i8];
                d9 = d10 + ((d8 - ((double) i8)) * ((i8 == 99 ? 256.0d : jArr[i8 + 1]) - d10));
            }
        }
        long j9 = this.f6590d;
        r1 r1Var2 = new r1(jMax, this.f6587a + Math.max(this.f6588b, Math.min(Math.round((d9 / 256.0d) * j9), j9 - 1)));
        return new o1(r1Var2, r1Var2);
    }
}
