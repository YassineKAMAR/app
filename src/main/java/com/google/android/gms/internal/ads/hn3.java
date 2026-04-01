package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes.dex */
final class hn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f8862a = d(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    static void a(int[] iArr, int i8, int i9, int i10, int i11) {
        int i12 = iArr[i8] + iArr[i9];
        iArr[i8] = i12;
        int i13 = i12 ^ iArr[i11];
        int i14 = (i13 >>> (-16)) | (i13 << 16);
        iArr[i11] = i14;
        int i15 = iArr[i10] + i14;
        iArr[i10] = i15;
        int i16 = iArr[i9] ^ i15;
        int i17 = (i16 >>> (-12)) | (i16 << 12);
        iArr[i9] = i17;
        int i18 = iArr[i8] + i17;
        iArr[i8] = i18;
        int i19 = iArr[i11] ^ i18;
        int i20 = (i19 >>> (-8)) | (i19 << 8);
        iArr[i11] = i20;
        int i21 = iArr[i10] + i20;
        iArr[i10] = i21;
        int i22 = iArr[i9] ^ i21;
        iArr[i9] = (i22 >>> (-7)) | (i22 << 7);
    }

    static void b(int[] iArr, int[] iArr2) {
        int[] iArr3 = f8862a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static void c(int[] iArr) {
        for (int i8 = 0; i8 < 10; i8++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    static int[] d(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }
}
