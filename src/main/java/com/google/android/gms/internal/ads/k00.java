package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k00 implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ft1 f9854a;

    public k00(ft1 ft1Var) {
        a3.o.k(ft1Var, "The Inspector Manager must not be null");
        this.f9854a = ft1Var;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j8 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j8 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.f9854a.i((String) map.get("extras"), j8);
    }
}
