package com.google.android.gms.internal.ads;

import android.util.Log;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class v74 extends a84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f16036a;

    public v74(String str) {
        this.f16036a = str;
    }

    @Override // com.google.android.gms.internal.ads.a84
    public final void a(String str) {
        String str2 = this.f16036a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
