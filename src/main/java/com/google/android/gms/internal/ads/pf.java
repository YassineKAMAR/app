package com.google.android.gms.internal.ads;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class pf {
    public static String a(byte[] bArr, boolean z7) {
        return Base64.encodeToString(bArr, true != z7 ? 2 : 11);
    }

    public static byte[] b(String str, boolean z7) {
        byte[] bArrDecode = Base64.decode(str, 2);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
