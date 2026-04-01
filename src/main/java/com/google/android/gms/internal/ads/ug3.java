package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class ug3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    xg3 f15657a;

    ug3(xg3 xg3Var) {
        this.f15657a = xg3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x3.d dVar;
        xg3 xg3Var = this.f15657a;
        if (xg3Var == null || (dVar = xg3Var.f17218h) == null) {
            return;
        }
        this.f15657a = null;
        if (dVar.isDone()) {
            xg3Var.u(dVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = xg3Var.f17219i;
            xg3Var.f17219i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    xg3Var.g(new wg3(str, null));
                    throw th;
                }
            }
            xg3Var.g(new wg3(str + ": " + dVar.toString(), null));
        } finally {
            dVar.cancel(true);
        }
    }
}
