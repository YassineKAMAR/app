package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ku1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f10354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg3 f10355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sv1 f10356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c84 f10357d;

    public ku1(lg3 lg3Var, lg3 lg3Var2, sv1 sv1Var, c84 c84Var) {
        this.f10354a = lg3Var;
        this.f10355b = lg3Var2;
        this.f10356c = sv1Var;
        this.f10357d = c84Var;
    }

    final /* synthetic */ x3.d a(ya0 ya0Var, int i8, kw1 kw1Var) {
        return ((uy1) this.f10357d.k()).P5(ya0Var, i8);
    }

    public final x3.d b(final ya0 ya0Var) {
        x3.d dVarF;
        String str = ya0Var.f17711d;
        g2.t.r();
        if (j2.k2.b(str)) {
            dVarF = zf3.g(new kw1(1));
        } else {
            dVarF = zf3.f(this.f10354a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.hu1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f8978a.c(ya0Var);
                }
            }), ExecutionException.class, new gf3() { // from class: com.google.android.gms.internal.ads.iu1
                @Override // com.google.android.gms.internal.ads.gf3
                public final x3.d a(Object obj) {
                    return zf3.g(((ExecutionException) obj).getCause());
                }
            }, this.f10355b);
        }
        final int callingUid = Binder.getCallingUid();
        return zf3.f(dVarF, kw1.class, new gf3() { // from class: com.google.android.gms.internal.ads.ju1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f9808a.a(ya0Var, callingUid, (kw1) obj);
            }
        }, this.f10355b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream c(ya0 ya0Var) {
        jh0 jh0Var;
        final sv1 sv1Var = this.f10356c;
        synchronized (sv1Var.f15895b) {
            if (sv1Var.f15896c) {
                jh0Var = sv1Var.f15894a;
            } else {
                sv1Var.f15896c = true;
                sv1Var.f15898e = ya0Var;
                sv1Var.f15899f.q();
                sv1Var.f15894a.c(new Runnable() { // from class: com.google.android.gms.internal.ads.rv1
                    @Override // java.lang.Runnable
                    public final void run() {
                        sv1Var.a();
                    }
                }, eh0.f7327f);
                jh0Var = sv1Var.f15894a;
            }
        }
        return (InputStream) jh0Var.get(((Integer) h2.y.c().b(ns.f12206u5)).intValue(), TimeUnit.SECONDS);
    }
}
