package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class wd3 extends yd3 {
    wd3(x3.d dVar, Class cls, gf3 gf3Var) {
        super(dVar, cls, gf3Var);
    }

    @Override // com.google.android.gms.internal.ads.yd3
    final /* bridge */ /* synthetic */ Object D(Object obj, Throwable th) {
        gf3 gf3Var = (gf3) obj;
        x3.d dVarA = gf3Var.a(th);
        l83.d(dVarA, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", gf3Var);
        return dVarA;
    }

    @Override // com.google.android.gms.internal.ads.yd3
    final /* synthetic */ void E(Object obj) {
        u((x3.d) obj);
    }
}
