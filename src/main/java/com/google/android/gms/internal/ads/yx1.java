package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class yx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vv1 f17940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17941b;

    public yx1(vv1 vv1Var) {
        this.f17940a = vv1Var;
    }

    public final synchronized void a() {
        while (!this.f17941b) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z7 = false;
        while (!this.f17941b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z7 = true;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        boolean z7;
        z7 = this.f17941b;
        this.f17941b = false;
        return z7;
    }

    public final synchronized boolean d() {
        return this.f17941b;
    }

    public final synchronized boolean e() {
        if (this.f17941b) {
            return false;
        }
        this.f17941b = true;
        notifyAll();
        return true;
    }
}
