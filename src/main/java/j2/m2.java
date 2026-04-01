package j2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.jg0;
import com.google.android.gms.internal.ads.ns;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public class m2 extends l2 {
    static final boolean n(int i8, int i9, int i10) {
        return Math.abs(i8 - i9) <= i10;
    }

    @Override // j2.c
    public final boolean e(Activity activity, Configuration configuration) {
        if (!((Boolean) h2.y.c().b(ns.H4)).booleanValue()) {
            return false;
        }
        if (((Boolean) h2.y.c().b(ns.J4)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        h2.v.b();
        int iB = jg0.B(activity, configuration.screenHeightDp);
        int iB2 = jg0.B(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        g2.t.r();
        DisplayMetrics displayMetricsT = k2.T(windowManager);
        int i8 = displayMetricsT.heightPixels;
        int i9 = displayMetricsT.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iRound = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) h2.y.c().b(ns.F4)).intValue();
        return (n(i8, iB + dimensionPixelSize, iRound) && n(i9, iB2, iRound)) ? false : true;
    }
}
