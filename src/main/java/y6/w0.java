package y6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w0 extends x0 implements n0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f27559f = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_queue");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f27560g = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_delayed");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f27561h = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    public static abstract class a implements Runnable, Comparable<a>, t0, d7.o0 {
        private volatile Object _heap;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f27562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27563b;

        @Override // y6.t0
        public final void a() {
            synchronized (this) {
                Object obj = this._heap;
                if (obj == z0.f27566a) {
                    return;
                }
                b bVar = obj instanceof b ? (b) obj : null;
                if (bVar != null) {
                    bVar.g(this);
                }
                this._heap = z0.f27566a;
                e6.i0 i0Var = e6.i0.f21430a;
            }
        }

        @Override // d7.o0
        public d7.n0<?> c() {
            Object obj = this._heap;
            if (obj instanceof d7.n0) {
                return (d7.n0) obj;
            }
            return null;
        }

        @Override // d7.o0
        public void e(d7.n0<?> n0Var) {
            if (!(this._heap != z0.f27566a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = n0Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            long j8 = this.f27562a - aVar.f27562a;
            if (j8 > 0) {
                return 1;
            }
            return j8 < 0 ? -1 : 0;
        }

        @Override // d7.o0
        public int getIndex() {
            return this.f27563b;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0040 A[Catch: all -> 0x0048, TryCatch #0 {, blocks: (B:9:0x000d, B:17:0x0021, B:25:0x0037, B:27:0x0040, B:28:0x0042, B:18:0x0024, B:22:0x002e), top: B:37:0x000d, outer: #1 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int h(long r8, y6.w0.b r10, y6.w0 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L4b
                d7.h0 r1 = y6.z0.b()     // Catch: java.lang.Throwable -> L4b
                if (r0 != r1) goto Lc
                r8 = 2
            La:
                monitor-exit(r7)
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L4b
                d7.o0 r0 = r10.b()     // Catch: java.lang.Throwable -> L48
                y6.w0$a r0 = (y6.w0.a) r0     // Catch: java.lang.Throwable -> L48
                boolean r11 = y6.w0.t0(r11)     // Catch: java.lang.Throwable -> L48
                if (r11 == 0) goto L1d
                r8 = 1
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                monitor-exit(r7)
                return r8
            L1d:
                r1 = 0
                if (r0 != 0) goto L24
            L21:
                r10.f27564c = r8     // Catch: java.lang.Throwable -> L48
                goto L37
            L24:
                long r3 = r0.f27562a     // Catch: java.lang.Throwable -> L48
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L2d
                goto L2e
            L2d:
                r8 = r3
            L2e:
                long r3 = r10.f27564c     // Catch: java.lang.Throwable -> L48
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L37
                goto L21
            L37:
                long r8 = r7.f27562a     // Catch: java.lang.Throwable -> L48
                long r3 = r10.f27564c     // Catch: java.lang.Throwable -> L48
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L42
                r7.f27562a = r3     // Catch: java.lang.Throwable -> L48
            L42:
                r10.a(r7)     // Catch: java.lang.Throwable -> L48
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                r8 = 0
                goto La
            L48:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                throw r8     // Catch: java.lang.Throwable -> L4b
            L4b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: y6.w0.a.h(long, y6.w0$b, y6.w0):int");
        }

        public final boolean i(long j8) {
            return j8 - this.f27562a >= 0;
        }

        @Override // d7.o0
        public void setIndex(int i8) {
            this.f27563b = i8;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f27562a + ']';
        }
    }

    public static final class b extends d7.n0<a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f27564c;

        public b(long j8) {
            this.f27564c = j8;
        }
    }

    private final void B0() {
        a aVarI;
        c.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) f27560g.get(this);
            if (bVar == null || (aVarI = bVar.i()) == null) {
                return;
            } else {
                r0(jNanoTime, aVarI);
            }
        }
    }

    private final int E0(long j8, a aVar) {
        if (y0()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27560g;
        b bVar = (b) atomicReferenceFieldUpdater.get(this);
        if (bVar == null) {
            androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, new b(j8));
            Object obj = atomicReferenceFieldUpdater.get(this);
            kotlin.jvm.internal.q.c(obj);
            bVar = (b) obj;
        }
        return aVar.h(j8, bVar, this);
    }

    private final void F0(boolean z7) {
        f27561h.set(this, z7 ? 1 : 0);
    }

    private final boolean G0(a aVar) {
        b bVar = (b) f27560g.get(this);
        return (bVar != null ? bVar.e() : null) == aVar;
    }

    private final void u0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27559f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f27559f, this, null, z0.f27567b)) {
                    return;
                }
            } else if (obj instanceof d7.u) {
                ((d7.u) obj).d();
                return;
            } else {
                if (obj == z0.f27567b) {
                    return;
                }
                d7.u uVar = new d7.u(8, true);
                kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                uVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f27559f, this, obj, uVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable v0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27559f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof d7.u) {
                kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                d7.u uVar = (d7.u) obj;
                Object objJ = uVar.j();
                if (objJ != d7.u.f21066h) {
                    return (Runnable) objJ;
                }
                androidx.concurrent.futures.b.a(f27559f, this, obj, uVar.i());
            } else {
                if (obj == z0.f27567b) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f27559f, this, obj, null)) {
                    kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean x0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27559f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (y0()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f27559f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof d7.u) {
                kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                d7.u uVar = (d7.u) obj;
                int iA = uVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.b.a(f27559f, this, obj, uVar.i());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == z0.f27567b) {
                    return false;
                }
                d7.u uVar2 = new d7.u(8, true);
                kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                uVar2.a((Runnable) obj);
                uVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f27559f, this, obj, uVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y0() {
        return f27561h.get(this) != 0;
    }

    public long A0() {
        a aVarH;
        if (p0()) {
            return 0L;
        }
        b bVar = (b) f27560g.get(this);
        if (bVar != null && !bVar.d()) {
            c.a();
            long jNanoTime = System.nanoTime();
            do {
                synchronized (bVar) {
                    a aVarB = bVar.b();
                    aVarH = null;
                    if (aVarB != null) {
                        a aVar = aVarB;
                        if (aVar.i(jNanoTime) ? x0(aVar) : false) {
                            aVarH = bVar.h(0);
                        }
                    }
                }
            } while (aVarH != null);
        }
        Runnable runnableV0 = v0();
        if (runnableV0 == null) {
            return k0();
        }
        runnableV0.run();
        return 0L;
    }

    protected final void C0() {
        f27559f.set(this, null);
        f27560g.set(this, null);
    }

    public final void D0(long j8, a aVar) {
        int iE0 = E0(j8, aVar);
        if (iE0 == 0) {
            if (G0(aVar)) {
                s0();
            }
        } else if (iE0 == 1) {
            r0(j8, aVar);
        } else if (iE0 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @Override // y6.b0
    public final void e0(h6.g gVar, Runnable runnable) {
        w0(runnable);
    }

    @Override // y6.v0
    protected long k0() {
        a aVarE;
        if (super.k0() == 0) {
            return 0L;
        }
        Object obj = f27559f.get(this);
        if (obj != null) {
            if (!(obj instanceof d7.u)) {
                return obj == z0.f27567b ? Long.MAX_VALUE : 0L;
            }
            if (!((d7.u) obj).g()) {
                return 0L;
            }
        }
        b bVar = (b) f27560g.get(this);
        if (bVar == null || (aVarE = bVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j8 = aVarE.f27562a;
        c.a();
        return t6.l.c(j8 - System.nanoTime(), 0L);
    }

    @Override // y6.v0
    public void shutdown() {
        b2.f27479a.b();
        F0(true);
        u0();
        while (A0() <= 0) {
        }
        B0();
    }

    public void w0(Runnable runnable) {
        if (x0(runnable)) {
            s0();
        } else {
            j0.f27501i.w0(runnable);
        }
    }

    protected boolean z0() {
        if (!o0()) {
            return false;
        }
        b bVar = (b) f27560g.get(this);
        if (bVar != null && !bVar.d()) {
            return false;
        }
        Object obj = f27559f.get(this);
        if (obj != null) {
            if (obj instanceof d7.u) {
                return ((d7.u) obj).g();
            }
            if (obj != z0.f27567b) {
                return false;
            }
        }
        return true;
    }
}
