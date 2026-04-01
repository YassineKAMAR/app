package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class c94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f6235a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f6236b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long a(String str, String str2) {
        long j8 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j8 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                pf2.c("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j8;
        }
        Matcher matcher = f6235a.matcher(str2);
        if (!matcher.matches()) {
            return j8;
        }
        try {
            String strGroup = matcher.group(2);
            strGroup.getClass();
            long j9 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            long j10 = (j9 - Long.parseLong(strGroup2)) + 1;
            if (j8 < 0) {
                return j10;
            }
            if (j8 == j10) {
                return j8;
            }
            pf2.f("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j8, j10);
        } catch (NumberFormatException unused2) {
            pf2.c("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j8;
        }
    }

    public static long b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f6236b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }
}
