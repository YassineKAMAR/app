package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class c3 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ t1 f18611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ g2 f18612f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c3(g2 g2Var, t1 t1Var) {
        super(g2Var);
        this.f18612f = g2Var;
        this.f18611e = t1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f18612f.f18723i)).getCurrentScreenClass(this.f18611e);
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    protected final void b() {
        this.f18611e.f(null);
    }
}
