package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class nh extends of {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11869c;

    public nh(String str) {
        this.f11868b = -1L;
        this.f11869c = -1L;
        HashMap mapA = of.a(str);
        if (mapA != null) {
            this.f11868b = ((Long) mapA.get(0)).longValue();
            this.f11869c = ((Long) mapA.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.f11868b));
        map.put(1, Long.valueOf(this.f11869c));
        return map;
    }
}
