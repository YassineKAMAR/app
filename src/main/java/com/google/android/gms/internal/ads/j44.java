package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class j44 extends i44 {
    j44() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.i44
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int a(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j44.a(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.i44
    final String b(byte[] bArr, int i8, int i9) throws m14 {
        int length = bArr.length;
        if ((((length - i8) - i9) | i8 | i9) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        int i10 = i8 + i9;
        char[] cArr = new char[i9];
        int i11 = 0;
        while (i8 < i10) {
            byte b8 = bArr[i8];
            if (!h44.d(b8)) {
                break;
            }
            i8++;
            cArr[i11] = (char) b8;
            i11++;
        }
        while (i8 < i10) {
            int i12 = i8 + 1;
            byte b9 = bArr[i8];
            if (h44.d(b9)) {
                int i13 = i11 + 1;
                cArr[i11] = (char) b9;
                i8 = i12;
                while (true) {
                    i11 = i13;
                    if (i8 < i10) {
                        byte b10 = bArr[i8];
                        if (h44.d(b10)) {
                            i8++;
                            i13 = i11 + 1;
                            cArr[i11] = (char) b10;
                        }
                    }
                }
            } else if (h44.f(b9)) {
                if (i12 >= i10) {
                    throw m14.d();
                }
                h44.c(b9, bArr[i12], cArr, i11);
                i11++;
                i8 = i12 + 1;
            } else if (h44.e(b9)) {
                if (i12 >= i10 - 1) {
                    throw m14.d();
                }
                int i14 = i12 + 1;
                h44.b(b9, bArr[i12], bArr[i14], cArr, i11);
                i11++;
                i8 = i14 + 1;
            } else {
                if (i12 >= i10 - 2) {
                    throw m14.d();
                }
                int i15 = i12 + 1;
                byte b11 = bArr[i12];
                int i16 = i15 + 1;
                h44.a(b9, b11, bArr[i15], bArr[i16], cArr, i11);
                i11 += 2;
                i8 = i16 + 1;
            }
        }
        return new String(cArr, 0, i11);
    }
}
