package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.n1;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class b extends ThreadPoolExecutor {
    b(FirebaseAnalytics firebaseAnalytics, int i8, int i9, long j8, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(n1.a().d(runnable));
    }
}
