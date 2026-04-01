package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class nd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final OutputStream f11829a = new md3();

    public static byte[] a(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iHighestOneBit = Integer.highestOneBit(0);
        int iMin = Math.min(8192, Math.max(128, iHighestOneBit + iHighestOneBit));
        int i8 = 0;
        while (i8 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i8);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i9 = 0;
            while (i9 < iMin2) {
                int i10 = inputStream.read(bArr, i9, iMin2 - i9);
                if (i10 == -1) {
                    return b(arrayDeque, i8);
                }
                i9 += i10;
                i8 += i10;
            }
            iMin = td3.c(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return b(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] b(Queue queue, int i8) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i8) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i8);
        int i9 = i8 - length;
        while (i9 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(i9, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i8 - i9, iMin);
            i9 -= iMin;
        }
        return bArrCopyOf;
    }
}
