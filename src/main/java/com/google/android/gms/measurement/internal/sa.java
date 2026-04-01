package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class sa extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ pa f20490e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    sa(pa paVar, w6 w6Var) {
        super(w6Var);
        this.f20490e = paVar;
    }

    @Override // com.google.android.gms.measurement.internal.u
    public final void d() {
        this.f20490e.z();
        this.f20490e.t().K().a("Starting upload from DelayedRunnable");
        this.f20490e.f20461b.t0();
    }
}
