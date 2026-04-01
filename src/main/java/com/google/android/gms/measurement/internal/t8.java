package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class t8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ p8 f20508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f20509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ o8 f20510c;

    t8(o8 o8Var, p8 p8Var, long j8) {
        this.f20510c = o8Var;
        this.f20508a = p8Var;
        this.f20509b = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20510c.O(this.f20508a, false, this.f20509b);
        o8 o8Var = this.f20510c;
        o8Var.f20325e = null;
        o8Var.r().J(null);
    }
}
