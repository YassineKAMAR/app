package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class i7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.w1 f20113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f20115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f20116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f20117e;

    i7(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.w1 w1Var, String str, String str2, boolean z7) {
        this.f20117e = appMeasurementDynamiteService;
        this.f20113a = w1Var;
        this.f20114b = str;
        this.f20115c = str2;
        this.f20116d = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20117e.f19759a.J().G(this.f20113a, this.f20114b, this.f20115c, this.f20116d);
    }
}
