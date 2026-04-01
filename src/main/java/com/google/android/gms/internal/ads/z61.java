package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class z61 extends aa1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f18038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e3.e f18039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f18040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f18041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f18042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ScheduledFuture f18043g;

    public z61(ScheduledExecutorService scheduledExecutorService, e3.e eVar) {
        super(Collections.emptySet());
        this.f18040d = -1L;
        this.f18041e = -1L;
        this.f18042f = false;
        this.f18038b = scheduledExecutorService;
        this.f18039c = eVar;
    }

    private final synchronized void B0(long j8) {
        ScheduledFuture scheduledFuture = this.f18043g;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f18043g.cancel(true);
        }
        this.f18040d = this.f18039c.b() + j8;
        this.f18043g = this.f18038b.schedule(new w61(this, null), j8, TimeUnit.MILLISECONDS);
    }

    public final synchronized void A0(int i8) {
        if (i8 <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i8);
        if (this.f18042f) {
            long j8 = this.f18041e;
            if (j8 <= 0 || millis >= j8) {
                millis = j8;
            }
            this.f18041e = millis;
            return;
        }
        long jB = this.f18039c.b();
        long j9 = this.f18040d;
        if (jB > j9 || j9 - this.f18039c.b() > millis) {
            B0(millis);
        }
    }

    public final synchronized void j() {
        this.f18042f = false;
        B0(0L);
    }

    public final synchronized void k() {
        if (this.f18042f) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f18043g;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            this.f18041e = -1L;
        } else {
            this.f18043g.cancel(true);
            this.f18041e = this.f18040d - this.f18039c.b();
        }
        this.f18042f = true;
    }

    public final synchronized void l() {
        if (this.f18042f) {
            if (this.f18041e > 0 && this.f18043g.isCancelled()) {
                B0(this.f18041e);
            }
            this.f18042f = false;
        }
    }
}
