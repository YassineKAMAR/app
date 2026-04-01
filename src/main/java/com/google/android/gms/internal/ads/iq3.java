package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class iq3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f9325a = Charset.forName("UTF-8");

    public static final wy3 a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i8 = 0; i8 < str.length(); i8++) {
            char cCharAt = str.charAt(i8);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new hq3("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i8] = (byte) cCharAt;
        }
        return wy3.b(bArr);
    }
}
