package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
final class s2 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ThreadFactory f19148a = Executors.defaultThreadFactory();

    s2(g2 g2Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f19148a.newThread(runnable);
        threadNewThread.setName("ScionFrontendApi");
        return threadNewThread;
    }
}
