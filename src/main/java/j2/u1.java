package j2;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.eu;
import com.google.android.gms.internal.ads.hh0;
import com.google.android.gms.internal.ads.pg0;
import com.google.android.gms.internal.ads.qg0;

/* JADX INFO: loaded from: classes.dex */
public final class u1 {
    public static void a(Context context) {
        int i8 = pg0.f12861g;
        if (((Boolean) eu.f7501a.e()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || pg0.l()) {
                    return;
                }
                x3.d dVarB = new c1(context).b();
                qg0.f("Updating ad debug logging enablement.");
                hh0.a(dVarB, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e8) {
                qg0.h("Fail to determine debug setting.", e8);
            }
        }
    }
}
