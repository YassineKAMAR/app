package a7;

import d7.e0;
import d7.f0;
import d7.g0;
import d7.h0;
import d7.q0;
import d7.z;
import e6.i0;
import e6.s;
import e6.t;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.r;
import p6.q;
import y6.f2;

/* JADX INFO: loaded from: classes2.dex */
public class b<E> implements d<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f242e = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f243f = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f244g = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f245h = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f246i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f247j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f248k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f249l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f250m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f251b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p6.l<E, i0> f252c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q<g7.b<?>, Object, Object, p6.l<Throwable, i0>> f253d;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    private final class a implements e<E>, f2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f254a = a7.c.f278p;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private y6.k<? super Boolean> f255b;

        public a() {
        }

        private final Object f(i<E> iVar, int i8, long j8, h6.d<? super Boolean> dVar) throws Throwable {
            Boolean boolA;
            b<E> bVar = b.this;
            y6.k kVarA = y6.m.a(i6.c.c(dVar));
            try {
                this.f255b = kVarA;
                Object objE0 = bVar.e0(iVar, i8, j8, this);
                if (objE0 == a7.c.f275m) {
                    bVar.T(this, iVar, i8);
                } else {
                    p6.l<Throwable, i0> lVarA = null;
                    if (objE0 == a7.c.f277o) {
                        if (j8 < bVar.D()) {
                            iVar.b();
                        }
                        i iVar2 = (i) b.f247j.get(bVar);
                        while (true) {
                            if (bVar.J()) {
                                h();
                                break;
                            }
                            long andIncrement = b.f243f.getAndIncrement(bVar);
                            int i9 = a7.c.f264b;
                            long j9 = andIncrement / ((long) i9);
                            int i10 = (int) (andIncrement % ((long) i9));
                            if (iVar2.f21017c != j9) {
                                i iVarW = bVar.w(j9, iVar2);
                                if (iVarW != null) {
                                    iVar2 = iVarW;
                                }
                            }
                            Object objE02 = bVar.e0(iVar2, i10, andIncrement, this);
                            if (objE02 == a7.c.f275m) {
                                bVar.T(this, iVar2, i10);
                                break;
                            }
                            if (objE02 == a7.c.f277o) {
                                if (andIncrement < bVar.D()) {
                                    iVar2.b();
                                }
                            } else {
                                if (objE02 == a7.c.f276n) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                iVar2.b();
                                this.f254a = objE02;
                                this.f255b = null;
                                boolA = kotlin.coroutines.jvm.internal.b.a(true);
                                p6.l<E, i0> lVar = bVar.f252c;
                                if (lVar != null) {
                                    lVarA = z.a(lVar, objE02, kVarA.getContext());
                                }
                            }
                        }
                    } else {
                        iVar.b();
                        this.f254a = objE0;
                        this.f255b = null;
                        boolA = kotlin.coroutines.jvm.internal.b.a(true);
                        p6.l<E, i0> lVar2 = bVar.f252c;
                        if (lVar2 != null) {
                            lVarA = z.a(lVar2, objE0, kVarA.getContext());
                        }
                    }
                    kVarA.H(boolA, lVarA);
                }
                Object objU = kVarA.u();
                if (objU == i6.d.e()) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return objU;
            } catch (Throwable th) {
                kVarA.F();
                throw th;
            }
        }

        private final boolean g() throws Throwable {
            this.f254a = a7.c.x();
            Throwable thZ = b.this.z();
            if (thZ == null) {
                return false;
            }
            throw g0.a(thZ);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            Object objA;
            y6.k<? super Boolean> kVar = this.f255b;
            kotlin.jvm.internal.q.c(kVar);
            this.f255b = null;
            this.f254a = a7.c.x();
            Throwable thZ = b.this.z();
            if (thZ == null) {
                s.a aVar = s.f21442b;
                objA = Boolean.FALSE;
            } else {
                s.a aVar2 = s.f21442b;
                objA = t.a(thZ);
            }
            kVar.resumeWith(s.b(objA));
        }

        @Override // a7.e
        public Object a(h6.d<? super Boolean> dVar) throws Throwable {
            boolean zG;
            i<E> iVar;
            b<E> bVar = b.this;
            i<E> iVar2 = (i) b.f247j.get(bVar);
            while (true) {
                if (bVar.J()) {
                    zG = g();
                    break;
                }
                long andIncrement = b.f243f.getAndIncrement(bVar);
                int i8 = a7.c.f264b;
                long j8 = andIncrement / ((long) i8);
                int i9 = (int) (andIncrement % ((long) i8));
                if (iVar2.f21017c != j8) {
                    i<E> iVarW = bVar.w(j8, iVar2);
                    if (iVarW == null) {
                        continue;
                    } else {
                        iVar = iVarW;
                    }
                } else {
                    iVar = iVar2;
                }
                Object objE0 = bVar.e0(iVar, i9, andIncrement, null);
                if (objE0 == a7.c.f275m) {
                    throw new IllegalStateException("unreachable".toString());
                }
                if (objE0 == a7.c.f277o) {
                    if (andIncrement < bVar.D()) {
                        iVar.b();
                    }
                    iVar2 = iVar;
                } else {
                    if (objE0 == a7.c.f276n) {
                        return f(iVar, i9, andIncrement, dVar);
                    }
                    iVar.b();
                    this.f254a = objE0;
                    zG = true;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(zG);
        }

        @Override // y6.f2
        public void c(e0<?> e0Var, int i8) {
            y6.k<? super Boolean> kVar = this.f255b;
            if (kVar != null) {
                kVar.c(e0Var, i8);
            }
        }

        public final boolean i(E e8) {
            y6.k<? super Boolean> kVar = this.f255b;
            kotlin.jvm.internal.q.c(kVar);
            this.f255b = null;
            this.f254a = e8;
            Boolean bool = Boolean.TRUE;
            p6.l<E, i0> lVar = b.this.f252c;
            return a7.c.z(kVar, bool, lVar != null ? z.a(lVar, e8, kVar.getContext()) : null);
        }

        public final void j() {
            Object objA;
            y6.k<? super Boolean> kVar = this.f255b;
            kotlin.jvm.internal.q.c(kVar);
            this.f255b = null;
            this.f254a = a7.c.x();
            Throwable thZ = b.this.z();
            if (thZ == null) {
                s.a aVar = s.f21442b;
                objA = Boolean.FALSE;
            } else {
                s.a aVar2 = s.f21442b;
                objA = t.a(thZ);
            }
            kVar.resumeWith(s.b(objA));
        }

        @Override // a7.e
        public E next() throws Throwable {
            E e8 = (E) this.f254a;
            if (!(e8 != a7.c.f278p)) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            this.f254a = a7.c.f278p;
            if (e8 != a7.c.x()) {
                return e8;
            }
            throw g0.a(b.this.A());
        }
    }

    /* JADX INFO: renamed from: a7.b$b, reason: collision with other inner class name */
    private static final class C0007b implements f2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y6.j<Boolean> f257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final /* synthetic */ y6.k<Boolean> f258b;

        public final y6.j<Boolean> a() {
            return this.f257a;
        }

        @Override // y6.f2
        public void c(e0<?> e0Var, int i8) {
            this.f258b.c(e0Var, i8);
        }
    }

    static final class c extends r implements q<g7.b<?>, Object, Object, p6.l<? super Throwable, ? extends i0>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b<E> f259a;

        static final class a extends r implements p6.l<Throwable, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f260a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b<E> f261b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ g7.b<?> f262c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, b<E> bVar, g7.b<?> bVar2) {
                super(1);
                this.f260a = obj;
                this.f261b = bVar;
                this.f262c = bVar2;
            }

            public final void a(Throwable th) {
                if (this.f260a != a7.c.x()) {
                    z.b(this.f261b.f252c, this.f260a, this.f262c.getContext());
                }
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ i0 invoke(Throwable th) {
                a(th);
                return i0.f21430a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b<E> bVar) {
            super(3);
            this.f259a = bVar;
        }

        @Override // p6.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p6.l<Throwable, i0> invoke(g7.b<?> bVar, Object obj, Object obj2) {
            return new a(obj2, this.f259a, bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i8, p6.l<? super E, i0> lVar) {
        this.f251b = i8;
        this.f252c = lVar;
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i8 + ", should be >=0").toString());
        }
        this.bufferEnd = a7.c.y(i8);
        this.completedExpandBuffersAndPauseFlag = y();
        i iVar = new i(0L, null, this, 3);
        this.sendSegment = iVar;
        this.receiveSegment = iVar;
        if (O()) {
            iVar = a7.c.f263a;
            kotlin.jvm.internal.q.d(iVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = iVar;
        this.f253d = lVar != 0 ? new c(this) : null;
        this._closeCause = a7.c.f281s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable A() {
        Throwable thZ = z();
        return thZ == null ? new j("Channel was closed") : thZ;
    }

    private final void F(long j8) {
        if ((f245h.addAndGet(this, j8) & 4611686018427387904L) != 0) {
            do {
            } while ((f245h.get(this) & 4611686018427387904L) != 0);
        }
    }

    static /* synthetic */ void G(b bVar, long j8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i8 & 1) != 0) {
            j8 = 1;
        }
        bVar.F(j8);
    }

    private final boolean H(i<E> iVar, int i8, long j8) {
        Object objW;
        do {
            objW = iVar.w(i8);
            if (objW != null && objW != a7.c.f267e) {
                if (objW == a7.c.f266d) {
                    return true;
                }
                if (objW == a7.c.f272j || objW == a7.c.x() || objW == a7.c.f271i || objW == a7.c.f270h) {
                    return false;
                }
                if (objW == a7.c.f269g) {
                    return true;
                }
                return objW != a7.c.f268f && j8 == B();
            }
        } while (!iVar.r(i8, objW, a7.c.f270h));
        u();
        return false;
    }

    private final boolean I(long j8, boolean z7) {
        int i8 = (int) (j8 >> 60);
        if (i8 == 0 || i8 == 1) {
            return false;
        }
        if (i8 == 2) {
            r(j8 & 1152921504606846975L);
            if (z7 && E()) {
                return false;
            }
        } else {
            if (i8 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i8).toString());
            }
            q(j8 & 1152921504606846975L);
        }
        return true;
    }

    private final boolean K(long j8) {
        return I(j8, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M(long j8) {
        return I(j8, false);
    }

    private final boolean O() {
        long jY = y();
        return jY == 0 || jY == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        r9 = (a7.i) r9.g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long P(a7.i<E> r9) {
        /*
            r8 = this;
        L0:
            int r0 = a7.c.f264b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3d
            long r3 = r9.f21017c
            int r5 = a7.c.f264b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r8.B()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L1b
            return r1
        L1b:
            java.lang.Object r1 = r9.w(r0)
            if (r1 == 0) goto L2d
            d7.h0 r2 = a7.c.i()
            if (r1 != r2) goto L28
            goto L2d
        L28:
            d7.h0 r2 = a7.c.f266d
            if (r1 != r2) goto L3a
            return r3
        L2d:
            d7.h0 r2 = a7.c.x()
            boolean r1 = r9.r(r0, r1, r2)
            if (r1 == 0) goto L1b
            r9.p()
        L3a:
            int r0 = r0 + (-1)
            goto L4
        L3d:
            d7.e r9 = r9.g()
            a7.i r9 = (a7.i) r9
            if (r9 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.b.P(a7.i):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void Q(long j8, i<E> iVar) {
        boolean z7;
        i<E> iVar2;
        i<E> iVar3;
        while (iVar.f21017c < j8 && (iVar3 = (i) iVar.e()) != null) {
            iVar = iVar3;
        }
        while (true) {
            if (!iVar.h() || (iVar2 = (i) iVar.e()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f248k;
                while (true) {
                    e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                    z7 = true;
                    if (e0Var.f21017c >= iVar.f21017c) {
                        break;
                    }
                    if (!iVar.q()) {
                        z7 = false;
                        break;
                    } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e0Var, iVar)) {
                        if (e0Var.m()) {
                            e0Var.k();
                        }
                    } else if (iVar.m()) {
                        iVar.k();
                    }
                }
                if (z7) {
                    return;
                }
            } else {
                iVar = iVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(f2 f2Var, i<E> iVar, int i8) {
        S();
        f2Var.c(iVar, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(f2 f2Var, i<E> iVar, int i8) {
        f2Var.c(iVar, i8 + a7.c.f264b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        r13.s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ab, code lost:
    
        r13 = (a7.i) r13.g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void V(a7.i<E> r13) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.b.V(a7.i):void");
    }

    private final void W(f2 f2Var) {
        Y(f2Var, true);
    }

    private final void X(f2 f2Var) {
        Y(f2Var, false);
    }

    private final void Y(f2 f2Var, boolean z7) {
        h6.d dVarA;
        Object objB;
        if (f2Var instanceof C0007b) {
            dVarA = ((C0007b) f2Var).a();
            s.a aVar = s.f21442b;
            objB = Boolean.FALSE;
        } else if (f2Var instanceof y6.j) {
            dVarA = (h6.d) f2Var;
            s.a aVar2 = s.f21442b;
            objB = t.a(z7 ? A() : C());
        } else {
            if (!(f2Var instanceof m)) {
                if (f2Var instanceof a) {
                    ((a) f2Var).j();
                    return;
                } else {
                    if (f2Var instanceof g7.b) {
                        ((g7.b) f2Var).a(this, a7.c.x());
                        return;
                    }
                    throw new IllegalStateException(("Unexpected waiter: " + f2Var).toString());
                }
            }
            dVarA = ((m) f2Var).f294a;
            s.a aVar3 = s.f21442b;
            objB = g.b(g.f286b.a(z()));
        }
        dVarA.resumeWith(s.b(objB));
    }

    private final boolean Z(long j8) {
        if (M(j8)) {
            return false;
        }
        return !n(j8 & 1152921504606846975L);
    }

    private final boolean a0(Object obj, E e8) {
        if (obj instanceof g7.b) {
            return ((g7.b) obj).a(this, e8);
        }
        if (obj instanceof m) {
            kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            m mVar = (m) obj;
            y6.k<g<? extends E>> kVar = mVar.f294a;
            g gVarB = g.b(g.f286b.c(e8));
            p6.l<E, i0> lVar = this.f252c;
            return a7.c.z(kVar, gVarB, lVar != null ? z.a(lVar, e8, mVar.f294a.getContext()) : null);
        }
        if (obj instanceof a) {
            kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(e8);
        }
        if (obj instanceof y6.j) {
            kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            y6.j jVar = (y6.j) obj;
            p6.l<E, i0> lVar2 = this.f252c;
            return a7.c.z(jVar, e8, lVar2 != null ? z.a(lVar2, e8, jVar.getContext()) : null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final boolean b0(Object obj, i<E> iVar, int i8) {
        y6.j<Boolean> jVarA;
        Object obj2;
        if (obj instanceof y6.j) {
            kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            jVarA = (y6.j) obj;
            obj2 = i0.f21430a;
        } else {
            if (obj instanceof g7.b) {
                kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
                g7.d dVarE = ((g7.a) obj).e(this, i0.f21430a);
                if (dVarE == g7.d.REREGISTER) {
                    iVar.s(i8);
                }
                return dVarE == g7.d.SUCCESSFUL;
            }
            if (!(obj instanceof C0007b)) {
                throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
            }
            jVarA = ((C0007b) obj).a();
            obj2 = Boolean.TRUE;
        }
        return a7.c.A(jVarA, obj2, null, 2, null);
    }

    private final boolean c0(i<E> iVar, int i8, long j8) {
        Object objW = iVar.w(i8);
        if (!(objW instanceof f2) || j8 < f243f.get(this) || !iVar.r(i8, objW, a7.c.f269g)) {
            return d0(iVar, i8, j8);
        }
        if (b0(objW, iVar, i8)) {
            iVar.A(i8, a7.c.f266d);
            return true;
        }
        iVar.A(i8, a7.c.f272j);
        iVar.x(i8, false);
        return false;
    }

    private final boolean d0(i<E> iVar, int i8, long j8) {
        while (true) {
            Object objW = iVar.w(i8);
            if (objW instanceof f2) {
                if (j8 < f243f.get(this)) {
                    if (iVar.r(i8, objW, new p((f2) objW))) {
                        return true;
                    }
                } else if (iVar.r(i8, objW, a7.c.f269g)) {
                    if (b0(objW, iVar, i8)) {
                        iVar.A(i8, a7.c.f266d);
                        return true;
                    }
                    iVar.A(i8, a7.c.f272j);
                    iVar.x(i8, false);
                    return false;
                }
            } else {
                if (objW == a7.c.f272j) {
                    return false;
                }
                if (objW == null) {
                    if (iVar.r(i8, objW, a7.c.f267e)) {
                        return true;
                    }
                } else {
                    if (objW == a7.c.f266d || objW == a7.c.f270h || objW == a7.c.f271i || objW == a7.c.f273k || objW == a7.c.x()) {
                        return true;
                    }
                    if (objW != a7.c.f268f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objW).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e0(i<E> iVar, int i8, long j8, Object obj) {
        Object objW = iVar.w(i8);
        if (objW == null) {
            if (j8 >= (f242e.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return a7.c.f276n;
                }
                if (iVar.r(i8, objW, obj)) {
                    u();
                    return a7.c.f275m;
                }
            }
        } else if (objW == a7.c.f266d && iVar.r(i8, objW, a7.c.f271i)) {
            u();
            return iVar.y(i8);
        }
        return f0(iVar, i8, j8, obj);
    }

    private final Object f0(i<E> iVar, int i8, long j8, Object obj) {
        while (true) {
            Object objW = iVar.w(i8);
            if (objW == null || objW == a7.c.f267e) {
                if (j8 < (f242e.get(this) & 1152921504606846975L)) {
                    if (iVar.r(i8, objW, a7.c.f270h)) {
                        u();
                        return a7.c.f277o;
                    }
                } else {
                    if (obj == null) {
                        return a7.c.f276n;
                    }
                    if (iVar.r(i8, objW, obj)) {
                        u();
                        return a7.c.f275m;
                    }
                }
            } else {
                if (objW != a7.c.f266d) {
                    if (objW != a7.c.f272j && objW != a7.c.f270h) {
                        if (objW == a7.c.x()) {
                            u();
                            return a7.c.f277o;
                        }
                        if (objW != a7.c.f269g && iVar.r(i8, objW, a7.c.f268f)) {
                            boolean z7 = objW instanceof p;
                            if (z7) {
                                objW = ((p) objW).f295a;
                            }
                            if (b0(objW, iVar, i8)) {
                                iVar.A(i8, a7.c.f271i);
                                u();
                                return iVar.y(i8);
                            }
                            iVar.A(i8, a7.c.f272j);
                            iVar.x(i8, false);
                            if (z7) {
                                u();
                            }
                            return a7.c.f277o;
                        }
                    }
                    return a7.c.f277o;
                }
                if (iVar.r(i8, objW, a7.c.f271i)) {
                    u();
                    return iVar.y(i8);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int g0(i<E> iVar, int i8, E e8, long j8, Object obj, boolean z7) {
        iVar.B(i8, e8);
        if (z7) {
            return h0(iVar, i8, e8, j8, obj, z7);
        }
        Object objW = iVar.w(i8);
        if (objW == null) {
            if (n(j8)) {
                if (iVar.r(i8, null, a7.c.f266d)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (iVar.r(i8, null, obj)) {
                    return 2;
                }
            }
        } else if (objW instanceof f2) {
            iVar.s(i8);
            if (a0(objW, e8)) {
                iVar.A(i8, a7.c.f271i);
                R();
                return 0;
            }
            if (iVar.t(i8, a7.c.f273k) != a7.c.f273k) {
                iVar.x(i8, true);
            }
            return 5;
        }
        return h0(iVar, i8, e8, j8, obj, z7);
    }

    private final int h0(i<E> iVar, int i8, E e8, long j8, Object obj, boolean z7) {
        while (true) {
            Object objW = iVar.w(i8);
            if (objW == null) {
                if (!n(j8) || z7) {
                    if (z7) {
                        if (iVar.r(i8, null, a7.c.f272j)) {
                            iVar.x(i8, false);
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (iVar.r(i8, null, obj)) {
                            return 2;
                        }
                    }
                } else if (iVar.r(i8, null, a7.c.f266d)) {
                    return 1;
                }
            } else {
                if (objW != a7.c.f267e) {
                    if (objW == a7.c.f273k) {
                        iVar.s(i8);
                        return 5;
                    }
                    if (objW == a7.c.f270h) {
                        iVar.s(i8);
                        return 5;
                    }
                    h0 h0VarX = a7.c.x();
                    iVar.s(i8);
                    if (objW == h0VarX) {
                        s();
                        return 4;
                    }
                    if (objW instanceof p) {
                        objW = ((p) objW).f295a;
                    }
                    if (a0(objW, e8)) {
                        iVar.A(i8, a7.c.f271i);
                        R();
                        return 0;
                    }
                    if (iVar.t(i8, a7.c.f273k) != a7.c.f273k) {
                        iVar.x(i8, true);
                    }
                    return 5;
                }
                if (iVar.r(i8, objW, a7.c.f266d)) {
                    return 1;
                }
            }
        }
    }

    private final void i0(long j8) {
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f243f;
        do {
            j9 = atomicLongFieldUpdater.get(this);
            if (j9 >= j8) {
                return;
            }
        } while (!f243f.compareAndSet(this, j9, j8));
    }

    private final void j0(long j8) {
        long j9;
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f242e;
        do {
            j9 = atomicLongFieldUpdater.get(this);
            j10 = 1152921504606846975L & j9;
            if (j10 >= j8) {
                return;
            }
        } while (!f242e.compareAndSet(this, j9, a7.c.u(j10, (int) (j9 >> 60))));
    }

    private final boolean n(long j8) {
        return j8 < y() || j8 < B() + ((long) this.f251b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r0 = d7.n.c(r0, r4);
        r9.x(r3, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void o(a7.i<E> r9, long r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r0 = d7.n.b(r0, r1, r0)
        L6:
            r2 = -1
            if (r9 == 0) goto L68
            int r3 = a7.c.f264b
            int r3 = r3 - r1
        Lc:
            if (r2 >= r3) goto L61
            long r4 = r9.f21017c
            int r6 = a7.c.f264b
            long r6 = (long) r6
            long r4 = r4 * r6
            long r6 = (long) r3
            long r4 = r4 + r6
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 < 0) goto L68
        L1b:
            java.lang.Object r4 = r9.w(r3)
            if (r4 == 0) goto L51
            d7.h0 r5 = a7.c.i()
            if (r4 != r5) goto L28
            goto L51
        L28:
            boolean r5 = r4 instanceof a7.p
            if (r5 == 0) goto L42
            d7.h0 r5 = a7.c.x()
            boolean r5 = r9.r(r3, r4, r5)
            if (r5 == 0) goto L1b
            a7.p r4 = (a7.p) r4
            y6.f2 r4 = r4.f295a
        L3a:
            java.lang.Object r0 = d7.n.c(r0, r4)
            r9.x(r3, r1)
            goto L5e
        L42:
            boolean r5 = r4 instanceof y6.f2
            if (r5 == 0) goto L5e
            d7.h0 r5 = a7.c.x()
            boolean r5 = r9.r(r3, r4, r5)
            if (r5 == 0) goto L1b
            goto L3a
        L51:
            d7.h0 r5 = a7.c.x()
            boolean r4 = r9.r(r3, r4, r5)
            if (r4 == 0) goto L1b
            r9.p()
        L5e:
            int r3 = r3 + (-1)
            goto Lc
        L61:
            d7.e r9 = r9.g()
            a7.i r9 = (a7.i) r9
            goto L6
        L68:
            if (r0 == 0) goto L8e
            boolean r9 = r0 instanceof java.util.ArrayList
            if (r9 != 0) goto L74
            y6.f2 r0 = (y6.f2) r0
            r8.W(r0)
            goto L8e
        L74:
            java.lang.String r9 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.q.d(r0, r9)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r9 = r0.size()
            int r9 = r9 - r1
        L80:
            if (r2 >= r9) goto L8e
            java.lang.Object r10 = r0.get(r9)
            y6.f2 r10 = (y6.f2) r10
            r8.W(r10)
            int r9 = r9 + (-1)
            goto L80
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.b.o(a7.i, long):void");
    }

    private final i<E> p() {
        Object obj = f248k.get(this);
        i iVar = (i) f246i.get(this);
        if (iVar.f21017c > ((i) obj).f21017c) {
            obj = iVar;
        }
        i iVar2 = (i) f247j.get(this);
        if (iVar2.f21017c > ((i) obj).f21017c) {
            obj = iVar2;
        }
        return (i) d7.d.b((d7.e) obj);
    }

    private final void q(long j8) {
        V(r(j8));
    }

    private final i<E> r(long j8) {
        i<E> iVarP = p();
        if (N()) {
            long jP = P(iVarP);
            if (jP != -1) {
                t(jP);
            }
        }
        o(iVarP, j8);
        return iVarP;
    }

    private final void s() {
        L();
    }

    private final void u() {
        if (O()) {
            return;
        }
        i<E> iVar = (i) f248k.get(this);
        while (true) {
            long andIncrement = f244g.getAndIncrement(this);
            int i8 = a7.c.f264b;
            long j8 = andIncrement / ((long) i8);
            long jD = D();
            long j9 = iVar.f21017c;
            if (jD <= andIncrement) {
                if (j9 < j8 && iVar.e() != 0) {
                    Q(j8, iVar);
                }
                G(this, 0L, 1, null);
                return;
            }
            if (j9 != j8) {
                i<E> iVarV = v(j8, iVar, andIncrement);
                if (iVarV == null) {
                    continue;
                } else {
                    iVar = iVarV;
                }
            }
            boolean zC0 = c0(iVar, (int) (andIncrement % ((long) i8)), andIncrement);
            G(this, 0L, 1, null);
            if (zC0) {
                return;
            }
        }
    }

    private final i<E> v(long j8, i<E> iVar, long j9) {
        Object objC;
        boolean z7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f248k;
        p6.p pVar = (p6.p) a7.c.w();
        do {
            objC = d7.d.c(iVar, j8, pVar);
            if (f0.c(objC)) {
                break;
            }
            e0 e0VarB = f0.b(objC);
            while (true) {
                e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                if (e0Var.f21017c >= e0VarB.f21017c) {
                    break;
                }
                if (!e0VarB.q()) {
                    z7 = false;
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e0Var, e0VarB)) {
                    if (e0Var.m()) {
                        e0Var.k();
                    }
                } else if (e0VarB.m()) {
                    e0VarB.k();
                }
            }
            z7 = true;
        } while (!z7);
        if (f0.c(objC)) {
            s();
            Q(j8, iVar);
        } else {
            i<E> iVar2 = (i) f0.b(objC);
            long j10 = iVar2.f21017c;
            if (j10 <= j8) {
                return iVar2;
            }
            int i8 = a7.c.f264b;
            if (f244g.compareAndSet(this, j9 + 1, ((long) i8) * j10)) {
                F((iVar2.f21017c * ((long) i8)) - j9);
                return null;
            }
        }
        G(this, 0L, 1, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i<E> w(long j8, i<E> iVar) {
        Object objC;
        boolean z7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f247j;
        p6.p pVar = (p6.p) a7.c.w();
        do {
            objC = d7.d.c(iVar, j8, pVar);
            if (!f0.c(objC)) {
                e0 e0VarB = f0.b(objC);
                while (true) {
                    e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                    z7 = true;
                    if (e0Var.f21017c >= e0VarB.f21017c) {
                        break;
                    }
                    if (!e0VarB.q()) {
                        z7 = false;
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e0Var, e0VarB)) {
                        if (e0Var.m()) {
                            e0Var.k();
                        }
                    } else if (e0VarB.m()) {
                        e0VarB.k();
                    }
                }
            } else {
                break;
            }
        } while (!z7);
        if (f0.c(objC)) {
            s();
            if (iVar.f21017c * ((long) a7.c.f264b) >= D()) {
                return null;
            }
        } else {
            iVar = (i) f0.b(objC);
            if (!O() && j8 <= y() / ((long) a7.c.f264b)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f248k;
                while (true) {
                    e0 e0Var2 = (e0) atomicReferenceFieldUpdater2.get(this);
                    if (e0Var2.f21017c >= iVar.f21017c || !iVar.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, e0Var2, iVar)) {
                        if (e0Var2.m()) {
                            e0Var2.k();
                        }
                    } else if (iVar.m()) {
                        iVar.k();
                    }
                }
            }
            long j9 = iVar.f21017c;
            if (j9 <= j8) {
                return iVar;
            }
            int i8 = a7.c.f264b;
            i0(j9 * ((long) i8));
            if (iVar.f21017c * ((long) i8) >= D()) {
                return null;
            }
        }
        iVar.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i<E> x(long j8, i<E> iVar) {
        Object objC;
        boolean z7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f246i;
        p6.p pVar = (p6.p) a7.c.w();
        do {
            objC = d7.d.c(iVar, j8, pVar);
            if (!f0.c(objC)) {
                e0 e0VarB = f0.b(objC);
                while (true) {
                    e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                    z7 = true;
                    if (e0Var.f21017c >= e0VarB.f21017c) {
                        break;
                    }
                    if (!e0VarB.q()) {
                        z7 = false;
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e0Var, e0VarB)) {
                        if (e0Var.m()) {
                            e0Var.k();
                        }
                    } else if (e0VarB.m()) {
                        e0VarB.k();
                    }
                }
            } else {
                break;
            }
        } while (!z7);
        if (f0.c(objC)) {
            s();
            if (iVar.f21017c * ((long) a7.c.f264b) >= B()) {
                return null;
            }
        } else {
            iVar = (i) f0.b(objC);
            long j9 = iVar.f21017c;
            if (j9 <= j8) {
                return iVar;
            }
            int i8 = a7.c.f264b;
            j0(j9 * ((long) i8));
            if (iVar.f21017c * ((long) i8) >= B()) {
                return null;
            }
        }
        iVar.b();
        return null;
    }

    private final long y() {
        return f244g.get(this);
    }

    public final long B() {
        return f243f.get(this);
    }

    protected final Throwable C() {
        Throwable thZ = z();
        return thZ == null ? new k("Channel was closed") : thZ;
    }

    public final long D() {
        return f242e.get(this) & 1152921504606846975L;
    }

    public final boolean E() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f247j;
            i<E> iVarW = (i) atomicReferenceFieldUpdater.get(this);
            long jB = B();
            if (D() <= jB) {
                return false;
            }
            int i8 = a7.c.f264b;
            long j8 = jB / ((long) i8);
            if (iVarW.f21017c == j8 || (iVarW = w(j8, iVarW)) != null) {
                iVarW.b();
                if (H(iVarW, (int) (jB % ((long) i8)), jB)) {
                    return true;
                }
                f243f.compareAndSet(this, jB, jB + 1);
            } else if (((i) atomicReferenceFieldUpdater.get(this)).f21017c < j8) {
                return false;
            }
        }
    }

    public boolean J() {
        return K(f242e.get(this));
    }

    public boolean L() {
        return M(f242e.get(this));
    }

    protected boolean N() {
        return false;
    }

    protected void R() {
    }

    protected void S() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
    
        return a7.g.f286b.c(e6.i0.f21430a);
     */
    @Override // a7.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = a7.b.f242e
            long r0 = r0.get(r14)
            boolean r0 = r14.Z(r0)
            if (r0 == 0) goto L13
            a7.g$b r15 = a7.g.f286b
            java.lang.Object r15 = r15.b()
            return r15
        L13:
            d7.h0 r8 = a7.c.h()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = g()
            java.lang.Object r0 = r0.get(r14)
            a7.i r0 = (a7.i) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = h()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = i(r14, r1)
            int r1 = a7.c.f264b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f21017c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L4e
            a7.i r1 = c(r14, r2, r0)
            if (r1 != 0) goto L4c
            if (r11 == 0) goto L21
            goto L8e
        L4c:
            r13 = r1
            goto L4f
        L4e:
            r13 = r0
        L4f:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = m(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb0
            r1 = 1
            if (r0 == r1) goto Lb3
            r1 = 2
            if (r0 == r1) goto L89
            r1 = 3
            if (r0 == r1) goto L7d
            r1 = 4
            if (r0 == r1) goto L71
            r1 = 5
            if (r0 == r1) goto L6c
            goto L6f
        L6c:
            r13.b()
        L6f:
            r0 = r13
            goto L21
        L71:
            long r0 = r14.B()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L8e
            r13.b()
            goto L8e
        L7d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L89:
            if (r11 == 0) goto L99
            r13.p()
        L8e:
            a7.g$b r15 = a7.g.f286b
            java.lang.Throwable r0 = r14.C()
            java.lang.Object r15 = r15.a(r0)
            goto Lbb
        L99:
            boolean r15 = r8 instanceof y6.f2
            if (r15 == 0) goto La0
            y6.f2 r8 = (y6.f2) r8
            goto La1
        La0:
            r8 = 0
        La1:
            if (r8 == 0) goto La6
            k(r14, r8, r13, r12)
        La6:
            r13.p()
            a7.g$b r15 = a7.g.f286b
            java.lang.Object r15 = r15.b()
            goto Lbb
        Lb0:
            r13.b()
        Lb3:
            a7.g$b r15 = a7.g.f286b
            e6.i0 r0 = e6.i0.f21430a
            java.lang.Object r15 = r15.c(r0)
        Lbb:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.b.a(java.lang.Object):java.lang.Object");
    }

    @Override // a7.n
    public e<E> iterator() {
        return new a();
    }

    public final void k0(long j8) {
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        if (O()) {
            return;
        }
        while (y() <= j8) {
        }
        int i8 = a7.c.f265c;
        for (int i9 = 0; i9 < i8; i9++) {
            long jY = y();
            if (jY == (f245h.get(this) & 4611686018427387903L) && jY == y()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f245h;
        do {
            j9 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j9, a7.c.t(j9 & 4611686018427387903L, true)));
        while (true) {
            long jY2 = y();
            atomicLongFieldUpdater = f245h;
            long j11 = atomicLongFieldUpdater.get(this);
            long j12 = j11 & 4611686018427387903L;
            boolean z7 = (4611686018427387904L & j11) != 0;
            if (jY2 == j12 && jY2 == y()) {
                break;
            } else if (!z7) {
                atomicLongFieldUpdater.compareAndSet(this, j11, a7.c.t(j12, true));
            }
        }
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, a7.c.t(j10 & 4611686018427387903L, false)));
    }

    protected final void t(long j8) {
        q0 q0VarD;
        i<E> iVar = (i) f247j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f243f;
            long j9 = atomicLongFieldUpdater.get(this);
            if (j8 < Math.max(((long) this.f251b) + j9, y())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j9, j9 + 1)) {
                int i8 = a7.c.f264b;
                long j10 = j9 / ((long) i8);
                int i9 = (int) (j9 % ((long) i8));
                if (iVar.f21017c != j10) {
                    i<E> iVarW = w(j10, iVar);
                    if (iVarW == null) {
                        continue;
                    } else {
                        iVar = iVarW;
                    }
                }
                Object objE0 = e0(iVar, i9, j9, null);
                if (objE0 != a7.c.f277o) {
                    iVar.b();
                    p6.l<E, i0> lVar = this.f252c;
                    if (lVar != null && (q0VarD = z.d(lVar, objE0, null, 2, null)) != null) {
                        throw q0VarD;
                    }
                } else if (j9 < D()) {
                    iVar.b();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01da, code lost:
    
        r3 = (a7.i) r3.e();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.b.toString():java.lang.String");
    }

    protected final Throwable z() {
        return (Throwable) f249l.get(this);
    }
}
