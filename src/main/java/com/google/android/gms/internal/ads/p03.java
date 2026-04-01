package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p03 f12692a = new p03();

    private p03() {
    }

    public static final p03 a() {
        return f12692a;
    }

    public static final boolean i(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: ".concat(String.valueOf(str)));
            return true;
        }
    }

    final void b(WebView webView, String str, Object... objArr) {
        String string;
        if (webView == null) {
            lz2.f11095a.booleanValue();
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        if (objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    string = "\"\"";
                } else {
                    if (obj instanceof String) {
                        string = obj.toString();
                        if (!string.startsWith("{")) {
                            sb.append('\"');
                            sb.append(string);
                            sb.append('\"');
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(com.amazon.a.a.o.b.f.f3942a);
                }
                sb.append(string);
                sb.append(com.amazon.a.a.o.b.f.f3942a);
            }
            sb.setLength(sb.length() - 1);
        }
        sb.append(")}");
        String string2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            i(webView, string2);
        } else {
            handler.post(new n03(this, webView, string2));
        }
    }

    public final void c(WebView webView) {
        b(webView, "finishSession", new Object[0]);
    }

    public final void d(WebView webView, JSONObject jSONObject) {
        b(webView, "init", jSONObject);
    }

    public final void e(WebView webView, float f8) {
        b(webView, "setDeviceVolume", Float.valueOf(f8));
    }

    public final void f(WebView webView, JSONObject jSONObject) {
        b(webView, "setLastActivity", jSONObject);
    }

    public final void g(WebView webView, String str) {
        b(webView, "setNativeViewHierarchy", str);
    }

    public final void h(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        b(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
