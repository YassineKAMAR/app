package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
final class kk0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f10126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f10127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f10128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f10129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f10130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f10131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f10132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f10133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f10134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f10135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ pk0 f10136k;

    kk0(pk0 pk0Var, String str, String str2, long j8, long j9, long j10, long j11, long j12, boolean z7, int i8, int i9) {
        this.f10136k = pk0Var;
        this.f10126a = str;
        this.f10127b = str2;
        this.f10128c = j8;
        this.f10129d = j9;
        this.f10130e = j10;
        this.f10131f = j11;
        this.f10132g = j12;
        this.f10133h = z7;
        this.f10134i = i8;
        this.f10135j = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f10126a);
        map.put("cachedSrc", this.f10127b);
        map.put("bufferedDuration", Long.toString(this.f10128c));
        map.put("totalDuration", Long.toString(this.f10129d));
        if (((Boolean) h2.y.c().b(ns.O1)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.f10130e));
            map.put("qoeCachedBytes", Long.toString(this.f10131f));
            map.put("totalBytes", Long.toString(this.f10132g));
            map.put("reportTime", Long.toString(g2.t.b().a()));
        }
        map.put("cacheReady", true != this.f10133h ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f10134i));
        map.put("playerPreparedCount", Integer.toString(this.f10135j));
        pk0.g(this.f10136k, "onPrecacheEvent", map);
    }
}
