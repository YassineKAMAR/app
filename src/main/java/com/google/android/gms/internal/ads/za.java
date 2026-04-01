package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class za {
    public static X509Certificate[][] a(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair pairC = ab.c(randomAccessFile);
            if (pairC == null) {
                throw new wa("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairC.first;
            long jLongValue = ((Long) pairC.second).longValue();
            long j8 = (-20) + jLongValue;
            if (j8 >= 0) {
                randomAccessFile.seek(j8);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new wa("ZIP64 APK not supported");
                }
            }
            long jA = ab.a(byteBuffer);
            if (jA >= jLongValue) {
                throw new wa("ZIP Central Directory offset out of range: " + jA + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            if (ab.b(byteBuffer) + jA != jLongValue) {
                throw new wa("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jA < 32) {
                throw new wa("APK too small for APK Signing Block. ZIP Central Directory offset: " + jA);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(jA - ((long) byteBufferAllocate.capacity()));
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new wa("No APK Signing Block before ZIP Central Directory");
            }
            int i8 = 0;
            long j9 = byteBufferAllocate.getLong(0);
            if (j9 < byteBufferAllocate.capacity() || j9 > 2147483639) {
                throw new wa("APK Signing Block size out of range: " + j9);
            }
            int i9 = (int) (8 + j9);
            long j10 = jA - ((long) i9);
            if (j10 < 0) {
                throw new wa("APK Signing Block offset out of range: " + j10);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i9);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j10);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j11 = byteBufferAllocate2.getLong(0);
            if (j11 != j9) {
                throw new wa("APK Signing Block sizes in header and footer do not match: " + j11 + " vs " + j9);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j10));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                while (byteBufferSlice.hasRemaining()) {
                    i8++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new wa("Insufficient data to read size of APK Signing Block entry #" + i8);
                    }
                    long j12 = byteBufferSlice.getLong();
                    if (j12 < 4 || j12 > 2147483647L) {
                        throw new wa("APK Signing Block entry #" + i8 + " size out of range: " + j12);
                    }
                    int i10 = (int) j12;
                    int iPosition2 = byteBufferSlice.position() + i10;
                    if (i10 > byteBufferSlice.remaining()) {
                        throw new wa("APK Signing Block entry #" + i8 + " size out of range: " + i10 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrL = l(randomAccessFile.getChannel(), new va(e(byteBufferSlice, i10 - 4), jLongValue2, jA, jLongValue, byteBuffer, null));
                        randomAccessFile.close();
                        return x509CertificateArrL;
                    }
                    byteBufferSlice.position(iPosition2);
                }
                throw new wa("No APK Signature Scheme v2 block in APK Signing Block");
            } finally {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    private static int b(int i8) {
        if (i8 == 1) {
            return 32;
        }
        if (i8 == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i8);
    }

    private static int c(int i8) {
        if (i8 == 513) {
            return 1;
        }
        if (i8 == 514) {
            return 2;
        }
        if (i8 == 769) {
            return 1;
        }
        switch (i8) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i8))));
        }
    }

    private static String d(int i8) {
        if (i8 == 1) {
            return "SHA-256";
        }
        if (i8 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i8);
    }

    private static ByteBuffer e(ByteBuffer byteBuffer, int i8) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i9 = i8 + iPosition;
        if (i9 < iPosition || i9 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i9);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i9);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static ByteBuffer f(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i8 = byteBuffer.getInt();
        if (i8 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i8 <= byteBuffer.remaining()) {
            return e(byteBuffer, i8);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i8 + ", remaining: " + byteBuffer.remaining());
    }

    private static void g(int i8, byte[] bArr, int i9) {
        bArr[1] = (byte) (i8 & 255);
        bArr[2] = (byte) ((i8 >>> 8) & 255);
        bArr[3] = (byte) ((i8 >>> 16) & 255);
        bArr[4] = (byte) (i8 >> 24);
    }

    private static void h(Map map, FileChannel fileChannel, long j8, long j9, long j10, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        ta taVar = new ta(fileChannel, 0L, j8);
        ta taVar2 = new ta(fileChannel, j9, j10 - j9);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        ab.d(byteBufferDuplicate, j8);
        ra raVar = new ra(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            iArr[i8] = ((Integer) it.next()).intValue();
            i8++;
        }
        try {
            byte[][] bArrK = k(iArr, new sa[]{taVar, taVar2, raVar});
            for (int i9 = 0; i9 < size; i9++) {
                int i10 = iArr[i9];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i10)), bArrK[i9])) {
                    throw new SecurityException(d(i10).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e8) {
            throw new SecurityException("Failed to compute digest(s) of contents", e8);
        }
    }

    private static byte[] i(ByteBuffer byteBuffer) throws IOException {
        int i8 = byteBuffer.getInt();
        if (i8 < 0) {
            throw new IOException("Negative length");
        }
        if (i8 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i8];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i8 + ", available: " + byteBuffer.remaining());
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012e A[Catch: InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x024e, InvalidAlgorithmParameterException -> 0x0250, InvalidKeyException -> 0x0252, InvalidKeySpecException -> 0x0254, NoSuchAlgorithmException -> 0x0256, TryCatch #5 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x024e, blocks: (B:60:0x0118, B:62:0x012e, B:63:0x0131), top: B:130:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.cert.X509Certificate[] j(java.nio.ByteBuffer r22, java.util.Map r23, java.security.cert.CertificateFactory r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.za.j(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] k(int[] iArr, sa[] saVarArr) throws DigestException {
        long j8;
        int i8;
        int length;
        long j9 = 0;
        int i9 = 0;
        long j10 = 0;
        int i10 = 0;
        while (true) {
            j8 = 1048576;
            if (i10 >= 3) {
                break;
            }
            j10 += (saVarArr[i10].j() + 1048575) / 1048576;
            i10++;
        }
        if (j10 >= 2097151) {
            throw new DigestException("Too many chunks: " + j10);
        }
        byte[][] bArr = new byte[iArr.length][];
        int i11 = 0;
        while (true) {
            length = iArr.length;
            if (i11 >= length) {
                break;
            }
            int i12 = (int) j10;
            byte[] bArr2 = new byte[(b(iArr[i11]) * i12) + 5];
            bArr2[0] = 90;
            g(i12, bArr2, 1);
            bArr[i11] = bArr2;
            i11++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            String strD = d(iArr[i13]);
            try {
                messageDigestArr[i13] = MessageDigest.getInstance(strD);
            } catch (NoSuchAlgorithmException e8) {
                throw new RuntimeException(strD.concat(" digest not supported"), e8);
            }
        }
        int i14 = 0;
        int i15 = 0;
        for (i8 = 3; i14 < i8; i8 = 3) {
            sa saVar = saVarArr[i14];
            long j11 = j9;
            long j12 = saVar.j();
            while (j12 > j9) {
                int iMin = (int) Math.min(j12, j8);
                g(iMin, bArr3, 1);
                for (int i16 = 0; i16 < length; i16++) {
                    messageDigestArr[i16].update(bArr3);
                }
                long j13 = j11;
                try {
                    saVar.a(messageDigestArr, j13, iMin);
                    byte[] bArr4 = bArr3;
                    int i17 = 0;
                    while (i17 < iArr.length) {
                        int i18 = iArr[i17];
                        sa saVar2 = saVar;
                        byte[] bArr5 = bArr[i17];
                        int iB = b(i18);
                        int i19 = length;
                        MessageDigest messageDigest = messageDigestArr[i17];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int iDigest = messageDigest.digest(bArr5, (i15 * iB) + 5, iB);
                        if (iDigest != iB) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i17++;
                        saVar = saVar2;
                        length = i19;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j14 = iMin;
                    long j15 = j13 + j14;
                    j12 -= j14;
                    i15++;
                    j9 = 0;
                    j8 = 1048576;
                    bArr3 = bArr4;
                    j11 = j15;
                    messageDigestArr = messageDigestArr;
                } catch (IOException e9) {
                    throw new DigestException("Failed to digest chunk #" + i15 + " of section #" + i9, e9);
                }
            }
            i9++;
            i14++;
            j9 = 0;
            j8 = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i20 = 0; i20 < iArr.length; i20++) {
            int i21 = iArr[i20];
            byte[] bArr7 = bArr[i20];
            String strD2 = d(i21);
            try {
                bArr6[i20] = MessageDigest.getInstance(strD2).digest(bArr7);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(strD2.concat(" digest not supported"), e10);
            }
        }
        return bArr6;
    }

    private static X509Certificate[][] l(FileChannel fileChannel, va vaVar) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferF = f(vaVar.f16080a);
                int i8 = 0;
                while (byteBufferF.hasRemaining()) {
                    i8++;
                    try {
                        arrayList.add(j(f(byteBufferF), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e8) {
                        throw new SecurityException("Failed to parse/verify signer #" + i8 + " block", e8);
                    }
                }
                if (i8 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                h(map, fileChannel, vaVar.f16081b, vaVar.f16082c, vaVar.f16083d, vaVar.f16084e);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e9) {
                throw new SecurityException("Failed to read list of signers", e9);
            }
        } catch (CertificateException e10) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e10);
        }
    }
}
