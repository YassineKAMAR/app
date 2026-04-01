package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
final class mk0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f11346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f11347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f11348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ pk0 f11349d;

    mk0(pk0 pk0Var, String str, String str2, int i8) {
        this.f11349d = pk0Var;
        this.f11346a = str;
        this.f11347b = str2;
        this.f11348c = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f11346a);
        map.put("cachedSrc", this.f11347b);
        map.put("totalBytes", Integer.toString(this.f11348c));
        pk0.g(this.f11349d, "onPrecacheEvent", map);
    }
}
