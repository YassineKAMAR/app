package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class h {

    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f2121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2122b;

        /* JADX INFO: renamed from: androidx.core.provider.h$a$a, reason: collision with other inner class name */
        private static class C0027a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f2123a;

            C0027a(Runnable runnable, String str, int i8) {
                super(runnable, str);
                this.f2123a = i8;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f2123a);
                super.run();
            }
        }

        a(String str, int i8) {
            this.f2121a = str;
            this.f2122b = i8;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0027a(runnable, this.f2121a, this.f2122b);
        }
    }

    private static class b<T> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Callable<T> f2124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.core.util.a<T> f2125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f2126c;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.core.util.a f2127a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f2128b;

            a(androidx.core.util.a aVar, Object obj) {
                this.f2127a = aVar;
                this.f2128b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f2127a.accept(this.f2128b);
            }
        }

        b(Handler handler, Callable<T> callable, androidx.core.util.a<T> aVar) {
            this.f2124a = callable;
            this.f2125b = aVar;
            this.f2126c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f2124a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f2126c.post(new a(this.f2125b, tCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i8, int i9) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i9, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i8));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static <T> void b(Executor executor, Callable<T> callable, androidx.core.util.a<T> aVar) {
        executor.execute(new b(androidx.core.provider.b.a(), callable, aVar));
    }

    static <T> T c(ExecutorService executorService, Callable<T> callable, int i8) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i8, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            throw e8;
        } catch (ExecutionException e9) {
            throw new RuntimeException(e9);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
