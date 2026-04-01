package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class r3 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Activity f19113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ g2.b f19114f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r3(g2.b bVar, Activity activity) {
        super(g2.this);
        this.f19114f = bVar;
        this.f19113e = activity;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(g2.this.f18723i)).onActivityDestroyed(g3.b.k3(this.f19113e), this.f18725b);
    }
}
