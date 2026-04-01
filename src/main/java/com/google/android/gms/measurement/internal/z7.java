package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class z7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f20751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f20752b;

    z7(b7 b7Var, AtomicReference atomicReference) {
        this.f20752b = b7Var;
        this.f20751a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20751a) {
            try {
                this.f20751a.set(Integer.valueOf(this.f20752b.a().s(this.f20752b.m().F(), e0.P)));
            } finally {
                this.f20751a.notify();
            }
        }
    }
}
