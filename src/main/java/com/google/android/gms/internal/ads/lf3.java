package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
abstract class lf3 extends kg3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f10662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ mf3 f10663d;

    lf3(mf3 mf3Var, Executor executor) {
        this.f10663d = mf3Var;
        executor.getClass();
        this.f10662c = executor;
    }

    @Override // com.google.android.gms.internal.ads.kg3
    final void d(Throwable th) {
        this.f10663d.f11279p = null;
        if (th instanceof ExecutionException) {
            this.f10663d.g(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.f10663d.cancel(false);
        } else {
            this.f10663d.g(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.kg3
    final void e(Object obj) {
        this.f10663d.f11279p = null;
        h(obj);
    }

    @Override // com.google.android.gms.internal.ads.kg3
    final boolean f() {
        return this.f10663d.isDone();
    }

    abstract void h(Object obj);

    final void i() {
        try {
            this.f10662c.execute(this);
        } catch (RejectedExecutionException e8) {
            this.f10663d.g(e8);
        }
    }
}
