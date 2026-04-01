package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class z4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f20745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ w4 f20746b;

    z4(w4 w4Var, boolean z7) {
        this.f20746b = w4Var;
        this.f20745a = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20746b.f20616a.H(this.f20745a);
    }
}
