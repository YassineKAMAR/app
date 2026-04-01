package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class f9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.w1 f20017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f20019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f20020d;

    f9(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.w1 w1Var, String str, String str2) {
        this.f20020d = appMeasurementDynamiteService;
        this.f20017a = w1Var;
        this.f20018b = str;
        this.f20019c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20020d.f19759a.J().F(this.f20017a, this.f20018b, this.f20019c);
    }
}
