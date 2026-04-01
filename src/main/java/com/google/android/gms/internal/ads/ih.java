package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ih extends of {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f9188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f9189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f9190d;

    public ih(String str) {
        HashMap mapA = of.a(str);
        if (mapA != null) {
            this.f9188b = (Long) mapA.get(0);
            this.f9189c = (Long) mapA.get(1);
            this.f9190d = (Long) mapA.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f9188b);
        map.put(1, this.f9189c);
        map.put(2, this.f9190d);
        return map;
    }
}
