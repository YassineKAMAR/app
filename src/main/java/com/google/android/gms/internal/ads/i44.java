package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
abstract class i44 {
    i44() {
    }

    static final String d(ByteBuffer byteBuffer, int i8, int i9) throws m14 {
        if ((((byteBuffer.limit() - i8) - i9) | i8 | i9) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        int i10 = i8 + i9;
        char[] cArr = new char[i9];
        int i11 = 0;
        while (i8 < i10) {
            byte b8 = byteBuffer.get(i8);
            if (!h44.d(b8)) {
                break;
            }
            i8++;
            cArr[i11] = (char) b8;
            i11++;
        }
        int i12 = i11;
        while (i8 < i10) {
            int i13 = i8 + 1;
            byte b9 = byteBuffer.get(i8);
            if (h44.d(b9)) {
                int i14 = i12 + 1;
                cArr[i12] = (char) b9;
                i8 = i13;
                while (true) {
                    i12 = i14;
                    if (i8 < i10) {
                        byte b10 = byteBuffer.get(i8);
                        if (h44.d(b10)) {
                            i8++;
                            i14 = i12 + 1;
                            cArr[i12] = (char) b10;
                        }
                    }
                }
            } else if (h44.f(b9)) {
                if (i13 >= i10) {
                    throw m14.d();
                }
                h44.c(b9, byteBuffer.get(i13), cArr, i12);
                i12++;
                i8 = i13 + 1;
            } else if (h44.e(b9)) {
                if (i13 >= i10 - 1) {
                    throw m14.d();
                }
                int i15 = i13 + 1;
                h44.b(b9, byteBuffer.get(i13), byteBuffer.get(i15), cArr, i12);
                i12++;
                i8 = i15 + 1;
            } else {
                if (i13 >= i10 - 2) {
                    throw m14.d();
                }
                int i16 = i13 + 1;
                byte b11 = byteBuffer.get(i13);
                int i17 = i16 + 1;
                h44.a(b9, b11, byteBuffer.get(i16), byteBuffer.get(i17), cArr, i12);
                i12 += 2;
                i8 = i17 + 1;
            }
        }
        return new String(cArr, 0, i12);
    }

    abstract int a(int i8, byte[] bArr, int i9, int i10);

    abstract String b(byte[] bArr, int i8, int i9);

    final boolean c(byte[] bArr, int i8, int i9) {
        return a(0, bArr, i8, i9) == 0;
    }
}
