package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class fw2 implements x3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f8094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x3.d f8096c;

    public fw2(Object obj, String str, x3.d dVar) {
        this.f8094a = obj;
        this.f8095b = str;
        this.f8096c = dVar;
    }

    public final Object a() {
        return this.f8094a;
    }

    public final String b() {
        return this.f8095b;
    }

    @Override // x3.d
    public final void c(Runnable runnable, Executor executor) {
        this.f8096c.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        return this.f8096c.cancel(z7);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f8096c.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return this.f8096c.get(j8, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8096c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8096c.isDone();
    }

    public final String toString() {
        return this.f8095b + "@" + System.identityHashCode(this);
    }
}
