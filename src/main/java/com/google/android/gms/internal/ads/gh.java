package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class gh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f8322d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8323a = "ad.doubleclick.net";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f8324b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ch f8325c;

    @Deprecated
    public gh(ch chVar) {
        this.f8325c = chVar;
    }

    private final Uri g(Uri uri, String str) throws hh {
        String str2;
        uri.getClass();
        try {
            try {
                if (uri.getHost().equals(this.f8323a)) {
                    if (uri.getPath().contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new hh("Parameter already exists: dc_ms");
                        }
                        String string = uri.toString();
                        int iIndexOf = string.indexOf(";adurl");
                        if (iIndexOf != -1) {
                            int i8 = iIndexOf + 1;
                            str2 = string.substring(0, i8) + "dc_ms" + com.amazon.a.a.o.b.f.f3943b + str + ";" + string.substring(i8);
                        } else {
                            String encodedPath = uri.getEncodedPath();
                            int iIndexOf2 = string.indexOf(encodedPath);
                            str2 = string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms" + com.amazon.a.a.o.b.f.f3943b + str + ";" + string.substring(iIndexOf2 + encodedPath.length());
                        }
                        return Uri.parse(str2);
                    }
                }
            } catch (UnsupportedOperationException unused) {
                throw new hh("Provided Uri is not in a valid state");
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new hh("Query parameter already exists: ms");
        }
        String string2 = uri.toString();
        int iIndexOf3 = string2.indexOf("&adurl");
        if (iIndexOf3 == -1) {
            iIndexOf3 = string2.indexOf("?adurl");
        }
        if (iIndexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i9 = iIndexOf3 + 1;
        return Uri.parse(string2.substring(0, i9) + "ms" + com.amazon.a.a.o.b.f.f3943b + str + "&" + string2.substring(i9));
    }

    @Deprecated
    public final Uri a(Uri uri, Context context, View view, Activity activity) throws hh {
        try {
            return g(uri, this.f8325c.e(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new hh("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri b(Uri uri, Context context) {
        return g(uri, this.f8325c.c(context));
    }

    @Deprecated
    public final ch c() {
        return this.f8325c;
    }

    @Deprecated
    public final void d(MotionEvent motionEvent) {
        this.f8325c.f(motionEvent);
    }

    public final boolean e(Uri uri) {
        if (f(uri)) {
            String[] strArr = f8322d;
            for (int i8 = 0; i8 < 3; i8++) {
                if (uri.getPath().endsWith(strArr[i8])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f8324b;
            for (int i8 = 0; i8 < 3; i8++) {
                if (host.endsWith(strArr[i8])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
