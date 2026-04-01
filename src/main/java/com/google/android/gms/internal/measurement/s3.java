package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class s3 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Activity f19149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ t1 f19150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ g2.b f19151g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s3(g2.b bVar, Activity activity, t1 t1Var) {
        super(g2.this);
        this.f19151g = bVar;
        this.f19149e = activity;
        this.f19150f = t1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(g2.this.f18723i)).onActivitySaveInstanceState(g3.b.k3(this.f19149e), this.f19150f, this.f18725b);
    }
}
