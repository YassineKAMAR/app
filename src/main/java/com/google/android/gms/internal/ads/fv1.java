package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class fv1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f8080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg3 f8081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lg3 f8082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final xv1 f8083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c84 f8084e;

    public fv1(ScheduledExecutorService scheduledExecutorService, lg3 lg3Var, lg3 lg3Var2, xv1 xv1Var, c84 c84Var) {
        this.f8080a = scheduledExecutorService;
        this.f8081b = lg3Var;
        this.f8082c = lg3Var2;
        this.f8083d = xv1Var;
        this.f8084e = c84Var;
    }

    final /* synthetic */ x3.d a(ya0 ya0Var, int i8, Throwable th) {
        return ((uy1) this.f8084e.k()).Q5(ya0Var, i8);
    }

    public final x3.d b(final ya0 ya0Var) {
        x3.d dVarZ;
        String str = ya0Var.f17711d;
        g2.t.r();
        if (j2.k2.b(str)) {
            dVarZ = zf3.g(new kw1(1));
        } else {
            dVarZ = ((Boolean) h2.y.c().b(ns.x7)).booleanValue() ? this.f8082c.Z(new Callable() { // from class: com.google.android.gms.internal.ads.dv1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f7025a.c(ya0Var);
                }
            }) : this.f8083d.b(ya0Var);
        }
        final int callingUid = Binder.getCallingUid();
        return zf3.f((qf3) zf3.o(qf3.C(dVarZ), ((Integer) h2.y.c().b(ns.f12206u5)).intValue(), TimeUnit.SECONDS, this.f8080a), Throwable.class, new gf3() { // from class: com.google.android.gms.internal.ads.ev1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f7507a.a(ya0Var, callingUid, (Throwable) obj);
            }
        }, this.f8081b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream c(ya0 ya0Var) {
        return (InputStream) this.f8083d.b(ya0Var).get(((Integer) h2.y.c().b(ns.f12206u5)).intValue(), TimeUnit.SECONDS);
    }
}
