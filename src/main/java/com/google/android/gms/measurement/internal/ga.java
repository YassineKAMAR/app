package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class ga implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f20040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ da f20041b;

    ga(da daVar, long j8) {
        this.f20041b = daVar;
        this.f20040a = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        da.I(this.f20041b, this.f20040a);
    }
}
