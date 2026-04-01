package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
final class rl implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ValueCallback f14184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ jl f14185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ WebView f14186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f14187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ tl f14188e;

    rl(tl tlVar, final jl jlVar, final WebView webView, final boolean z7) {
        this.f14188e = tlVar;
        this.f14185b = jlVar;
        this.f14186c = webView;
        this.f14187d = z7;
        this.f14184a = new ValueCallback() { // from class: com.google.android.gms.internal.ads.ql
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.f13545a.f14188e.d(jlVar, webView, (String) obj, z7);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f14186c.getSettings().getJavaScriptEnabled()) {
            try {
                this.f14186c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f14184a);
            } catch (Throwable unused) {
                this.f14184a.onReceiveValue("");
            }
        }
    }
}
