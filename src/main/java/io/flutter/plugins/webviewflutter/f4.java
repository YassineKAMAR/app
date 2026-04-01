package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import io.flutter.plugins.webviewflutter.n;

/* JADX INFO: loaded from: classes.dex */
public class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f23435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f23436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g4 f23437c;

    public f4(g4 g4Var, String str, Handler handler) {
        this.f23437c = g4Var;
        this.f23436b = str;
        this.f23435a = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(String str) {
        this.f23437c.f(this, str, new n.s.a() { // from class: io.flutter.plugins.webviewflutter.e4
            @Override // io.flutter.plugins.webviewflutter.n.s.a
            public final void a(Object obj) {
                f4.c((Void) obj);
            }
        });
    }

    @JavascriptInterface
    public void postMessage(final String str) {
        Runnable runnable = new Runnable() { // from class: io.flutter.plugins.webviewflutter.d4
            @Override // java.lang.Runnable
            public final void run() {
                this.f23419a.d(str);
            }
        };
        if (this.f23435a.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f23435a.post(runnable);
        }
    }
}
