package io.flutter.plugins.webviewflutter;

import android.webkit.WebStorage;
import io.flutter.plugins.webviewflutter.n;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class h5 implements n.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b4 f23458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f23459b;

    public static class a {
        public WebStorage a() {
            return WebStorage.getInstance();
        }
    }

    public h5(b4 b4Var, a aVar) {
        this.f23458a = b4Var;
        this.f23459b = aVar;
    }

    @Override // io.flutter.plugins.webviewflutter.n.e0
    public void a(Long l8) {
        this.f23458a.b(this.f23459b.a(), l8.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.e0
    public void b(Long l8) {
        WebStorage webStorage = (WebStorage) this.f23458a.i(l8.longValue());
        Objects.requireNonNull(webStorage);
        webStorage.deleteAllData();
    }
}
