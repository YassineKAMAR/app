package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ki extends of {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f10086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f10087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f10088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f10089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f10090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f10091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f10092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f10093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f10094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Long f10095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Long f10096l;

    public ki(String str) {
        HashMap mapA = of.a(str);
        if (mapA != null) {
            this.f10086b = (Long) mapA.get(0);
            this.f10087c = (Long) mapA.get(1);
            this.f10088d = (Long) mapA.get(2);
            this.f10089e = (Long) mapA.get(3);
            this.f10090f = (Long) mapA.get(4);
            this.f10091g = (Long) mapA.get(5);
            this.f10092h = (Long) mapA.get(6);
            this.f10093i = (Long) mapA.get(7);
            this.f10094j = (Long) mapA.get(8);
            this.f10095k = (Long) mapA.get(9);
            this.f10096l = (Long) mapA.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f10086b);
        map.put(1, this.f10087c);
        map.put(2, this.f10088d);
        map.put(3, this.f10089e);
        map.put(4, this.f10090f);
        map.put(5, this.f10091g);
        map.put(6, this.f10092h);
        map.put(7, this.f10093i);
        map.put(8, this.f10094j);
        map.put(9, this.f10095k);
        map.put(10, this.f10096l);
        return map;
    }
}
