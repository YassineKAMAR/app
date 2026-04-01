package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class r6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.w1 f20454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f20455b;

    r6(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.w1 w1Var) {
        this.f20455b = appMeasurementDynamiteService;
        this.f20454a = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20455b.f19759a.J().D(this.f20454a);
    }
}
