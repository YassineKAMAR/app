package d7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y6.b2;
import y6.v0;

/* JADX INFO: loaded from: classes2.dex */
public final class j<T> extends y6.p0<T> implements kotlin.coroutines.jvm.internal.e, h6.d<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21025h = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y6.b0 f21026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h6.d<T> f21027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f21028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f21029g;

    /* JADX WARN: Multi-variable type inference failed */
    public j(y6.b0 b0Var, h6.d<? super T> dVar) {
        super(-1);
        this.f21026d = b0Var;
        this.f21027e = dVar;
        this.f21028f = k.f21031a;
        this.f21029g = l0.b(getContext());
    }

    private final y6.k<?> l() {
        Object obj = f21025h.get(this);
        if (obj instanceof y6.k) {
            return (y6.k) obj;
        }
        return null;
    }

    @Override // y6.p0
    public void a(Object obj, Throwable th) {
        if (obj instanceof y6.v) {
            ((y6.v) obj).f27555b.invoke(th);
        }
    }

    @Override // y6.p0
    public h6.d<T> d() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        h6.d<T> dVar = this.f21027e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // h6.d
    public h6.g getContext() {
        return this.f21027e.getContext();
    }

    @Override // y6.p0
    public Object i() {
        Object obj = this.f21028f;
        this.f21028f = k.f21031a;
        return obj;
    }

    public final void j() {
        while (f21025h.get(this) == k.f21032b) {
        }
    }

    public final y6.k<T> k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21025h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f21025h.set(this, k.f21032b);
                return null;
            }
            if (obj instanceof y6.k) {
                if (androidx.concurrent.futures.b.a(f21025h, this, obj, k.f21032b)) {
                    return (y6.k) obj;
                }
            } else if (obj != k.f21032b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean m() {
        return f21025h.get(this) != null;
    }

    public final boolean n(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21025h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            h0 h0Var = k.f21032b;
            if (kotlin.jvm.internal.q.b(obj, h0Var)) {
                if (androidx.concurrent.futures.b.a(f21025h, this, h0Var, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f21025h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void o() {
        j();
        y6.k<?> kVarL = l();
        if (kVarL != null) {
            kVarL.p();
        }
    }

    public final Throwable p(y6.j<?> jVar) {
        h0 h0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21025h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            h0Var = k.f21032b;
            if (obj != h0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f21025h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f21025h, this, h0Var, jVar));
        return null;
    }

    @Override // h6.d
    public void resumeWith(Object obj) {
        h6.g context = this.f21027e.getContext();
        Object objD = y6.y.d(obj, null, 1, null);
        if (this.f21026d.f0(context)) {
            this.f21028f = objD;
            this.f27517c = 0;
            this.f21026d.e0(context, this);
            return;
        }
        v0 v0VarA = b2.f27479a.a();
        if (v0VarA.n0()) {
            this.f21028f = objD;
            this.f27517c = 0;
            v0VarA.j0(this);
            return;
        }
        v0VarA.l0(true);
        try {
            h6.g context2 = getContext();
            Object objC = l0.c(context2, this.f21029g);
            try {
                this.f21027e.resumeWith(obj);
                e6.i0 i0Var = e6.i0.f21430a;
                while (v0VarA.p0()) {
                }
            } finally {
                l0.a(context2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f21026d + ", " + y6.i0.c(this.f21027e) + ']';
    }
}
