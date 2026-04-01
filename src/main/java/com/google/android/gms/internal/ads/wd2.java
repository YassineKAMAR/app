package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.revenuecat.purchases.common.UtilsKt;

/* JADX INFO: loaded from: classes.dex */
public final class wd2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f16694a;

    private wd2(Integer num) {
        this.f16694a = num;
    }

    static /* bridge */ /* synthetic */ wd2 b() {
        if (!((Boolean) h2.y.c().b(ns.u9)).booleanValue()) {
            return new wd2(null);
        }
        g2.t.r();
        int extensionVersion = 0;
        if (Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
            extensionVersion = SdkExtensions.getExtensionVersion(UtilsKt.MICROS_MULTIPLIER);
        }
        return new wd2(Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Integer num = this.f16694a;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
