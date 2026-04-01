package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class x5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a7 f20669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ w5 f20670b;

    x5(w5 w5Var, a7 a7Var) {
        this.f20670b = w5Var;
        this.f20669a = a7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w5.d(this.f20670b, this.f20669a);
        this.f20670b.b(this.f20669a.f19796g);
    }
}
