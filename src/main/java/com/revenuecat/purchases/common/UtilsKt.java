package com.revenuecat.purchases.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.util.Base64;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class UtilsKt {
    public static final int MICROS_MULTIPLIER = 1000000;

    public static final Locale getLocale(Context context) {
        q.f(context, "<this>");
        int i8 = Build.VERSION.SDK_INT;
        Configuration configuration = context.getResources().getConfiguration();
        return i8 >= 24 ? configuration.getLocales().get(0) : configuration.locale;
    }

    public static final String getPlayServicesVersionName(Context context) {
        q.f(context, "<this>");
        return packageVersionName(context, "com.google.android.gms");
    }

    public static final String getPlayStoreVersionName(Context context) {
        q.f(context, "<this>");
        return packageVersionName(context, "com.android.vending");
    }

    public static final String getVersionName(Context context) {
        q.f(context, "<this>");
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
    }

    private static final String packageVersionName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final String sha1(String str) throws NoSuchAlgorithmException {
        q.f(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        Charset charset = w6.d.f27129b;
        byte[] bytes = str.getBytes(charset);
        q.e(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrEncode = Base64.encode(messageDigest.digest(bytes), 2);
        q.e(bArrEncode, "encode(it, Base64.NO_WRAP)");
        return new String(bArrEncode, charset);
    }

    public static final String sha256(String str) throws NoSuchAlgorithmException {
        q.f(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset charset = w6.d.f27129b;
        byte[] bytes = str.getBytes(charset);
        q.e(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrEncode = Base64.encode(messageDigest.digest(bytes), 2);
        q.e(bArrEncode, "encode(it, Base64.NO_WRAP)");
        return new String(bArrEncode, charset);
    }

    public static final String toBCP47(Locale locale) {
        q.f(locale, "<this>");
        String languageTag = locale.toLanguageTag();
        q.e(languageTag, "toLanguageTag()");
        return languageTag;
    }
}
