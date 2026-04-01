package io.flutter.plugins.webviewflutter;

import android.webkit.GeolocationPermissions;
import io.flutter.plugins.webviewflutter.n;

/* JADX INFO: loaded from: classes.dex */
public class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.c f23633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4 f23634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n.l f23635c;

    public w3(s5.c cVar, b4 b4Var) {
        this.f23633a = cVar;
        this.f23634b = b4Var;
        this.f23635c = new n.l(cVar);
    }

    public void a(GeolocationPermissions.Callback callback, n.l.a<Void> aVar) {
        if (this.f23634b.f(callback)) {
            return;
        }
        this.f23635c.b(Long.valueOf(this.f23634b.c(callback)), aVar);
    }
}
