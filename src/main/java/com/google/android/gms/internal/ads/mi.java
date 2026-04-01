package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class mi extends of {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f11309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f11310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f11311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f11312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f11313f;

    public mi(String str) {
        HashMap mapA = of.a(str);
        if (mapA != null) {
            this.f11309b = (Long) mapA.get(0);
            this.f11310c = (Long) mapA.get(1);
            this.f11311d = (Long) mapA.get(2);
            this.f11312e = (Long) mapA.get(3);
            this.f11313f = (Long) mapA.get(4);
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f11309b);
        map.put(1, this.f11310c);
        map.put(2, this.f11311d);
        map.put(3, this.f11312e);
        map.put(4, this.f11313f);
        return map;
    }
}
