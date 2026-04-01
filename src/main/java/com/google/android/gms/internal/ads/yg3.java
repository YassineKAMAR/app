package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class yg3 extends kg3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ef3 f17761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ah3 f17762d;

    yg3(ah3 ah3Var, ef3 ef3Var) {
        this.f17762d = ah3Var;
        this.f17761c = ef3Var;
    }

    @Override // com.google.android.gms.internal.ads.kg3
    final /* bridge */ /* synthetic */ Object a() {
        ef3 ef3Var = this.f17761c;
        x3.d dVarJ = ef3Var.j();
        l83.d(dVarJ, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ef3Var);
        return dVarJ;
    }

    @Override // com.google.android.gms.internal.ads.kg3
    final String b() {
        return this.f17761c.toString();
    }

    @Override // com.google.android.gms.internal.ads.kg3
    final void d(Throwable th) {
        this.f17762d.g(th);
    }

    @Override // com.google.android.gms.internal.ads.kg3
    final /* synthetic */ void e(Object obj) {
        this.f17762d.u((x3.d) obj);
    }

    @Override // com.google.android.gms.internal.ads.kg3
    final boolean f() {
        return this.f17762d.isDone();
    }
}
