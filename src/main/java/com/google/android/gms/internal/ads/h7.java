package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e7 f8654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f8656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f8657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f8659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f8660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f8661h;

    public h7(e7 e7Var, long[] jArr, int[] iArr, int i8, long[] jArr2, int[] iArr2, long j8) {
        int length = iArr.length;
        int length2 = jArr2.length;
        uu1.d(length == length2);
        int length3 = jArr.length;
        uu1.d(length3 == length2);
        int length4 = iArr2.length;
        uu1.d(length4 == length2);
        this.f8654a = e7Var;
        this.f8656c = jArr;
        this.f8657d = iArr;
        this.f8658e = i8;
        this.f8659f = jArr2;
        this.f8660g = iArr2;
        this.f8661h = j8;
        this.f8655b = length3;
        if (length4 > 0) {
            int i9 = length4 - 1;
            iArr2[i9] = iArr2[i9] | 536870912;
        }
    }

    public final int a(long j8) {
        for (int iO = nz2.o(this.f8659f, j8, true, false); iO >= 0; iO--) {
            if ((this.f8660g[iO] & 1) != 0) {
                return iO;
            }
        }
        return -1;
    }

    public final int b(long j8) {
        for (int iM = nz2.m(this.f8659f, j8, true, false); iM < this.f8659f.length; iM++) {
            if ((this.f8660g[iM] & 1) != 0) {
                return iM;
            }
        }
        return -1;
    }
}
