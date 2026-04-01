package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class w0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f20610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ x f20611b;

    w0(x xVar, long j8) {
        this.f20611b = xVar;
        this.f20610a = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20611b.B(this.f20610a);
    }
}
