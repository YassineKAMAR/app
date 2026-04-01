package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class zg3 extends kg3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable f18226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ah3 f18227d;

    zg3(ah3 ah3Var, Callable callable) {
        this.f18227d = ah3Var;
        callable.getClass();
        this.f18226c = callable;
    }

    @Override // com.google.android.gms.internal.ads.kg3
    final Object a() {
        return this.f18226c.call();
    }

    @Override // com.google.android.gms.internal.ads.kg3
    final String b() {
        return this.f18226c.toString();
    }

    @Override // com.google.android.gms.internal.ads.kg3
    final void d(Throwable th) {
        this.f18227d.g(th);
    }

    @Override // com.google.android.gms.internal.ads.kg3
    final void e(Object obj) {
        this.f18227d.f(obj);
    }

    @Override // com.google.android.gms.internal.ads.kg3
    final boolean f() {
        return this.f18227d.isDone();
    }
}
