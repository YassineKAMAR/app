package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class oo4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Random f12588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f12589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f12590c;

    public oo4(int i8) {
        this(0, new Random());
    }

    private oo4(int i8, Random random) {
        this(new int[0], random);
    }

    private oo4(int[] iArr, Random random) {
        this.f12589b = iArr;
        this.f12588a = random;
        this.f12590c = new int[iArr.length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            this.f12590c[iArr[i8]] = i8;
        }
    }

    public final int a() {
        int[] iArr = this.f12589b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final int b() {
        int[] iArr = this.f12589b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int c() {
        return this.f12589b.length;
    }

    public final int d(int i8) {
        int i9 = this.f12590c[i8] + 1;
        int[] iArr = this.f12589b;
        if (i9 < iArr.length) {
            return iArr[i9];
        }
        return -1;
    }

    public final int e(int i8) {
        int i9 = this.f12590c[i8] - 1;
        if (i9 >= 0) {
            return this.f12589b[i9];
        }
        return -1;
    }

    public final oo4 f() {
        return new oo4(0, new Random(this.f12588a.nextLong()));
    }

    public final oo4 g(int i8, int i9) {
        int[] iArr = new int[i9];
        int[] iArr2 = new int[i9];
        int i10 = 0;
        int i11 = 0;
        while (i11 < i9) {
            iArr[i11] = this.f12588a.nextInt(this.f12589b.length + 1);
            int i12 = i11 + 1;
            int iNextInt = this.f12588a.nextInt(i12);
            iArr2[i11] = iArr2[iNextInt];
            iArr2[iNextInt] = i11;
            i11 = i12;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.f12589b.length + i9];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr4 = this.f12589b;
            if (i10 >= iArr4.length + i9) {
                return new oo4(iArr3, new Random(this.f12588a.nextLong()));
            }
            if (i13 >= i9 || i14 != iArr[i13]) {
                int i15 = i14 + 1;
                int i16 = iArr4[i14];
                iArr3[i10] = i16;
                if (i16 >= 0) {
                    iArr3[i10] = i16 + i9;
                }
                i14 = i15;
            } else {
                iArr3[i10] = iArr2[i13];
                i13++;
            }
            i10++;
        }
    }

    public final oo4 h(int i8, int i9) {
        int[] iArr = new int[this.f12589b.length - i9];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr2 = this.f12589b;
            if (i10 >= iArr2.length) {
                return new oo4(iArr, new Random(this.f12588a.nextLong()));
            }
            int i12 = iArr2[i10];
            if (i12 < 0 || i12 >= i9) {
                int i13 = i10 - i11;
                if (i12 >= 0) {
                    i12 -= i9;
                }
                iArr[i13] = i12;
            } else {
                i11++;
            }
            i10++;
        }
    }
}
