package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class di0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ gi0 f6763a;

    di0(gi0 gi0Var) {
        this.f6763a = gi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gi0 gi0Var = this.f6763a;
        if (gi0Var.f8350p != null) {
            if (!gi0Var.f8351q) {
                gi0Var.f8350p.q();
                this.f6763a.f8351q = true;
            }
            this.f6763a.f8350p.m();
        }
    }
}
