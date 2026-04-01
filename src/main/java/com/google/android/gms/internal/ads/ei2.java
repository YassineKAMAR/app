package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ei2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7349h;

    ei2(boolean z7, boolean z8, String str, boolean z9, int i8, int i9, int i10, String str2) {
        this.f7342a = z7;
        this.f7343b = z8;
        this.f7344c = str;
        this.f7345d = z9;
        this.f7346e = i8;
        this.f7347f = i9;
        this.f7348g = i10;
        this.f7349h = str2;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f7344c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) h2.y.c().b(ns.f12236y3));
        bundle.putInt("target_api", this.f7346e);
        bundle.putInt("dv", this.f7347f);
        bundle.putInt("lv", this.f7348g);
        if (((Boolean) h2.y.c().b(ns.R5)).booleanValue() && !TextUtils.isEmpty(this.f7349h)) {
            bundle.putString("ev", this.f7349h);
        }
        Bundle bundleA = ft2.a(bundle, "sdk_env");
        bundleA.putBoolean("mf", ((Boolean) ju.f9803a.e()).booleanValue());
        bundleA.putBoolean("instant_app", this.f7342a);
        bundleA.putBoolean("lite", this.f7343b);
        bundleA.putBoolean("is_privileged_process", this.f7345d);
        bundle.putBundle("sdk_env", bundleA);
        Bundle bundleA2 = ft2.a(bundleA, "build_meta");
        bundleA2.putString("cl", "575948185");
        bundleA2.putString("rapid_rc", "dev");
        bundleA2.putString("rapid_rollup", "HEAD");
        bundleA.putBundle("build_meta", bundleA2);
    }
}
