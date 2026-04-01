package io.flutter.plugins.webviewflutter;

import android.view.View;
import io.flutter.plugins.webviewflutter.n;

/* JADX INFO: loaded from: classes.dex */
public class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.c f23478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4 f23479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n.x f23480c;

    public k4(s5.c cVar, b4 b4Var) {
        this.f23478a = cVar;
        this.f23479b = b4Var;
        this.f23480c = new n.x(cVar);
    }

    public void a(View view, n.x.a<Void> aVar) {
        if (this.f23479b.f(view)) {
            return;
        }
        this.f23480c.b(Long.valueOf(this.f23479b.c(view)), aVar);
    }
}
