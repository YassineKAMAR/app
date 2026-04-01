package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class s7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f20480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f20481b;

    s7(b7 b7Var, long j8) {
        this.f20481b = b7Var;
        this.f20480a = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20481b.E(this.f20480a, true);
        this.f20481b.r().O(new AtomicReference<>());
    }
}
