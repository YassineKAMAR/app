package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class k2 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f18863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f18864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ t1 f18865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ g2 f18866h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k2(g2 g2Var, String str, String str2, t1 t1Var) {
        super(g2Var);
        this.f18866h = g2Var;
        this.f18863e = str;
        this.f18864f = str2;
        this.f18865g = t1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f18866h.f18723i)).getConditionalUserProperties(this.f18863e, this.f18864f, this.f18865g);
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    protected final void b() {
        this.f18865g.f(null);
    }
}
