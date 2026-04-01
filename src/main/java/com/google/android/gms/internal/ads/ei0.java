package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class ei0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ gi0 f7337a;

    ei0(gi0 gi0Var) {
        this.f7337a = gi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gi0 gi0Var = this.f7337a;
        if (gi0Var.f8350p != null) {
            gi0Var.f8350p.p();
        }
    }
}
