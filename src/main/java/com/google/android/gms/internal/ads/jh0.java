package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class jh0 implements x3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tg3 f9625a = tg3.C();

    private static final boolean b(boolean z7) {
        if (!z7) {
            g2.t.q().t(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z7;
    }

    @Override // x3.d
    public final void c(Runnable runnable, Executor executor) {
        this.f9625a.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z7) {
        return this.f9625a.cancel(z7);
    }

    public final boolean d(Object obj) {
        boolean zF = this.f9625a.f(obj);
        b(zF);
        return zF;
    }

    public final boolean e(Throwable th) {
        boolean zG = this.f9625a.g(th);
        b(zG);
        return zG;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f9625a.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return this.f9625a.get(j8, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9625a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9625a.isDone();
    }
}
