package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class yi2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17779f;

    public yi2(String str, int i8, int i9, int i10, boolean z7, int i11) {
        this.f17774a = str;
        this.f17775b = i8;
        this.f17776c = i9;
        this.f17777d = i10;
        this.f17778e = z7;
        this.f17779f = i11;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        ft2.f(bundle, "carrier", this.f17774a, !TextUtils.isEmpty(this.f17774a));
        int i8 = this.f17775b;
        ft2.e(bundle, "cnt", i8, i8 != -2);
        bundle.putInt("gnt", this.f17776c);
        bundle.putInt("pt", this.f17777d);
        Bundle bundleA = ft2.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = ft2.a(bundleA, "network");
        bundleA.putBundle("network", bundleA2);
        bundleA2.putInt("active_network_state", this.f17779f);
        bundleA2.putBoolean("active_network_metered", this.f17778e);
    }
}
