package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class n2 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f18973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ g2 f18974f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n2(g2 g2Var, String str) {
        super(g2Var);
        this.f18974f = g2Var;
        this.f18973e = str;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f18974f.f18723i)).setUserId(this.f18973e, this.f18724a);
    }
}
