package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class me2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f11247a;

    me2(lg3 lg3Var) {
        this.f11247a = lg3Var;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f11247a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.le2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ne2(Long.valueOf(g2.t.b().a() - g2.t.q().h().o().a()).longValue());
            }
        });
    }
}
