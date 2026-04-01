package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes.dex */
final class y03 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f17537a = "OMID NativeBridge WebViewClient";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a13 f17538b;

    y03(a13 a13Var) {
        this.f17538b = a13Var;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w(this.f17537a, "WebView renderer gone: ".concat(String.valueOf(renderProcessGoneDetail.toString())));
        if (this.f17538b.a() != webView) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        Log.w(this.f17537a, "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
        this.f17538b.j(null);
        webView.destroy();
        return true;
    }
}
