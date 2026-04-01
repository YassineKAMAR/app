package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class oc extends lc {
    oc() {
    }

    @Override // com.google.android.gms.internal.measurement.lc
    final int a(int i8, byte[] bArr, int i9, int i10) {
        while (i9 < i10 && bArr[i9] >= 0) {
            i9++;
        }
        if (i9 >= i10) {
            return 0;
        }
        while (i9 < i10) {
            int i11 = i9 + 1;
            byte b8 = bArr[i9];
            if (b8 < 0) {
                if (b8 < -32) {
                    if (i11 >= i10) {
                        return b8;
                    }
                    if (b8 >= -62) {
                        i9 = i11 + 1;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                if (b8 >= -16) {
                    if (i11 >= i10 - 2) {
                        return kc.c(bArr, i11, i10);
                    }
                    int i12 = i11 + 1;
                    byte b9 = bArr[i11];
                    if (b9 <= -65 && (((b8 << 28) + (b9 + 112)) >> 30) == 0) {
                        int i13 = i12 + 1;
                        if (bArr[i12] <= -65) {
                            i11 = i13 + 1;
                            if (bArr[i13] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i11 >= i10 - 1) {
                    return kc.c(bArr, i11, i10);
                }
                int i14 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 <= -65 && ((b8 != -32 || b10 >= -96) && (b8 != -19 || b10 < -96))) {
                    i9 = i14 + 1;
                    if (bArr[i14] > -65) {
                    }
                }
                return -1;
            }
            i9 = i11;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.lc
    final int b(CharSequence charSequence, byte[] bArr, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        char cCharAt;
        int length = charSequence.length();
        int i13 = i9 + i8;
        int i14 = 0;
        while (i14 < length && (i12 = i14 + i8) < i13 && (cCharAt = charSequence.charAt(i14)) < 128) {
            bArr[i12] = (byte) cCharAt;
            i14++;
        }
        if (i14 == length) {
            return i8 + length;
        }
        int i15 = i8 + i14;
        while (i14 < length) {
            char cCharAt2 = charSequence.charAt(i14);
            if (cCharAt2 >= 128 || i15 >= i13) {
                if (cCharAt2 < 2048 && i15 <= i13 - 2) {
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                    i15 = i16 + 1;
                    bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i15 > i13 - 3) {
                        if (i15 > i13 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i11 = i14 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i11)))) {
                                throw new nc(i14, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i15);
                        }
                        int i17 = i14 + 1;
                        if (i17 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i17);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i18 = i15 + 1;
                                bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                                int i19 = i18 + 1;
                                bArr[i18] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i20 = i19 + 1;
                                bArr[i19] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i15 = i20 + 1;
                                bArr[i20] = (byte) ((codePoint & 63) | 128);
                                i14 = i17;
                            } else {
                                i14 = i17;
                            }
                        }
                        throw new nc(i14 - 1, length);
                    }
                    int i21 = i15 + 1;
                    bArr[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i22 = i21 + 1;
                    bArr[i21] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i10 = i22 + 1;
                    bArr[i22] = (byte) ((cCharAt2 & '?') | 128);
                }
                i14++;
            } else {
                i10 = i15 + 1;
                bArr[i15] = (byte) cCharAt2;
            }
            i15 = i10;
            i14++;
        }
        return i15;
    }

    @Override // com.google.android.gms.internal.measurement.lc
    final String c(byte[] bArr, int i8, int i9) throws k9 {
        if ((i8 | i9 | ((bArr.length - i8) - i9)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        int i10 = i8 + i9;
        char[] cArr = new char[i9];
        int i11 = 0;
        while (i8 < i10) {
            byte b8 = bArr[i8];
            if (!(b8 >= 0)) {
                break;
            }
            i8++;
            mc.d(b8, cArr, i11);
            i11++;
        }
        int i12 = i11;
        while (i8 < i10) {
            int i13 = i8 + 1;
            byte b9 = bArr[i8];
            if (b9 >= 0) {
                int i14 = i12 + 1;
                mc.d(b9, cArr, i12);
                while (i13 < i10) {
                    byte b10 = bArr[i13];
                    if (!(b10 >= 0)) {
                        break;
                    }
                    i13++;
                    mc.d(b10, cArr, i14);
                    i14++;
                }
                i8 = i13;
                i12 = i14;
            } else if (b9 < -32) {
                if (i13 >= i10) {
                    throw k9.c();
                }
                mc.c(b9, bArr[i13], cArr, i12);
                i8 = i13 + 1;
                i12++;
            } else if (b9 < -16) {
                if (i13 >= i10 - 1) {
                    throw k9.c();
                }
                int i15 = i13 + 1;
                mc.b(b9, bArr[i13], bArr[i15], cArr, i12);
                i8 = i15 + 1;
                i12++;
            } else {
                if (i13 >= i10 - 2) {
                    throw k9.c();
                }
                int i16 = i13 + 1;
                byte b11 = bArr[i13];
                int i17 = i16 + 1;
                mc.a(b9, b11, bArr[i16], bArr[i17], cArr, i12);
                i8 = i17 + 1;
                i12 = i12 + 1 + 1;
            }
        }
        return new String(cArr, 0, i12);
    }
}
