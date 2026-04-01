package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class hp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iu2 f8875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m31 f8876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f8877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private gp2 f8878d;

    public hp2(iu2 iu2Var, m31 m31Var, Executor executor) {
        this.f8875a = iu2Var;
        this.f8876b = m31Var;
        this.f8877c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final su2 e() {
        ts2 ts2VarQ = this.f8876b.q();
        return this.f8875a.b(ts2VarQ.f15302d, ts2VarQ.f15304f, ts2VarQ.f15308j);
    }

    public final x3.d c() {
        x3.d dVarE;
        gp2 gp2Var = this.f8878d;
        if (gp2Var != null) {
            return zf3.h(gp2Var);
        }
        if (((Boolean) qu.f13764a.e()).booleanValue()) {
            dVarE = zf3.e(zf3.m(qf3.C(this.f8876b.k().e(this.f8875a.j())), new ep2(this), this.f8877c), kw1.class, new dp2(this), this.f8877c);
        } else {
            gp2 gp2Var2 = new gp2(null, e(), null);
            this.f8878d = gp2Var2;
            dVarE = zf3.h(gp2Var2);
        }
        return zf3.m(dVarE, new z73() { // from class: com.google.android.gms.internal.ads.zo2
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                return (gp2) obj;
            }
        }, this.f8877c);
    }
}
