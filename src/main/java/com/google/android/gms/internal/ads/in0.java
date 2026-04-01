package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class in0 extends jn0 {
    public in0(fm0 fm0Var, vn vnVar, boolean z7, b22 b22Var) {
        super(fm0Var, vnVar, z7, b22Var);
    }

    @Override // com.google.android.gms.internal.ads.mm0, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return g0(webView, str, null);
    }
}
