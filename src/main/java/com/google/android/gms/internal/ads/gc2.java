package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class gc2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f8290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts2 f8291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ht2 f8292c;

    gc2(lg3 lg3Var, ts2 ts2Var, ht2 ht2Var) {
        this.f8290a = lg3Var;
        this.f8291b = ts2Var;
        this.f8292c = ht2Var;
    }

    final /* synthetic */ hc2 a() {
        String strA = null;
        if (((Boolean) h2.y.c().b(ns.f12074f7)).booleanValue() && "requester_type_2".equals(p2.y.b(this.f8291b.f15302d))) {
            strA = ht2.a();
        }
        return new hc2(strA);
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f8290a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.fc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f7718a.a();
            }
        });
    }
}
