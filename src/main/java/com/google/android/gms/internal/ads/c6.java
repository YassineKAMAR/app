package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class c6 implements b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f6180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f6181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f6183d;

    private c6(long[] jArr, long[] jArr2, long j8, long j9) {
        this.f6180a = jArr;
        this.f6181b = jArr2;
        this.f6182c = j8;
        this.f6183d = j9;
    }

    public static c6 b(long j8, long j9, k1 k1Var, dq2 dq2Var) {
        int iU;
        dq2Var.h(10);
        int iO = dq2Var.o();
        if (iO <= 0) {
            return null;
        }
        int i8 = k1Var.f9867d;
        long jD = nz2.D(iO, ((long) (i8 >= 32000 ? 1152 : 576)) * 1000000, i8);
        int iY = dq2Var.y();
        int iY2 = dq2Var.y();
        int iY3 = dq2Var.y();
        dq2Var.h(2);
        long j10 = j9 + ((long) k1Var.f9866c);
        long[] jArr = new long[iY];
        long[] jArr2 = new long[iY];
        int i9 = 0;
        long j11 = j9;
        while (i9 < iY) {
            int i10 = iY2;
            long j12 = j10;
            jArr[i9] = (((long) i9) * jD) / ((long) iY);
            jArr2[i9] = Math.max(j11, j12);
            if (iY3 == 1) {
                iU = dq2Var.u();
            } else if (iY3 == 2) {
                iU = dq2Var.y();
            } else if (iY3 == 3) {
                iU = dq2Var.w();
            } else {
                if (iY3 != 4) {
                    return null;
                }
                iU = dq2Var.x();
            }
            j11 += ((long) iU) * ((long) i10);
            i9++;
            j10 = j12;
            iY2 = i10;
            iY = iY;
        }
        if (j8 != -1 && j8 != j11) {
            pf2.f("VbriSeeker", "VBRI data size mismatch: " + j8 + ", " + j11);
        }
        return new c6(jArr, jArr2, jD, j11);
    }

    @Override // com.google.android.gms.internal.ads.b6
    public final long a(long j8) {
        return this.f6180a[nz2.o(this.f6181b, j8, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final long j() {
        return this.f6182c;
    }

    @Override // com.google.android.gms.internal.ads.b6
    public final long l() {
        return this.f6183d;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final boolean o() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final o1 p(long j8) {
        long[] jArr = this.f6180a;
        int iO = nz2.o(jArr, j8, true, true);
        r1 r1Var = new r1(jArr[iO], this.f6181b[iO]);
        if (r1Var.f13856a < j8) {
            long[] jArr2 = this.f6180a;
            if (iO != jArr2.length - 1) {
                int i8 = iO + 1;
                return new o1(r1Var, new r1(jArr2[i8], this.f6181b[i8]));
            }
        }
        return new o1(r1Var, r1Var);
    }
}
