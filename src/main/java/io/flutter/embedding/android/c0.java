package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c0 f22607c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LongSparseArray<MotionEvent> f22608a = new LongSparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Long> f22609b = new PriorityQueue<>();

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final AtomicLong f22610b = new AtomicLong(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f22611a;

        private a(long j8) {
            this.f22611a = j8;
        }

        public static a b() {
            return c(f22610b.incrementAndGet());
        }

        public static a c(long j8) {
            return new a(j8);
        }

        public long d() {
            return this.f22611a;
        }
    }

    private c0() {
    }

    public static c0 a() {
        if (f22607c == null) {
            f22607c = new c0();
        }
        return f22607c;
    }

    public MotionEvent b(a aVar) {
        while (!this.f22609b.isEmpty() && this.f22609b.peek().longValue() < aVar.f22611a) {
            this.f22608a.remove(this.f22609b.poll().longValue());
        }
        if (!this.f22609b.isEmpty() && this.f22609b.peek().longValue() == aVar.f22611a) {
            this.f22609b.poll();
        }
        MotionEvent motionEvent = this.f22608a.get(aVar.f22611a);
        this.f22608a.remove(aVar.f22611a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a aVarB = a.b();
        this.f22608a.put(aVarB.f22611a, MotionEvent.obtain(motionEvent));
        this.f22609b.add(Long.valueOf(aVarB.f22611a));
        return aVarB;
    }
}
