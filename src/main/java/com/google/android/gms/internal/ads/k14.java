package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class k14 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f9884a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f9885b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f9886c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f9887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f9888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zz3 f9889f;

    static {
        byte[] bArr = new byte[0];
        f9887d = bArr;
        f9888e = ByteBuffer.wrap(bArr);
        f9889f = zz3.h(bArr, 0, 0, false);
    }

    public static int a(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    static int b(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i8 = (i8 * 31) + bArr[i11];
        }
        return i8;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static String d(byte[] bArr) {
        return new String(bArr, f9885b);
    }
}
