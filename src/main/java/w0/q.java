package w0;

import android.content.Context;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class q {
    public static void a(SafeBrowsingResponse safeBrowsingResponse, boolean z7) {
        safeBrowsingResponse.backToSafety(z7);
    }

    public static Uri b() {
        return WebView.getSafeBrowsingPrivacyPolicyUrl();
    }

    public static void c(SafeBrowsingResponse safeBrowsingResponse, boolean z7) {
        safeBrowsingResponse.proceed(z7);
    }

    public static void d(List<String> list, ValueCallback<Boolean> valueCallback) {
        WebView.setSafeBrowsingWhitelist(list, valueCallback);
    }

    public static void e(SafeBrowsingResponse safeBrowsingResponse, boolean z7) {
        safeBrowsingResponse.showInterstitial(z7);
    }

    public static void f(Context context, ValueCallback<Boolean> valueCallback) {
        WebView.startSafeBrowsing(context, valueCallback);
    }
}
