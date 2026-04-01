package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class hs {
    public static final SharedPreferences a(Context context) {
        return context.getSharedPreferences("google_ads_flags", 0);
    }
}
