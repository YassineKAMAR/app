package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f19765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f19766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ x f19767c;

    a(x xVar, String str, long j8) {
        this.f19767c = xVar;
        this.f19765a = str;
        this.f19766b = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x.y(this.f19767c, this.f19765a, this.f19766b);
    }
}
