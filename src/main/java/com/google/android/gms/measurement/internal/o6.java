package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class o6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d0 f20315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ lb f20316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a6 f20317c;

    o6(a6 a6Var, d0 d0Var, lb lbVar) {
        this.f20317c = a6Var;
        this.f20315a = d0Var;
        this.f20316b = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20317c.G5(this.f20317c.y4(this.f20315a, this.f20316b), this.f20316b);
    }
}
