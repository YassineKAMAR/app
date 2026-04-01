package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class rx3 implements fh3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadLocal f14367e = new px3();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f14368f = new qx3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f14369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f14370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SecretKeySpec f14371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14372d;

    public rx3(byte[] bArr, int i8) throws GeneralSecurityException {
        if (!un3.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i8 != 12 && i8 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f14372d = i8;
        uy3.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f14371c = secretKeySpec;
        Cipher cipher = (Cipher) f14367e.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrB = b(cipher.doFinal(new byte[16]));
        this.f14369a = bArrB;
        this.f14370b = b(bArrB);
    }

    private static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i8 = 0;
        while (i8 < 15) {
            byte b8 = bArr[i8];
            int i9 = i8 + 1;
            bArr2[i8] = (byte) (((b8 + b8) ^ ((bArr[i9] & 255) >>> 7)) & 255);
            i8 = i9;
        }
        byte b9 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b9 + b9));
        return bArr2;
    }

    private final byte[] c(Cipher cipher, int i8, byte[] bArr, int i9, int i10) throws BadPaddingException, IllegalBlockSizeException {
        int length;
        byte[] bArrD;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i8;
        if (i10 == 0) {
            return cipher.doFinal(d(bArr2, this.f14369a));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i11 = 0;
        int i12 = 0;
        while (i10 - i12 > 16) {
            for (int i13 = 0; i13 < 16; i13++) {
                bArrDoFinal[i13] = (byte) (bArr[(i9 + i12) + i13] ^ bArrDoFinal[i13]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i12 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i12 + i9, i9 + i10);
        if (bArrCopyOfRange.length == 16) {
            bArrD = d(bArrCopyOfRange, this.f14369a);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.f14370b, 16);
            while (true) {
                length = bArrCopyOfRange.length;
                if (i11 >= length) {
                    break;
                }
                bArrCopyOf[i11] = (byte) (bArrCopyOf[i11] ^ bArrCopyOfRange[i11]);
                i11++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
            bArrD = bArrCopyOf;
        }
        return cipher.doFinal(d(bArrDoFinal, bArrD));
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            bArr3[i8] = (byte) (bArr[i8] ^ bArr2[i8]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ads.fh3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i8 = (length - this.f14372d) - 16;
        if (i8 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f14367e.get();
        cipher.init(1, this.f14371c);
        byte[] bArrC = c(cipher, 0, bArr, 0, this.f14372d);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] bArrC2 = c(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrC3 = c(cipher, 2, bArr, this.f14372d, i8);
        int i9 = length - 16;
        byte b8 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            b8 = (byte) (b8 | (((bArr[i9 + i10] ^ bArrC2[i10]) ^ bArrC[i10]) ^ bArrC3[i10]));
        }
        if (b8 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f14368f.get();
        cipher2.init(1, this.f14371c, new IvParameterSpec(bArrC));
        return cipher2.doFinal(bArr, this.f14372d, i8);
    }
}
