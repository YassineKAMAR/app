package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import io.flutter.plugins.webviewflutter.n;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class e implements n.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.c f23422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4 f23423b;

    public e(s5.c cVar, b4 b4Var) {
        this.f23422a = cVar;
        this.f23423b = b4Var;
    }

    private WebChromeClient.CustomViewCallback b(Long l8) {
        WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) this.f23423b.i(l8.longValue());
        Objects.requireNonNull(customViewCallback);
        return customViewCallback;
    }

    @Override // io.flutter.plugins.webviewflutter.n.e
    public void a(Long l8) {
        b(l8).onCustomViewHidden();
    }
}
