package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class se3 extends ue3 {
    se3(x3.d dVar, gf3 gf3Var) {
        super(dVar, gf3Var);
    }

    @Override // com.google.android.gms.internal.ads.ue3
    final /* bridge */ /* synthetic */ Object D(Object obj, Object obj2) {
        gf3 gf3Var = (gf3) obj;
        x3.d dVarA = gf3Var.a(obj2);
        l83.d(dVarA, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", gf3Var);
        return dVarA;
    }

    @Override // com.google.android.gms.internal.ads.ue3
    final /* synthetic */ void E(Object obj) {
        u((x3.d) obj);
    }
}
