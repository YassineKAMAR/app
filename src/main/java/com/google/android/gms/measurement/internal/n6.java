package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class n6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d0 f20292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a6 f20294c;

    n6(a6 a6Var, d0 d0Var, String str) {
        this.f20294c = a6Var;
        this.f20292a = d0Var;
        this.f20293b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20294c.f19787a.o0();
        this.f20294c.f19787a.s(this.f20292a, this.f20293b);
    }
}
