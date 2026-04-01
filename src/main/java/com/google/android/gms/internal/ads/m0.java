package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f11098a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f11099b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f11100c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f11101d = 0;

    public static nb a(byte[] bArr, String str, String str2, e2 e2Var) {
        cp2 cp2Var;
        if (bArr[0] == 127) {
            cp2Var = new cp2(bArr, bArr.length);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            byte b8 = bArrCopyOf[0];
            if (b8 == -2 || b8 == -1) {
                for (int i8 = 0; i8 < bArrCopyOf.length - 1; i8 += 2) {
                    byte b9 = bArrCopyOf[i8];
                    int i9 = i8 + 1;
                    bArrCopyOf[i8] = bArrCopyOf[i9];
                    bArrCopyOf[i9] = b9;
                }
            }
            int length = bArrCopyOf.length;
            cp2Var = new cp2(bArrCopyOf, length);
            if (bArrCopyOf[0] == 31) {
                cp2 cp2Var2 = new cp2(bArrCopyOf, length);
                while (cp2Var2.a() >= 16) {
                    cp2Var2.l(2);
                    cp2Var.f(cp2Var2.d(14), 14);
                }
            }
            cp2Var.i(bArrCopyOf, bArrCopyOf.length);
        }
        cp2Var.l(60);
        int i10 = f11098a[cp2Var.d(6)];
        int i11 = f11099b[cp2Var.d(4)];
        int iD = cp2Var.d(5);
        int i12 = iD < 29 ? (f11100c[iD] * 1000) / 2 : -1;
        cp2Var.l(10);
        int i13 = i10 + (cp2Var.d(2) > 0 ? 1 : 0);
        l9 l9Var = new l9();
        l9Var.j(str);
        l9Var.u("audio/vnd.dts");
        l9Var.j0(i12);
        l9Var.k0(i13);
        l9Var.v(i11);
        l9Var.d(null);
        l9Var.m(str2);
        return l9Var.D();
    }
}
