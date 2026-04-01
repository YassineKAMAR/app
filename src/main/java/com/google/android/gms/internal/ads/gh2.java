package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;

/* JADX INFO: loaded from: classes.dex */
public final class gh2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8330b;

    public gh2(String str, String str2) {
        this.f8329a = str;
        this.f8330b = str2;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((Bundle) obj).putString(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, ((Boolean) h2.y.c().b(ns.S6)).booleanValue() ? this.f8330b : this.f8329a);
    }
}
