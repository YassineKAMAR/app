package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class py3 implements et3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKey f13196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f13197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f13198c;

    public py3(byte[] bArr) throws GeneralSecurityException {
        uy3.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f13196a = secretKeySpec;
        Cipher cipherB = b();
        cipherB.init(1, secretKeySpec);
        byte[] bArrA = ks3.a(cipherB.doFinal(new byte[16]));
        this.f13197b = bArrA;
        this.f13198c = ks3.a(bArrA);
    }

    private static Cipher b() throws GeneralSecurityException {
        if (un3.a(1)) {
            return (Cipher) ey3.f7544b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.et3
    public final byte[] a(byte[] bArr, int i8) throws GeneralSecurityException {
        byte[] bArrC;
        if (i8 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.f13196a;
        Cipher cipherB = b();
        cipherB.init(1, secretKey);
        int length = bArr.length;
        int iMax = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
        int i9 = iMax - 1;
        int i10 = i9 * 16;
        if (iMax * 16 == length) {
            bArrC = tx3.d(bArr, i10, this.f13197b, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            bArrC = tx3.c(bArrCopyOf, this.f13198c);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i11 = 0; i11 < i9; i11++) {
            bArrDoFinal = cipherB.doFinal(tx3.d(bArrDoFinal, 0, bArr, i11 * 16, 16));
        }
        return Arrays.copyOf(cipherB.doFinal(tx3.c(bArrC, bArrDoFinal)), i8);
    }
}
