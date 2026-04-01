package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final lc f18880a;

    static {
        if (jc.w()) {
            jc.z();
        }
        f18880a = new oc();
    }

    static int a(CharSequence charSequence) {
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
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i9) < 65536) {
                                throw new nc(i9, length2);
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

    static int b(CharSequence charSequence, byte[] bArr, int i8, int i9) {
        return f18880a.b(charSequence, bArr, i8, i9);
    }

    static /* synthetic */ int c(byte[] bArr, int i8, int i9) {
        byte b8 = bArr[i8 - 1];
        int i10 = i9 - i8;
        if (i10 == 0) {
            if (b8 > -12) {
                return -1;
            }
            return b8;
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

    static boolean d(byte[] bArr) {
        return f18880a.d(bArr, 0, bArr.length);
    }

    static String e(byte[] bArr, int i8, int i9) {
        return f18880a.c(bArr, i8, i9);
    }

    static boolean f(byte[] bArr, int i8, int i9) {
        return f18880a.d(bArr, i8, i9);
    }
}
