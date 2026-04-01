package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class bh0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f5788a = new j2.w1(Looper.getMainLooper());

    bh0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.f5788a.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            g2.t.r();
            j2.k2.l(g2.t.q().c(), th);
            throw th;
        }
    }
}
