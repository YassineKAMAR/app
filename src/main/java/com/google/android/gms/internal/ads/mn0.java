package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class mn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f11420a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f11421b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f11420a.matcher(str);
        int i8 = 0;
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb.append(str.substring(0, iEnd));
            while (i8 <= 0) {
                String str2 = strArr[i8];
                if (str2 != null) {
                    sb.append(str2);
                }
                i8++;
            }
            str = str.substring(iEnd);
        } else if (!f11421b.matcher(str).find()) {
            while (i8 <= 0) {
                String str3 = strArr[i8];
                if (str3 != null) {
                    sb.append(str3);
                }
                i8++;
            }
        }
        sb.append(str);
        return sb.toString();
    }
}
