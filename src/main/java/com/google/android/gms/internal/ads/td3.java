package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class td3 extends ud3 {
    public static int a(long j8) {
        int i8 = (int) j8;
        l83.g(((long) i8) == j8, "Out of range: %s", j8);
        return i8;
    }

    public static int b(int i8, int i9, int i10) {
        return Math.min(Math.max(i8, i9), 1073741823);
    }

    public static int c(long j8) {
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j8 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j8;
    }
}
