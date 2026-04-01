package j2;

import android.util.Log;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.qg0;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends qg0 {
    public static void k(String str) {
        if (m()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            boolean z7 = true;
            for (String str2 : qg0.f13447a.d(str)) {
                if (z7) {
                    Log.v("Ads", str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z7 = false;
            }
        }
    }

    public static void l(String str, Throwable th) {
        if (m()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean m() {
        return qg0.j(2) && ((Boolean) mu.f11540a.e()).booleanValue();
    }
}
