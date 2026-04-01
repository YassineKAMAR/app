package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.HttpAuthHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugins.webviewflutter.n;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class s5 extends n.f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s5.c f23591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b4 f23592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l6 f23593d;

    public s5(s5.c cVar, b4 b4Var) {
        super(cVar);
        this.f23591b = cVar;
        this.f23592c = b4Var;
        this.f23593d = new l6(cVar, b4Var);
    }

    static n.b0 I(WebResourceError webResourceError) {
        return new n.b0.a().c(Long.valueOf(webResourceError.getErrorCode())).b(webResourceError.getDescription().toString()).a();
    }

    @SuppressLint({"RequiresFeature"})
    static n.b0 J(v0.e eVar) {
        return new n.b0.a().c(Long.valueOf(eVar.b())).b(eVar.a().toString()).a();
    }

    static n.c0 K(WebResourceRequest webResourceRequest) {
        n.c0.a aVarF = new n.c0.a().g(webResourceRequest.getUrl().toString()).c(Boolean.valueOf(webResourceRequest.isForMainFrame())).b(Boolean.valueOf(webResourceRequest.hasGesture())).e(webResourceRequest.getMethod()).f(webResourceRequest.getRequestHeaders() != null ? webResourceRequest.getRequestHeaders() : new HashMap<>());
        if (Build.VERSION.SDK_INT >= 24) {
            aVarF.d(Boolean.valueOf(webResourceRequest.isRedirect()));
        }
        return aVarF.a();
    }

    private long M(WebViewClient webViewClient) {
        Long lH = this.f23592c.h(webViewClient);
        if (lH != null) {
            return lH.longValue();
        }
        throw new IllegalStateException("Could not find identifier for WebViewClient.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void U(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V(Void r02) {
    }

    public void L(WebViewClient webViewClient, WebView webView, String str, boolean z7, n.f0.a<Void> aVar) {
        this.f23593d.a(webView, new n.i0.a() { // from class: io.flutter.plugins.webviewflutter.k5
            @Override // io.flutter.plugins.webviewflutter.n.i0.a
            public final void a(Object obj) {
                s5.N((Void) obj);
            }
        });
        Long lH = this.f23592c.h(webView);
        Objects.requireNonNull(lH);
        i(Long.valueOf(M(webViewClient)), lH, str, Boolean.valueOf(z7), aVar);
    }

    public void W(WebViewClient webViewClient, WebView webView, String str, n.f0.a<Void> aVar) {
        this.f23593d.a(webView, new n.i0.a() { // from class: io.flutter.plugins.webviewflutter.q5
            @Override // io.flutter.plugins.webviewflutter.n.i0.a
            public final void a(Object obj) {
                s5.O((Void) obj);
            }
        });
        Long lH = this.f23592c.h(webView);
        Objects.requireNonNull(lH);
        s(Long.valueOf(M(webViewClient)), lH, str, aVar);
    }

    public void X(WebViewClient webViewClient, WebView webView, String str, n.f0.a<Void> aVar) {
        this.f23593d.a(webView, new n.i0.a() { // from class: io.flutter.plugins.webviewflutter.m5
            @Override // io.flutter.plugins.webviewflutter.n.i0.a
            public final void a(Object obj) {
                s5.P((Void) obj);
            }
        });
        Long lH = this.f23592c.h(webView);
        Objects.requireNonNull(lH);
        t(Long.valueOf(M(webViewClient)), lH, str, aVar);
    }

    public void Y(WebViewClient webViewClient, WebView webView, Long l8, String str, String str2, n.f0.a<Void> aVar) {
        this.f23593d.a(webView, new n.i0.a() { // from class: io.flutter.plugins.webviewflutter.n5
            @Override // io.flutter.plugins.webviewflutter.n.i0.a
            public final void a(Object obj) {
                s5.Q((Void) obj);
            }
        });
        Long lH = this.f23592c.h(webView);
        Objects.requireNonNull(lH);
        u(Long.valueOf(M(webViewClient)), lH, l8, str, str2, aVar);
    }

    public void Z(WebViewClient webViewClient, WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2, n.f0.a<Void> aVar) {
        new y3(this.f23591b, this.f23592c).a(httpAuthHandler, new n.C0129n.a() { // from class: io.flutter.plugins.webviewflutter.l5
            @Override // io.flutter.plugins.webviewflutter.n.C0129n.a
            public final void a(Object obj) {
                s5.R((Void) obj);
            }
        });
        Long lH = this.f23592c.h(webViewClient);
        Objects.requireNonNull(lH);
        Long lH2 = this.f23592c.h(webView);
        Objects.requireNonNull(lH2);
        Long lH3 = this.f23592c.h(httpAuthHandler);
        Objects.requireNonNull(lH3);
        v(lH, lH2, lH3, str, str2, aVar);
    }

    public void a0(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError, n.f0.a<Void> aVar) {
        this.f23593d.a(webView, new n.i0.a() { // from class: io.flutter.plugins.webviewflutter.p5
            @Override // io.flutter.plugins.webviewflutter.n.i0.a
            public final void a(Object obj) {
                s5.S((Void) obj);
            }
        });
        Long lH = this.f23592c.h(webView);
        Objects.requireNonNull(lH);
        w(Long.valueOf(M(webViewClient)), lH, K(webResourceRequest), I(webResourceError), aVar);
    }

    public void b0(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, v0.e eVar, n.f0.a<Void> aVar) {
        this.f23593d.a(webView, new n.i0.a() { // from class: io.flutter.plugins.webviewflutter.r5
            @Override // io.flutter.plugins.webviewflutter.n.i0.a
            public final void a(Object obj) {
                s5.T((Void) obj);
            }
        });
        Long lH = this.f23592c.h(webView);
        Objects.requireNonNull(lH);
        w(Long.valueOf(M(webViewClient)), lH, K(webResourceRequest), J(eVar), aVar);
    }

    public void c0(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, n.f0.a<Void> aVar) {
        this.f23593d.a(webView, new n.i0.a() { // from class: io.flutter.plugins.webviewflutter.j5
            @Override // io.flutter.plugins.webviewflutter.n.i0.a
            public final void a(Object obj) {
                s5.U((Void) obj);
            }
        });
        Long lH = this.f23592c.h(webView);
        Objects.requireNonNull(lH);
        x(Long.valueOf(M(webViewClient)), lH, K(webResourceRequest), aVar);
    }

    public void d0(WebViewClient webViewClient, WebView webView, String str, n.f0.a<Void> aVar) {
        this.f23593d.a(webView, new n.i0.a() { // from class: io.flutter.plugins.webviewflutter.o5
            @Override // io.flutter.plugins.webviewflutter.n.i0.a
            public final void a(Object obj) {
                s5.V((Void) obj);
            }
        });
        Long lH = this.f23592c.h(webView);
        Objects.requireNonNull(lH);
        y(Long.valueOf(M(webViewClient)), lH, str, aVar);
    }
}
