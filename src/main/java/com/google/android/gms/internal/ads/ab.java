package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class ab {
    public static long a(ByteBuffer byteBuffer) {
        g(byteBuffer);
        return e(byteBuffer, byteBuffer.position() + 16);
    }

    public static long b(ByteBuffer byteBuffer) {
        g(byteBuffer);
        return e(byteBuffer, byteBuffer.position() + 12);
    }

    static Pair c(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair pairF = f(randomAccessFile, 0);
        return pairF != null ? pairF : f(randomAccessFile, 65535);
    }

    public static void d(ByteBuffer byteBuffer, long j8) {
        g(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j8 >= 0 && j8 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j8);
            return;
        }
        throw new IllegalArgumentException("uint32 value of out range: " + j8);
    }

    private static long e(ByteBuffer byteBuffer, int i8) {
        return ((long) byteBuffer.getInt(i8)) & 4294967295L;
    }

    private static Pair f(RandomAccessFile randomAccessFile, int i8) throws IOException {
        int i9;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i8, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        g(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i9 = -1;
        } else {
            int i10 = iCapacity - 22;
            int iMin = Math.min(i10, 65535);
            for (int i11 = 0; i11 < iMin; i11++) {
                i9 = i10 - i11;
                if (byteBufferAllocate.getInt(i9) == 101010256 && ((char) byteBufferAllocate.getShort(i9 + 20)) == i11) {
                    break;
                }
            }
            i9 = -1;
        }
        if (i9 == -1) {
            return null;
        }
        byteBufferAllocate.position(i9);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i9)));
    }

    private static void g(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
