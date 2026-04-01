package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class c53 implements a53 {
    /* synthetic */ c53(b53 b53Var) {
    }

    @Override // com.google.android.gms.internal.ads.a53
    public final ExecutorService a(int i8, ThreadFactory threadFactory, int i9) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i8, i8, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.a53
    public final ExecutorService b(int i8) {
        return a(1, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.ads.a53
    public final ExecutorService c(ThreadFactory threadFactory, int i8) {
        return a(1, threadFactory, 1);
    }
}
