package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class eb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ub f7243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ fb f7244b;

    eb(fb fbVar, ub ubVar) {
        this.f7244b = fbVar;
        this.f7243a = ubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7244b.f7702b.put(this.f7243a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
