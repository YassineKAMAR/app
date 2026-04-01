package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class km3 implements fh3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f10166c = new byte[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f10167d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bw3 f10168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fh3 f10169b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f10167d = Collections.unmodifiableSet(hashSet);
    }

    public km3(bw3 bw3Var, fh3 fh3Var) {
        if (b(bw3Var.R())) {
            this.f10168a = bw3Var;
            this.f10169b = fh3Var;
            return;
        }
        throw new IllegalArgumentException("Unsupported DEK key type: " + bw3Var.R() + ". Only Tink AEAD key types are supported.");
    }

    public static boolean b(String str) {
        return f10167d.contains(str);
    }

    @Override // com.google.android.gms.internal.ads.fh3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i8 = byteBufferWrap.getInt();
            if (i8 <= 0 || i8 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i8];
            byteBufferWrap.get(bArr3, 0, i8);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrA = this.f10169b.a(bArr3, f10166c);
            String strR = this.f10168a.R();
            int i9 = qi3.f13525g;
            rz3 rz3Var = rz3.f14393b;
            return ((fh3) qi3.d(strR, rz3.L(bArrA, 0, bArrA.length), fh3.class)).a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e8) {
            throw new GeneralSecurityException("invalid ciphertext", e8);
        }
    }
}
