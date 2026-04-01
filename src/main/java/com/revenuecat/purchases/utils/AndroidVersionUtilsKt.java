package com.revenuecat.purchases.utils;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidVersionUtilsKt {
    public static final boolean isAndroidNOrNewer() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
