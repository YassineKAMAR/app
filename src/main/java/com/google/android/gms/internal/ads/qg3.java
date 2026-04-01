package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class qg3 extends ng3 implements ScheduledExecutorService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ScheduledExecutorService f13475b;

    qg3(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f13475b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j8, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.f13475b;
        ah3 ah3VarD = ah3.D(runnable, null);
        return new og3(ah3VarD, scheduledExecutorService.schedule(ah3VarD, j8, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j8, TimeUnit timeUnit) {
        ah3 ah3Var = new ah3(callable);
        return new og3(ah3Var, this.f13475b.schedule(ah3Var, j8, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
        pg3 pg3Var = new pg3(runnable);
        return new og3(pg3Var, this.f13475b.scheduleAtFixedRate(pg3Var, j8, j9, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
        pg3 pg3Var = new pg3(runnable);
        return new og3(pg3Var, this.f13475b.scheduleWithFixedDelay(pg3Var, j8, j9, timeUnit));
    }
}
