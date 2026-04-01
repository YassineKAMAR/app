package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class ba implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ va f19840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Runnable f19841b;

    ba(aa aaVar, va vaVar, Runnable runnable) {
        this.f19840a = vaVar;
        this.f19841b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19840a.o0();
        this.f19840a.y(this.f19841b);
        this.f19840a.t0();
    }
}
