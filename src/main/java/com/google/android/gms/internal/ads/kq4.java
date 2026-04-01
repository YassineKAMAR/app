package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class kq4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f10241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f10242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final to4[] f10243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f10244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[][][] f10245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final to4 f10246f;

    kq4(String[] strArr, int[] iArr, to4[] to4VarArr, int[] iArr2, int[][][] iArr3, to4 to4Var) {
        this.f10241a = strArr;
        this.f10242b = iArr;
        this.f10243c = to4VarArr;
        this.f10245e = iArr3;
        this.f10244d = iArr2;
        this.f10246f = to4Var;
    }

    public final int a(int i8, int i9, boolean z7) {
        int i10 = this.f10243c[i8].b(i9).f15465a;
        int[] iArr = new int[1];
        int i11 = 0;
        int i12 = 0;
        for (char c8 = 0; c8 <= 0; c8 = 1) {
            if ((this.f10245e[i8][i9][0] & 7) == 4) {
                iArr[i12] = 0;
                i12++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
        String str = null;
        boolean z8 = false;
        int i13 = 0;
        int iMin = 16;
        while (i11 < iArrCopyOf.length) {
            String str2 = this.f10243c[i8].b(i9).b(iArrCopyOf[i11]).f11793l;
            int i14 = i13 + 1;
            if (i13 == 0) {
                str = str2;
            } else {
                z8 |= !nz2.e(str, str2);
            }
            iMin = Math.min(iMin, this.f10245e[i8][i9][i11] & 24);
            i11++;
            i13 = i14;
        }
        return z8 ? Math.min(iMin, this.f10244d[i8]) : iMin;
    }

    public final int b(int i8, int i9, int i10) {
        return this.f10245e[i8][i9][i10];
    }

    public final int c(int i8) {
        return this.f10242b[i8];
    }

    public final to4 d(int i8) {
        return this.f10243c[i8];
    }

    public final to4 e() {
        return this.f10246f;
    }
}
