package io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.n;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class g5 implements n.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b4 f23444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f23445b;

    public static class a {
        public WebSettings a(WebView webView) {
            return webView.getSettings();
        }
    }

    public g5(b4 b4Var, a aVar) {
        this.f23444a = b4Var;
        this.f23445b = aVar;
    }

    @Override // io.flutter.plugins.webviewflutter.n.d0
    public String a(Long l8) {
        WebSettings webSettings = (WebSettings) this.f23444a.i(l8.longValue());
        Objects.requireNonNull(webSettings);
        return webSettings.getUserAgentString();
    }

    @Override // io.flutter.plugins.webviewflutter.n.d0
    public void b(Long l8, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f23444a.i(l8.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setDomStorageEnabled(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.d0
    public void c(Long l8, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f23444a.i(l8.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setDisplayZoomControls(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.d0
    public void d(Long l8, Long l9) {
        WebView webView = (WebView) this.f23444a.i(l9.longValue());
        Objects.requireNonNull(webView);
        this.f23444a.b(this.f23445b.a(webView), l8.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.d0
    public void e(Long l8, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f23444a.i(l8.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setSupportMultipleWindows(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.d0
    public void f(Long l8, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f23444a.i(l8.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setAllowFileAccess(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.d0
    public void g(Long l8, Long l9) {
        WebSettings webSettings = (WebSettings) this.f23444a.i(l8.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setTextZoom(l9.intValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.d0
    public void h(Long l8, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f23444a.i(l8.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setLoadWithOverviewMode(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.d0
    public void i(Long l8, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f23444a.i(l8.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setUseWideViewPort(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.d0
    public void j(Long l8, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f23444a.i(l8.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setJavaScriptEnabled(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.d0
    public void k(Long l8, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f23444a.i(l8.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.d0
    public void l(Long l8, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f23444a.i(l8.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setSupportZoom(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.d0
    public void m(Long l8, String str) {
        WebSettings webSettings = (WebSettings) this.f23444a.i(l8.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setUserAgentString(str);
    }

    @Override // io.flutter.plugins.webviewflutter.n.d0
    public void n(Long l8, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f23444a.i(l8.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.d0
    public void o(Long l8, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f23444a.i(l8.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setBuiltInZoomControls(bool.booleanValue());
    }
}
