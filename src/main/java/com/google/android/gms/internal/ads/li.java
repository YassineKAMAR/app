package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class li {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f10730a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f10731b = 0;

    public static long a(double d8, int i8, DisplayMetrics displayMetrics) {
        return Math.round(d8 / ((double) displayMetrics.density));
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            int i9 = bArr[i8] & 255;
            char[] cArr2 = f10730a;
            int i10 = i8 + i8;
            cArr[i10] = cArr2[i9 >>> 4];
            cArr[i10 + 1] = cArr2[i9 & 15];
        }
        return new String(cArr);
    }

    public static boolean c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean d(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean e(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static byte[] f(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i8 = 0; i8 < length; i8 += 2) {
            bArr[i8 / 2] = (byte) ((Character.digit(str.charAt(i8), 16) << 4) + Character.digit(str.charAt(i8 + 1), 16));
        }
        return bArr;
    }
}
