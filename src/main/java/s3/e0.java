package s3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class e0<TResult> extends h<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f26154a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f26155b = new b0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f26157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f26158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Exception f26159f;

    e0() {
    }

    private final void s() {
        a3.o.n(this.f26156c, "Task is not yet complete");
    }

    private final void t() {
        if (this.f26157d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void u() {
        if (this.f26156c) {
            throw b.a(this);
        }
    }

    private final void v() {
        synchronized (this.f26154a) {
            if (this.f26156c) {
                this.f26155b.b(this);
            }
        }
    }

    @Override // s3.h
    public final h<TResult> a(Executor executor, c cVar) {
        this.f26155b.a(new t(executor, cVar));
        v();
        return this;
    }

    @Override // s3.h
    public final h<TResult> b(Executor executor, d<TResult> dVar) {
        this.f26155b.a(new v(executor, dVar));
        v();
        return this;
    }

    @Override // s3.h
    public final h<TResult> c(d<TResult> dVar) {
        this.f26155b.a(new v(j.f26163a, dVar));
        v();
        return this;
    }

    @Override // s3.h
    public final h<TResult> d(Executor executor, e eVar) {
        this.f26155b.a(new x(executor, eVar));
        v();
        return this;
    }

    @Override // s3.h
    public final h<TResult> e(Executor executor, f<? super TResult> fVar) {
        this.f26155b.a(new z(executor, fVar));
        v();
        return this;
    }

    @Override // s3.h
    public final <TContinuationResult> h<TContinuationResult> f(Executor executor, a<TResult, TContinuationResult> aVar) {
        e0 e0Var = new e0();
        this.f26155b.a(new p(executor, aVar, e0Var));
        v();
        return e0Var;
    }

    @Override // s3.h
    public final <TContinuationResult> h<TContinuationResult> g(Executor executor, a<TResult, h<TContinuationResult>> aVar) {
        e0 e0Var = new e0();
        this.f26155b.a(new r(executor, aVar, e0Var));
        v();
        return e0Var;
    }

    @Override // s3.h
    public final <TContinuationResult> h<TContinuationResult> h(a<TResult, h<TContinuationResult>> aVar) {
        return g(j.f26163a, aVar);
    }

    @Override // s3.h
    public final Exception i() {
        Exception exc;
        synchronized (this.f26154a) {
            exc = this.f26159f;
        }
        return exc;
    }

    @Override // s3.h
    public final TResult j() {
        TResult tresult;
        synchronized (this.f26154a) {
            s();
            t();
            Exception exc = this.f26159f;
            if (exc != null) {
                throw new g(exc);
            }
            tresult = (TResult) this.f26158e;
        }
        return tresult;
    }

    @Override // s3.h
    public final boolean k() {
        return this.f26157d;
    }

    @Override // s3.h
    public final boolean l() {
        boolean z7;
        synchronized (this.f26154a) {
            z7 = this.f26156c;
        }
        return z7;
    }

    @Override // s3.h
    public final boolean m() {
        boolean z7;
        synchronized (this.f26154a) {
            z7 = false;
            if (this.f26156c && !this.f26157d && this.f26159f == null) {
                z7 = true;
            }
        }
        return z7;
    }

    public final void n(Exception exc) {
        a3.o.k(exc, "Exception must not be null");
        synchronized (this.f26154a) {
            u();
            this.f26156c = true;
            this.f26159f = exc;
        }
        this.f26155b.b(this);
    }

    public final void o(Object obj) {
        synchronized (this.f26154a) {
            u();
            this.f26156c = true;
            this.f26158e = obj;
        }
        this.f26155b.b(this);
    }

    public final boolean p() {
        synchronized (this.f26154a) {
            if (this.f26156c) {
                return false;
            }
            this.f26156c = true;
            this.f26157d = true;
            this.f26155b.b(this);
            return true;
        }
    }

    public final boolean q(Exception exc) {
        a3.o.k(exc, "Exception must not be null");
        synchronized (this.f26154a) {
            if (this.f26156c) {
                return false;
            }
            this.f26156c = true;
            this.f26159f = exc;
            this.f26155b.b(this);
            return true;
        }
    }

    public final boolean r(Object obj) {
        synchronized (this.f26154a) {
            if (this.f26156c) {
                return false;
            }
            this.f26156c = true;
            this.f26158e = obj;
            this.f26155b.b(this);
            return true;
        }
    }
}
