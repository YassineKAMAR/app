package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f19668a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f19669b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f19670c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f19671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f19672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r0 f19673f;

    static {
        byte[] bArr = new byte[0];
        f19671d = bArr;
        f19672e = ByteBuffer.wrap(bArr);
        int i8 = r0.f19664a;
        p0 p0Var = new p0(bArr, 0, 0, false, null);
        try {
            p0Var.c(0);
            f19673f = p0Var;
        } catch (u1 e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static int a(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    static int b(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
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
        return new String(bArr, f19669b);
    }
}
