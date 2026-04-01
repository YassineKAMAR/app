package d7;

import d7.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e<N extends e<N>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21014a = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_next");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21015b = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public e(N n8) {
        this._prev = n8;
    }

    private final N c() {
        N n8 = (N) g();
        while (n8 != null && n8.h()) {
            n8 = (N) f21015b.get(n8);
        }
        return n8;
    }

    private final N d() {
        e eVarE;
        N n8 = (N) e();
        kotlin.jvm.internal.q.c(n8);
        while (n8.h() && (eVarE = n8.e()) != null) {
            n8 = (N) eVarE;
        }
        return n8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f() {
        return f21014a.get(this);
    }

    public final void b() {
        f21015b.lazySet(this, null);
    }

    public final N e() {
        Object objF = f();
        if (objF == d.f21012a) {
            return null;
        }
        return (N) objF;
    }

    public final N g() {
        return (N) f21015b.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return androidx.concurrent.futures.b.a(f21014a, this, null, d.f21012a);
    }

    public final void k() {
        Object obj;
        if (i()) {
            return;
        }
        while (true) {
            e eVarC = c();
            e eVarD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21015b;
            do {
                obj = atomicReferenceFieldUpdater.get(eVarD);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, eVarD, obj, ((e) obj) == null ? null : eVarC));
            if (eVarC != null) {
                f21014a.set(eVarC, eVarD);
            }
            if (!eVarD.h() || eVarD.i()) {
                if (eVarC == null || !eVarC.h()) {
                    return;
                }
            }
        }
    }

    public final boolean l(N n8) {
        return androidx.concurrent.futures.b.a(f21014a, this, null, n8);
    }
}
