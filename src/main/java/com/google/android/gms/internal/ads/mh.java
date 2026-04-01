package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class mh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Cipher f11304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f11305b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f11306c = new Object();

    public mh(SecureRandom secureRandom) {
    }

    private static final Cipher c() {
        Cipher cipher;
        synchronized (f11306c) {
            if (f11304a == null) {
                f11304a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f11304a;
        }
        return cipher;
    }

    public final String a(byte[] bArr, byte[] bArr2) throws lh {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f11305b) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return pf.a(bArr3, false);
        } catch (InvalidKeyException e8) {
            throw new lh(this, e8);
        } catch (NoSuchAlgorithmException e9) {
            throw new lh(this, e9);
        } catch (BadPaddingException e10) {
            throw new lh(this, e10);
        } catch (IllegalBlockSizeException e11) {
            throw new lh(this, e11);
        } catch (NoSuchPaddingException e12) {
            throw new lh(this, e12);
        }
    }

    public final byte[] b(byte[] bArr, String str) throws lh {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrB = pf.b(str, false);
            int length2 = bArrB.length;
            if (length2 <= 16) {
                throw new lh(this);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrB);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f11305b) {
                c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = c().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e8) {
            throw new lh(this, e8);
        } catch (InvalidAlgorithmParameterException e9) {
            throw new lh(this, e9);
        } catch (InvalidKeyException e10) {
            throw new lh(this, e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new lh(this, e11);
        } catch (BadPaddingException e12) {
            throw new lh(this, e12);
        } catch (IllegalBlockSizeException e13) {
            throw new lh(this, e13);
        } catch (NoSuchPaddingException e14) {
            throw new lh(this, e14);
        }
    }
}
