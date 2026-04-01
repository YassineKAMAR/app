package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f7074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f7075b;

    public e(Handler handler, f fVar) {
        this.f7074a = fVar == null ? null : handler;
        this.f7075b = fVar;
    }

    public final void a(final String str, final long j8, final long j9) {
        Handler handler = this.f7074a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.vs4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16466a.g(str, j8, j9);
                }
            });
        }
    }

    public final void b(final String str) {
        Handler handler = this.f7074a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6518a.h(str);
                }
            });
        }
    }

    public final void c(final ba4 ba4Var) {
        ba4Var.a();
        Handler handler = this.f7074a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6075a.i(ba4Var);
                }
            });
        }
    }

    public final void d(final int i8, final long j8) {
        Handler handler = this.f7074a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.xs4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17455a.j(i8, j8);
                }
            });
        }
    }

    public final void e(final ba4 ba4Var) {
        Handler handler = this.f7074a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.bt4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6037a.k(ba4Var);
                }
            });
        }
    }

    public final void f(final nb nbVar, final ca4 ca4Var) {
        Handler handler = this.f7074a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ct4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6478a.l(nbVar, ca4Var);
                }
            });
        }
    }

    final /* synthetic */ void g(String str, long j8, long j9) {
        int i8 = nz2.f12300a;
        this.f7075b.k0(str, j8, j9);
    }

    final /* synthetic */ void h(String str) {
        int i8 = nz2.f12300a;
        this.f7075b.c0(str);
    }

    final /* synthetic */ void i(ba4 ba4Var) {
        ba4Var.a();
        int i8 = nz2.f12300a;
        this.f7075b.d0(ba4Var);
    }

    final /* synthetic */ void j(int i8, long j8) {
        int i9 = nz2.f12300a;
        this.f7075b.f0(i8, j8);
    }

    final /* synthetic */ void k(ba4 ba4Var) {
        int i8 = nz2.f12300a;
        this.f7075b.h0(ba4Var);
    }

    final /* synthetic */ void l(nb nbVar, ca4 ca4Var) {
        int i8 = nz2.f12300a;
        this.f7075b.e0(nbVar, ca4Var);
    }

    final /* synthetic */ void m(Object obj, long j8) {
        int i8 = nz2.f12300a;
        this.f7075b.l0(obj, j8);
    }

    final /* synthetic */ void n(long j8, int i8) {
        int i9 = nz2.f12300a;
        this.f7075b.g0(j8, i8);
    }

    final /* synthetic */ void o(Exception exc) {
        int i8 = nz2.f12300a;
        this.f7075b.j0(exc);
    }

    final /* synthetic */ void p(jj1 jj1Var) {
        int i8 = nz2.f12300a;
        this.f7075b.i0(jj1Var);
    }

    public final void q(final Object obj) {
        Handler handler = this.f7074a;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ys4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17916a.m(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void r(final long j8, final int i8) {
        Handler handler = this.f7074a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zs4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18480a.n(j8, i8);
                }
            });
        }
    }

    public final void s(final Exception exc) {
        Handler handler = this.f7074a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.at4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5486a.o(exc);
                }
            });
        }
    }

    public final void t(final jj1 jj1Var) {
        Handler handler = this.f7074a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ws4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16939a.p(jj1Var);
                }
            });
        }
    }
}
