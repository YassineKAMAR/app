package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class vr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e3.e f16429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f16430b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f16432d = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f16431c = 0;

    public vr2(e3.e eVar) {
        this.f16429a = eVar;
    }

    private final void e() {
        long jA = this.f16429a.a();
        synchronized (this.f16430b) {
            if (this.f16432d == 3) {
                if (this.f16431c + ((Long) h2.y.c().b(ns.T5)).longValue() <= jA) {
                    this.f16432d = 1;
                }
            }
        }
    }

    private final void f(int i8, int i9) {
        e();
        Object obj = this.f16430b;
        long jA = this.f16429a.a();
        synchronized (obj) {
            if (this.f16432d != i8) {
                return;
            }
            this.f16432d = i9;
            if (this.f16432d == 3) {
                this.f16431c = jA;
            }
        }
    }

    public final void a() {
        f(2, 3);
    }

    public final void b(boolean z7) {
        if (z7) {
            f(1, 2);
        } else {
            f(2, 1);
        }
    }

    public final boolean c() {
        boolean z7;
        synchronized (this.f16430b) {
            e();
            z7 = this.f16432d == 3;
        }
        return z7;
    }

    public final boolean d() {
        boolean z7;
        synchronized (this.f16430b) {
            e();
            z7 = this.f16432d == 2;
        }
        return z7;
    }
}
