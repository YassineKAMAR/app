package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class hh4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f8750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ih4 f8751b;

    public hh4(Handler handler, ih4 ih4Var) {
        this.f8750a = ih4Var == null ? null : handler;
        this.f8751b = ih4Var;
    }

    public final void a(final Exception exc) {
        Handler handler = this.f8750a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.yg4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17763a.h(exc);
                }
            });
        }
    }

    public final void b(final Exception exc) {
        Handler handler = this.f8750a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zg4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18228a.i(exc);
                }
            });
        }
    }

    public final void c(final String str, final long j8, final long j9) {
        Handler handler = this.f8750a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ch4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6342a.j(str, j8, j9);
                }
            });
        }
    }

    public final void d(final String str) {
        Handler handler = this.f8750a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.dh4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6759a.k(str);
                }
            });
        }
    }

    public final void e(final ba4 ba4Var) {
        ba4Var.a();
        Handler handler = this.f8750a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.eh4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7333a.l(ba4Var);
                }
            });
        }
    }

    public final void f(final ba4 ba4Var) {
        Handler handler = this.f8750a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.wg4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16732a.m(ba4Var);
                }
            });
        }
    }

    public final void g(final nb nbVar, final ca4 ca4Var) {
        Handler handler = this.f8750a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ah4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5271a.n(nbVar, ca4Var);
                }
            });
        }
    }

    final /* synthetic */ void h(Exception exc) {
        int i8 = nz2.f12300a;
        this.f8751b.c(exc);
    }

    final /* synthetic */ void i(Exception exc) {
        int i8 = nz2.f12300a;
        this.f8751b.e(exc);
    }

    final /* synthetic */ void j(String str, long j8, long j9) {
        int i8 = nz2.f12300a;
        this.f8751b.d(str, j8, j9);
    }

    final /* synthetic */ void k(String str) {
        int i8 = nz2.f12300a;
        this.f8751b.h(str);
    }

    final /* synthetic */ void l(ba4 ba4Var) {
        ba4Var.a();
        int i8 = nz2.f12300a;
        this.f8751b.j(ba4Var);
    }

    final /* synthetic */ void m(ba4 ba4Var) {
        int i8 = nz2.f12300a;
        this.f8751b.i(ba4Var);
    }

    final /* synthetic */ void n(nb nbVar, ca4 ca4Var) {
        int i8 = nz2.f12300a;
        this.f8751b.f(nbVar, ca4Var);
    }

    final /* synthetic */ void o(long j8) {
        int i8 = nz2.f12300a;
        this.f8751b.k(j8);
    }

    final /* synthetic */ void p(boolean z7) {
        int i8 = nz2.f12300a;
        this.f8751b.b(z7);
    }

    final /* synthetic */ void q(int i8, long j8, long j9) {
        int i9 = nz2.f12300a;
        this.f8751b.g(i8, j8, j9);
    }

    public final void r(final long j8) {
        Handler handler = this.f8750a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.gh4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8332a.o(j8);
                }
            });
        }
    }

    public final void s(final boolean z7) {
        Handler handler = this.f8750a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.bh4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5798a.p(z7);
                }
            });
        }
    }

    public final void t(final int i8, final long j8, final long j9) {
        Handler handler = this.f8750a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.xg4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17220a.q(i8, j8, j9);
                }
            });
        }
    }
}
