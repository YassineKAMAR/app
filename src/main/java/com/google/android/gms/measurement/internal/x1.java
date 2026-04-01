package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class x1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f20658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f20659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ x f20660c;

    x1(x xVar, String str, long j8) {
        this.f20660c = xVar;
        this.f20658a = str;
        this.f20659b = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x.C(this.f20660c, this.f20658a, this.f20659b);
    }
}
