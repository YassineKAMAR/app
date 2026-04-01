package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f4864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f4865b;

    j(m mVar, int i8) {
        this.f4865b = mVar;
        this.f4864a = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4865b.h(this.f4864a);
    }
}
