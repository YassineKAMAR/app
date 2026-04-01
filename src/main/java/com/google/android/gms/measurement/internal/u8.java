package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class u8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f20532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ o8 f20533b;

    u8(o8 o8Var, long j8) {
        this.f20533b = o8Var;
        this.f20532a = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20533b.l().v(this.f20532a);
        this.f20533b.f20325e = null;
    }
}
