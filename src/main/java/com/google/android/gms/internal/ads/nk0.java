package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
final class nk0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f11903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f11904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f11905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ pk0 f11906d;

    nk0(pk0 pk0Var, String str, String str2, long j8) {
        this.f11906d = pk0Var;
        this.f11903a = str;
        this.f11904b = str2;
        this.f11905c = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f11903a);
        map.put("cachedSrc", this.f11904b);
        map.put("totalDuration", Long.toString(this.f11905c));
        pk0.g(this.f11906d, "onPrecacheEvent", map);
    }
}
