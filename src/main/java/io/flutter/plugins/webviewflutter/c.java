package io.flutter.plugins.webviewflutter;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.n;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c implements n.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.c f23404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4 f23405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f23406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f23407d;

    interface a {
        boolean a(int i8);
    }

    static class b {
        b() {
        }

        public CookieManager a() {
            return CookieManager.getInstance();
        }
    }

    public c(s5.c cVar, b4 b4Var) {
        this(cVar, b4Var, new b());
    }

    c(s5.c cVar, b4 b4Var, b bVar) {
        this(cVar, b4Var, bVar, new a() { // from class: io.flutter.plugins.webviewflutter.a
            @Override // io.flutter.plugins.webviewflutter.c.a
            public final boolean a(int i8) {
                return c.g(i8);
            }
        });
    }

    c(s5.c cVar, b4 b4Var, b bVar, a aVar) {
        this.f23404a = cVar;
        this.f23405b = b4Var;
        this.f23406c = bVar;
        this.f23407d = aVar;
    }

    private CookieManager f(Long l8) {
        CookieManager cookieManager = (CookieManager) this.f23405b.i(l8.longValue());
        Objects.requireNonNull(cookieManager);
        return cookieManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean g(int i8) {
        return Build.VERSION.SDK_INT >= i8;
    }

    private boolean h(CookieManager cookieManager) {
        boolean zHasCookies = cookieManager.hasCookies();
        if (zHasCookies) {
            cookieManager.removeAllCookie();
        }
        return zHasCookies;
    }

    @Override // io.flutter.plugins.webviewflutter.n.c
    public void a(Long l8, final n.w<Boolean> wVar) {
        boolean zA = this.f23407d.a(21);
        CookieManager cookieManagerF = f(l8);
        if (!zA) {
            wVar.a(Boolean.valueOf(h(cookieManagerF)));
        } else {
            Objects.requireNonNull(wVar);
            cookieManagerF.removeAllCookies(new ValueCallback() { // from class: io.flutter.plugins.webviewflutter.b
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    wVar.a((Boolean) obj);
                }
            });
        }
    }

    @Override // io.flutter.plugins.webviewflutter.n.c
    public void b(Long l8) {
        this.f23405b.b(this.f23406c.a(), l8.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.c
    public void c(Long l8, Long l9, Boolean bool) {
        if (!this.f23407d.a(21)) {
            throw new UnsupportedOperationException("`setAcceptThirdPartyCookies` is unsupported on versions below `Build.VERSION_CODES.LOLLIPOP`.");
        }
        CookieManager cookieManagerF = f(l8);
        WebView webView = (WebView) this.f23405b.i(l9.longValue());
        Objects.requireNonNull(webView);
        cookieManagerF.setAcceptThirdPartyCookies(webView, bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.n.c
    public void d(Long l8, String str, String str2) {
        f(l8).setCookie(str, str2);
    }
}
