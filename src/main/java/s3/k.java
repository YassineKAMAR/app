package s3;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static <TResult> TResult a(h<TResult> hVar) throws InterruptedException {
        a3.o.h();
        a3.o.k(hVar, "Task must not be null");
        if (hVar.l()) {
            return (TResult) f(hVar);
        }
        m mVar = new m(null);
        g(hVar, mVar);
        mVar.c();
        return (TResult) f(hVar);
    }

    public static <TResult> TResult b(h<TResult> hVar, long j8, TimeUnit timeUnit) throws TimeoutException {
        a3.o.h();
        a3.o.k(hVar, "Task must not be null");
        a3.o.k(timeUnit, "TimeUnit must not be null");
        if (hVar.l()) {
            return (TResult) f(hVar);
        }
        m mVar = new m(null);
        g(hVar, mVar);
        if (mVar.e(j8, timeUnit)) {
            return (TResult) f(hVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> h<TResult> c(Executor executor, Callable<TResult> callable) {
        a3.o.k(executor, "Executor must not be null");
        a3.o.k(callable, "Callback must not be null");
        e0 e0Var = new e0();
        executor.execute(new f0(e0Var, callable));
        return e0Var;
    }

    public static <TResult> h<TResult> d(Exception exc) {
        e0 e0Var = new e0();
        e0Var.n(exc);
        return e0Var;
    }

    public static <TResult> h<TResult> e(TResult tresult) {
        e0 e0Var = new e0();
        e0Var.o(tresult);
        return e0Var;
    }

    private static Object f(h hVar) throws ExecutionException {
        if (hVar.m()) {
            return hVar.j();
        }
        if (hVar.k()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.i());
    }

    private static void g(h hVar, n nVar) {
        Executor executor = j.f26164b;
        hVar.e(executor, nVar);
        hVar.d(executor, nVar);
        hVar.a(executor, nVar);
    }
}
