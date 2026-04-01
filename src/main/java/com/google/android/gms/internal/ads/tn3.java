package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class tn3 implements fh3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f15176b = new sn3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f15177c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKey f15178a;

    static {
        boolean z7;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            z7 = true;
        } catch (ClassNotFoundException unused) {
            z7 = false;
        }
        f15177c = z7;
    }

    public tn3(byte[] bArr) throws InvalidAlgorithmParameterException {
        uy3.a(bArr.length);
        this.f15178a = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.ads.fh3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec ivParameterSpec;
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (f15177c) {
            ivParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        } else {
            if (!ty3.a()) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            ivParameterSpec = new IvParameterSpec(bArr, 0, 12);
        }
        ThreadLocal threadLocal = f15176b;
        ((Cipher) threadLocal.get()).init(2, this.f15178a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr, 12, length - 12);
    }
}
