package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class uo2 implements lp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iu2 f15785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f15786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vf3 f15787c = new so2(this);

    public uo2(iu2 iu2Var, Executor executor) {
        this.f15785a = iu2Var;
        this.f15786b = executor;
    }

    @Override // com.google.android.gms.internal.ads.lp2
    public final /* bridge */ /* synthetic */ x3.d a(mp2 mp2Var, kp2 kp2Var, Object obj) {
        return c(mp2Var, kp2Var, null);
    }

    final /* synthetic */ x3.d b(m31 m31Var, gp2 gp2Var) {
        iu2 iu2Var = this.f15785a;
        su2 su2Var = gp2Var.f8447b;
        ya0 ya0Var = gp2Var.f8446a;
        ru2 ru2VarC = iu2Var.c(su2Var);
        if (ru2VarC != null && ya0Var != null) {
            zf3.r(m31Var.k().h(ya0Var), this.f15787c, this.f15786b);
        }
        return zf3.h(new to2(su2Var, ya0Var, ru2VarC));
    }

    public final x3.d c(mp2 mp2Var, kp2 kp2Var, final m31 m31Var) {
        return zf3.e(zf3.n(qf3.C(new hp2(this.f15785a, m31Var, this.f15786b).c()), new gf3() { // from class: com.google.android.gms.internal.ads.qo2
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f13578a.b(m31Var, (gp2) obj);
            }
        }, this.f15786b), Exception.class, new ro2(this), this.f15786b);
    }

    @Override // com.google.android.gms.internal.ads.lp2
    public final /* bridge */ /* synthetic */ Object p() {
        return null;
    }
}
