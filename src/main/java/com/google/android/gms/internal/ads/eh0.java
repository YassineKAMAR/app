package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class eh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lg3 f7322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final lg3 f7323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final lg3 f7324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ScheduledExecutorService f7325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final lg3 f7326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final lg3 f7327f;

    static {
        Executor threadPoolExecutor;
        ExecutorService executorServiceA;
        ExecutorService executorServiceC;
        if (e3.d.a()) {
            d53.a();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ah0("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new ah0("Default"));
        }
        ch0 ch0Var = null;
        f7322a = new dh0(threadPoolExecutor, ch0Var);
        if (e3.d.a()) {
            executorServiceA = d53.a().a(5, new ah0("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ah0("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executorServiceA = threadPoolExecutor2;
        }
        f7323b = new dh0(executorServiceA, ch0Var);
        if (e3.d.a()) {
            executorServiceC = d53.a().c(new ah0("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ah0("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceC = threadPoolExecutor3;
        }
        f7324c = new dh0(executorServiceC, ch0Var);
        f7325d = new zg0(3, new ah0("Schedule"));
        f7326e = new dh0(new bh0(), ch0Var);
        f7327f = new dh0(rg3.b(), ch0Var);
    }
}
