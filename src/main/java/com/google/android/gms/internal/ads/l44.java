package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class l44 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i44 f10459a;

    static {
        if (g44.a() && g44.b()) {
            int i8 = cz3.f6517a;
        }
        f10459a = new j44();
    }

    static /* bridge */ /* synthetic */ int c(byte[] bArr, int i8, int i9) {
        int i10 = i9 - i8;
        byte b8 = bArr[i8 - 1];
        if (i10 == 0) {
            if (b8 > -12) {
                return -1;
            }
            return b8;
        }
        if (i10 == 1) {
            return k(b8, bArr[i8]);
        }
        if (i10 == 2) {
            return l(b8, bArr[i8], bArr[i8 + 1]);
        }
        throw new AssertionError();
    }

    static int d(CharSequence charSequence, byte[] bArr, int i8, int i9) {
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
                            throw new k44(i13, length);
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
                    throw new k44(i13 - 1, length);
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

    static int e(CharSequence charSequence) {
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
                                throw new k44(i9, length2);
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

    static int f(int i8, byte[] bArr, int i9, int i10) {
        return f10459a.a(i8, bArr, i9, i10);
    }

    static String g(ByteBuffer byteBuffer, int i8, int i9) {
        i44 i44Var = f10459a;
        if (byteBuffer.hasArray()) {
            return i44Var.b(byteBuffer.array(), byteBuffer.arrayOffset() + i8, i9);
        }
        byteBuffer.isDirect();
        return i44.d(byteBuffer, i8, i9);
    }

    static String h(byte[] bArr, int i8, int i9) {
        return f10459a.b(bArr, i8, i9);
    }

    static boolean i(byte[] bArr) {
        return f10459a.c(bArr, 0, bArr.length);
    }

    static boolean j(byte[] bArr, int i8, int i9) {
        return f10459a.c(bArr, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i8, int i9) {
        if (i8 > -12 || i9 > -65) {
            return -1;
        }
        return i8 ^ (i9 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i8, int i9, int i10) {
        if (i8 > -12 || i9 > -65 || i10 > -65) {
            return -1;
        }
        return (i8 ^ (i9 << 8)) ^ (i10 << 16);
    }
}
