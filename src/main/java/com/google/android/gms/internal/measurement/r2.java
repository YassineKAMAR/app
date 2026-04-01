package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class r2 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Bundle f19111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ g2 f19112f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r2(g2 g2Var, Bundle bundle) {
        super(g2Var);
        this.f19112f = g2Var;
        this.f19111e = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f19112f.f18723i)).setConsentThirdParty(this.f19111e, this.f18724a);
    }
}
