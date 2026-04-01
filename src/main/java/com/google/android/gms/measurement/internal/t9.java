package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class t9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ p3.i f20511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ s9 f20512b;

    t9(s9 s9Var, p3.i iVar) {
        this.f20512b = s9Var;
        this.f20511a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20512b) {
            this.f20512b.f20487a = false;
            if (!this.f20512b.f20489c.c0()) {
                this.f20512b.f20489c.t().F().a("Connected to remote service");
                this.f20512b.f20489c.S(this.f20511a);
            }
        }
    }
}
