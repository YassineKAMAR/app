package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class o3 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Activity f18990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ g2.b f18991f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o3(g2.b bVar, Activity activity) {
        super(g2.this);
        this.f18991f = bVar;
        this.f18990e = activity;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(g2.this.f18723i)).onActivityStarted(g3.b.k3(this.f18990e), this.f18725b);
    }
}
