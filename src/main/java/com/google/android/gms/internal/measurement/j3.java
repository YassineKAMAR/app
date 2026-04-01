package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class j3 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Bundle f18828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ g2 f18829f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j3(g2 g2Var, Bundle bundle) {
        super(g2Var);
        this.f18829f = g2Var;
        this.f18828e = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f18829f.f18723i)).setDefaultEventParameters(this.f18828e);
    }
}
