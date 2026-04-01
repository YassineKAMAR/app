package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class bm extends vl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MessageDigest f5874c;

    @Override // com.google.android.gms.internal.ads.vl
    public final byte[] b(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i8 = 4;
        if (length == 1) {
            int iA = am.a(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iA);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i9 = 0; i9 < strArrSplit.length; i9++) {
                    int iA2 = am.a(strArrSplit[i9]);
                    int i10 = (iA2 >> 16) ^ ((char) iA2);
                    int i11 = i9 + i9;
                    bArr[i11] = (byte) i10;
                    bArr[i11 + 1] = (byte) (i10 >> 8);
                }
            } else {
                bArr = new byte[length];
                for (int i12 = 0; i12 < strArrSplit.length; i12++) {
                    int iA3 = am.a(strArrSplit[i12]);
                    bArr[i12] = (byte) ((iA3 >> 24) ^ (((iA3 & 255) ^ ((iA3 >> 8) & 255)) ^ ((iA3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f5874c = a();
        synchronized (this.f16336a) {
            MessageDigest messageDigest = this.f5874c;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.f5874c.update(bArrArray);
            byte[] bArrDigest = this.f5874c.digest();
            int length2 = bArrDigest.length;
            if (length2 <= 4) {
                i8 = length2;
            }
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArrDigest, 0, bArr2, 0, i8);
            return bArr2;
        }
    }
}
