package j2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.b22;
import com.google.android.gms.internal.ads.fm0;
import com.google.android.gms.internal.ads.in0;
import com.google.android.gms.internal.ads.mm0;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.vn;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private c() {
    }

    /* synthetic */ c(b bVar) {
    }

    public static c m(int i8) {
        return i8 >= 30 ? new u2() : i8 >= 28 ? new t2() : i8 >= 26 ? new q2() : i8 >= 24 ? new m2() : i8 >= 21 ? new l2() : new c();
    }

    public int a() {
        return 1;
    }

    public CookieManager b(Context context) {
        g2.t.r();
        if (k2.e()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            qg0.e("Failed to obtain CookieManager.", th);
            g2.t.q().u(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebResourceResponse c(String str, String str2, int i8, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public mm0 d(fm0 fm0Var, vn vnVar, boolean z7, b22 b22Var) {
        return new in0(fm0Var, vnVar, z7, b22Var);
    }

    public boolean e(Activity activity, Configuration configuration) {
        return false;
    }

    public Intent f(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public void g(Context context, String str, String str2) {
    }

    public boolean h(Context context, String str) {
        return false;
    }

    public int i(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    public int j(AudioManager audioManager) {
        return 0;
    }

    public void k(Activity activity) {
    }

    public int l(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
