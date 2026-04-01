package com.google.android.gms.measurement.internal;

import android.content.Context;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class q5 extends u6 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final AtomicLong f20395l = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t5 f20396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t5 f20397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PriorityBlockingQueue<u5<?>> f20398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BlockingQueue<u5<?>> f20399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f20400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f20401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f20402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Semaphore f20403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f20404k;

    q5(w5 w5Var) {
        super(w5Var);
        this.f20402i = new Object();
        this.f20403j = new Semaphore(2);
        this.f20398e = new PriorityBlockingQueue<>();
        this.f20399f = new LinkedBlockingQueue();
        this.f20400g = new s5(this, "Thread death: Uncaught exception on worker thread");
        this.f20401h = new s5(this, "Thread death: Uncaught exception on network thread");
    }

    private final void y(u5<?> u5Var) {
        synchronized (this.f20402i) {
            this.f20398e.add(u5Var);
            t5 t5Var = this.f20396c;
            if (t5Var == null) {
                t5 t5Var2 = new t5(this, "Measurement Worker", this.f20398e);
                this.f20396c = t5Var2;
                t5Var2.setUncaughtExceptionHandler(this.f20400g);
                this.f20396c.start();
            } else {
                t5Var.a();
            }
        }
    }

    public final <V> Future<V> B(Callable<V> callable) {
        l();
        a3.o.j(callable);
        u5<?> u5Var = new u5<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f20396c) {
            u5Var.run();
        } else {
            y(u5Var);
        }
        return u5Var;
    }

    public final void D(Runnable runnable) {
        l();
        a3.o.j(runnable);
        y(new u5<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final void G(Runnable runnable) {
        l();
        a3.o.j(runnable);
        y(new u5<>(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean J() {
        return Thread.currentThread() == this.f20396c;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final void g() {
        if (Thread.currentThread() != this.f20397d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final void i() {
        if (Thread.currentThread() != this.f20396c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e3.e k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.u6
    protected final boolean q() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 u() {
        return super.u();
    }

    final <T> T v(AtomicReference<T> atomicReference, long j8, String str, Runnable runnable) {
        synchronized (atomicReference) {
            u().D(runnable);
            try {
                atomicReference.wait(j8);
            } catch (InterruptedException unused) {
                t().L().a("Interrupted waiting for " + str);
                return null;
            }
        }
        T t7 = atomicReference.get();
        if (t7 == null) {
            t().L().a("Timed out waiting for " + str);
        }
        return t7;
    }

    public final <V> Future<V> w(Callable<V> callable) {
        l();
        a3.o.j(callable);
        u5<?> u5Var = new u5<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f20396c) {
            if (!this.f20398e.isEmpty()) {
                t().L().a("Callable skipped the worker queue.");
            }
            u5Var.run();
        } else {
            y(u5Var);
        }
        return u5Var;
    }

    public final void z(Runnable runnable) {
        l();
        a3.o.j(runnable);
        u5<?> u5Var = new u5<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f20402i) {
            this.f20399f.add(u5Var);
            t5 t5Var = this.f20397d;
            if (t5Var == null) {
                t5 t5Var2 = new t5(this, "Measurement Network", this.f20399f);
                this.f20397d = t5Var2;
                t5Var2.setUncaughtExceptionHandler(this.f20401h);
                this.f20397d.start();
            } else {
                t5Var.a();
            }
        }
    }
}
