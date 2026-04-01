package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class di extends of {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f6761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f6762c;

    public di(String str) {
        HashMap mapA = of.a(str);
        if (mapA != null) {
            this.f6761b = (Long) mapA.get(0);
            this.f6762c = (Long) mapA.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f6761b);
        map.put(1, this.f6762c);
        return map;
    }
}
