package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class w2 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ t1 f19285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ g2 f19286f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w2(g2 g2Var, t1 t1Var) {
        super(g2Var);
        this.f19286f = g2Var;
        this.f19285e = t1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f19286f.f18723i)).getCachedAppInstanceId(this.f19285e);
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    protected final void b() {
        this.f19285e.f(null);
    }
}
