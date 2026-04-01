package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
final class dg3 implements x3.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final x3.d f6722b = new dg3(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f6723c = Logger.getLogger(dg3.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f6724a;

    dg3(Object obj) {
        this.f6724a = obj;
    }

    @Override // x3.d
    public final void c(Runnable runnable, Executor executor) {
        l83.c(runnable, "Runnable was null.");
        l83.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            f6723c.logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e8);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f6724a;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f6724a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.f6724a;
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(obj) + "]]";
    }
}
