package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.ads.MobileAds;
import io.flutter.plugins.webviewflutter.k6;

/* JADX INFO: loaded from: classes.dex */
public class v {
    public void a(Context context) {
        MobileAds.a(context);
    }

    public z1.v b() {
        return MobileAds.b();
    }

    public String c() {
        return MobileAds.c().toString();
    }

    public void d(Context context, f2.c cVar) {
        MobileAds.d(context, cVar);
    }

    public void e(Context context, z1.p pVar) {
        MobileAds.e(context, pVar);
    }

    public void f(Context context, String str) {
        MobileAds.f(context, str);
    }

    public void g(int i8, io.flutter.embedding.engine.a aVar) {
        WebView webViewA = k6.a(aVar, i8);
        if (webViewA != null) {
            MobileAds.g(webViewA);
            return;
        }
        Log.w("FlutterMobileAdsWrapper", "MobileAds.registerWebView unable to find webView with id: " + i8);
    }

    public void h(boolean z7) {
        MobileAds.h(z7);
    }

    public void i(double d8) {
        MobileAds.i((float) d8);
    }
}
