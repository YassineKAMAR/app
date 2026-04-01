package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ry0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f14374a;

    public /* synthetic */ ry0(AtomicReference atomicReference) {
        this.f14374a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ty0.o(this.f14374a);
    }
}
