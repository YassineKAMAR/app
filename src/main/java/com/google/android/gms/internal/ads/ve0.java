package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ve0 {
    static Uri a(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i8 = iIndexOf + 1;
        return Uri.parse(str.substring(0, i8) + str2 + com.amazon.a.a.o.b.f.f3943b + str3 + "&" + str.substring(i8));
    }

    public static String b(Uri uri, Context context) {
        String strF;
        if (g2.t.p().z(context) && (strF = g2.t.p().f(context)) != null) {
            String str = (String) h2.y.c().b(ns.f12058e0);
            String string = uri.toString();
            if (((Boolean) h2.y.c().b(ns.f12049d0)).booleanValue() && string.contains(str)) {
                g2.t.p().r(context, strF);
                return d(string, context).replace(str, strF);
            }
            if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
                return string;
            }
            String string2 = a(d(string, context), "fbs_aeid", strF).toString();
            g2.t.p().r(context, strF);
            return string2;
        }
        return uri.toString();
    }

    public static String c(String str, Context context, boolean z7) {
        String strF;
        if ((((Boolean) h2.y.c().b(ns.f12121l0)).booleanValue() && !z7) || !g2.t.p().z(context) || TextUtils.isEmpty(str) || (strF = g2.t.p().f(context)) == null) {
            return str;
        }
        String str2 = (String) h2.y.c().b(ns.f12058e0);
        if (((Boolean) h2.y.c().b(ns.f12049d0)).booleanValue() && str.contains(str2)) {
            if (g2.t.r().J(str)) {
                g2.t.p().r(context, strF);
                return d(str, context).replace(str2, strF);
            }
            if (!g2.t.r().K(str)) {
                return str;
            }
            g2.t.p().s(context, strF);
            return d(str, context).replace(str2, strF);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (g2.t.r().J(str)) {
            g2.t.p().r(context, strF);
            return a(d(str, context), "fbs_aeid", strF).toString();
        }
        if (!g2.t.r().K(str)) {
            return str;
        }
        g2.t.p().s(context, strF);
        return a(d(str, context), "fbs_aeid", strF).toString();
    }

    private static String d(String str, Context context) {
        String strJ = g2.t.p().j(context);
        String strH = g2.t.p().h(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strJ)) {
            str = a(str, "gmp_app_id", strJ).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strH)) ? str : a(str, "fbs_aiid", strH).toString();
    }
}
