package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class pn3 extends ln3 {
    public pn3(byte[] bArr, int i8) {
        super(bArr, i8);
    }

    @Override // com.google.android.gms.internal.ads.ln3
    final int a() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.ln3
    final int[] b(int[] iArr, int i8) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        hn3.b(iArr3, this.f10789a);
        iArr3[12] = iArr[0];
        iArr3[13] = iArr[1];
        iArr3[14] = iArr[2];
        iArr3[15] = iArr[3];
        hn3.c(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        hn3.b(iArr2, Arrays.copyOf(iArr3, 8));
        iArr2[12] = i8;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
