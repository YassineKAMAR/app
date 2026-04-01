package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class y2 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ t1 f19390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ g2 f19391f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y2(g2 g2Var, t1 t1Var) {
        super(g2Var);
        this.f19391f = g2Var;
        this.f19390e = t1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f19391f.f18723i)).getCurrentScreenName(this.f19390e);
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    protected final void b() {
        this.f19390e.f(null);
    }
}
