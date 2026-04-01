package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class yf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f17748a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f17750c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile long f17749b = 0;

    /* synthetic */ yf0(xf0 xf0Var) {
    }

    public final void a() {
        long jA = g2.t.b().a();
        synchronized (this.f17748a) {
            if (this.f17750c == 3) {
                if (this.f17749b + ((Long) h2.y.c().b(ns.T5)).longValue() <= jA) {
                    this.f17750c = 1;
                }
            }
        }
        long jA2 = g2.t.b().a();
        synchronized (this.f17748a) {
            if (this.f17750c != 2) {
                return;
            }
            this.f17750c = 3;
            if (this.f17750c == 3) {
                this.f17749b = jA2;
            }
        }
    }
}
