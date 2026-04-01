package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import io.flutter.plugins.webviewflutter.n;

/* JADX INFO: loaded from: classes.dex */
public class h4 implements n.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b4 f23454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f23455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g4 f23456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f23457d;

    public static class a {
        public f4 a(g4 g4Var, String str, Handler handler) {
            return new f4(g4Var, str, handler);
        }
    }

    public h4(b4 b4Var, a aVar, g4 g4Var, Handler handler) {
        this.f23454a = b4Var;
        this.f23455b = aVar;
        this.f23456c = g4Var;
        this.f23457d = handler;
    }

    @Override // io.flutter.plugins.webviewflutter.n.t
    public void a(Long l8, String str) {
        this.f23454a.b(this.f23455b.a(this.f23456c, str, this.f23457d), l8.longValue());
    }

    public void b(Handler handler) {
        this.f23457d = handler;
    }
}
