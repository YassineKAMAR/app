package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ee2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f7280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7281b;

    public ee2(double d8, boolean z7) {
        this.f7280a = d8;
        this.f7281b = z7;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleA = ft2.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = ft2.a(bundleA, "battery");
        bundleA.putBundle("battery", bundleA2);
        bundleA2.putBoolean("is_charging", this.f7281b);
        bundleA2.putDouble("battery_level", this.f7280a);
    }
}
