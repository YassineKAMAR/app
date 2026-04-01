package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ag2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f5263a;

    public ag2(Bundle bundle) {
        this.f5263a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleA = ft2.a(bundle, "device");
        bundleA.putBundle("android_mem_info", this.f5263a);
        bundle.putBundle("device", bundleA);
    }
}
