package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m1 {
    public static int a(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int b(ByteBuffer byteBuffer) {
        int i8;
        if ((byteBuffer.get(5) & 2) == 0) {
            i8 = 0;
        } else {
            byte b8 = byteBuffer.get(26);
            int i9 = 28;
            int i10 = 28;
            for (int i11 = 0; i11 < b8; i11++) {
                i10 += byteBuffer.get(i11 + 27);
            }
            byte b9 = byteBuffer.get(i10 + 26);
            for (int i12 = 0; i12 < b9; i12++) {
                i9 += byteBuffer.get(i10 + 27 + i12);
            }
            i8 = i10 + i9;
        }
        int i13 = byteBuffer.get(i8 + 26) + 27 + i8;
        return (int) ((f(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int c(ByteBuffer byteBuffer) {
        return (int) ((f(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long d(byte[] bArr) {
        return f(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static List e(byte[] bArr) {
        long jA = a(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(h(g(jA)));
        arrayList.add(h(g(3840L)));
        return arrayList;
    }

    private static long f(byte b8, byte b9) {
        int i8 = b8 & 255;
        int i9 = i8 & 3;
        int i10 = 2;
        if (i9 == 0) {
            i10 = 1;
        } else if (i9 != 1 && i9 != 2) {
            i10 = b9 & 63;
        }
        int i11 = i8 >> 3;
        int i12 = i11 & 3;
        return ((long) i10) * ((long) (i11 >= 16 ? 2500 << i12 : i11 >= 12 ? 10000 << (i12 & 1) : i12 == 3 ? 60000 : 10000 << i12));
    }

    private static long g(long j8) {
        return (j8 * 1000000000) / 48000;
    }

    private static byte[] h(long j8) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j8).array();
    }
}
