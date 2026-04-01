package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class eb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.w1 f19997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f19998b;

    eb(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.w1 w1Var) {
        this.f19998b = appMeasurementDynamiteService;
        this.f19997a = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19998b.f19759a.L().T(this.f19997a, this.f19998b.f19759a.l());
    }
}
