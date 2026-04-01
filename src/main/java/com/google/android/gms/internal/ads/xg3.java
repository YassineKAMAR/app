package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class xg3 extends pf3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private x3.d f17218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ScheduledFuture f17219i;

    private xg3(x3.d dVar) {
        dVar.getClass();
        this.f17218h = dVar;
    }

    static x3.d E(x3.d dVar, long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        xg3 xg3Var = new xg3(dVar);
        ug3 ug3Var = new ug3(xg3Var);
        xg3Var.f17219i = scheduledExecutorService.schedule(ug3Var, j8, timeUnit);
        dVar.c(ug3Var, nf3.INSTANCE);
        return xg3Var;
    }

    @Override // com.google.android.gms.internal.ads.le3
    protected final String d() {
        x3.d dVar = this.f17218h;
        ScheduledFuture scheduledFuture = this.f17219i;
        if (dVar == null) {
            return null;
        }
        String str = "inputFuture=[" + dVar.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.le3
    protected final void e() {
        t(this.f17218h);
        ScheduledFuture scheduledFuture = this.f17219i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f17218h = null;
        this.f17219i = null;
    }
}
