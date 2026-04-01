package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes.dex */
final class ah3 extends pf3 implements RunnableFuture {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile kg3 f5270h;

    ah3(ef3 ef3Var) {
        this.f5270h = new yg3(this, ef3Var);
    }

    ah3(Callable callable) {
        this.f5270h = new zg3(this, callable);
    }

    static ah3 D(Runnable runnable, Object obj) {
        return new ah3(Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.ads.le3
    protected final String d() {
        kg3 kg3Var = this.f5270h;
        if (kg3Var == null) {
            return super.d();
        }
        return "task=[" + kg3Var.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.le3
    protected final void e() {
        kg3 kg3Var;
        if (v() && (kg3Var = this.f5270h) != null) {
            kg3Var.g();
        }
        this.f5270h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        kg3 kg3Var = this.f5270h;
        if (kg3Var != null) {
            kg3Var.run();
        }
        this.f5270h = null;
    }
}
