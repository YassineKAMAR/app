package io.flutter.plugins.webviewflutter;

import android.webkit.HttpAuthHandler;
import io.flutter.plugins.webviewflutter.n;

/* JADX INFO: loaded from: classes.dex */
public class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.c f23645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4 f23646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n.C0129n f23647c;

    public y3(s5.c cVar, b4 b4Var) {
        this.f23645a = cVar;
        this.f23646b = b4Var;
        this.f23647c = new n.C0129n(cVar);
    }

    public void a(HttpAuthHandler httpAuthHandler, n.C0129n.a<Void> aVar) {
        if (this.f23646b.f(httpAuthHandler)) {
            return;
        }
        this.f23647c.b(Long.valueOf(this.f23646b.c(httpAuthHandler)), aVar);
    }
}
