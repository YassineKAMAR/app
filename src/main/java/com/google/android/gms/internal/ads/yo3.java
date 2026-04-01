package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class yo3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final yo3 f17869b = (yo3) hq3.a(new gq3() { // from class: com.google.android.gms.internal.ads.wo3
        @Override // com.google.android.gms.internal.ads.gq3
        public final Object j() {
            yo3 yo3Var = new yo3();
            yo3Var.e(new fo3(mo3.class, tp3.class, new go3() { // from class: com.google.android.gms.internal.ads.xo3
            }));
            return yo3Var;
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f17870a = new AtomicReference(new fq3(new zp3(), null));

    public static yo3 b() {
        return f17869b;
    }

    public final nh3 a(tp3 tp3Var, ri3 ri3Var) {
        return !((fq3) this.f17870a.get()).g(tp3Var) ? new mo3(tp3Var, ri3Var) : ((fq3) this.f17870a.get()).a(tp3Var, ri3Var);
    }

    public final yp3 c(fi3 fi3Var, Class cls) {
        return ((fq3) this.f17870a.get()).b(fi3Var, cls);
    }

    public final synchronized void d(eo3 eo3Var) {
        zp3 zp3Var = new zp3((fq3) this.f17870a.get());
        zp3Var.a(eo3Var);
        this.f17870a.set(new fq3(zp3Var, null));
    }

    public final synchronized void e(io3 io3Var) {
        zp3 zp3Var = new zp3((fq3) this.f17870a.get());
        zp3Var.b(io3Var);
        this.f17870a.set(new fq3(zp3Var, null));
    }

    public final synchronized void f(cp3 cp3Var) {
        zp3 zp3Var = new zp3((fq3) this.f17870a.get());
        zp3Var.c(cp3Var);
        this.f17870a.set(new fq3(zp3Var, null));
    }

    public final synchronized void g(gp3 gp3Var) {
        zp3 zp3Var = new zp3((fq3) this.f17870a.get());
        zp3Var.d(gp3Var);
        this.f17870a.set(new fq3(zp3Var, null));
    }
}
