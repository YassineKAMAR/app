package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class at extends bt {
    at() {
    }

    private static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i8 = 0;
        int i9 = 0;
        while (i9 < str.length() && str.charAt(i9) == ',') {
            i9++;
        }
        while (length > 0) {
            int i10 = length - 1;
            if (str.charAt(i10) != ',') {
                break;
            }
            length = i10;
        }
        if (length < i9) {
            return null;
        }
        if (i9 != 0) {
            i8 = i9;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i8, length);
    }

    @Override // com.google.android.gms.internal.ads.bt
    public final String a(String str, String str2) {
        String strB = b(str);
        String strB2 = b(str2);
        if (TextUtils.isEmpty(strB)) {
            return strB2;
        }
        if (TextUtils.isEmpty(strB2)) {
            return strB;
        }
        return strB + com.amazon.a.a.o.b.f.f3942a + strB2;
    }
}
