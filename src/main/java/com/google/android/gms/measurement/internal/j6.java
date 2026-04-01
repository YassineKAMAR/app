package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class j6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f20152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a6 f20153b;

    j6(a6 a6Var, lb lbVar) {
        this.f20153b = a6Var;
        this.f20152a = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20153b.f19787a.o0();
        this.f20153b.f19787a.b0(this.f20152a);
    }
}
