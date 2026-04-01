package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f6521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f6522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f6523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f6524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f6525f;

    public d0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f6521b = iArr;
        this.f6522c = jArr;
        this.f6523d = jArr2;
        this.f6524e = jArr3;
        int length = iArr.length;
        this.f6520a = length;
        if (length <= 0) {
            this.f6525f = 0L;
        } else {
            int i8 = length - 1;
            this.f6525f = jArr2[i8] + jArr3[i8];
        }
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final long j() {
        return this.f6525f;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final boolean o() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final o1 p(long j8) {
        long[] jArr = this.f6524e;
        int iO = nz2.o(jArr, j8, true, true);
        r1 r1Var = new r1(jArr[iO], this.f6522c[iO]);
        if (r1Var.f13856a >= j8 || iO == this.f6520a - 1) {
            return new o1(r1Var, r1Var);
        }
        int i8 = iO + 1;
        return new o1(r1Var, new r1(this.f6524e[i8], this.f6522c[i8]));
    }

    public final String toString() {
        long[] jArr = this.f6523d;
        long[] jArr2 = this.f6524e;
        long[] jArr3 = this.f6522c;
        return "ChunkIndex(length=" + this.f6520a + ", sizes=" + Arrays.toString(this.f6521b) + ", offsets=" + Arrays.toString(jArr3) + ", timeUs=" + Arrays.toString(jArr2) + ", durationsUs=" + Arrays.toString(jArr) + ")";
    }
}
