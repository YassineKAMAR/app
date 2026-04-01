package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class a9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f18545a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f18546b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f18547c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f18548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ByteBuffer f18549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e8 f18550f;

    static {
        byte[] bArr = new byte[0];
        f18548d = bArr;
        f18549e = ByteBuffer.wrap(bArr);
        f18550f = e8.c(bArr, 0, bArr.length, false);
    }

    static int a(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i8 = (i8 * 31) + bArr[i11];
        }
        return i8;
    }

    public static int b(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static int c(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        int iA = a(length, bArr, 0, length);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    static <T> T e(T t7) {
        t7.getClass();
        return t7;
    }

    static <T> T f(T t7, String str) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(str);
    }

    static boolean g(ma maVar) {
        if (!(maVar instanceof g7)) {
            return false;
        }
        return false;
    }

    public static String h(byte[] bArr) {
        return new String(bArr, f18546b);
    }

    public static boolean i(byte[] bArr) {
        return kc.d(bArr);
    }
}
