package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class re2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f14076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final co1 f14077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ts2 f14079d;

    public re2(lg3 lg3Var, co1 co1Var, ts2 ts2Var, String str) {
        this.f14076a = lg3Var;
        this.f14077b = co1Var;
        this.f14079d = ts2Var;
        this.f14078c = str;
    }

    final /* synthetic */ se2 a() {
        ts2 ts2Var = this.f14079d;
        co1 co1Var = this.f14077b;
        return new se2(co1Var.b(ts2Var.f15304f, this.f14078c), co1Var.a());
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f14076a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.qe2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f13429a.a();
            }
        });
    }
}
