package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ea {
    public static int a(byte[] bArr, int i8, int i9) {
        while (i8 < i9 && bArr[i8] != 71) {
            i8++;
        }
        return i8;
    }

    public static long b(dq2 dq2Var, int i8, int i9) {
        dq2Var.g(i8);
        if (dq2Var.j() < 5) {
            return -9223372036854775807L;
        }
        int iO = dq2Var.o();
        if ((8388608 & iO) != 0 || ((iO >> 8) & 8191) != i9 || (iO & 32) == 0 || dq2Var.u() < 7 || dq2Var.j() < 7 || (dq2Var.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        dq2Var.c(bArr, 0, 6);
        long j8 = bArr[0];
        long j9 = bArr[1];
        long j10 = bArr[2];
        long j11 = bArr[3] & 255;
        return ((j8 & 255) << 25) | ((j9 & 255) << 17) | ((j10 & 255) << 9) | (j11 + j11) | ((((long) bArr[4]) & 255) >> 7);
    }
}
