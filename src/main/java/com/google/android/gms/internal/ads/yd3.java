package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
abstract class yd3 extends pf3 implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    x3.d f17737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Class f17738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Object f17739j;

    yd3(x3.d dVar, Class cls, Object obj) {
        dVar.getClass();
        this.f17737h = dVar;
        this.f17738i = cls;
        this.f17739j = obj;
    }

    abstract Object D(Object obj, Throwable th);

    abstract void E(Object obj);

    @Override // com.google.android.gms.internal.ads.le3
    protected final String d() {
        String str;
        x3.d dVar = this.f17737h;
        Class cls = this.f17738i;
        Object obj = this.f17739j;
        String strD = super.d();
        if (dVar != null) {
            str = "inputFuture=[" + dVar.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strD != null) {
                return str.concat(strD);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.le3
    protected final void e() {
        t(this.f17737h);
        this.f17737h = null;
        this.f17738i = null;
        this.f17739j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable e8;
        x3.d dVar = this.f17737h;
        Class cls = this.f17738i;
        Object obj = this.f17739j;
        if (((obj == null) || ((dVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f17737h = null;
        try {
            e8 = dVar instanceof dh3 ? ((dh3) dVar).a() : null;
        } catch (Error e9) {
            e8 = e9;
        } catch (RuntimeException e10) {
            e8 = e10;
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(dVar.getClass()) + " threw " + String.valueOf(e11.getClass()) + " without a cause");
            }
            e8 = cause;
        }
        Object objP = e8 == null ? zf3.p(dVar) : null;
        if (e8 == null) {
            f(objP);
            return;
        }
        if (!cls.isInstance(e8)) {
            u(dVar);
            return;
        }
        try {
            Object objD = D(obj, e8);
            this.f17738i = null;
            this.f17739j = null;
            E(objD);
        } catch (Throwable th) {
            try {
                sg3.a(th);
                g(th);
            } finally {
                this.f17738i = null;
                this.f17739j = null;
            }
        }
    }
}
