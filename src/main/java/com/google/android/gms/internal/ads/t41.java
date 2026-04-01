package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class t41 extends aa1 implements k41 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f14956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScheduledFuture f14957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f14958d;

    public t41(s41 s41Var, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f14958d = false;
        this.f14956b = scheduledExecutorService;
        w0(s41Var, executor);
    }

    final /* synthetic */ void A0() {
        synchronized (this) {
            qg0.d("Timeout waiting for show call succeed to be called.");
            K(new je1("Timeout for show call succeed."));
            this.f14958d = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.k41
    public final void K(final je1 je1Var) {
        if (this.f14958d) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f14957c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        z0(new z91() { // from class: com.google.android.gms.internal.ads.o41
            @Override // com.google.android.gms.internal.ads.z91
            public final void a(Object obj) {
                ((k41) obj).K(je1Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.k41
    public final void k() {
        z0(new z91() { // from class: com.google.android.gms.internal.ads.m41
            @Override // com.google.android.gms.internal.ads.z91
            public final void a(Object obj) {
                ((k41) obj).k();
            }
        });
    }

    public final synchronized void m() {
        ScheduledFuture scheduledFuture = this.f14957c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void n() {
        this.f14957c = this.f14956b.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.n41
            @Override // java.lang.Runnable
            public final void run() {
                this.f11674a.A0();
            }
        }, ((Integer) h2.y.c().b(ns.R9)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.k41
    public final void w(final h2.z2 z2Var) {
        z0(new z91() { // from class: com.google.android.gms.internal.ads.l41
            @Override // com.google.android.gms.internal.ads.z91
            public final void a(Object obj) {
                ((k41) obj).w(z2Var);
            }
        });
    }
}
