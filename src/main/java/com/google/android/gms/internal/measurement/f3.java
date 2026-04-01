package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class f3 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f18694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ t1 f18695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ g2 f18696g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f3(g2 g2Var, String str, t1 t1Var) {
        super(g2Var);
        this.f18696g = g2Var;
        this.f18694e = str;
        this.f18695f = t1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f18696g.f18723i)).getMaxUserProperties(this.f18694e, this.f18695f);
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    protected final void b() {
        this.f18695f.f(null);
    }
}
