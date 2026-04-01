package g1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class i implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f21888b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Runnable f21890d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f21887a = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f21889c = new Object();

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i f21891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Runnable f21892b;

        a(i iVar, Runnable runnable) {
            this.f21891a = iVar;
            this.f21892b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f21892b.run();
            } finally {
                this.f21891a.b();
            }
        }
    }

    public i(Executor executor) {
        this.f21888b = executor;
    }

    public boolean a() {
        boolean z7;
        synchronized (this.f21889c) {
            z7 = !this.f21887a.isEmpty();
        }
        return z7;
    }

    void b() {
        synchronized (this.f21889c) {
            a aVarPoll = this.f21887a.poll();
            this.f21890d = aVarPoll;
            if (aVarPoll != null) {
                this.f21888b.execute(this.f21890d);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f21889c) {
            this.f21887a.add(new a(this, runnable));
            if (this.f21890d == null) {
                b();
            }
        }
    }
}
