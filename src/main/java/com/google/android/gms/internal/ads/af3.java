package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
final class af3 extends ze3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f5245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicIntegerFieldUpdater f5246b;

    af3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.f5245a = atomicReferenceFieldUpdater;
        this.f5246b = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.ze3
    final int a(df3 df3Var) {
        return this.f5246b.decrementAndGet(df3Var);
    }

    @Override // com.google.android.gms.internal.ads.ze3
    final void b(df3 df3Var, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5245a;
            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, df3Var, null, set2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(df3Var) == null);
    }
}
