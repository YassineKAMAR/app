package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ks3 {
    public static byte[] a(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i8 = 0;
        while (i8 < 16) {
            int i9 = i8 + 1;
            byte b8 = bArr[i8];
            byte b9 = (byte) ((b8 + b8) & 254);
            bArr2[i8] = b9;
            if (i8 < 15) {
                bArr2[i8] = (byte) (((bArr[i9] >> 7) & 1) | b9);
            }
            i8 = i9;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
