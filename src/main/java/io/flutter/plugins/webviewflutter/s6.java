package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugins.webviewflutter.n;
import io.flutter.plugins.webviewflutter.s6;
import io.flutter.plugins.webviewflutter.u4;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class s6 implements n.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b4 f23594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f23595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s5.c f23596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f23597d;

    @SuppressLint({"ViewConstructor"})
    public static class a extends WebView implements io.flutter.plugin.platform.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private l6 f23598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WebViewClient f23599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private u4.a f23600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC0130a f23601d;

        /* JADX INFO: renamed from: io.flutter.plugins.webviewflutter.s6$a$a, reason: collision with other inner class name */
        interface InterfaceC0130a {
            boolean a(int i8);
        }

        public a(Context context, s5.c cVar, b4 b4Var) {
            this(context, cVar, b4Var, new InterfaceC0130a() { // from class: io.flutter.plugins.webviewflutter.r6
                @Override // io.flutter.plugins.webviewflutter.s6.a.InterfaceC0130a
                public final boolean a(int i8) {
                    return s6.a.g(i8);
                }
            });
        }

        a(Context context, s5.c cVar, b4 b4Var, InterfaceC0130a interfaceC0130a) {
            super(context);
            this.f23599b = new WebViewClient();
            this.f23600c = new u4.a();
            this.f23598a = new l6(cVar, b4Var);
            this.f23601d = interfaceC0130a;
            setWebViewClient(this.f23599b);
            setWebChromeClient(this.f23600c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean g(int i8) {
            return Build.VERSION.SDK_INT >= i8;
        }

        private io.flutter.embedding.android.s h() {
            ViewParent parent = this;
            while (parent.getParent() != null) {
                parent = parent.getParent();
                if (parent instanceof io.flutter.embedding.android.s) {
                    return (io.flutter.embedding.android.s) parent;
                }
            }
            return null;
        }

        @Override // io.flutter.plugin.platform.k
        public void a() {
        }

        @Override // io.flutter.plugin.platform.k
        public /* synthetic */ void b(View view) {
            io.flutter.plugin.platform.j.a(this, view);
        }

        @Override // io.flutter.plugin.platform.k
        public /* synthetic */ void c() {
            io.flutter.plugin.platform.j.c(this);
        }

        @Override // io.flutter.plugin.platform.k
        public /* synthetic */ void d() {
            io.flutter.plugin.platform.j.d(this);
        }

        @Override // io.flutter.plugin.platform.k
        public /* synthetic */ void e() {
            io.flutter.plugin.platform.j.b(this);
        }

        @Override // io.flutter.plugin.platform.k
        public View getView() {
            return this;
        }

        @Override // android.webkit.WebView
        public WebChromeClient getWebChromeClient() {
            return this.f23600c;
        }

        @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            io.flutter.embedding.android.s sVarH;
            super.onAttachedToWindow();
            if (!this.f23601d.a(26) || (sVarH = h()) == null) {
                return;
            }
            sVarH.setImportantForAutofill(1);
        }

        void setApi(l6 l6Var) {
            this.f23598a = l6Var;
        }

        @Override // android.webkit.WebView
        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            if (!(webChromeClient instanceof u4.a)) {
                throw new AssertionError("Client must be a SecureWebChromeClient.");
            }
            u4.a aVar = (u4.a) webChromeClient;
            this.f23600c = aVar;
            aVar.b(this.f23599b);
        }

        @Override // android.webkit.WebView
        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.f23599b = webViewClient;
            this.f23600c.b(webViewClient);
        }
    }

    public static class b {
        public a a(Context context, s5.c cVar, b4 b4Var) {
            return new a(context, cVar, b4Var);
        }

        public void b(boolean z7) {
            WebView.setWebContentsDebuggingEnabled(z7);
        }
    }

    public s6(b4 b4Var, s5.c cVar, b bVar, Context context) {
        this.f23594a = b4Var;
        this.f23596c = cVar;
        this.f23595b = bVar;
        this.f23597d = context;
    }

    public void A(Context context) {
        this.f23597d = context;
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void a(Long l8) {
        f fVar = new f();
        DisplayManager displayManager = (DisplayManager) this.f23597d.getSystemService("display");
        fVar.b(displayManager);
        a aVarA = this.f23595b.a(this.f23597d, this.f23596c, this.f23594a);
        fVar.a(displayManager);
        this.f23594a.b(aVarA, l8.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public Long b(Long l8) {
        Objects.requireNonNull((WebView) this.f23594a.i(l8.longValue()));
        return Long.valueOf(r4.getScrollX());
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void c(Long l8, String str, String str2, String str3) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        webView.loadData(str, str2, str3);
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    @SuppressLint({"JavascriptInterface"})
    public void d(Long l8, Long l9) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        f4 f4Var = (f4) this.f23594a.i(l9.longValue());
        Objects.requireNonNull(f4Var);
        webView.addJavascriptInterface(f4Var, f4Var.f23436b);
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void e(Boolean bool) {
        this.f23595b.b(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void f(Long l8, Long l9) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        b4 b4Var = this.f23594a;
        Objects.requireNonNull(l9);
        webView.setWebChromeClient((WebChromeClient) b4Var.i(l9.longValue()));
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void g(Long l8) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        webView.goForward();
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void h(Long l8, String str, Map<String, String> map) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        webView.loadUrl(str, map);
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void i(Long l8, Boolean bool) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        webView.clearCache(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void j(Long l8, String str, final n.w<String> wVar) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        Objects.requireNonNull(wVar);
        webView.evaluateJavascript(str, new ValueCallback() { // from class: io.flutter.plugins.webviewflutter.q6
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                wVar.a((String) obj);
            }
        });
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void k(Long l8, Long l9, Long l10) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        webView.scrollTo(l9.intValue(), l10.intValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void l(Long l8, Long l9) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        f4 f4Var = (f4) this.f23594a.i(l9.longValue());
        Objects.requireNonNull(f4Var);
        webView.removeJavascriptInterface(f4Var.f23436b);
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public Long m(Long l8) {
        Objects.requireNonNull((WebView) this.f23594a.i(l8.longValue()));
        return Long.valueOf(r4.getScrollY());
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public n.l0 n(Long l8) {
        Objects.requireNonNull((WebView) this.f23594a.i(l8.longValue()));
        return new n.l0.a().b(Long.valueOf(r4.getScrollX())).c(Long.valueOf(r4.getScrollY())).a();
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public String o(Long l8) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        return webView.getTitle();
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void p(Long l8) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        webView.reload();
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public Boolean q(Long l8) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        return Boolean.valueOf(webView.canGoForward());
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void r(Long l8, String str, String str2, String str3, String str4, String str5) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void s(Long l8) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        webView.goBack();
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void t(Long l8, Long l9) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        webView.setBackgroundColor(l9.intValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void u(Long l8, Long l9) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        b4 b4Var = this.f23594a;
        Objects.requireNonNull(l9);
        webView.setDownloadListener((DownloadListener) b4Var.i(l9.longValue()));
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public Boolean v(Long l8) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        return Boolean.valueOf(webView.canGoBack());
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public String w(Long l8) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        return webView.getUrl();
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void x(Long l8, String str, byte[] bArr) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        webView.postUrl(str, bArr);
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void y(Long l8, Long l9, Long l10) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        webView.scrollBy(l9.intValue(), l10.intValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.j0
    public void z(Long l8, Long l9) {
        WebView webView = (WebView) this.f23594a.i(l8.longValue());
        Objects.requireNonNull(webView);
        webView.setWebViewClient((WebViewClient) this.f23594a.i(l9.longValue()));
    }
}
