package w0;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebView$VisualStateCallback;
import v0.d;
import v0.f;

/* JADX INFO: loaded from: classes.dex */
public class g {

    class a extends WebMessagePort.WebMessageCallback {
        a(d.a aVar) {
        }

        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            new z(webMessagePort);
            z.c(webMessage);
            throw null;
        }
    }

    class b extends WebMessagePort.WebMessageCallback {
        b(d.a aVar) {
        }

        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            new z(webMessagePort);
            z.c(webMessage);
            throw null;
        }
    }

    class c extends WebView$VisualStateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f.a f27081a;

        c(f.a aVar) {
            this.f27081a = aVar;
        }

        public void onComplete(long j8) {
            this.f27081a.onComplete(j8);
        }
    }

    public static void a(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static WebMessage b(v0.c cVar) {
        return new WebMessage(cVar.a(), z.b(cVar.b()));
    }

    public static WebMessagePort[] c(WebView webView) {
        return webView.createWebMessageChannel();
    }

    public static v0.c d(WebMessage webMessage) {
        return new v0.c(webMessage.getData(), z.e(webMessage.getPorts()));
    }

    public static CharSequence e(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int f(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean g(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void h(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void i(WebView webView, long j8, f.a aVar) {
        webView.postVisualStateCallback(j8, new c(aVar));
    }

    public static void j(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void k(WebSettings webSettings, boolean z7) {
        webSettings.setOffscreenPreRaster(z7);
    }

    public static void l(WebMessagePort webMessagePort, d.a aVar) {
        webMessagePort.setWebMessageCallback(new a(aVar));
    }

    public static void m(WebMessagePort webMessagePort, d.a aVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new b(aVar), handler);
    }
}
