package y6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y6.j1;

/* JADX INFO: loaded from: classes2.dex */
public class k<T> extends p0<T> implements j<T>, kotlin.coroutines.jvm.internal.e, f2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f27504f = AtomicIntegerFieldUpdater.newUpdater(k.class, "_decisionAndIndex");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f27505g = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_state");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f27506h = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h6.d<T> f27507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h6.g f27508e;

    /* JADX WARN: Multi-variable type inference failed */
    public k(h6.d<? super T> dVar, int i8) {
        super(i8);
        this.f27507d = dVar;
        this.f27508e = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = d.f27484a;
    }

    private final boolean B() {
        if (q0.c(this.f27517c)) {
            h6.d<T> dVar = this.f27507d;
            kotlin.jvm.internal.q.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((d7.j) dVar).m()) {
                return true;
            }
        }
        return false;
    }

    private final void C(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void I(Object obj, int i8, p6.l<? super Throwable, e6.i0> lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27505g;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof x1)) {
                if (obj2 instanceof n) {
                    n nVar = (n) obj2;
                    if (nVar.c()) {
                        if (lVar != null) {
                            l(lVar, nVar.f27552a);
                            return;
                        }
                        return;
                    }
                }
                j(obj);
                throw new e6.h();
            }
        } while (!androidx.concurrent.futures.b.a(f27505g, this, obj2, K((x1) obj2, obj, i8, lVar, null)));
        q();
        r(i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void J(k kVar, Object obj, int i8, p6.l lVar, int i9, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i9 & 4) != 0) {
            lVar = null;
        }
        kVar.I(obj, i8, lVar);
    }

    private final Object K(x1 x1Var, Object obj, int i8, p6.l<? super Throwable, e6.i0> lVar, Object obj2) {
        if (obj instanceof u) {
            return obj;
        }
        if (!q0.b(i8) && obj2 == null) {
            return obj;
        }
        if (lVar == null && !(x1Var instanceof h) && obj2 == null) {
            return obj;
        }
        return new t(obj, x1Var instanceof h ? (h) x1Var : null, lVar, obj2, null, 16, null);
    }

    private final boolean L() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f27504f;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f27504f.compareAndSet(this, i8, 1073741824 + (536870911 & i8)));
        return true;
    }

    private final d7.h0 M(Object obj, Object obj2, p6.l<? super Throwable, e6.i0> lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27505g;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof x1)) {
                if ((obj3 instanceof t) && obj2 != null && ((t) obj3).f27548d == obj2) {
                    return l.f27512a;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f27505g, this, obj3, K((x1) obj3, obj, this.f27517c, lVar, obj2)));
        q();
        return l.f27512a;
    }

    private final boolean N() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f27504f;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f27504f.compareAndSet(this, i8, 536870912 + (536870911 & i8)));
        return true;
    }

    private final Void j(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void m(d7.e0<?> e0Var, Throwable th) {
        int i8 = f27504f.get(this) & 536870911;
        if (!(i8 != 536870911)) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            e0Var.o(i8, th, getContext());
        } catch (Throwable th2) {
            d0.a(getContext(), new x("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean o(Throwable th) {
        if (!B()) {
            return false;
        }
        h6.d<T> dVar = this.f27507d;
        kotlin.jvm.internal.q.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((d7.j) dVar).n(th);
    }

    private final void q() {
        if (B()) {
            return;
        }
        p();
    }

    private final void r(int i8) {
        if (L()) {
            return;
        }
        q0.a(this, i8);
    }

    private final t0 t() {
        return (t0) f27506h.get(this);
    }

    private final String w() {
        Object objV = v();
        return objV instanceof x1 ? "Active" : objV instanceof n ? "Cancelled" : "Completed";
    }

    private final t0 y() {
        j1 j1Var = (j1) getContext().a(j1.V);
        if (j1Var == null) {
            return null;
        }
        t0 t0VarD = j1.a.d(j1Var, true, false, new o(this), 2, null);
        androidx.concurrent.futures.b.a(f27506h, this, null, t0VarD);
        return t0VarD;
    }

    private final void z(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27505g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof d)) {
                if (obj2 instanceof h ? true : obj2 instanceof d7.e0) {
                    C(obj, obj2);
                } else {
                    boolean z7 = obj2 instanceof u;
                    if (z7) {
                        u uVar = (u) obj2;
                        if (!uVar.b()) {
                            C(obj, obj2);
                        }
                        if (obj2 instanceof n) {
                            if (!z7) {
                                uVar = null;
                            }
                            Throwable th = uVar != null ? uVar.f27552a : null;
                            if (obj instanceof h) {
                                k((h) obj, th);
                                return;
                            } else {
                                kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                m((d7.e0) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof t) {
                        t tVar = (t) obj2;
                        if (tVar.f27546b != null) {
                            C(obj, obj2);
                        }
                        if (obj instanceof d7.e0) {
                            return;
                        }
                        kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        h hVar = (h) obj;
                        if (tVar.c()) {
                            k(hVar, tVar.f27549e);
                            return;
                        } else {
                            if (androidx.concurrent.futures.b.a(f27505g, this, obj2, t.b(tVar, null, hVar, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof d7.e0) {
                            return;
                        }
                        kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (androidx.concurrent.futures.b.a(f27505g, this, obj2, new t(obj2, (h) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (androidx.concurrent.futures.b.a(f27505g, this, obj2, obj)) {
                return;
            }
        }
    }

    public boolean A() {
        return !(v() instanceof x1);
    }

    protected String D() {
        return "CancellableContinuation";
    }

    public final void E(Throwable th) {
        if (o(th)) {
            return;
        }
        n(th);
        q();
    }

    public final void F() {
        Throwable thP;
        h6.d<T> dVar = this.f27507d;
        d7.j jVar = dVar instanceof d7.j ? (d7.j) dVar : null;
        if (jVar == null || (thP = jVar.p(this)) == null) {
            return;
        }
        p();
        n(thP);
    }

    public final boolean G() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27505g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof t) && ((t) obj).f27548d != null) {
            p();
            return false;
        }
        f27504f.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, d.f27484a);
        return true;
    }

    public void H(T t7, p6.l<? super Throwable, e6.i0> lVar) {
        I(t7, this.f27517c, lVar);
    }

    @Override // y6.p0
    public void a(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27505g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof x1) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof u) {
                return;
            }
            if (obj2 instanceof t) {
                t tVar = (t) obj2;
                if (!(!tVar.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.concurrent.futures.b.a(f27505g, this, obj2, t.b(tVar, null, null, null, null, th, 15, null))) {
                    tVar.d(this, th);
                    return;
                }
            } else if (androidx.concurrent.futures.b.a(f27505g, this, obj2, new t(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // y6.j
    public Object b(T t7, Object obj, p6.l<? super Throwable, e6.i0> lVar) {
        return M(t7, obj, lVar);
    }

    @Override // y6.f2
    public void c(d7.e0<?> e0Var, int i8) {
        int i9;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f27504f;
        do {
            i9 = atomicIntegerFieldUpdater.get(this);
            if (!((i9 & 536870911) == 536870911)) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, ((i9 >> 29) << 29) + i8));
        z(e0Var);
    }

    @Override // y6.p0
    public final h6.d<T> d() {
        return this.f27507d;
    }

    @Override // y6.j
    public void e(Object obj) {
        r(this.f27517c);
    }

    @Override // y6.p0
    public Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y6.p0
    public <T> T g(Object obj) {
        return obj instanceof t ? (T) ((t) obj).f27545a : obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        h6.d<T> dVar = this.f27507d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // h6.d
    public h6.g getContext() {
        return this.f27508e;
    }

    @Override // y6.p0
    public Object i() {
        return v();
    }

    public final void k(h hVar, Throwable th) {
        try {
            hVar.b(th);
        } catch (Throwable th2) {
            d0.a(getContext(), new x("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(p6.l<? super Throwable, e6.i0> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            d0.a(getContext(), new x("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public boolean n(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27505g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof x1)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f27505g, this, obj, new n(this, th, (obj instanceof h) || (obj instanceof d7.e0))));
        x1 x1Var = (x1) obj;
        if (x1Var instanceof h) {
            k((h) obj, th);
        } else if (x1Var instanceof d7.e0) {
            m((d7.e0) obj, th);
        }
        q();
        r(this.f27517c);
        return true;
    }

    public final void p() {
        t0 t0VarT = t();
        if (t0VarT == null) {
            return;
        }
        t0VarT.a();
        f27506h.set(this, w1.f27565a);
    }

    @Override // h6.d
    public void resumeWith(Object obj) {
        J(this, y.c(obj, this), this.f27517c, null, 4, null);
    }

    public Throwable s(j1 j1Var) {
        return j1Var.z();
    }

    public String toString() {
        return D() + '(' + i0.c(this.f27507d) + "){" + w() + "}@" + i0.b(this);
    }

    public final Object u() throws Throwable {
        j1 j1Var;
        boolean zB = B();
        if (N()) {
            if (t() == null) {
                y();
            }
            if (zB) {
                F();
            }
            return i6.d.e();
        }
        if (zB) {
            F();
        }
        Object objV = v();
        if (objV instanceof u) {
            throw ((u) objV).f27552a;
        }
        if (!q0.b(this.f27517c) || (j1Var = (j1) getContext().a(j1.V)) == null || j1Var.c()) {
            return g(objV);
        }
        CancellationException cancellationExceptionZ = j1Var.z();
        a(objV, cancellationExceptionZ);
        throw cancellationExceptionZ;
    }

    public final Object v() {
        return f27505g.get(this);
    }

    public void x() {
        t0 t0VarY = y();
        if (t0VarY != null && A()) {
            t0VarY.a();
            f27506h.set(this, w1.f27565a);
        }
    }
}
