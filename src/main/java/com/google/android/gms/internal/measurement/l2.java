package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class l2 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f18910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f18911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Bundle f18912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ g2 f18913h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l2(g2 g2Var, String str, String str2, Bundle bundle) {
        super(g2Var);
        this.f18913h = g2Var;
        this.f18910e = str;
        this.f18911f = str2;
        this.f18912g = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f18913h.f18723i)).clearConditionalUserProperty(this.f18910e, this.f18911f, this.f18912g);
    }
}
