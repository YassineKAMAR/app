package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class kn3 extends ln3 {
    public kn3(byte[] bArr, int i8) {
        super(bArr, i8);
    }

    @Override // com.google.android.gms.internal.ads.ln3
    public final int a() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.ln3
    public final int[] b(int[] iArr, int i8) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        hn3.b(iArr2, this.f10789a);
        iArr2[12] = i8;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
