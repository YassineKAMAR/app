package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class c31 implements g41, pb1, e91, x41, tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z41 f6124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wr2 f6125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f6126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f6127d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ScheduledFuture f6129f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f6131h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final tg3 f6128e = tg3.C();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f6130g = new AtomicBoolean();

    c31(z41 z41Var, wr2 wr2Var, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.f6124a = z41Var;
        this.f6125b = wr2Var;
        this.f6126c = scheduledExecutorService;
        this.f6127d = executor;
        this.f6131h = str;
    }

    private final boolean o() {
        return this.f6131h.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void a(ob0 ob0Var, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void b0(sk skVar) {
        if (((Boolean) h2.y.c().b(ns.ua)).booleanValue() && o() && skVar.f14729j && this.f6130g.compareAndSet(false, true) && this.f6125b.f16875f != 3) {
            j2.v1.k("Full screen 1px impression occurred");
            this.f6124a.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.x41
    public final synchronized void e(h2.z2 z2Var) {
        if (this.f6128e.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f6129f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f6128e.g(new Exception());
    }

    final /* synthetic */ void h() {
        synchronized (this) {
            if (this.f6128e.isDone()) {
                return;
            }
            this.f6128e.f(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void l() {
        wr2 wr2Var = this.f6125b;
        if (wr2Var.f16875f == 3) {
            return;
        }
        int i8 = wr2Var.f16866a0;
        if (i8 == 0 || i8 == 1) {
            if (((Boolean) h2.y.c().b(ns.ua)).booleanValue() && o()) {
                return;
            }
            this.f6124a.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void n() {
    }

    @Override // com.google.android.gms.internal.ads.e91
    public final void r() {
    }

    @Override // com.google.android.gms.internal.ads.pb1
    public final void s() {
        if (this.f6125b.f16875f == 3) {
            return;
        }
        if (((Boolean) h2.y.c().b(ns.f12202u1)).booleanValue()) {
            wr2 wr2Var = this.f6125b;
            if (wr2Var.f16866a0 == 2) {
                if (wr2Var.f16901s == 0) {
                    this.f6124a.j();
                } else {
                    zf3.r(this.f6128e, new b31(this), this.f6127d);
                    this.f6129f = this.f6126c.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.a31
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f4999a.h();
                        }
                    }, this.f6125b.f16901s, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.e91
    public final synchronized void t() {
        if (this.f6128e.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f6129f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f6128e.f(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.pb1
    public final void u() {
    }
}
