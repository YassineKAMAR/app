package m3;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
final class o1 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f24786b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f24785a = new AtomicInteger(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f24787c = new WeakReference(null);

    o1(String str) {
        final String str2 = "Google consent worker";
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(str2) { // from class: m3.n1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f24780b = "Google consent worker";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return this.f24779a.a(this.f24780b, runnable);
            }
        });
        this.f24786b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    final /* synthetic */ Thread a(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, "Google consent worker #" + this.f24785a.getAndIncrement());
        this.f24787c = new WeakReference(thread);
        return thread;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f24787c.get()) {
            runnable.run();
        } else {
            this.f24786b.execute(runnable);
        }
    }
}
