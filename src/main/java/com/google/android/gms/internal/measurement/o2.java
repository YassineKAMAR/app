package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class o2 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Bundle f18988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ g2 f18989f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o2(g2 g2Var, Bundle bundle) {
        super(g2Var);
        this.f18989f = g2Var;
        this.f18988e = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f18989f.f18723i)).setConsent(this.f18988e, this.f18724a);
    }
}
