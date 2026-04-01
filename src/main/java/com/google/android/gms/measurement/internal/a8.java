package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class a8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f19800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f19801b;

    a8(b7 b7Var, AtomicReference atomicReference) {
        this.f19801b = b7Var;
        this.f19800a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f19800a) {
            try {
                this.f19800a.set(Long.valueOf(this.f19801b.a().x(this.f19801b.m().F(), e0.O)));
            } finally {
                this.f19800a.notify();
            }
        }
    }
}
