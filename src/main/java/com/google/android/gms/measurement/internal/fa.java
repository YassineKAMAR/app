package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes.dex */
final class fa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService.a f20021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f20022b;

    fa(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.a aVar) {
        this.f20022b = appMeasurementDynamiteService;
        this.f20021a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20022b.f19759a.H().d0(this.f20021a);
    }
}
