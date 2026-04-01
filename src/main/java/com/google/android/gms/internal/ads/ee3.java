package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
final class ee3 extends ae3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<ke3, Thread> f7282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<ke3, ke3> f7283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<le3, ke3> f7284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<le3, de3> f7285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<le3, Object> f7286e;

    ee3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f7282a = atomicReferenceFieldUpdater;
        this.f7283b = atomicReferenceFieldUpdater2;
        this.f7284c = atomicReferenceFieldUpdater3;
        this.f7285d = atomicReferenceFieldUpdater4;
        this.f7286e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final de3 a(le3 le3Var, de3 de3Var) {
        return this.f7285d.getAndSet(le3Var, de3Var);
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final ke3 b(le3 le3Var, ke3 ke3Var) {
        return this.f7284c.getAndSet(le3Var, ke3Var);
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final void c(ke3 ke3Var, ke3 ke3Var2) {
        this.f7283b.lazySet(ke3Var, ke3Var2);
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final void d(ke3 ke3Var, Thread thread) {
        this.f7282a.lazySet(ke3Var, thread);
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final boolean e(le3 le3Var, de3 de3Var, de3 de3Var2) {
        return me3.a(this.f7285d, le3Var, de3Var, de3Var2);
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final boolean f(le3 le3Var, Object obj, Object obj2) {
        return me3.a(this.f7286e, le3Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final boolean g(le3 le3Var, ke3 ke3Var, ke3 ke3Var2) {
        return me3.a(this.f7284c, le3Var, ke3Var, ke3Var2);
    }
}
