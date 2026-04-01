package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class dd2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f6689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts2 f6690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wg0 f6691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dg0 f6692d;

    public dd2(lg3 lg3Var, ts2 ts2Var, wg0 wg0Var, dg0 dg0Var) {
        this.f6689a = lg3Var;
        this.f6690b = ts2Var;
        this.f6691c = wg0Var;
        this.f6692d = dg0Var;
    }

    final /* synthetic */ ed2 a() {
        return new ed2(this.f6690b.f15308j, this.f6691c, this.f6692d.m());
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f6689a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.cd2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6319a.a();
            }
        });
    }
}
