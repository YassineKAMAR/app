package m3;

import android.annotation.TargetApi;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f24801a;

    private q1() {
    }

    @TargetApi(19)
    public static void a(WebView webView, String str) {
        boolean zBooleanValue;
        synchronized (q1.class) {
            if (f24801a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    f24801a = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    f24801a = Boolean.FALSE;
                }
                zBooleanValue = f24801a.booleanValue();
            } else {
                zBooleanValue = f24801a.booleanValue();
            }
        }
        if (zBooleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            webView.loadUrl("javascript:".concat(str));
        }
    }
}
