package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class i3 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f18796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ g2 f18797f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i3(g2 g2Var, boolean z7) {
        super(g2Var);
        this.f18797f = g2Var;
        this.f18796e = z7;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f18797f.f18723i)).setDataCollectionEnabled(this.f18796e);
    }
}
