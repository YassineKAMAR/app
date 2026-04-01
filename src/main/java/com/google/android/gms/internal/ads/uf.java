package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean f15636a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static MessageDigest f15637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f15638c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f15639d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final CountDownLatch f15640e = new CountDownLatch(1);

    static String a(byte[] bArr, String str) {
        byte[] bArrG;
        Vector vectorB = b(bArr, 255);
        if (vectorB == null || vectorB.isEmpty()) {
            bArrG = g(f(4096).g(), str, true);
        } else {
            lf lfVarM = mf.M();
            int size = vectorB.size();
            for (int i8 = 0; i8 < size; i8++) {
                lfVarM.u(rz3.L(g((byte[]) vectorB.get(i8), str, false), 0, 256));
            }
            byte[] bArrE = e(bArr);
            rz3 rz3Var = rz3.f14393b;
            lfVarM.v(rz3.L(bArrE, 0, bArrE.length));
            bArrG = ((mf) lfVarM.q()).g();
        }
        return pf.a(bArrG, true);
    }

    static Vector b(byte[] bArr, int i8) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i9 = length + 254;
        Vector vector = new Vector();
        for (int i10 = 0; i10 < i9 / 255; i10++) {
            int i11 = i10 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i11 > 255) {
                    length2 = i11 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i11, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static void d() {
        synchronized (f15639d) {
            if (!f15636a) {
                f15636a = true;
                new Thread(new tf(null)).start();
            }
        }
    }

    public static byte[] e(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f15638c) {
            d();
            MessageDigest messageDigest2 = null;
            try {
                if (f15640e.await(2L, TimeUnit.SECONDS) && (messageDigest = f15637b) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest2 == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            messageDigest2.reset();
            messageDigest2.update(bArr);
            bArrDigest = f15637b.digest();
        }
        return bArrDigest;
    }

    static ze f(int i8) {
        ce ceVarM0 = ze.m0();
        ceVarM0.x(4096L);
        return (ze) ceVarM0.q();
    }

    private static byte[] g(byte[] bArr, String str, boolean z7) {
        ByteBuffer byteBufferPut;
        int length = bArr.length;
        int i8 = true != z7 ? 255 : 239;
        if (length > i8) {
            bArr = f(4096).g();
        }
        int i9 = i8 + 1;
        int length2 = bArr.length;
        byte b8 = (byte) length2;
        if (length2 < i8) {
            byte[] bArr2 = new byte[i8 - length2];
            new SecureRandom().nextBytes(bArr2);
            byteBufferPut = ByteBuffer.allocate(i9).put(b8).put(bArr).put(bArr2);
        } else {
            byteBufferPut = ByteBuffer.allocate(i9).put(b8).put(bArr);
        }
        byte[] bArrArray = byteBufferPut.array();
        if (z7) {
            bArrArray = ByteBuffer.allocate(256).put(e(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        vf[] vfVarArr = new vg().G2;
        int length3 = vfVarArr.length;
        for (int i10 = 0; i10 < 12; i10++) {
            vfVarArr[i10].a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new nf(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }
}
