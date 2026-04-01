package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
class p<V> extends androidx.concurrent.futures.a<V> implements ScheduledFuture<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScheduledFuture<?> f20832h;

    class a implements b<V> {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.x(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(V v7) {
            p.this.w(v7);
        }
    }

    interface b<T> {
        void a(Throwable th);

        void set(T t7);
    }

    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    p(c<V> cVar) {
        this.f20832h = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f20832h.compareTo(delayed);
    }

    @Override // androidx.concurrent.futures.a
    protected void d() {
        this.f20832h.cancel(z());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f20832h.getDelay(timeUnit);
    }
}
