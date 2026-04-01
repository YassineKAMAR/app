package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class m7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f20259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f20260b;

    m7(b7 b7Var, long j8) {
        this.f20260b = b7Var;
        this.f20259a = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20260b.e().f20705k.b(this.f20259a);
        this.f20260b.t().F().b("Session timeout duration set", Long.valueOf(this.f20259a));
    }
}
