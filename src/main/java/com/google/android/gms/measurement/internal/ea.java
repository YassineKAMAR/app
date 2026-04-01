package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class ea implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f19995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ da f19996b;

    ea(da daVar, long j8) {
        this.f19996b = daVar;
        this.f19995a = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        da.C(this.f19996b, this.f19995a);
    }
}
