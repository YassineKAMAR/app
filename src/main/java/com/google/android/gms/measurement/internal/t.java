package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ w6 f20493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ u f20494b;

    t(u uVar, w6 w6Var) {
        this.f20494b = uVar;
        this.f20493a = w6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20493a.p();
        if (e.a()) {
            this.f20493a.u().D(this);
            return;
        }
        boolean zE = this.f20494b.e();
        this.f20494b.f20520c = 0L;
        if (zE) {
            this.f20494b.d();
        }
    }
}
