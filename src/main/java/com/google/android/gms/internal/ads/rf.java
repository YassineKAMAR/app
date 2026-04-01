package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rf extends of {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f14088f;

    public rf() {
        this.f14084b = "E";
        this.f14085c = -1L;
        this.f14086d = "E";
        this.f14087e = "E";
        this.f14088f = "E";
    }

    public rf(String str) {
        this.f14084b = "E";
        this.f14085c = -1L;
        this.f14086d = "E";
        this.f14087e = "E";
        this.f14088f = "E";
        HashMap mapA = of.a(str);
        if (mapA != null) {
            this.f14084b = mapA.get(0) == null ? "E" : (String) mapA.get(0);
            this.f14085c = mapA.get(1) != null ? ((Long) mapA.get(1)).longValue() : -1L;
            this.f14086d = mapA.get(2) == null ? "E" : (String) mapA.get(2);
            this.f14087e = mapA.get(3) == null ? "E" : (String) mapA.get(3);
            this.f14088f = mapA.get(4) != null ? (String) mapA.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f14084b);
        map.put(4, this.f14088f);
        map.put(3, this.f14087e);
        map.put(2, this.f14086d);
        map.put(1, Long.valueOf(this.f14085c));
        return map;
    }
}
