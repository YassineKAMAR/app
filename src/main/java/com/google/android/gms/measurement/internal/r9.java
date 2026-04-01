package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class r9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ p3.i f20459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ s9 f20460b;

    r9(s9 s9Var, p3.i iVar) {
        this.f20460b = s9Var;
        this.f20459a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20460b) {
            this.f20460b.f20487a = false;
            if (!this.f20460b.f20489c.c0()) {
                this.f20460b.f20489c.t().K().a("Connected to service");
                this.f20460b.f20489c.S(this.f20459a);
            }
        }
    }
}
