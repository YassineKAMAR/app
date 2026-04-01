package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class l implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f2913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<Runnable> f2914b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f2915c;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f2916a;

        a(Runnable runnable) {
            this.f2916a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f2916a.run();
            } finally {
                l.this.a();
            }
        }
    }

    l(Executor executor) {
        this.f2913a = executor;
    }

    synchronized void a() {
        Runnable runnablePoll = this.f2914b.poll();
        this.f2915c = runnablePoll;
        if (runnablePoll != null) {
            this.f2913a.execute(runnablePoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f2914b.offer(new a(runnable));
        if (this.f2915c == null) {
            a();
        }
    }
}
