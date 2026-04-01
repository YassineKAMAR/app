package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class c8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f19867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f19868b;

    c8(b7 b7Var, AtomicReference atomicReference) {
        this.f19868b = b7Var;
        this.f19867a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f19867a) {
            try {
                this.f19867a.set(Double.valueOf(this.f19868b.a().l(this.f19868b.m().F(), e0.Q)));
            } finally {
                this.f19867a.notify();
            }
        }
    }
}
