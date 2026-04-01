package io.flutter.plugins.webviewflutter;

import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.n;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class s4 extends n.y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s5.c f23587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b4 f23588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l6 f23589d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23590a;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            f23590a = iArr;
            try {
                iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23590a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23590a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23590a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23590a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public s4(s5.c cVar, b4 b4Var) {
        super(cVar);
        this.f23587b = cVar;
        this.f23588c = b4Var;
        this.f23589d = new l6(cVar, b4Var);
    }

    private long P(WebChromeClient webChromeClient) {
        Long lH = this.f23588c.h(webChromeClient);
        if (lH != null) {
            return lH.longValue();
        }
        throw new IllegalStateException("Could not find identifier for WebChromeClient.");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W(Void r02) {
    }

    private static n.b i0(ConsoleMessage.MessageLevel messageLevel) {
        int i8 = a.f23590a[messageLevel.ordinal()];
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? n.b.UNKNOWN : n.b.DEBUG : n.b.ERROR : n.b.WARNING : n.b.LOG : n.b.TIP;
    }

    public void X(WebChromeClient webChromeClient, ConsoleMessage consoleMessage, n.y.a<Void> aVar) {
        Long lH = this.f23588c.h(webChromeClient);
        Objects.requireNonNull(lH);
        super.x(lH, new n.a.C0128a().c(Long.valueOf(consoleMessage.lineNumber())).d(consoleMessage.message()).b(i0(consoleMessage.messageLevel())).e(consoleMessage.sourceId()).a(), aVar);
    }

    public void Y(WebChromeClient webChromeClient, n.y.a<Void> aVar) {
        Long lH = this.f23588c.h(webChromeClient);
        Objects.requireNonNull(lH);
        super.y(lH, aVar);
    }

    public void Z(WebChromeClient webChromeClient, String str, GeolocationPermissions.Callback callback, n.y.a<Void> aVar) {
        new w3(this.f23587b, this.f23588c).a(callback, new n.l.a() { // from class: io.flutter.plugins.webviewflutter.n4
            @Override // io.flutter.plugins.webviewflutter.n.l.a
            public final void a(Object obj) {
                s4.Q((Void) obj);
            }
        });
        Long lH = this.f23588c.h(webChromeClient);
        Objects.requireNonNull(lH);
        Long lH2 = this.f23588c.h(callback);
        Objects.requireNonNull(lH2);
        z(lH, lH2, str, aVar);
    }

    public void a0(WebChromeClient webChromeClient, n.y.a<Void> aVar) {
        Long lH = this.f23588c.h(webChromeClient);
        Objects.requireNonNull(lH);
        super.A(lH, aVar);
    }

    public void b0(WebChromeClient webChromeClient, String str, String str2, n.y.a<Void> aVar) {
        Long lH = this.f23588c.h(webChromeClient);
        Objects.requireNonNull(lH);
        super.B(lH, str, str2, aVar);
    }

    public void c0(WebChromeClient webChromeClient, String str, String str2, n.y.a<Boolean> aVar) {
        Long lH = this.f23588c.h(webChromeClient);
        Objects.requireNonNull(lH);
        super.C(lH, str, str2, aVar);
    }

    public void d0(WebChromeClient webChromeClient, String str, String str2, String str3, n.y.a<String> aVar) {
        Long lH = this.f23588c.h(webChromeClient);
        Objects.requireNonNull(lH);
        super.D(lH, str, str2, str3, aVar);
    }

    public void e0(WebChromeClient webChromeClient, PermissionRequest permissionRequest, n.y.a<Void> aVar) {
        new i4(this.f23587b, this.f23588c).a(permissionRequest, permissionRequest.getResources(), new n.u.a() { // from class: io.flutter.plugins.webviewflutter.r4
            @Override // io.flutter.plugins.webviewflutter.n.u.a
            public final void a(Object obj) {
                s4.R((Void) obj);
            }
        });
        Long lH = this.f23588c.h(webChromeClient);
        Objects.requireNonNull(lH);
        Long lH2 = this.f23588c.h(permissionRequest);
        Objects.requireNonNull(lH2);
        super.E(lH, lH2, aVar);
    }

    public void f0(WebChromeClient webChromeClient, WebView webView, Long l8, n.y.a<Void> aVar) {
        this.f23589d.a(webView, new n.i0.a() { // from class: io.flutter.plugins.webviewflutter.o4
            @Override // io.flutter.plugins.webviewflutter.n.i0.a
            public final void a(Object obj) {
                s4.S((Void) obj);
            }
        });
        Long lH = this.f23588c.h(webView);
        Objects.requireNonNull(lH);
        super.F(Long.valueOf(P(webChromeClient)), lH, l8, aVar);
    }

    public void g0(WebChromeClient webChromeClient, View view, WebChromeClient.CustomViewCallback customViewCallback, n.y.a<Void> aVar) {
        new k4(this.f23587b, this.f23588c).a(view, new n.x.a() { // from class: io.flutter.plugins.webviewflutter.l4
            @Override // io.flutter.plugins.webviewflutter.n.x.a
            public final void a(Object obj) {
                s4.T((Void) obj);
            }
        });
        new d(this.f23587b, this.f23588c).a(customViewCallback, new n.d.a() { // from class: io.flutter.plugins.webviewflutter.m4
            @Override // io.flutter.plugins.webviewflutter.n.d.a
            public final void a(Object obj) {
                s4.U((Void) obj);
            }
        });
        Long lH = this.f23588c.h(webChromeClient);
        Objects.requireNonNull(lH);
        Long lH2 = this.f23588c.h(view);
        Objects.requireNonNull(lH2);
        Long lH3 = this.f23588c.h(customViewCallback);
        Objects.requireNonNull(lH3);
        G(lH, lH2, lH3, aVar);
    }

    public void h0(WebChromeClient webChromeClient, WebView webView, WebChromeClient.FileChooserParams fileChooserParams, n.y.a<List<String>> aVar) {
        this.f23589d.a(webView, new n.i0.a() { // from class: io.flutter.plugins.webviewflutter.p4
            @Override // io.flutter.plugins.webviewflutter.n.i0.a
            public final void a(Object obj) {
                s4.V((Void) obj);
            }
        });
        new j(this.f23587b, this.f23588c).e(fileChooserParams, new n.i.a() { // from class: io.flutter.plugins.webviewflutter.q4
            @Override // io.flutter.plugins.webviewflutter.n.i.a
            public final void a(Object obj) {
                s4.W((Void) obj);
            }
        });
        Long lH = this.f23588c.h(webChromeClient);
        Objects.requireNonNull(lH);
        Long lH2 = this.f23588c.h(webView);
        Objects.requireNonNull(lH2);
        Long lH3 = this.f23588c.h(fileChooserParams);
        Objects.requireNonNull(lH3);
        H(lH, lH2, lH3, aVar);
    }
}
