package m3;

import android.annotation.TargetApi;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes.dex */
final class q0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ r0 f24800a;

    /* synthetic */ q0(r0 r0Var, p0 p0Var) {
        this.f24800a = r0Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (r0.e(this.f24800a, str)) {
            this.f24800a.f24806b.c(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (this.f24800a.f24807c) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        this.f24800a.f24807c = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i8, String str, String str2) {
        this.f24800a.f24806b.d(i8, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        if (!r0.e(this.f24800a, string)) {
            return false;
        }
        this.f24800a.f24806b.c(string);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!r0.e(this.f24800a, str)) {
            return false;
        }
        this.f24800a.f24806b.c(str);
        return true;
    }
}
