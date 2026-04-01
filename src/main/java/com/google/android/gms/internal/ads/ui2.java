package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ui2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f15681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f15683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f15684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f15685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f15686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f15687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f15688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f15689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f15690q;

    public ui2(boolean z7, boolean z8, String str, boolean z9, boolean z10, boolean z11, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z12, String str6, long j8, boolean z13, String str7, int i8) {
        this.f15674a = z7;
        this.f15675b = z8;
        this.f15676c = str;
        this.f15677d = z9;
        this.f15678e = z10;
        this.f15679f = z11;
        this.f15680g = str2;
        this.f15681h = arrayList;
        this.f15682i = str3;
        this.f15683j = str4;
        this.f15684k = str5;
        this.f15685l = z12;
        this.f15686m = str6;
        this.f15687n = j8;
        this.f15688o = z13;
        this.f15689p = str7;
        this.f15690q = i8;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f15674a);
        bundle.putBoolean("coh", this.f15675b);
        bundle.putString("gl", this.f15676c);
        bundle.putBoolean("simulator", this.f15677d);
        bundle.putBoolean("is_latchsky", this.f15678e);
        bundle.putInt("build_api_level", this.f15690q);
        if (!((Boolean) h2.y.c().b(ns.ea)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f15679f);
        }
        bundle.putString("hl", this.f15680g);
        if (!this.f15681h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f15681h);
        }
        bundle.putString("mv", this.f15682i);
        bundle.putString("submodel", this.f15686m);
        Bundle bundleA = ft2.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        bundleA.putString("build", this.f15684k);
        bundleA.putLong("remaining_data_partition_space", this.f15687n);
        Bundle bundleA2 = ft2.a(bundleA, "browser");
        bundleA.putBundle("browser", bundleA2);
        bundleA2.putBoolean("is_browser_custom_tabs_capable", this.f15685l);
        if (!TextUtils.isEmpty(this.f15683j)) {
            Bundle bundleA3 = ft2.a(bundleA, "play_store");
            bundleA.putBundle("play_store", bundleA3);
            bundleA3.putString("package_version", this.f15683j);
        }
        if (((Boolean) h2.y.c().b(ns.ra)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f15688o);
        }
        if (!TextUtils.isEmpty(this.f15689p)) {
            bundle.putString("v_unity", this.f15689p);
        }
        if (((Boolean) h2.y.c().b(ns.pa)).booleanValue()) {
            ft2.g(bundle, "gotmt_l", true, ((Boolean) h2.y.c().b(ns.ma)).booleanValue());
            ft2.g(bundle, "gotmt_i", true, ((Boolean) h2.y.c().b(ns.la)).booleanValue());
        }
    }
}
