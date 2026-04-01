package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
final class w5 implements b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f16635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f16636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f16637c;

    private w5(long[] jArr, long[] jArr2, long j8) {
        this.f16635a = jArr;
        this.f16636b = jArr2;
        this.f16637c = j8 == -9223372036854775807L ? nz2.C(jArr2[jArr2.length - 1]) : j8;
    }

    public static w5 b(long j8, s4 s4Var, long j9) {
        int length = s4Var.f14515e.length;
        int i8 = length + 1;
        long[] jArr = new long[i8];
        long[] jArr2 = new long[i8];
        jArr[0] = j8;
        long j10 = 0;
        jArr2[0] = 0;
        for (int i9 = 1; i9 <= length; i9++) {
            int i10 = i9 - 1;
            j8 += (long) (s4Var.f14513c + s4Var.f14515e[i10]);
            j10 += (long) (s4Var.f14514d + s4Var.f14516f[i10]);
            jArr[i9] = j8;
            jArr2[i9] = j10;
        }
        return new w5(jArr, jArr2, j9);
    }

    private static Pair c(long j8, long[] jArr, long[] jArr2) {
        Long lValueOf;
        Long lValueOf2;
        int iO = nz2.o(jArr, j8, true, true);
        long j9 = jArr[iO];
        long j10 = jArr2[iO];
        int i8 = iO + 1;
        if (i8 == jArr.length) {
            lValueOf = Long.valueOf(j9);
            lValueOf2 = Long.valueOf(j10);
        } else {
            long j11 = jArr[i8];
            long j12 = jArr2[i8];
            double d8 = j11 == j9 ? 0.0d : (j8 - j9) / (j11 - j9);
            lValueOf = Long.valueOf(j8);
            lValueOf2 = Long.valueOf(((long) (d8 * (j12 - j10))) + j10);
        }
        return Pair.create(lValueOf, lValueOf2);
    }

    @Override // com.google.android.gms.internal.ads.b6
    public final long a(long j8) {
        return nz2.C(((Long) c(j8, this.f16635a, this.f16636b).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final long j() {
        return this.f16637c;
    }

    @Override // com.google.android.gms.internal.ads.b6
    public final long l() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final boolean o() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final o1 p(long j8) {
        Pair pairC = c(nz2.E(Math.max(0L, Math.min(j8, this.f16637c))), this.f16636b, this.f16635a);
        r1 r1Var = new r1(nz2.C(((Long) pairC.first).longValue()), ((Long) pairC.second).longValue());
        return new o1(r1Var, r1Var);
    }
}
