package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class v2 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f19265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ g2 f19266f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v2(g2 g2Var, String str) {
        super(g2Var);
        this.f19266f = g2Var;
        this.f19265e = str;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f19266f.f18723i)).beginAdUnitExposure(this.f19265e, this.f18725b);
    }
}
