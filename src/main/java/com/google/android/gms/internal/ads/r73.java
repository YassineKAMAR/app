package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class r73 {
    public static String a(String str) {
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            if (e(str.charAt(i8))) {
                char[] charArray = str.toCharArray();
                while (i8 < length) {
                    char c8 = charArray[i8];
                    if (e(c8)) {
                        charArray[i8] = (char) (c8 ^ ' ');
                    }
                    i8++;
                }
                return String.valueOf(charArray);
            }
            i8++;
        }
        return str;
    }

    public static String b(String str) {
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            if (d(str.charAt(i8))) {
                char[] charArray = str.toCharArray();
                while (i8 < length) {
                    char c8 = charArray[i8];
                    if (d(c8)) {
                        charArray[i8] = (char) (c8 ^ ' ');
                    }
                    i8++;
                }
                return String.valueOf(charArray);
            }
            i8++;
        }
        return str;
    }

    public static boolean c(CharSequence charSequence, CharSequence charSequence2) {
        int iF;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = charSequence.charAt(i8);
            char cCharAt2 = charSequence2.charAt(i8);
            if (cCharAt != cCharAt2 && ((iF = f(cCharAt)) >= 26 || iF != f(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(char c8) {
        return c8 >= 'a' && c8 <= 'z';
    }

    public static boolean e(char c8) {
        return c8 >= 'A' && c8 <= 'Z';
    }

    private static int f(char c8) {
        return (char) ((c8 | ' ') - 97);
    }
}
