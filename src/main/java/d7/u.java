package d7;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class u<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f21063e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21064f = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "_next");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f21065g = AtomicLongFieldUpdater.newUpdater(u.class, "_state");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h0 f21066h = new h0("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReferenceArray f21070d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }

        public final int a(long j8) {
            return (j8 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j8, int i8) {
            return d(j8, 1073741823L) | (((long) i8) << 0);
        }

        public final long c(long j8, int i8) {
            return d(j8, 1152921503533105152L) | (((long) i8) << 30);
        }

        public final long d(long j8, long j9) {
            return j8 & (~j9);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21071a;

        public b(int i8) {
            this.f21071a = i8;
        }
    }

    public u(int i8, boolean z7) {
        this.f21067a = i8;
        this.f21068b = z7;
        int i9 = i8 - 1;
        this.f21069c = i9;
        this.f21070d = new AtomicReferenceArray(i8);
        if (!(i9 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i8 & i9) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final u<E> b(long j8) {
        u<E> uVar = new u<>(this.f21067a * 2, this.f21068b);
        int i8 = (int) ((1073741823 & j8) >> 0);
        int i9 = (int) ((1152921503533105152L & j8) >> 30);
        while (true) {
            int i10 = this.f21069c;
            if ((i8 & i10) == (i9 & i10)) {
                f21065g.set(uVar, f21063e.d(j8, 1152921504606846976L));
                return uVar;
            }
            Object bVar = this.f21070d.get(i10 & i8);
            if (bVar == null) {
                bVar = new b(i8);
            }
            uVar.f21070d.set(uVar.f21069c & i8, bVar);
            i8++;
        }
    }

    private final u<E> c(long j8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21064f;
        while (true) {
            u<E> uVar = (u) atomicReferenceFieldUpdater.get(this);
            if (uVar != null) {
                return uVar;
            }
            androidx.concurrent.futures.b.a(f21064f, this, null, b(j8));
        }
    }

    private final u<E> e(int i8, E e8) {
        Object obj = this.f21070d.get(this.f21069c & i8);
        if (!(obj instanceof b) || ((b) obj).f21071a != i8) {
            return null;
        }
        this.f21070d.set(i8 & this.f21069c, e8);
        return this;
    }

    private final long h() {
        long j8;
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f21065g;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & 1152921504606846976L) != 0) {
                return j8;
            }
            j9 = j8 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, j9));
        return j9;
    }

    private final u<E> k(int i8, int i9) {
        long j8;
        int i10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f21065g;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            i10 = (int) ((1073741823 & j8) >> 0);
            if ((1152921504606846976L & j8) != 0) {
                return i();
            }
        } while (!f21065g.compareAndSet(this, j8, f21063e.b(j8, i9)));
        this.f21070d.set(this.f21069c & i10, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(E r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = d7.u.f21065g
        L2:
            long r3 = r0.get(r13)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L16
            d7.u$a r14 = d7.u.f21063e
            int r14 = r14.a(r3)
            return r14
        L16:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            r9 = 0
            long r1 = r1 >> r9
            int r2 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r1 = 30
            long r5 = r5 >> r1
            int r10 = (int) r5
            int r11 = r13.f21069c
            int r1 = r10 + 2
            r1 = r1 & r11
            r5 = r2 & r11
            r6 = 1
            if (r1 != r5) goto L32
            return r6
        L32:
            boolean r1 = r13.f21068b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 != 0) goto L51
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r13.f21070d
            r12 = r10 & r11
            java.lang.Object r1 = r1.get(r12)
            if (r1 == 0) goto L51
            int r1 = r13.f21067a
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 < r3) goto L50
            int r10 = r10 - r2
            r2 = r10 & r5
            int r1 = r1 >> 1
            if (r2 <= r1) goto L2
        L50:
            return r6
        L51:
            int r1 = r10 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = d7.u.f21065g
            d7.u$a r5 = d7.u.f21063e
            long r5 = r5.c(r3, r1)
            r1 = r2
            r2 = r13
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f21070d
            r1 = r10 & r11
            r0.set(r1, r14)
            r0 = r13
        L6c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = d7.u.f21065g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L83
            d7.u r0 = r0.i()
            d7.u r0 = r0.e(r10, r14)
            if (r0 != 0) goto L6c
        L83:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.u.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f21065g;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j8) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, j8 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j8 = f21065g.get(this);
        return 1073741823 & (((int) ((j8 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j8) >> 0)));
    }

    public final boolean g() {
        long j8 = f21065g.get(this);
        return ((int) ((1073741823 & j8) >> 0)) == ((int) ((j8 & 1152921503533105152L) >> 30));
    }

    public final u<E> i() {
        return c(h());
    }

    public final Object j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f21065g;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j8) != 0) {
                return f21066h;
            }
            int i8 = (int) ((1073741823 & j8) >> 0);
            int i9 = (int) ((1152921503533105152L & j8) >> 30);
            int i10 = this.f21069c;
            if ((i9 & i10) == (i8 & i10)) {
                return null;
            }
            Object obj = this.f21070d.get(i10 & i8);
            if (obj == null) {
                if (this.f21068b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i11 = (i8 + 1) & 1073741823;
                if (f21065g.compareAndSet(this, j8, f21063e.b(j8, i11))) {
                    this.f21070d.set(this.f21069c & i8, null);
                    return obj;
                }
                if (this.f21068b) {
                    u<E> uVarK = this;
                    do {
                        uVarK = uVarK.k(i8, i11);
                    } while (uVarK != null);
                    return obj;
                }
            }
        }
    }
}
