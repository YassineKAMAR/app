package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class g3 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ t1 f18729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ g2 f18730f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g3(g2 g2Var, t1 t1Var) {
        super(g2Var);
        this.f18730f = g2Var;
        this.f18729e = t1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f18730f.f18723i)).getSessionId(this.f18729e);
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    protected final void b() {
        this.f18729e.f(null);
    }
}
