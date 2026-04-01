package io.flutter.plugins.webviewflutter;

import android.webkit.HttpAuthHandler;
import io.flutter.plugins.webviewflutter.n;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class z3 implements n.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.c f23653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4 f23654b;

    public z3(s5.c cVar, b4 b4Var) {
        this.f23653a = cVar;
        this.f23654b = b4Var;
    }

    private HttpAuthHandler d(Long l8) {
        HttpAuthHandler httpAuthHandler = (HttpAuthHandler) this.f23654b.i(l8.longValue());
        Objects.requireNonNull(httpAuthHandler);
        return httpAuthHandler;
    }

    @Override // io.flutter.plugins.webviewflutter.n.o
    public void a(Long l8) {
        d(l8).cancel();
    }

    @Override // io.flutter.plugins.webviewflutter.n.o
    public Boolean b(Long l8) {
        return Boolean.valueOf(d(l8).useHttpAuthUsernamePassword());
    }

    @Override // io.flutter.plugins.webviewflutter.n.o
    public void c(Long l8, String str, String str2) {
        d(l8).proceed(str, str2);
    }
}
