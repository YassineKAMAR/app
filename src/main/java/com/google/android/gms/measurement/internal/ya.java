package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class ya implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ fb f20739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ va f20740b;

    ya(va vaVar, fb fbVar) {
        this.f20740b = vaVar;
        this.f20739a = fbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va.w(this.f20740b, this.f20739a);
        this.f20740b.s0();
    }
}
