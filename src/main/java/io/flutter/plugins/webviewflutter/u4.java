package io.flutter.plugins.webviewflutter;

import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugins.webviewflutter.n;
import io.flutter.plugins.webviewflutter.u4;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class u4 implements n.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b4 f23611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f23612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s4 f23613c;

    public static class a extends WebChromeClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WebViewClient f23614a;

        /* JADX INFO: renamed from: io.flutter.plugins.webviewflutter.u4$a$a, reason: collision with other inner class name */
        class C0131a extends WebViewClient {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ WebView f23615a;

            C0131a(WebView webView) {
                this.f23615a = webView;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                if (a.this.f23614a.shouldOverrideUrlLoading(this.f23615a, webResourceRequest)) {
                    return true;
                }
                this.f23615a.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (a.this.f23614a.shouldOverrideUrlLoading(this.f23615a, str)) {
                    return true;
                }
                this.f23615a.loadUrl(str);
                return true;
            }
        }

        boolean a(WebView webView, Message message, WebView webView2) {
            if (this.f23614a == null) {
                return false;
            }
            C0131a c0131a = new C0131a(webView);
            if (webView2 == null) {
                webView2 = new WebView(webView.getContext());
            }
            webView2.setWebViewClient(c0131a);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        public void b(WebViewClient webViewClient) {
            this.f23614a = webViewClient;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z7, boolean z8, Message message) {
            return a(webView, message, new WebView(webView.getContext()));
        }
    }

    public static class b {
        public c a(s4 s4Var) {
            return new c(s4Var);
        }
    }

    public static class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s4 f23617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f23618c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f23619d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f23620e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f23621f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f23622g = false;

        public c(s4 s4Var) {
            this.f23617b = s4Var;
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
        public static /* synthetic */ void s(JsResult jsResult, Boolean bool) {
            if (bool.booleanValue()) {
                jsResult.confirm();
            } else {
                jsResult.cancel();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void t(JsPromptResult jsPromptResult, String str) {
            if (str != null) {
                jsPromptResult.confirm(str);
            } else {
                jsPromptResult.cancel();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void u(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void v(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void w(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void x(boolean z7, ValueCallback valueCallback, List list) {
            if (z7) {
                Uri[] uriArr = new Uri[list.size()];
                for (int i8 = 0; i8 < list.size(); i8++) {
                    uriArr[i8] = Uri.parse((String) list.get(i8));
                }
                valueCallback.onReceiveValue(uriArr);
            }
        }

        public void A(boolean z7) {
            this.f23621f = z7;
        }

        public void B(boolean z7) {
            this.f23622g = z7;
        }

        public void C(boolean z7) {
            this.f23618c = z7;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            this.f23617b.X(this, consoleMessage, new n.y.a() { // from class: io.flutter.plugins.webviewflutter.w4
                @Override // io.flutter.plugins.webviewflutter.n.y.a
                public final void a(Object obj) {
                    u4.c.n((Void) obj);
                }
            });
            return this.f23619d;
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsHidePrompt() {
            this.f23617b.Y(this, new n.y.a() { // from class: io.flutter.plugins.webviewflutter.x4
                @Override // io.flutter.plugins.webviewflutter.n.y.a
                public final void a(Object obj) {
                    u4.c.o((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            this.f23617b.Z(this, str, callback, new n.y.a() { // from class: io.flutter.plugins.webviewflutter.z4
                @Override // io.flutter.plugins.webviewflutter.n.y.a
                public final void a(Object obj) {
                    u4.c.p((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            this.f23617b.a0(this, new n.y.a() { // from class: io.flutter.plugins.webviewflutter.a5
                @Override // io.flutter.plugins.webviewflutter.n.y.a
                public final void a(Object obj) {
                    u4.c.q((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
            if (!this.f23620e) {
                return false;
            }
            this.f23617b.b0(this, str, str2, new n.y.a() { // from class: io.flutter.plugins.webviewflutter.e5
                @Override // io.flutter.plugins.webviewflutter.n.y.a
                public final void a(Object obj) {
                    jsResult.confirm();
                }
            });
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
            if (!this.f23621f) {
                return false;
            }
            this.f23617b.c0(this, str, str2, new n.y.a() { // from class: io.flutter.plugins.webviewflutter.d5
                @Override // io.flutter.plugins.webviewflutter.n.y.a
                public final void a(Object obj) {
                    u4.c.s(jsResult, (Boolean) obj);
                }
            });
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
            if (!this.f23622g) {
                return false;
            }
            this.f23617b.d0(this, str, str2, str3, new n.y.a() { // from class: io.flutter.plugins.webviewflutter.y4
                @Override // io.flutter.plugins.webviewflutter.n.y.a
                public final void a(Object obj) {
                    u4.c.t(jsPromptResult, (String) obj);
                }
            });
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            this.f23617b.e0(this, permissionRequest, new n.y.a() { // from class: io.flutter.plugins.webviewflutter.f5
                @Override // io.flutter.plugins.webviewflutter.n.y.a
                public final void a(Object obj) {
                    u4.c.u((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i8) {
            this.f23617b.f0(this, webView, Long.valueOf(i8), new n.y.a() { // from class: io.flutter.plugins.webviewflutter.b5
                @Override // io.flutter.plugins.webviewflutter.n.y.a
                public final void a(Object obj) {
                    u4.c.v((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            this.f23617b.g0(this, view, customViewCallback, new n.y.a() { // from class: io.flutter.plugins.webviewflutter.c5
                @Override // io.flutter.plugins.webviewflutter.n.y.a
                public final void a(Object obj) {
                    u4.c.w((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, final ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            final boolean z7 = this.f23618c;
            this.f23617b.h0(this, webView, fileChooserParams, new n.y.a() { // from class: io.flutter.plugins.webviewflutter.v4
                @Override // io.flutter.plugins.webviewflutter.n.y.a
                public final void a(Object obj) {
                    u4.c.x(z7, valueCallback, (List) obj);
                }
            });
            return z7;
        }

        public void y(boolean z7) {
            this.f23619d = z7;
        }

        public void z(boolean z7) {
            this.f23620e = z7;
        }
    }

    public u4(b4 b4Var, b bVar, s4 s4Var) {
        this.f23611a = b4Var;
        this.f23612b = bVar;
        this.f23613c = s4Var;
    }

    @Override // io.flutter.plugins.webviewflutter.n.a0
    public void a(Long l8) {
        this.f23611a.b(this.f23612b.a(this.f23613c), l8.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.a0
    public void b(Long l8, Boolean bool) {
        c cVar = (c) this.f23611a.i(l8.longValue());
        Objects.requireNonNull(cVar);
        cVar.C(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.a0
    public void c(Long l8, Boolean bool) {
        c cVar = (c) this.f23611a.i(l8.longValue());
        Objects.requireNonNull(cVar);
        cVar.B(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.a0
    public void d(Long l8, Boolean bool) {
        c cVar = (c) this.f23611a.i(l8.longValue());
        Objects.requireNonNull(cVar);
        cVar.z(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.a0
    public void e(Long l8, Boolean bool) {
        c cVar = (c) this.f23611a.i(l8.longValue());
        Objects.requireNonNull(cVar);
        cVar.y(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.a0
    public void f(Long l8, Boolean bool) {
        c cVar = (c) this.f23611a.i(l8.longValue());
        Objects.requireNonNull(cVar);
        cVar.A(bool.booleanValue());
    }
}
