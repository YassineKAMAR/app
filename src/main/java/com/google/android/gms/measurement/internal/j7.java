package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class j7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f20154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f20155b;

    j7(b7 b7Var, AtomicReference atomicReference) {
        this.f20155b = b7Var;
        this.f20154a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20154a) {
            try {
                this.f20154a.set(Boolean.valueOf(this.f20155b.a().J(this.f20155b.m().F())));
            } finally {
                this.f20154a.notify();
            }
        }
    }
}
