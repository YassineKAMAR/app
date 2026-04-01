package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
final class lk0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f10750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f10751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f10752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f10753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f10754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f10755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f10756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f10757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f10758i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ pk0 f10759j;

    lk0(pk0 pk0Var, String str, String str2, int i8, int i9, long j8, long j9, boolean z7, int i10, int i11) {
        this.f10759j = pk0Var;
        this.f10750a = str;
        this.f10751b = str2;
        this.f10752c = i8;
        this.f10753d = i9;
        this.f10754e = j8;
        this.f10755f = j9;
        this.f10756g = z7;
        this.f10757h = i10;
        this.f10758i = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f10750a);
        map.put("cachedSrc", this.f10751b);
        map.put("bytesLoaded", Integer.toString(this.f10752c));
        map.put("totalBytes", Integer.toString(this.f10753d));
        map.put("bufferedDuration", Long.toString(this.f10754e));
        map.put("totalDuration", Long.toString(this.f10755f));
        map.put("cacheReady", true != this.f10756g ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f10757h));
        map.put("playerPreparedCount", Integer.toString(this.f10758i));
        pk0.g(this.f10759j, "onPrecacheEvent", map);
    }
}
