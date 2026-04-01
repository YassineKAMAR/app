package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class ai0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ gi0 f5275a;

    ai0(gi0 gi0Var) {
        this.f5275a = gi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gi0 gi0Var = this.f5275a;
        if (gi0Var.f8350p != null) {
            gi0Var.f8350p.o();
        }
    }
}
