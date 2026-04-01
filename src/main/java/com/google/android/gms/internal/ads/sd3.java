package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class sd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f14624a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f14625b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f14626c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f14627d = new int[10];

    public static int a(byte[] bArr, int i8, int i9, boolean[] zArr) {
        int i10 = i9 - i8;
        uu1.f(i10 >= 0);
        if (i10 == 0) {
            return i9;
        }
        if (zArr[0]) {
            f(zArr);
            return i8 - 3;
        }
        if (i10 > 1 && zArr[1] && bArr[i8] == 1) {
            f(zArr);
            return i8 - 2;
        }
        if (i10 > 2 && zArr[2] && bArr[i8] == 0 && bArr[i8 + 1] == 1) {
            f(zArr);
            return i8 - 1;
        }
        int i11 = i9 - 1;
        int i12 = i8 + 2;
        while (i12 < i11) {
            byte b8 = bArr[i12];
            if ((b8 & 254) == 0) {
                int i13 = i12 - 2;
                if (bArr[i13] == 0 && bArr[i12 - 1] == 0 && b8 == 1) {
                    f(zArr);
                    return i13;
                }
                i12 = i13;
            }
            i12 += 3;
        }
        zArr[0] = i10 <= 2 ? !(i10 != 2 ? !(zArr[1] && bArr[i11] == 1) : !(zArr[2] && bArr[i9 + (-2)] == 0 && bArr[i11] == 1)) : bArr[i9 + (-3)] == 0 && bArr[i9 + (-2)] == 0 && bArr[i11] == 1;
        zArr[1] = i10 <= 1 ? zArr[2] && bArr[i11] == 0 : bArr[i9 + (-2)] == 0 && bArr[i11] == 0;
        zArr[2] = bArr[i11] == 0;
        return i9;
    }

    public static int b(byte[] bArr, int i8) {
        int i9;
        synchronized (f14626c) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < i8) {
                while (true) {
                    try {
                        if (i10 >= i8 - 2) {
                            i10 = i8;
                            break;
                        }
                        int i12 = i10 + 1;
                        if (bArr[i10] == 0 && bArr[i12] == 0 && bArr[i10 + 2] == 3) {
                            break;
                        }
                        i10 = i12;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i10 < i8) {
                    int[] iArr = f14627d;
                    int length = iArr.length;
                    if (length <= i11) {
                        f14627d = Arrays.copyOf(iArr, length + length);
                    }
                    f14627d[i11] = i10;
                    i10 += 3;
                    i11++;
                }
            }
            i9 = i8 - i11;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = f14627d[i15] - i13;
                System.arraycopy(bArr, i13, bArr, i14, i16);
                int i17 = i14 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i14 = i18 + 1;
                bArr[i18] = 0;
                i13 += i16 + 3;
            }
            System.arraycopy(bArr, i13, bArr, i14, i9 - i14);
        }
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.qa3 c(byte[] r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sd3.c(byte[], int, int):com.google.android.gms.internal.ads.qa3");
    }

    public static rb3 d(byte[] bArr, int i8, int i9) {
        ff3 ff3Var = new ff3(bArr, 4, i9);
        int iC = ff3Var.c();
        int iC2 = ff3Var.c();
        ff3Var.d();
        return new rb3(iC, iC2, ff3Var.f());
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.rc3 e(byte[] r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sd3.e(byte[], int, int):com.google.android.gms.internal.ads.rc3");
    }

    public static void f(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
