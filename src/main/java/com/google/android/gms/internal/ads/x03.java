package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class x03 extends w03 {
    @SuppressLint({"SetJavaScriptEnabled"})
    public x03(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        j(webView);
    }
}
