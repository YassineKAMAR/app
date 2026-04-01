package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class p1 implements o1 {
    p1() {
    }

    @Override // com.google.android.gms.internal.measurement.o1
    public final <V> Callable<V> a(Callable<V> callable) {
        return callable;
    }

    @Override // com.google.android.gms.internal.measurement.o1
    public final Runnable d(Runnable runnable) {
        return runnable;
    }
}
