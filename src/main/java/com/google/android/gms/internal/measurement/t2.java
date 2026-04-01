package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class t2 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ long f19221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ g2 f19222f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t2(g2 g2Var, long j8) {
        super(g2Var);
        this.f19222f = g2Var;
        this.f19221e = j8;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f19222f.f18723i)).setSessionTimeoutDuration(this.f19221e);
    }
}
