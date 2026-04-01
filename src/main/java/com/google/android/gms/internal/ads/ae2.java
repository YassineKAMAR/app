package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ae2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f5238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f5239j;

    public ae2(int i8, boolean z7, boolean z8, int i9, int i10, int i11, int i12, int i13, float f8, boolean z9) {
        this.f5230a = i8;
        this.f5231b = z7;
        this.f5232c = z8;
        this.f5233d = i9;
        this.f5234e = i10;
        this.f5235f = i11;
        this.f5236g = i12;
        this.f5237h = i13;
        this.f5238i = f8;
        this.f5239j = z9;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.f5230a);
        bundle.putBoolean("ma", this.f5231b);
        bundle.putBoolean("sp", this.f5232c);
        bundle.putInt("muv", this.f5233d);
        if (((Boolean) h2.y.c().b(ns.ba)).booleanValue()) {
            bundle.putInt("muv_min", this.f5234e);
            bundle.putInt("muv_max", this.f5235f);
        }
        bundle.putInt("rm", this.f5236g);
        bundle.putInt("riv", this.f5237h);
        bundle.putFloat("android_app_volume", this.f5238i);
        bundle.putBoolean("android_app_muted", this.f5239j);
    }
}
