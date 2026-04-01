package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zh extends of {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f18230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f18231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f18232d;

    public zh(String str) {
        HashMap mapA = of.a(str);
        if (mapA != null) {
            this.f18230b = (Long) mapA.get(0);
            this.f18231c = (Boolean) mapA.get(1);
            this.f18232d = (Boolean) mapA.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f18230b);
        map.put(1, this.f18231c);
        map.put(2, this.f18232d);
        return map;
    }
}
