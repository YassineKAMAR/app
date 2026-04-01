package f7;

import d7.c0;
import d7.h0;
import e6.i0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0108a f21812h = new C0108a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f21813i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f21814j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f21815k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h0 f21816l = new h0("NOT_IN_STACK");
    private volatile int _isTerminated;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21819c;
    private volatile long controlState;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f7.d f21821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f7.d f21822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0<c> f21823g;
    private volatile long parkedWorkersStack;

    /* JADX INFO: renamed from: f7.a$a, reason: collision with other inner class name */
    public static final class C0108a {
        private C0108a() {
        }

        public /* synthetic */ C0108a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21824a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f21824a = iArr;
        }
    }

    public final class c extends Thread {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f21825i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f21826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final y<h> f21827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f21828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f21829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f21830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f21831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f21832g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.f21826a = new n();
            this.f21827b = new y<>();
            this.f21828c = d.DORMANT;
            this.nextParkedWorker = a.f21816l;
            this.f21831f = r6.c.f26119a.c();
        }

        public c(a aVar, int i8) {
            this();
            q(i8);
        }

        private final void b(int i8) {
            if (i8 == 0) {
                return;
            }
            a.f21814j.addAndGet(a.this, -2097152L);
            if (this.f21828c != d.TERMINATED) {
                this.f21828c = d.DORMANT;
            }
        }

        private final void c(int i8) {
            if (i8 != 0 && u(d.BLOCKING)) {
                a.this.P();
            }
        }

        private final void d(h hVar) {
            int iB = hVar.f21850b.b();
            k(iB);
            c(iB);
            a.this.J(hVar);
            b(iB);
        }

        private final h e(boolean z7) {
            h hVarO;
            h hVarO2;
            if (z7) {
                boolean z8 = m(a.this.f21817a * 2) == 0;
                if (z8 && (hVarO2 = o()) != null) {
                    return hVarO2;
                }
                h hVarG = this.f21826a.g();
                if (hVarG != null) {
                    return hVarG;
                }
                if (!z8 && (hVarO = o()) != null) {
                    return hVarO;
                }
            } else {
                h hVarO3 = o();
                if (hVarO3 != null) {
                    return hVarO3;
                }
            }
            return v(3);
        }

        private final h f() {
            h hVarH = this.f21826a.h();
            if (hVarH != null) {
                return hVarH;
            }
            h hVarD = a.this.f21822f.d();
            return hVarD == null ? v(1) : hVarD;
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f21825i;
        }

        private final void k(int i8) {
            this.f21829d = 0L;
            if (this.f21828c == d.PARKING) {
                this.f21828c = d.BLOCKING;
            }
        }

        private final boolean l() {
            return this.nextParkedWorker != a.f21816l;
        }

        private final void n() {
            if (this.f21829d == 0) {
                this.f21829d = System.nanoTime() + a.this.f21819c;
            }
            LockSupport.parkNanos(a.this.f21819c);
            if (System.nanoTime() - this.f21829d >= 0) {
                this.f21829d = 0L;
                w();
            }
        }

        private final h o() {
            f7.d dVar;
            if (m(2) == 0) {
                h hVarD = a.this.f21821e.d();
                if (hVarD != null) {
                    return hVarD;
                }
                dVar = a.this.f21822f;
            } else {
                h hVarD2 = a.this.f21822f.d();
                if (hVarD2 != null) {
                    return hVarD2;
                }
                dVar = a.this.f21821e;
            }
            return dVar.d();
        }

        private final void p() {
            loop0: while (true) {
                boolean z7 = false;
                while (!a.this.isTerminated() && this.f21828c != d.TERMINATED) {
                    h hVarG = g(this.f21832g);
                    if (hVarG != null) {
                        this.f21830e = 0L;
                        d(hVarG);
                    } else {
                        this.f21832g = false;
                        if (this.f21830e == 0) {
                            t();
                        } else if (z7) {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f21830e);
                            this.f21830e = 0L;
                        } else {
                            z7 = true;
                        }
                    }
                }
                break loop0;
            }
            u(d.TERMINATED);
        }

        private final boolean s() {
            boolean z7;
            if (this.f21828c != d.CPU_ACQUIRED) {
                a aVar = a.this;
                AtomicLongFieldUpdater atomicLongFieldUpdater = a.f21814j;
                while (true) {
                    long j8 = atomicLongFieldUpdater.get(aVar);
                    if (((int) ((9223367638808264704L & j8) >> 42)) == 0) {
                        z7 = false;
                        break;
                    }
                    if (a.f21814j.compareAndSet(aVar, j8, j8 - 4398046511104L)) {
                        z7 = true;
                        break;
                    }
                }
                if (!z7) {
                    return false;
                }
                this.f21828c = d.CPU_ACQUIRED;
            }
            return true;
        }

        private final void t() {
            if (!l()) {
                a.this.E(this);
                return;
            }
            f21825i.set(this, -1);
            while (l() && f21825i.get(this) == -1 && !a.this.isTerminated() && this.f21828c != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        private final h v(int i8) {
            int i9 = (int) (a.f21814j.get(a.this) & 2097151);
            if (i9 < 2) {
                return null;
            }
            int iM = m(i9);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i10 = 0; i10 < i9; i10++) {
                iM++;
                if (iM > i9) {
                    iM = 1;
                }
                c cVarB = aVar.f21823g.b(iM);
                if (cVarB != null && cVarB != this) {
                    long jN = cVarB.f21826a.n(i8, this.f21827b);
                    if (jN == -1) {
                        y<h> yVar = this.f21827b;
                        h hVar = yVar.f24325a;
                        yVar.f24325a = null;
                        return hVar;
                    }
                    if (jN > 0) {
                        jMin = Math.min(jMin, jN);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f21830e = jMin;
            return null;
        }

        private final void w() {
            a aVar = a.this;
            synchronized (aVar.f21823g) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (a.f21814j.get(aVar) & 2097151)) <= aVar.f21817a) {
                    return;
                }
                if (f21825i.compareAndSet(this, -1, 1)) {
                    int i8 = this.indexInArray;
                    q(0);
                    aVar.G(this, i8, 0);
                    int andDecrement = (int) (a.f21814j.getAndDecrement(aVar) & 2097151);
                    if (andDecrement != i8) {
                        c cVarB = aVar.f21823g.b(andDecrement);
                        q.c(cVarB);
                        c cVar = cVarB;
                        aVar.f21823g.c(i8, cVar);
                        cVar.q(i8);
                        aVar.G(cVar, andDecrement, i8);
                    }
                    aVar.f21823g.c(andDecrement, null);
                    i0 i0Var = i0.f21430a;
                    this.f21828c = d.TERMINATED;
                }
            }
        }

        public final h g(boolean z7) {
            return s() ? e(z7) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int i8) {
            int i9 = this.f21831f;
            int i10 = i9 ^ (i9 << 13);
            int i11 = i10 ^ (i10 >> 17);
            int i12 = i11 ^ (i11 << 5);
            this.f21831f = i12;
            int i13 = i8 - 1;
            return (i13 & i8) == 0 ? i12 & i13 : (i12 & Integer.MAX_VALUE) % i8;
        }

        public final void q(int i8) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f21820d);
            sb.append("-worker-");
            sb.append(i8 == 0 ? "TERMINATED" : String.valueOf(i8));
            setName(sb.toString());
            this.indexInArray = i8;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f21828c;
            boolean z7 = dVar2 == d.CPU_ACQUIRED;
            if (z7) {
                a.f21814j.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f21828c = dVar;
            }
            return z7;
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i8, int i9, long j8, String str) {
        this.f21817a = i8;
        this.f21818b = i9;
        this.f21819c = j8;
        this.f21820d = str;
        if (!(i8 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i8 + " should be at least 1").toString());
        }
        if (!(i9 >= i8)) {
            throw new IllegalArgumentException(("Max pool size " + i9 + " should be greater than or equals to core pool size " + i8).toString());
        }
        if (!(i9 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i9 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j8 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j8 + " must be positive").toString());
        }
        this.f21821e = new f7.d();
        this.f21822f = new f7.d();
        this.f21823g = new c0<>((i8 + 1) * 2);
        this.controlState = ((long) i8) << 42;
        this._isTerminated = 0;
    }

    private final void N(long j8, boolean z7) {
        if (z7 || X() || R(j8)) {
            return;
        }
        X();
    }

    private final h Q(c cVar, h hVar, boolean z7) {
        if (cVar == null || cVar.f21828c == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f21850b.b() == 0 && cVar.f21828c == d.BLOCKING) {
            return hVar;
        }
        cVar.f21832g = true;
        return cVar.f21826a.a(hVar, z7);
    }

    private final boolean R(long j8) {
        if (t6.l.b(((int) (2097151 & j8)) - ((int) ((j8 & 4398044413952L) >> 21)), 0) < this.f21817a) {
            int iH = h();
            if (iH == 1 && this.f21817a > 1) {
                h();
            }
            if (iH > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean W(a aVar, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = f21814j.get(aVar);
        }
        return aVar.R(j8);
    }

    private final boolean X() {
        c cVarZ;
        do {
            cVarZ = z();
            if (cVarZ == null) {
                return false;
            }
        } while (!c.j().compareAndSet(cVarZ, -1, 0));
        LockSupport.unpark(cVarZ);
        return true;
    }

    private final boolean c(h hVar) {
        return (hVar.f21850b.b() == 1 ? this.f21822f : this.f21821e).a(hVar);
    }

    private final int h() {
        synchronized (this.f21823g) {
            if (isTerminated()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f21814j;
            long j8 = atomicLongFieldUpdater.get(this);
            int i8 = (int) (j8 & 2097151);
            int iB = t6.l.b(i8 - ((int) ((j8 & 4398044413952L) >> 21)), 0);
            if (iB >= this.f21817a) {
                return 0;
            }
            if (i8 >= this.f21818b) {
                return 0;
            }
            int i9 = ((int) (f21814j.get(this) & 2097151)) + 1;
            if (!(i9 > 0 && this.f21823g.b(i9) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            c cVar = new c(this, i9);
            this.f21823g.c(i9, cVar);
            if (!(i9 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int i10 = iB + 1;
            cVar.start();
            return i10;
        }
    }

    private final c o() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !q.b(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void t(a aVar, Runnable runnable, i iVar, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            iVar = l.f21859g;
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        aVar.q(runnable, iVar, z7);
    }

    private final int w(c cVar) {
        int iH;
        do {
            Object objI = cVar.i();
            if (objI == f21816l) {
                return -1;
            }
            if (objI == null) {
                return 0;
            }
            cVar = (c) objI;
            iH = cVar.h();
        } while (iH == 0);
        return iH;
    }

    private final c z() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f21813i;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            c cVarB = this.f21823g.b((int) (2097151 & j8));
            if (cVarB == null) {
                return null;
            }
            long j9 = (2097152 + j8) & (-2097152);
            int iW = w(cVarB);
            if (iW >= 0 && f21813i.compareAndSet(this, j8, ((long) iW) | j9)) {
                cVarB.r(f21816l);
                return cVarB;
            }
        }
    }

    public final boolean E(c cVar) {
        long j8;
        int iH;
        if (cVar.i() != f21816l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f21813i;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            iH = cVar.h();
            cVar.r(this.f21823g.b((int) (2097151 & j8)));
        } while (!f21813i.compareAndSet(this, j8, ((2097152 + j8) & (-2097152)) | ((long) iH)));
        return true;
    }

    public final void G(c cVar, int i8, int i9) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f21813i;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            int iW = (int) (2097151 & j8);
            long j9 = (2097152 + j8) & (-2097152);
            if (iW == i8) {
                iW = i9 == 0 ? w(cVar) : i9;
            }
            if (iW >= 0 && f21813i.compareAndSet(this, j8, j9 | ((long) iW))) {
                return;
            }
        }
    }

    public final void J(h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f7.a.f21815k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            f7.a$c r0 = r7.o()
            d7.c0<f7.a$c> r1 = r7.f21823g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = a()     // Catch: java.lang.Throwable -> L87
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L87
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r4 = (int) r3
            monitor-exit(r1)
            if (r2 > r4) goto L49
            r1 = 1
        L23:
            d7.c0<f7.a$c> r3 = r7.f21823g
            java.lang.Object r3 = r3.b(r1)
            kotlin.jvm.internal.q.c(r3)
            f7.a$c r3 = (f7.a.c) r3
            if (r3 == r0) goto L44
        L30:
            boolean r5 = r3.isAlive()
            if (r5 == 0) goto L3d
            java.util.concurrent.locks.LockSupport.unpark(r3)
            r3.join(r8)
            goto L30
        L3d:
            f7.n r3 = r3.f21826a
            f7.d r5 = r7.f21822f
            r3.f(r5)
        L44:
            if (r1 == r4) goto L49
            int r1 = r1 + 1
            goto L23
        L49:
            f7.d r8 = r7.f21822f
            r8.b()
            f7.d r8 = r7.f21821e
            r8.b()
        L53:
            if (r0 == 0) goto L5b
            f7.h r8 = r0.g(r2)
            if (r8 != 0) goto L83
        L5b:
            f7.d r8 = r7.f21821e
            java.lang.Object r8 = r8.d()
            f7.h r8 = (f7.h) r8
            if (r8 != 0) goto L83
            f7.d r8 = r7.f21822f
            java.lang.Object r8 = r8.d()
            f7.h r8 = (f7.h) r8
            if (r8 != 0) goto L83
            if (r0 == 0) goto L76
            f7.a$d r8 = f7.a.d.TERMINATED
            r0.u(r8)
        L76:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f7.a.f21813i
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f7.a.f21814j
            r8.set(r7, r0)
            return
        L83:
            r7.J(r8)
            goto L53
        L87:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.a.M(long):void");
    }

    public final void P() {
        if (X() || W(this, 0L, 1, null)) {
            return;
        }
        X();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        M(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        t(this, runnable, null, false, 6, null);
    }

    public final boolean isTerminated() {
        return f21815k.get(this) != 0;
    }

    public final h j(Runnable runnable, i iVar) {
        long jA = l.f21858f.a();
        if (!(runnable instanceof h)) {
            return new k(runnable, jA, iVar);
        }
        h hVar = (h) runnable;
        hVar.f21849a = jA;
        hVar.f21850b = iVar;
        return hVar;
    }

    public final void q(Runnable runnable, i iVar, boolean z7) {
        y6.c.a();
        h hVarJ = j(runnable, iVar);
        boolean z8 = false;
        boolean z9 = hVarJ.f21850b.b() == 1;
        long jAddAndGet = z9 ? f21814j.addAndGet(this, 2097152L) : 0L;
        c cVarO = o();
        h hVarQ = Q(cVarO, hVarJ, z7);
        if (hVarQ != null && !c(hVarQ)) {
            throw new RejectedExecutionException(this.f21820d + " was terminated");
        }
        if (z7 && cVarO != null) {
            z8 = true;
        }
        if (z9) {
            N(jAddAndGet, z8);
        } else {
            if (z8) {
                return;
            }
            P();
        }
    }

    public String toString() {
        StringBuilder sb;
        char c8;
        ArrayList arrayList = new ArrayList();
        int iA = this.f21823g.a();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i13 < iA; i13++) {
            c cVarB = this.f21823g.b(i13);
            if (cVarB != null) {
                int iE = cVarB.f21826a.e();
                int i14 = b.f21824a[cVarB.f21828c.ordinal()];
                if (i14 != 1) {
                    if (i14 == 2) {
                        i9++;
                        sb = new StringBuilder();
                        sb.append(iE);
                        c8 = 'b';
                    } else if (i14 == 3) {
                        i8++;
                        sb = new StringBuilder();
                        sb.append(iE);
                        c8 = 'c';
                    } else if (i14 == 4) {
                        i11++;
                        if (iE > 0) {
                            sb = new StringBuilder();
                            sb.append(iE);
                            c8 = 'd';
                        }
                    } else if (i14 == 5) {
                        i12++;
                    }
                    sb.append(c8);
                    arrayList.add(sb.toString());
                } else {
                    i10++;
                }
            }
        }
        long j8 = f21814j.get(this);
        return this.f21820d + '@' + y6.i0.b(this) + "[Pool Size {core = " + this.f21817a + ", max = " + this.f21818b + "}, Worker States {CPU = " + i8 + ", blocking = " + i9 + ", parked = " + i10 + ", dormant = " + i11 + ", terminated = " + i12 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f21821e.c() + ", global blocking queue size = " + this.f21822f.c() + ", Control State {created workers= " + ((int) (2097151 & j8)) + ", blocking tasks = " + ((int) ((4398044413952L & j8) >> 21)) + ", CPUs acquired = " + (this.f21817a - ((int) ((9223367638808264704L & j8) >> 42))) + "}]";
    }
}
