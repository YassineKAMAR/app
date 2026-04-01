package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.KeyEvent;
import android.webkit.HttpAuthHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewClientCompat;
import io.flutter.plugins.webviewflutter.b6;
import io.flutter.plugins.webviewflutter.n;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class b6 implements n.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b4 f23397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f23398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s5 f23399c;

    public static class a extends WebViewClientCompat {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s5 f23400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f23401c = false;

        public a(s5 s5Var) {
            this.f23400b = s5Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void k(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void l(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void m(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void n(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void o(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void p(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void q(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void r(Void r02) {
        }

        @Override // androidx.webkit.WebViewClientCompat
        @SuppressLint({"RequiresFeature"})
        public void a(WebView webView, WebResourceRequest webResourceRequest, v0.e eVar) {
            this.f23400b.b0(this, webView, webResourceRequest, eVar, new n.f0.a() { // from class: io.flutter.plugins.webviewflutter.w5
                @Override // io.flutter.plugins.webviewflutter.n.f0.a
                public final void a(Object obj) {
                    b6.a.n((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(WebView webView, String str, boolean z7) {
            this.f23400b.L(this, webView, str, z7, new n.f0.a() { // from class: io.flutter.plugins.webviewflutter.u5
                @Override // io.flutter.plugins.webviewflutter.n.f0.a
                public final void a(Object obj) {
                    b6.a.k((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            this.f23400b.W(this, webView, str, new n.f0.a() { // from class: io.flutter.plugins.webviewflutter.v5
                @Override // io.flutter.plugins.webviewflutter.n.f0.a
                public final void a(Object obj) {
                    b6.a.l((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f23400b.X(this, webView, str, new n.f0.a() { // from class: io.flutter.plugins.webviewflutter.a6
                @Override // io.flutter.plugins.webviewflutter.n.f0.a
                public final void a(Object obj) {
                    b6.a.m((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i8, String str, String str2) {
            this.f23400b.Y(this, webView, Long.valueOf(i8), str, str2, new n.f0.a() { // from class: io.flutter.plugins.webviewflutter.z5
                @Override // io.flutter.plugins.webviewflutter.n.f0.a
                public final void a(Object obj) {
                    b6.a.o((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.f23400b.Z(this, webView, httpAuthHandler, str, str2, new n.f0.a() { // from class: io.flutter.plugins.webviewflutter.t5
                @Override // io.flutter.plugins.webviewflutter.n.f0.a
                public final void a(Object obj) {
                    b6.a.p((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        public void s(boolean z7) {
            this.f23401c = z7;
        }

        @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
        @TargetApi(21)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            this.f23400b.c0(this, webView, webResourceRequest, new n.f0.a() { // from class: io.flutter.plugins.webviewflutter.y5
                @Override // io.flutter.plugins.webviewflutter.n.f0.a
                public final void a(Object obj) {
                    b6.a.q((Void) obj);
                }
            });
            return this.f23401c;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.f23400b.d0(this, webView, str, new n.f0.a() { // from class: io.flutter.plugins.webviewflutter.x5
                @Override // io.flutter.plugins.webviewflutter.n.f0.a
                public final void a(Object obj) {
                    b6.a.r((Void) obj);
                }
            });
            return this.f23401c;
        }
    }

    public static class b {
        public WebViewClient a(s5 s5Var) {
            return Build.VERSION.SDK_INT >= 24 ? new c(s5Var) : new a(s5Var);
        }
    }

    public static class c extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s5 f23402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f23403b = false;

        public c(s5 s5Var) {
            this.f23402a = s5Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void i(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void j(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void k(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void l(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void m(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void n(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void o(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void p(Void r02) {
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(WebView webView, String str, boolean z7) {
            this.f23402a.L(this, webView, str, z7, new n.f0.a() { // from class: io.flutter.plugins.webviewflutter.e6
                @Override // io.flutter.plugins.webviewflutter.n.f0.a
                public final void a(Object obj) {
                    b6.c.i((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            this.f23402a.W(this, webView, str, new n.f0.a() { // from class: io.flutter.plugins.webviewflutter.d6
                @Override // io.flutter.plugins.webviewflutter.n.f0.a
                public final void a(Object obj) {
                    b6.c.j((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f23402a.X(this, webView, str, new n.f0.a() { // from class: io.flutter.plugins.webviewflutter.c6
                @Override // io.flutter.plugins.webviewflutter.n.f0.a
                public final void a(Object obj) {
                    b6.c.k((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i8, String str, String str2) {
            this.f23402a.Y(this, webView, Long.valueOf(i8), str, str2, new n.f0.a() { // from class: io.flutter.plugins.webviewflutter.f6
                @Override // io.flutter.plugins.webviewflutter.n.f0.a
                public final void a(Object obj) {
                    b6.c.m((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f23402a.a0(this, webView, webResourceRequest, webResourceError, new n.f0.a() { // from class: io.flutter.plugins.webviewflutter.i6
                @Override // io.flutter.plugins.webviewflutter.n.f0.a
                public final void a(Object obj) {
                    b6.c.l((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.f23402a.Z(this, webView, httpAuthHandler, str, str2, new n.f0.a() { // from class: io.flutter.plugins.webviewflutter.j6
                @Override // io.flutter.plugins.webviewflutter.n.f0.a
                public final void a(Object obj) {
                    b6.c.n((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        public void q(boolean z7) {
            this.f23403b = z7;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            this.f23402a.c0(this, webView, webResourceRequest, new n.f0.a() { // from class: io.flutter.plugins.webviewflutter.h6
                @Override // io.flutter.plugins.webviewflutter.n.f0.a
                public final void a(Object obj) {
                    b6.c.o((Void) obj);
                }
            });
            return this.f23403b;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.f23402a.d0(this, webView, str, new n.f0.a() { // from class: io.flutter.plugins.webviewflutter.g6
                @Override // io.flutter.plugins.webviewflutter.n.f0.a
                public final void a(Object obj) {
                    b6.c.p((Void) obj);
                }
            });
            return this.f23403b;
        }
    }

    public b6(b4 b4Var, b bVar, s5 s5Var) {
        this.f23397a = b4Var;
        this.f23398b = bVar;
        this.f23399c = s5Var;
    }

    @Override // io.flutter.plugins.webviewflutter.n.h0
    public void a(Long l8) {
        this.f23397a.b(this.f23398b.a(this.f23399c), l8.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.h0
    public void b(Long l8, Boolean bool) {
        WebViewClient webViewClient = (WebViewClient) this.f23397a.i(l8.longValue());
        Objects.requireNonNull(webViewClient);
        if (webViewClient instanceof a) {
            ((a) webViewClient).s(bool.booleanValue());
        } else {
            if (Build.VERSION.SDK_INT < 24 || !(webViewClient instanceof c)) {
                throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
            }
            ((c) webViewClient).q(bool.booleanValue());
        }
    }
}
