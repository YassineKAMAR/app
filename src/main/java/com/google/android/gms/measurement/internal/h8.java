package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class h8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.w1 f20062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ d0 f20063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f20064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f20065d;

    h8(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.w1 w1Var, d0 d0Var, String str) {
        this.f20065d = appMeasurementDynamiteService;
        this.f20062a = w1Var;
        this.f20063b = d0Var;
        this.f20064c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20065d.f19759a.J().E(this.f20062a, this.f20063b, this.f20064c);
    }
}
