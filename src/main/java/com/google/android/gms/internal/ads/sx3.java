package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class sx3 implements fh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jn3 f14857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f14858b;

    public sx3(byte[] bArr) throws GeneralSecurityException {
        wy3 wy3VarB = wy3.b(new byte[0]);
        if (!un3.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f14857a = new jn3(bArr, true);
        this.f14858b = wy3VarB.c();
    }

    @Override // com.google.android.gms.internal.ads.fh3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f14858b;
        int length = bArr3.length;
        if (length == 0) {
            return this.f14857a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
        }
        Charset charset = iq3.f9325a;
        if (bArr.length >= length) {
            for (int i8 = 0; i8 < bArr3.length; i8++) {
                if (bArr[i8] == bArr3[i8]) {
                }
            }
            byte[] bArr4 = this.f14858b;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr.length);
            return this.f14857a.a(Arrays.copyOf(bArrCopyOfRange, 12), bArrCopyOfRange, bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
