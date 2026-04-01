package g1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f21929f = x0.j.f("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadFactory f21930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f21931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map<String, c> f21932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map<String, b> f21933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Object f21934e;

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f21935a = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f21935a);
            this.f21935a = this.f21935a + 1;
            return threadNewThread;
        }
    }

    public interface b {
        void a(String str);
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f21937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f21938b;

        c(p pVar, String str) {
            this.f21937a = pVar;
            this.f21938b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f21937a.f21934e) {
                if (this.f21937a.f21932c.remove(this.f21938b) != null) {
                    b bVarRemove = this.f21937a.f21933d.remove(this.f21938b);
                    if (bVarRemove != null) {
                        bVarRemove.a(this.f21938b);
                    }
                } else {
                    x0.j.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f21938b), new Throwable[0]);
                }
            }
        }
    }

    public p() {
        a aVar = new a();
        this.f21930a = aVar;
        this.f21932c = new HashMap();
        this.f21933d = new HashMap();
        this.f21934e = new Object();
        this.f21931b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (this.f21931b.isShutdown()) {
            return;
        }
        this.f21931b.shutdownNow();
    }

    public void b(String str, long j8, b bVar) {
        synchronized (this.f21934e) {
            x0.j.c().a(f21929f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f21932c.put(str, cVar);
            this.f21933d.put(str, bVar);
            this.f21931b.schedule(cVar, j8, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f21934e) {
            if (this.f21932c.remove(str) != null) {
                x0.j.c().a(f21929f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f21933d.remove(str);
            }
        }
    }
}
