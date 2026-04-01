package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class d3 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Bundle f18636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ t1 f18637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ g2 f18638g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d3(g2 g2Var, Bundle bundle, t1 t1Var) {
        super(g2Var);
        this.f18638g = g2Var;
        this.f18636e = bundle;
        this.f18637f = t1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f18638g.f18723i)).performAction(this.f18636e, this.f18637f, this.f18724a);
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    protected final void b() {
        this.f18637f.f(null);
    }
}
