package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes.dex */
abstract class ln3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f10789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10790b;

    public ln3(byte[] bArr, int i8) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f10789a = hn3.d(bArr);
        this.f10790b = i8;
    }

    abstract int a();

    abstract int[] b(int[] iArr, int i8);

    final ByteBuffer c(byte[] bArr, int i8) {
        int[] iArrB = b(hn3.d(bArr), i8);
        int[] iArr = (int[]) iArrB.clone();
        hn3.c(iArr);
        for (int i9 = 0; i9 < 16; i9++) {
            iArrB[i9] = iArrB[i9] + iArr[i9];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    public final byte[] d(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != a()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + a());
        }
        int iRemaining = byteBuffer.remaining();
        int i8 = iRemaining / 64;
        int i9 = 0;
        while (true) {
            int i10 = i8 + 1;
            if (i9 >= i10) {
                return byteBufferAllocate.array();
            }
            ByteBuffer byteBufferC = c(bArr, this.f10790b + i9);
            if (i9 == i10 - 1) {
                tx3.a(byteBufferAllocate, byteBuffer, byteBufferC, iRemaining % 64);
            } else {
                tx3.a(byteBufferAllocate, byteBuffer, byteBufferC, 64);
            }
            i9++;
        }
    }
}
