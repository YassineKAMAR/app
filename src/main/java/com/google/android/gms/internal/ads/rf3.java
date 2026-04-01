package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class rf3 extends qf3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x3.d f14105h;

    rf3(x3.d dVar) {
        dVar.getClass();
        this.f14105h = dVar;
    }

    @Override // com.google.android.gms.internal.ads.le3, x3.d
    public final void c(Runnable runnable, Executor executor) {
        this.f14105h.c(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.le3, java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        return this.f14105h.cancel(z7);
    }

    @Override // com.google.android.gms.internal.ads.le3, java.util.concurrent.Future
    public final Object get() {
        return this.f14105h.get();
    }

    @Override // com.google.android.gms.internal.ads.le3, java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return this.f14105h.get(j8, timeUnit);
    }

    @Override // com.google.android.gms.internal.ads.le3, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14105h.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.le3, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14105h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.le3
    public final String toString() {
        return this.f14105h.toString();
    }
}
