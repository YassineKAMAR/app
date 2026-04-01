package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class ox3 implements oy3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f12659d = new nx3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f12660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12662c;

    public ox3(byte[] bArr, int i8) throws GeneralSecurityException {
        if (!un3.a(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        uy3.a(bArr.length);
        this.f12660a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f12659d.get()).getBlockSize();
        this.f12662c = blockSize;
        if (i8 < 12 || i8 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f12661b = i8;
    }

    @Override // com.google.android.gms.internal.ads.oy3
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i8 = this.f12661b;
        if (length < i8) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, 0, bArr2, 0, i8);
        int i9 = this.f12661b;
        int i10 = length - i9;
        byte[] bArr3 = new byte[i10];
        Cipher cipher = (Cipher) f12659d.get();
        byte[] bArr4 = new byte[this.f12662c];
        System.arraycopy(bArr2, 0, bArr4, 0, this.f12661b);
        cipher.init(2, this.f12660a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i9, i10, bArr3, 0) == i10) {
            return bArr3;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
