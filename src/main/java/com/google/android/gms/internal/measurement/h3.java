package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class h3 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ t1 f18759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ g2 f18760f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h3(g2 g2Var, t1 t1Var) {
        super(g2Var);
        this.f18760f = g2Var;
        this.f18759e = t1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f18760f.f18723i)).getAppInstanceId(this.f18759e);
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    protected final void b() {
        this.f18759e.f(null);
    }
}
