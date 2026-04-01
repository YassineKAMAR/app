package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class r7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f20456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f20457b;

    r7(b7 b7Var, AtomicReference atomicReference) {
        this.f20457b = b7Var;
        this.f20456a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20456a) {
            try {
                this.f20456a.set(this.f20457b.a().H(this.f20457b.m().F()));
            } finally {
                this.f20456a.notify();
            }
        }
    }
}
