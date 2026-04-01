package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class n3 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Activity f18975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ g2.b f18976f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n3(g2.b bVar, Activity activity) {
        super(g2.this);
        this.f18976f = bVar;
        this.f18975e = activity;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(g2.this.f18723i)).onActivityResumed(g3.b.k3(this.f18975e), this.f18725b);
    }
}
