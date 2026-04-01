package y6;

import d7.s;
import h6.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y6.j1;

/* JADX INFO: loaded from: classes2.dex */
public class q1 implements j1, r, y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f27520a = AtomicReferenceFieldUpdater.newUpdater(q1.class, Object.class, "_state");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f27521b = AtomicReferenceFieldUpdater.newUpdater(q1.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    private static final class a extends p1 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final q1 f27522e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f27523f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final q f27524g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Object f27525h;

        public a(q1 q1Var, b bVar, q qVar, Object obj) {
            this.f27522e = q1Var;
            this.f27523f = bVar;
            this.f27524g = qVar;
            this.f27525h = obj;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ e6.i0 invoke(Throwable th) {
            s(th);
            return e6.i0.f21430a;
        }

        @Override // y6.w
        public void s(Throwable th) {
            this.f27522e.x(this.f27523f, this.f27524g, this.f27525h);
        }
    }

    private static final class b implements f1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f27526b = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isCompleting");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f27527c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_rootCause");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f27528d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v1 f27529a;

        public b(v1 v1Var, boolean z7, Throwable th) {
            this.f27529a = v1Var;
            this._isCompleting = z7 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> b() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return f27528d.get(this);
        }

        private final void l(Object obj) {
            f27528d.set(this, obj);
        }

        public final void a(Throwable th) {
            Throwable thF = f();
            if (thF == null) {
                m(th);
                return;
            }
            if (th == thF) {
                return;
            }
            Object objD = d();
            if (objD == null) {
                l(th);
                return;
            }
            if (objD instanceof Throwable) {
                if (th == objD) {
                    return;
                }
                ArrayList<Throwable> arrayListB = b();
                arrayListB.add(objD);
                arrayListB.add(th);
                l(arrayListB);
                return;
            }
            if (objD instanceof ArrayList) {
                ((ArrayList) objD).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objD).toString());
        }

        @Override // y6.f1
        public boolean c() {
            return f() == null;
        }

        @Override // y6.f1
        public v1 e() {
            return this.f27529a;
        }

        public final Throwable f() {
            return (Throwable) f27527c.get(this);
        }

        public final boolean g() {
            return f() != null;
        }

        public final boolean h() {
            return f27526b.get(this) != 0;
        }

        public final boolean i() {
            return d() == r1.f27537e;
        }

        public final List<Throwable> j(Throwable th) {
            ArrayList<Throwable> arrayListB;
            Object objD = d();
            if (objD == null) {
                arrayListB = b();
            } else if (objD instanceof Throwable) {
                ArrayList<Throwable> arrayListB2 = b();
                arrayListB2.add(objD);
                arrayListB = arrayListB2;
            } else {
                if (!(objD instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objD).toString());
                }
                arrayListB = (ArrayList) objD;
            }
            Throwable thF = f();
            if (thF != null) {
                arrayListB.add(0, thF);
            }
            if (th != null && !kotlin.jvm.internal.q.b(th, thF)) {
                arrayListB.add(th);
            }
            l(r1.f27537e);
            return arrayListB;
        }

        public final void k(boolean z7) {
            f27526b.set(this, z7 ? 1 : 0);
        }

        public final void m(Throwable th) {
            f27527c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + f() + ", exceptions=" + d() + ", list=" + e() + ']';
        }
    }

    public static final class c extends s.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q1 f27530d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f27531e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d7.s sVar, q1 q1Var, Object obj) {
            super(sVar);
            this.f27530d = q1Var;
            this.f27531e = obj;
        }

        @Override // d7.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object d(d7.s sVar) {
            if (this.f27530d.O() == this.f27531e) {
                return null;
            }
            return d7.r.a();
        }
    }

    public q1(boolean z7) {
        this._state = z7 ? r1.f27539g : r1.f27538f;
    }

    private final Object A(b bVar, Object obj) throws Throwable {
        boolean zG;
        Throwable thF;
        u uVar = obj instanceof u ? (u) obj : null;
        Throwable th = uVar != null ? uVar.f27552a : null;
        synchronized (bVar) {
            zG = bVar.g();
            List<Throwable> listJ = bVar.j(th);
            thF = F(bVar, listJ);
            if (thF != null) {
                k(thF, listJ);
            }
        }
        if (thF != null && thF != th) {
            obj = new u(thF, false, 2, null);
        }
        if (thF != null) {
            if (r(thF) || S(thF)) {
                kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((u) obj).b();
            }
        }
        if (!zG) {
            h0(thF);
        }
        i0(obj);
        androidx.concurrent.futures.b.a(f27520a, this, bVar, r1.g(obj));
        v(bVar, obj);
        return obj;
    }

    private final q B(f1 f1Var) {
        q qVar = f1Var instanceof q ? (q) f1Var : null;
        if (qVar != null) {
            return qVar;
        }
        v1 v1VarE = f1Var.e();
        if (v1VarE != null) {
            return e0(v1VarE);
        }
        return null;
    }

    private final Throwable D(Object obj) {
        u uVar = obj instanceof u ? (u) obj : null;
        if (uVar != null) {
            return uVar.f27552a;
        }
        return null;
    }

    private final Throwable F(b bVar, List<? extends Throwable> list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (bVar.g()) {
                return new k1(s(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : list.get(0);
    }

    private final v1 K(f1 f1Var) {
        v1 v1VarE = f1Var.e();
        if (v1VarE != null) {
            return v1VarE;
        }
        if (f1Var instanceof u0) {
            return new v1();
        }
        if (f1Var instanceof p1) {
            l0((p1) f1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + f1Var).toString());
    }

    private final Object a0(Object obj) throws Throwable {
        Throwable thY = null;
        while (true) {
            Object objO = O();
            if (objO instanceof b) {
                synchronized (objO) {
                    if (((b) objO).i()) {
                        return r1.f27536d;
                    }
                    boolean zG = ((b) objO).g();
                    if (obj != null || !zG) {
                        if (thY == null) {
                            thY = y(obj);
                        }
                        ((b) objO).a(thY);
                    }
                    Throwable thF = zG ^ true ? ((b) objO).f() : null;
                    if (thF != null) {
                        f0(((b) objO).e(), thF);
                    }
                    return r1.f27533a;
                }
            }
            if (!(objO instanceof f1)) {
                return r1.f27536d;
            }
            if (thY == null) {
                thY = y(obj);
            }
            f1 f1Var = (f1) objO;
            if (!f1Var.c()) {
                Object objV0 = v0(objO, new u(thY, false, 2, null));
                if (objV0 == r1.f27533a) {
                    throw new IllegalStateException(("Cannot happen in " + objO).toString());
                }
                if (objV0 != r1.f27535c) {
                    return objV0;
                }
            } else if (u0(f1Var, thY)) {
                return r1.f27533a;
            }
        }
    }

    private final p1 c0(p6.l<? super Throwable, e6.i0> lVar, boolean z7) {
        p1 i1Var;
        if (z7) {
            i1Var = lVar instanceof l1 ? (l1) lVar : null;
            if (i1Var == null) {
                i1Var = new h1(lVar);
            }
        } else {
            i1Var = lVar instanceof p1 ? (p1) lVar : null;
            if (i1Var == null) {
                i1Var = new i1(lVar);
            }
        }
        i1Var.u(this);
        return i1Var;
    }

    private final q e0(d7.s sVar) {
        while (sVar.n()) {
            sVar = sVar.m();
        }
        while (true) {
            sVar = sVar.l();
            if (!sVar.n()) {
                if (sVar instanceof q) {
                    return (q) sVar;
                }
                if (sVar instanceof v1) {
                    return null;
                }
            }
        }
    }

    private final void f0(v1 v1Var, Throwable th) throws Throwable {
        h0(th);
        Object objK = v1Var.k();
        kotlin.jvm.internal.q.d(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        x xVar = null;
        for (d7.s sVarL = (d7.s) objK; !kotlin.jvm.internal.q.b(sVarL, v1Var); sVarL = sVarL.l()) {
            if (sVarL instanceof l1) {
                p1 p1Var = (p1) sVarL;
                try {
                    p1Var.s(th);
                } catch (Throwable th2) {
                    if (xVar != null) {
                        e6.f.a(xVar, th2);
                    } else {
                        xVar = new x("Exception in completion handler " + p1Var + " for " + this, th2);
                        e6.i0 i0Var = e6.i0.f21430a;
                    }
                }
            }
        }
        if (xVar != null) {
            T(xVar);
        }
        r(th);
    }

    private final void g0(v1 v1Var, Throwable th) throws Throwable {
        Object objK = v1Var.k();
        kotlin.jvm.internal.q.d(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        x xVar = null;
        for (d7.s sVarL = (d7.s) objK; !kotlin.jvm.internal.q.b(sVarL, v1Var); sVarL = sVarL.l()) {
            if (sVarL instanceof p1) {
                p1 p1Var = (p1) sVarL;
                try {
                    p1Var.s(th);
                } catch (Throwable th2) {
                    if (xVar != null) {
                        e6.f.a(xVar, th2);
                    } else {
                        xVar = new x("Exception in completion handler " + p1Var + " for " + this, th2);
                        e6.i0 i0Var = e6.i0.f21430a;
                    }
                }
            }
        }
        if (xVar != null) {
            T(xVar);
        }
    }

    private final boolean i(Object obj, v1 v1Var, p1 p1Var) {
        int iR;
        c cVar = new c(p1Var, this, obj);
        do {
            iR = v1Var.m().r(p1Var, v1Var, cVar);
            if (iR == 1) {
                return true;
            }
        } while (iR != 2);
        return false;
    }

    private final void k(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                e6.f.a(th, th2);
            }
        }
    }

    private final void k0(u0 u0Var) {
        v1 v1Var = new v1();
        Object e1Var = v1Var;
        if (!u0Var.c()) {
            e1Var = new e1(v1Var);
        }
        androidx.concurrent.futures.b.a(f27520a, this, u0Var, e1Var);
    }

    private final void l0(p1 p1Var) {
        p1Var.g(new v1());
        androidx.concurrent.futures.b.a(f27520a, this, p1Var, p1Var.l());
    }

    private final int o0(Object obj) {
        if (obj instanceof u0) {
            if (((u0) obj).c()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f27520a, this, obj, r1.f27539g)) {
                return -1;
            }
            j0();
            return 1;
        }
        if (!(obj instanceof e1)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f27520a, this, obj, ((e1) obj).e())) {
            return -1;
        }
        j0();
        return 1;
    }

    private final Object p(Object obj) {
        Object objV0;
        do {
            Object objO = O();
            if (!(objO instanceof f1) || ((objO instanceof b) && ((b) objO).h())) {
                return r1.f27533a;
            }
            objV0 = v0(objO, new u(y(obj), false, 2, null));
        } while (objV0 == r1.f27535c);
        return objV0;
    }

    private final String p0(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof f1 ? ((f1) obj).c() ? "Active" : "New" : obj instanceof u ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.g() ? "Cancelling" : bVar.h() ? "Completing" : "Active";
    }

    private final boolean r(Throwable th) {
        if (Z()) {
            return true;
        }
        boolean z7 = th instanceof CancellationException;
        p pVarL = L();
        return (pVarL == null || pVarL == w1.f27565a) ? z7 : pVarL.d(th) || z7;
    }

    public static /* synthetic */ CancellationException r0(q1 q1Var, Throwable th, String str, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i8 & 1) != 0) {
            str = null;
        }
        return q1Var.q0(th, str);
    }

    private final boolean t0(f1 f1Var, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.b.a(f27520a, this, f1Var, r1.g(obj))) {
            return false;
        }
        h0(null);
        i0(obj);
        v(f1Var, obj);
        return true;
    }

    private final boolean u0(f1 f1Var, Throwable th) throws Throwable {
        v1 v1VarK = K(f1Var);
        if (v1VarK == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f27520a, this, f1Var, new b(v1VarK, false, th))) {
            return false;
        }
        f0(v1VarK, th);
        return true;
    }

    private final void v(f1 f1Var, Object obj) throws Throwable {
        p pVarL = L();
        if (pVarL != null) {
            pVarL.a();
            n0(w1.f27565a);
        }
        u uVar = obj instanceof u ? (u) obj : null;
        Throwable th = uVar != null ? uVar.f27552a : null;
        if (!(f1Var instanceof p1)) {
            v1 v1VarE = f1Var.e();
            if (v1VarE != null) {
                g0(v1VarE, th);
                return;
            }
            return;
        }
        try {
            ((p1) f1Var).s(th);
        } catch (Throwable th2) {
            T(new x("Exception in completion handler " + f1Var + " for " + this, th2));
        }
    }

    private final Object v0(Object obj, Object obj2) {
        return !(obj instanceof f1) ? r1.f27533a : ((!(obj instanceof u0) && !(obj instanceof p1)) || (obj instanceof q) || (obj2 instanceof u)) ? w0((f1) obj, obj2) : t0((f1) obj, obj2) ? obj2 : r1.f27535c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, y6.q1] */
    private final Object w0(f1 f1Var, Object obj) throws Throwable {
        v1 v1VarK = K(f1Var);
        if (v1VarK == null) {
            return r1.f27535c;
        }
        b bVar = f1Var instanceof b ? (b) f1Var : null;
        if (bVar == null) {
            bVar = new b(v1VarK, false, null);
        }
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        synchronized (bVar) {
            if (bVar.h()) {
                return r1.f27533a;
            }
            bVar.k(true);
            if (bVar != f1Var && !androidx.concurrent.futures.b.a(f27520a, this, f1Var, bVar)) {
                return r1.f27535c;
            }
            boolean zG = bVar.g();
            u uVar = obj instanceof u ? (u) obj : null;
            if (uVar != null) {
                bVar.a(uVar.f27552a);
            }
            ?? F = Boolean.valueOf(zG ? false : true).booleanValue() ? bVar.f() : 0;
            yVar.f24325a = F;
            e6.i0 i0Var = e6.i0.f21430a;
            if (F != 0) {
                f0(v1VarK, F);
            }
            q qVarB = B(f1Var);
            return (qVarB == null || !x0(bVar, qVarB, obj)) ? A(bVar, obj) : r1.f27534b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(b bVar, q qVar, Object obj) {
        q qVarE0 = e0(qVar);
        if (qVarE0 == null || !x0(bVar, qVarE0, obj)) {
            l(A(bVar, obj));
        }
    }

    private final boolean x0(b bVar, q qVar, Object obj) {
        while (j1.a.d(qVar.f27519e, false, false, new a(this, bVar, qVar, obj), 1, null) == w1.f27565a) {
            qVar = e0(qVar);
            if (qVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable y(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new k1(s(), null, this) : th;
        }
        kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((y1) obj).W();
    }

    public final Object C() throws Throwable {
        Object objO = O();
        if (!(!(objO instanceof f1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (objO instanceof u) {
            throw ((u) objO).f27552a;
        }
        return r1.h(objO);
    }

    @Override // h6.g
    public h6.g E(g.c<?> cVar) {
        return j1.a.e(this, cVar);
    }

    @Override // y6.j1
    public final t0 G(p6.l<? super Throwable, e6.i0> lVar) {
        return w(false, true, lVar);
    }

    public boolean H() {
        return true;
    }

    public boolean I() {
        return false;
    }

    public final p L() {
        return (p) f27521b.get(this);
    }

    @Override // y6.j1
    public final p N(r rVar) {
        t0 t0VarD = j1.a.d(this, true, false, new q(rVar), 2, null);
        kotlin.jvm.internal.q.d(t0VarD, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (p) t0VarD;
    }

    public final Object O() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27520a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof d7.a0)) {
                return obj;
            }
            ((d7.a0) obj).a(this);
        }
    }

    @Override // h6.g
    public <R> R P(R r8, p6.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) j1.a.b(this, r8, pVar);
    }

    @Override // y6.r
    public final void R(y1 y1Var) throws Throwable {
        m(y1Var);
    }

    protected boolean S(Throwable th) {
        return false;
    }

    public void T(Throwable th) throws Throwable {
        throw th;
    }

    protected final void U(j1 j1Var) {
        if (j1Var == null) {
            n0(w1.f27565a);
            return;
        }
        j1Var.start();
        p pVarN = j1Var.N(this);
        n0(pVarN);
        if (V()) {
            pVarN.a();
            n0(w1.f27565a);
        }
    }

    public final boolean V() {
        return !(O() instanceof f1);
    }

    @Override // y6.y1
    public CancellationException W() {
        Throwable thF;
        Object objO = O();
        if (objO instanceof b) {
            thF = ((b) objO).f();
        } else if (objO instanceof u) {
            thF = ((u) objO).f27552a;
        } else {
            if (objO instanceof f1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objO).toString());
            }
            thF = null;
        }
        CancellationException cancellationException = thF instanceof CancellationException ? (CancellationException) thF : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new k1("Parent job is " + p0(objO), thF, this);
    }

    @Override // h6.g
    public h6.g X(h6.g gVar) {
        return j1.a.f(this, gVar);
    }

    @Override // y6.j1
    public void Y(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new k1(s(), null, this);
        }
        n(cancellationException);
    }

    protected boolean Z() {
        return false;
    }

    @Override // h6.g.b, h6.g
    public <E extends g.b> E a(g.c<E> cVar) {
        return (E) j1.a.c(this, cVar);
    }

    public final Object b0(Object obj) {
        Object objV0;
        do {
            objV0 = v0(O(), obj);
            if (objV0 == r1.f27533a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, D(obj));
            }
        } while (objV0 == r1.f27535c);
        return objV0;
    }

    @Override // y6.j1
    public boolean c() {
        Object objO = O();
        return (objO instanceof f1) && ((f1) objO).c();
    }

    public String d0() {
        return i0.a(this);
    }

    @Override // h6.g.b
    public final g.c<?> getKey() {
        return j1.V;
    }

    @Override // y6.j1
    public j1 getParent() {
        p pVarL = L();
        if (pVarL != null) {
            return pVarL.getParent();
        }
        return null;
    }

    protected void h0(Throwable th) {
    }

    protected void i0(Object obj) {
    }

    protected void j0() {
    }

    protected void l(Object obj) {
    }

    public final boolean m(Object obj) throws Throwable {
        Object objA0 = r1.f27533a;
        if (I() && (objA0 = p(obj)) == r1.f27534b) {
            return true;
        }
        if (objA0 == r1.f27533a) {
            objA0 = a0(obj);
        }
        if (objA0 == r1.f27533a || objA0 == r1.f27534b) {
            return true;
        }
        if (objA0 == r1.f27536d) {
            return false;
        }
        l(objA0);
        return true;
    }

    public final void m0(p1 p1Var) {
        Object objO;
        do {
            objO = O();
            if (!(objO instanceof p1)) {
                if (!(objO instanceof f1) || ((f1) objO).e() == null) {
                    return;
                }
                p1Var.o();
                return;
            }
            if (objO != p1Var) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f27520a, this, objO, r1.f27539g));
    }

    public void n(Throwable th) throws Throwable {
        m(th);
    }

    public final void n0(p pVar) {
        f27521b.set(this, pVar);
    }

    protected final CancellationException q0(Throwable th, String str) {
        CancellationException k1Var = th instanceof CancellationException ? (CancellationException) th : null;
        if (k1Var == null) {
            if (str == null) {
                str = s();
            }
            k1Var = new k1(str, th, this);
        }
        return k1Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String s() {
        return "Job was cancelled";
    }

    public final String s0() {
        return d0() + '{' + p0(O()) + '}';
    }

    @Override // y6.j1
    public final boolean start() {
        int iO0;
        do {
            iO0 = o0(O());
            if (iO0 == 0) {
                return false;
            }
        } while (iO0 != 1);
        return true;
    }

    public String toString() {
        return s0() + '@' + i0.b(this);
    }

    public boolean u(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m(th) && H();
    }

    @Override // y6.j1
    public final t0 w(boolean z7, boolean z8, p6.l<? super Throwable, e6.i0> lVar) {
        p1 p1VarC0 = c0(lVar, z7);
        while (true) {
            Object objO = O();
            if (objO instanceof u0) {
                u0 u0Var = (u0) objO;
                if (!u0Var.c()) {
                    k0(u0Var);
                } else if (androidx.concurrent.futures.b.a(f27520a, this, objO, p1VarC0)) {
                    return p1VarC0;
                }
            } else {
                if (!(objO instanceof f1)) {
                    if (z8) {
                        u uVar = objO instanceof u ? (u) objO : null;
                        lVar.invoke(uVar != null ? uVar.f27552a : null);
                    }
                    return w1.f27565a;
                }
                v1 v1VarE = ((f1) objO).e();
                if (v1VarE == null) {
                    kotlin.jvm.internal.q.d(objO, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    l0((p1) objO);
                } else {
                    t0 t0Var = w1.f27565a;
                    if (z7 && (objO instanceof b)) {
                        synchronized (objO) {
                            thF = ((b) objO).f();
                            if (thF == null || ((lVar instanceof q) && !((b) objO).h())) {
                                if (i(objO, v1VarE, p1VarC0)) {
                                    if (thF == null) {
                                        return p1VarC0;
                                    }
                                    t0Var = p1VarC0;
                                }
                            }
                            e6.i0 i0Var = e6.i0.f21430a;
                        }
                    }
                    if (thF != null) {
                        if (z8) {
                            lVar.invoke(thF);
                        }
                        return t0Var;
                    }
                    if (i(objO, v1VarE, p1VarC0)) {
                        return p1VarC0;
                    }
                }
            }
        }
    }

    @Override // y6.j1
    public final CancellationException z() {
        Object objO = O();
        if (!(objO instanceof b)) {
            if (objO instanceof f1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objO instanceof u) {
                return r0(this, ((u) objO).f27552a, null, 1, null);
            }
            return new k1(i0.a(this) + " has completed normally", null, this);
        }
        Throwable thF = ((b) objO).f();
        if (thF != null) {
            CancellationException cancellationExceptionQ0 = q0(thF, i0.a(this) + " is cancelling");
            if (cancellationExceptionQ0 != null) {
                return cancellationExceptionQ0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }
}
