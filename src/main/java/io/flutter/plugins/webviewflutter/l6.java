package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.n;

/* JADX INFO: loaded from: classes.dex */
public class l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.c f23486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4 f23487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n.i0 f23488c;

    public l6(s5.c cVar, b4 b4Var) {
        this.f23486a = cVar;
        this.f23487b = b4Var;
        this.f23488c = new n.i0(cVar);
    }

    public void a(WebView webView, n.i0.a<Void> aVar) {
        if (this.f23487b.f(webView)) {
            return;
        }
        this.f23488c.b(Long.valueOf(this.f23487b.c(webView)), aVar);
    }
}
