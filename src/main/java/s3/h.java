package s3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class h<TResult> {
    public h<TResult> a(Executor executor, c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public h<TResult> b(Executor executor, d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public h<TResult> c(d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract h<TResult> d(Executor executor, e eVar);

    public abstract h<TResult> e(Executor executor, f<? super TResult> fVar);

    public <TContinuationResult> h<TContinuationResult> f(Executor executor, a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> h<TContinuationResult> g(Executor executor, a<TResult, h<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> h<TContinuationResult> h(a<TResult, h<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception i();

    public abstract TResult j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();
}
