package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.td;

/* JADX INFO: loaded from: classes.dex */
final class m6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f20257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a6 f20258b;

    m6(a6 a6Var, lb lbVar) {
        this.f20258b = a6Var;
        this.f20257a = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20258b.f19787a.o0();
        va vaVar = this.f20258b.f19787a;
        lb lbVar = this.f20257a;
        vaVar.u().i();
        vaVar.p0();
        a3.o.f(lbVar.f20210a);
        y6 y6VarF = y6.f(lbVar.f20231v, (td.a() && vaVar.c0().q(e0.T0)) ? lbVar.A : 100);
        y6 y6VarQ = vaVar.Q(lbVar.f20210a);
        vaVar.t().K().c("Setting consent, package, consent", lbVar.f20210a, y6VarF);
        vaVar.C(lbVar.f20210a, y6VarF);
        if (y6VarF.t(y6VarQ)) {
            vaVar.b0(lbVar);
        }
        if (td.a() && vaVar.c0().q(e0.T0)) {
            v vVarC = v.c(lbVar.B);
            if (v.f20539f.equals(vVarC)) {
                return;
            }
            vaVar.t().K().c("Setting DMA consent. package, consent", lbVar.f20210a, vVarC);
            vaVar.B(lbVar.f20210a, vVarC);
        }
    }
}
