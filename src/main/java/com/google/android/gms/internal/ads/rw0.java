package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class rw0 implements nl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f14351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e3.e f14352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScheduledFuture f14353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f14354d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f14355e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f14356f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f14357g = false;

    public rw0(ScheduledExecutorService scheduledExecutorService, e3.e eVar) {
        this.f14351a = scheduledExecutorService;
        this.f14352b = eVar;
        g2.t.d().c(this);
    }

    @Override // com.google.android.gms.internal.ads.nl
    public final void a(boolean z7) {
        if (z7) {
            c();
        } else {
            b();
        }
    }

    final synchronized void b() {
        if (this.f14357g) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f14353c;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            this.f14355e = -1L;
        } else {
            this.f14353c.cancel(true);
            this.f14355e = this.f14354d - this.f14352b.b();
        }
        this.f14357g = true;
    }

    final synchronized void c() {
        ScheduledFuture scheduledFuture;
        if (this.f14357g) {
            if (this.f14355e > 0 && (scheduledFuture = this.f14353c) != null && scheduledFuture.isCancelled()) {
                this.f14353c = this.f14351a.schedule(this.f14356f, this.f14355e, TimeUnit.MILLISECONDS);
            }
            this.f14357g = false;
        }
    }

    public final synchronized void d(int i8, Runnable runnable) {
        this.f14356f = runnable;
        long j8 = i8;
        this.f14354d = this.f14352b.b() + j8;
        this.f14353c = this.f14351a.schedule(runnable, j8, TimeUnit.MILLISECONDS);
    }
}
