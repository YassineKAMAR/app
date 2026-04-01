package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f4 f19579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f19580b = 0;

    static {
        if (d4.C() && d4.D()) {
            int i8 = z.f19745a;
        }
        f19579a = new g4();
    }

    static /* bridge */ /* synthetic */ int a(byte[] bArr, int i8, int i9) {
        int i10 = i9 - i8;
        byte b8 = bArr[i8 - 1];
        if (i10 == 0) {
            if (b8 <= -12) {
                return b8;
            }
            return -1;
        }
        if (i10 == 1) {
            byte b9 = bArr[i8];
            if (b8 > -12 || b9 > -65) {
                return -1;
            }
            return (b9 << 8) ^ b8;
        }
        if (i10 != 2) {
            throw new AssertionError();
        }
        byte b10 = bArr[i8];
        byte b11 = bArr[i8 + 1];
        if (b8 > -12 || b10 > -65 || b11 > -65) {
            return -1;
        }
        return (b11 << 16) ^ ((b10 << 8) ^ b8);
    }

    static int b(CharSequence charSequence, byte[] bArr, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        char cCharAt;
        int length = charSequence.length();
        int i13 = 0;
        while (true) {
            i10 = i8 + i9;
            if (i13 >= length || (i12 = i13 + i8) >= i10 || (cCharAt = charSequence.charAt(i13)) >= 128) {
                break;
            }
            bArr[i12] = (byte) cCharAt;
            i13++;
        }
        if (i13 == length) {
            return i8 + length;
        }
        int i14 = i8 + i13;
        while (i13 < length) {
            char cCharAt2 = charSequence.charAt(i13);
            if (cCharAt2 < 128 && i14 < i10) {
                bArr[i14] = (byte) cCharAt2;
                i14++;
            } else if (cCharAt2 < 2048 && i14 <= i10 - 2) {
                int i15 = i14 + 1;
                bArr[i14] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i15] = (byte) ((cCharAt2 & '?') | 128);
                i14 = i15 + 1;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i14 > i10 - 3) {
                    if (i14 > i10 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i11 = i13 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i11)))) {
                            throw new h4(i13, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i14);
                    }
                    int i16 = i13 + 1;
                    if (i16 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i16);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i17 = i14 + 1;
                            int i18 = i17 + 1;
                            int i19 = i18 + 1;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i17] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i18] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i14 = i19 + 1;
                            bArr[i19] = (byte) ((codePoint & 63) | 128);
                            i13 = i16;
                        } else {
                            i13 = i16;
                        }
                    }
                    throw new h4(i13 - 1, length);
                }
                int i20 = i14 + 1;
                int i21 = i20 + 1;
                bArr[i14] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i20] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i21] = (byte) ((cCharAt2 & '?') | 128);
                i14 = i21 + 1;
            }
            i13++;
        }
        return i14;
    }

    static int c(CharSequence charSequence) {
        int length = charSequence.length();
        int i8 = 0;
        int i9 = 0;
        while (i9 < length && charSequence.charAt(i9) < 128) {
            i9++;
        }
        int i10 = length;
        while (true) {
            if (i9 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i9);
            if (cCharAt < 2048) {
                i10 += (127 - cCharAt) >>> 31;
                i9++;
            } else {
                int length2 = charSequence.length();
                while (i9 < length2) {
                    char cCharAt2 = charSequence.charAt(i9);
                    if (cCharAt2 < 2048) {
                        i8 += (127 - cCharAt2) >>> 31;
                    } else {
                        i8 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i9) < 65536) {
                                throw new h4(i9, length2);
                            }
                            i9++;
                        }
                    }
                    i9++;
                }
                i10 += i8;
            }
        }
        if (i10 >= length) {
            return i10;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i10) + 4294967296L));
    }

    static boolean d(byte[] bArr) {
        return f19579a.b(bArr, 0, bArr.length);
    }

    static boolean e(byte[] bArr, int i8, int i9) {
        return f19579a.b(bArr, i8, i9);
    }
}
