package com.google.android.gms.ads;

import a3.o;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.i90;
import com.google.android.gms.internal.ads.qg0;
import f2.c;
import g3.b;
import h2.j3;
import z1.p;
import z1.v;
import z1.x;

/* JADX INFO: loaded from: classes.dex */
public class MobileAds {
    private MobileAds() {
    }

    public static void a(Context context) {
        j3.g().l(context);
    }

    public static v b() {
        return j3.g().d();
    }

    public static x c() {
        j3.g();
        String[] strArrSplit = TextUtils.split("22.5.0", "\\.");
        if (strArrSplit.length != 3) {
            return new x(0, 0, 0);
        }
        try {
            return new x(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        } catch (NumberFormatException unused) {
            return new x(0, 0, 0);
        }
    }

    public static void d(Context context, c cVar) {
        j3.g().m(context, null, cVar);
    }

    public static void e(Context context, p pVar) {
        j3.g().p(context, pVar);
    }

    public static void f(Context context, String str) {
        j3.g().q(context, str);
    }

    public static void g(WebView webView) {
        j3.g();
        o.e("#008 Must be called on the main UI thread.");
        if (webView == null) {
            qg0.d("The webview to be registered cannot be null.");
            return;
        }
        ff0 ff0VarA = i90.a(webView.getContext());
        if (ff0VarA == null) {
            qg0.g("Internal error, query info generator is null.");
            return;
        }
        try {
            ff0VarA.e0(b.k3(webView));
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
    }

    public static void h(boolean z7) {
        j3.g().r(z7);
    }

    public static void i(float f8) {
        j3.g().s(f8);
    }

    public static void j(v vVar) {
        j3.g().u(vVar);
    }

    private static void setPlugin(String str) {
        j3.g().t(str);
    }
}
