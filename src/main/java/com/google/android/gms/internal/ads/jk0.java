package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
final class jk0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f9667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f9668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f9669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f9670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ pk0 f9671e;

    jk0(pk0 pk0Var, String str, String str2, int i8, int i9, boolean z7) {
        this.f9671e = pk0Var;
        this.f9667a = str;
        this.f9668b = str2;
        this.f9669c = i8;
        this.f9670d = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f9667a);
        map.put("cachedSrc", this.f9668b);
        map.put("bytesLoaded", Integer.toString(this.f9669c));
        map.put("totalBytes", Integer.toString(this.f9670d));
        map.put("cacheReady", "0");
        pk0.g(this.f9671e, "onPrecacheEvent", map);
    }
}
