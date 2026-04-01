package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ny3 {
    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b8 : bArr) {
            int i8 = b8 & 255;
            sb.append("0123456789abcdef".charAt(i8 >> 4));
            sb.append("0123456789abcdef".charAt(i8 & 15));
        }
        return sb.toString();
    }
}
