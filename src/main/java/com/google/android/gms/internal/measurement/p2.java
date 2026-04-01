package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class p2 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Boolean f19026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ g2 f19027f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p2(g2 g2Var, Boolean bool) {
        super(g2Var);
        this.f19027f = g2Var;
        this.f19026e = bool;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        if (this.f19026e != null) {
            ((v1) a3.o.j(this.f19027f.f18723i)).setMeasurementEnabled(this.f19026e.booleanValue(), this.f18724a);
        } else {
            ((v1) a3.o.j(this.f19027f.f18723i)).clearMeasurementEnabled(this.f18724a);
        }
    }
}
