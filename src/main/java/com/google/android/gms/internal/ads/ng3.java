package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class ng3 extends re3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f11867a;

    ng3(ExecutorService executorService) {
        executorService.getClass();
        this.f11867a = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j8, TimeUnit timeUnit) {
        return this.f11867a.awaitTermination(j8, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f11867a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f11867a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f11867a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f11867a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f11867a.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.f11867a;
        return super.toString() + "[" + String.valueOf(executorService) + "]";
    }
}
