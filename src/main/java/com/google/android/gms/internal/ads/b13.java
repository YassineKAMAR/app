package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class b13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UiModeManager f5565a;

    public static wz2 a() {
        UiModeManager uiModeManager = f5565a;
        if (uiModeManager == null) {
            return wz2.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? wz2.OTHER : wz2.CTV : wz2.MOBILE;
    }

    public static void b(Context context) {
        if (context != null) {
            f5565a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
