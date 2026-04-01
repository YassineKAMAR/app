package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class j9 extends a0 {
    public j9(kx2 kx2Var, long j8, long j9) {
        super(new v(), new i9(kx2Var, null), j8, 0L, j8 + 1, 0L, j9, 188L, 1000);
    }

    static /* bridge */ /* synthetic */ int h(byte[] bArr, int i8) {
        return (bArr[i8 + 3] & 255) | ((bArr[i8] & 255) << 24) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8);
    }
}
