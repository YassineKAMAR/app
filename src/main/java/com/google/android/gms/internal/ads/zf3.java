package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zf3 extends bg3 {
    /* JADX WARN: Multi-variable type inference failed */
    public static yf3 a(Iterable iterable) {
        return new yf3(false, jb3.x(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yf3 b(Iterable iterable) {
        int i8 = jb3.f9559c;
        iterable.getClass();
        return new yf3(true, jb3.x(iterable), null);
    }

    @SafeVarargs
    public static yf3 c(x3.d... dVarArr) {
        return new yf3(true, jb3.y(dVarArr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static x3.d d(Iterable iterable) {
        return new hf3(jb3.x(iterable), true);
    }

    public static x3.d e(x3.d dVar, Class cls, z73 z73Var, Executor executor) {
        xd3 xd3Var = new xd3(dVar, cls, z73Var);
        dVar.c(xd3Var, rg3.c(executor, xd3Var));
        return xd3Var;
    }

    public static x3.d f(x3.d dVar, Class cls, gf3 gf3Var, Executor executor) {
        wd3 wd3Var = new wd3(dVar, cls, gf3Var);
        dVar.c(wd3Var, rg3.c(executor, wd3Var));
        return wd3Var;
    }

    public static x3.d g(Throwable th) {
        th.getClass();
        return new cg3(th);
    }

    public static x3.d h(Object obj) {
        return obj == null ? dg3.f6722b : new dg3(obj);
    }

    public static x3.d i() {
        return dg3.f6722b;
    }

    public static x3.d j(Callable callable, Executor executor) {
        ah3 ah3Var = new ah3(callable);
        executor.execute(ah3Var);
        return ah3Var;
    }

    public static x3.d k(ef3 ef3Var, Executor executor) {
        ah3 ah3Var = new ah3(ef3Var);
        executor.execute(ah3Var);
        return ah3Var;
    }

    @SafeVarargs
    public static x3.d l(x3.d... dVarArr) {
        return new hf3(jb3.y(dVarArr), false);
    }

    public static x3.d m(x3.d dVar, z73 z73Var, Executor executor) {
        te3 te3Var = new te3(dVar, z73Var);
        dVar.c(te3Var, rg3.c(executor, te3Var));
        return te3Var;
    }

    public static x3.d n(x3.d dVar, gf3 gf3Var, Executor executor) {
        int i8 = ue3.f15632j;
        executor.getClass();
        se3 se3Var = new se3(dVar, gf3Var);
        dVar.c(se3Var, rg3.c(executor, se3Var));
        return se3Var;
    }

    public static x3.d o(x3.d dVar, long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return dVar.isDone() ? dVar : xg3.E(dVar, j8, timeUnit, scheduledExecutorService);
    }

    public static Object p(Future future) {
        if (future.isDone()) {
            return ch3.a(future);
        }
        throw new IllegalStateException(b93.b("Future was expected to be done: %s", future));
    }

    public static Object q(Future future) {
        try {
            return ch3.a(future);
        } catch (ExecutionException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof Error) {
                throw new of3((Error) cause);
            }
            throw new bh3(cause);
        }
    }

    public static void r(x3.d dVar, vf3 vf3Var, Executor executor) {
        vf3Var.getClass();
        dVar.c(new wf3(dVar, vf3Var), executor);
    }
}
