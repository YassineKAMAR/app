package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
abstract class ue3 extends pf3 implements Runnable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f15632j = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    x3.d f15633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Object f15634i;

    ue3(x3.d dVar, Object obj) {
        dVar.getClass();
        this.f15633h = dVar;
        this.f15634i = obj;
    }

    abstract Object D(Object obj, Object obj2);

    abstract void E(Object obj);

    @Override // com.google.android.gms.internal.ads.le3
    protected final String d() {
        String str;
        x3.d dVar = this.f15633h;
        Object obj = this.f15634i;
        String strD = super.d();
        if (dVar != null) {
            str = "inputFuture=[" + dVar.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strD != null) {
                return str.concat(strD);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.le3
    protected final void e() {
        t(this.f15633h);
        this.f15633h = null;
        this.f15634i = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x3.d dVar = this.f15633h;
        Object obj = this.f15634i;
        if ((isCancelled() | (dVar == null)) || (obj == null)) {
            return;
        }
        this.f15633h = null;
        if (dVar.isCancelled()) {
            u(dVar);
            return;
        }
        try {
            try {
                Object objD = D(obj, zf3.p(dVar));
                this.f15634i = null;
                E(objD);
            } catch (Throwable th) {
                try {
                    sg3.a(th);
                    g(th);
                } finally {
                    this.f15634i = null;
                }
            }
        } catch (Error e8) {
            g(e8);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e9) {
            g(e9);
        } catch (ExecutionException e10) {
            g(e10.getCause());
        }
    }
}
