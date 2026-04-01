package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class mf2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f11277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts2 f11278b;

    mf2(lg3 lg3Var, ts2 ts2Var) {
        this.f11277a = lg3Var;
        this.f11278b = ts2Var;
    }

    final /* synthetic */ nf2 a() {
        return new nf2("requester_type_2".equals(p2.y.b(this.f11278b.f15302d)));
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f11277a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.lf2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f10661a.a();
            }
        });
    }
}
