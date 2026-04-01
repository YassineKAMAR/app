package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ty implements qz {
    ty() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        fm0 fm0Var = (fm0) obj;
        WindowManager windowManager = (WindowManager) fm0Var.getContext().getSystemService("window");
        g2.t.r();
        DisplayMetrics displayMetricsT = j2.k2.T(windowManager);
        int i8 = displayMetricsT.widthPixels;
        int i9 = displayMetricsT.heightPixels;
        int[] iArr = new int[2];
        HashMap map2 = new HashMap();
        ((View) fm0Var).getLocationInWindow(iArr);
        map2.put("xInPixels", Integer.valueOf(iArr[0]));
        map2.put("yInPixels", Integer.valueOf(iArr[1]));
        map2.put("windowWidthInPixels", Integer.valueOf(i8));
        map2.put("windowHeightInPixels", Integer.valueOf(i9));
        fm0Var.U("locationReady", map2);
        qg0.g("GET LOCATION COMPILED");
    }
}
