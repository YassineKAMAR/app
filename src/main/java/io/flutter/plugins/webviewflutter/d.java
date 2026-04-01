package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import io.flutter.plugins.webviewflutter.n;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.c f23412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4 f23413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n.d f23414c;

    public d(s5.c cVar, b4 b4Var) {
        this.f23412a = cVar;
        this.f23413b = b4Var;
        this.f23414c = new n.d(cVar);
    }

    public void a(WebChromeClient.CustomViewCallback customViewCallback, n.d.a<Void> aVar) {
        if (this.f23413b.f(customViewCallback)) {
            return;
        }
        this.f23414c.b(Long.valueOf(this.f23413b.c(customViewCallback)), aVar);
    }
}
