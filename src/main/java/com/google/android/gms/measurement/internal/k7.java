package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class k7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f20179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f20180b;

    k7(b7 b7Var, boolean z7) {
        this.f20180b = b7Var;
        this.f20179a = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM = this.f20180b.f20556a.m();
        boolean zL = this.f20180b.f20556a.l();
        this.f20180b.f20556a.h(this.f20179a);
        if (zL == this.f20179a) {
            this.f20180b.f20556a.t().K().b("Default data collection state already set to", Boolean.valueOf(this.f20179a));
        }
        if (this.f20180b.f20556a.m() == zM || this.f20180b.f20556a.m() != this.f20180b.f20556a.l()) {
            this.f20180b.f20556a.t().M().c("Default data collection is different than actual status", Boolean.valueOf(this.f20179a), Boolean.valueOf(zM));
        }
        this.f20180b.t0();
    }
}
