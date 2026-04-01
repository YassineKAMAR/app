package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pz0 implements rz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f13225a;

    pz0(Map map) {
        this.f13225a = map;
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final x22 f(int i8, String str) {
        return (x22) this.f13225a.get(str);
    }
}
