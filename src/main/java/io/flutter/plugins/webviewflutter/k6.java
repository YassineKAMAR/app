package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k6 {
    public static WebView a(io.flutter.embedding.engine.a aVar, long j8) {
        p6 p6Var = (p6) aVar.q().a(p6.class);
        if (p6Var == null || p6Var.d() == null) {
            return null;
        }
        Object objI = p6Var.d().i(j8);
        if (objI instanceof WebView) {
            return (WebView) objI;
        }
        return null;
    }
}
