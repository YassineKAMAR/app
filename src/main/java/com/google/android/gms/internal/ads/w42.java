package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w42 extends zb0 implements r51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ac0 f16631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q51 f16632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sc1 f16633c;

    @Override // com.google.android.gms.internal.ads.ac0
    public final synchronized void F4(g3.a aVar) {
        ac0 ac0Var = this.f16631a;
        if (ac0Var != null) {
            ((d82) ac0Var).f6616d.l();
        }
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final synchronized void G0(g3.a aVar) {
        ac0 ac0Var = this.f16631a;
        if (ac0Var != null) {
            ac0Var.G0(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final synchronized void G4(g3.a aVar, int i8) {
        sc1 sc1Var = this.f16633c;
        if (sc1Var != null) {
            qg0.g("Fail to initialize adapter ".concat(String.valueOf(((c82) sc1Var).f6209c.f5000a)));
        }
    }

    public final synchronized void P5(ac0 ac0Var) {
        this.f16631a = ac0Var;
    }

    public final synchronized void Q5(sc1 sc1Var) {
        this.f16633c = sc1Var;
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final synchronized void b0(g3.a aVar) {
        ac0 ac0Var = this.f16631a;
        if (ac0Var != null) {
            ((d82) ac0Var).f6613a.G5();
        }
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final synchronized void e0(g3.a aVar) {
        q51 q51Var = this.f16632b;
        if (q51Var != null) {
            q51Var.p();
        }
    }

    @Override // com.google.android.gms.internal.ads.r51
    public final synchronized void k3(q51 q51Var) {
        this.f16632b = q51Var;
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final synchronized void k5(g3.a aVar, bc0 bc0Var) {
        ac0 ac0Var = this.f16631a;
        if (ac0Var != null) {
            ((d82) ac0Var).f6616d.c0(bc0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final synchronized void o4(g3.a aVar) {
        ac0 ac0Var = this.f16631a;
        if (ac0Var != null) {
            ((d82) ac0Var).f6615c.k();
        }
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final synchronized void p1(g3.a aVar) {
        sc1 sc1Var = this.f16633c;
        if (sc1Var != null) {
            Executor executor = ((c82) sc1Var).f6210d.f7187b;
            final a32 a32Var = ((c82) sc1Var).f6209c;
            final wr2 wr2Var = ((c82) sc1Var).f6208b;
            final ks2 ks2Var = ((c82) sc1Var).f6207a;
            final c82 c82Var = (c82) sc1Var;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.b82
                @Override // java.lang.Runnable
                public final void run() {
                    e82 e82Var = c82Var.f6210d;
                    e82.e(ks2Var, wr2Var, a32Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final synchronized void s0(g3.a aVar, int i8) {
        q51 q51Var = this.f16632b;
        if (q51Var != null) {
            q51Var.b(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final synchronized void u5(g3.a aVar) {
        ac0 ac0Var = this.f16631a;
        if (ac0Var != null) {
            ((d82) ac0Var).f6615c.m();
        }
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final synchronized void zze(g3.a aVar) {
        ac0 ac0Var = this.f16631a;
        if (ac0Var != null) {
            ((d82) ac0Var).f6614b.Z();
        }
    }
}
