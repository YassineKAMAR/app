package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class h9 extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ v8 f20066e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h9(v8 v8Var, w6 w6Var) {
        super(w6Var);
        this.f20066e = v8Var;
    }

    @Override // com.google.android.gms.measurement.internal.u
    public final void d() {
        this.f20066e.t().L().a("Tasks have been queued for a long time");
    }
}
