package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class xh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ gi0 f17227a;

    xh0(gi0 gi0Var) {
        this.f17227a = gi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gi0 gi0Var = this.f17227a;
        if (gi0Var.f8350p != null) {
            gi0Var.f8350p.j();
        }
    }
}
