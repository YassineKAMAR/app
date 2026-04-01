package g4;

import a3.o;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
final class l implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f22024f = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f22025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deque<Runnable> f22026b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f22027c = c.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f22028d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f22029e = new b(this, null);

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f22030a;

        a(Runnable runnable) {
            this.f22030a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22030a.run();
        }

        public String toString() {
            return this.f22030a.toString();
        }
    }

    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Runnable f22032a;

        private b() {
        }

        /* synthetic */ b(l lVar, a aVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        
            r8.f22032a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
        
            g4.l.f22024f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f22032a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
        
            r8.f22032a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = 0
            L2:
                g4.l r2 = g4.l.this     // Catch: java.lang.Throwable -> L82
                java.util.Deque r2 = g4.l.a(r2)     // Catch: java.lang.Throwable -> L82
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L82
                if (r0 != 0) goto L2b
                g4.l r0 = g4.l.this     // Catch: java.lang.Throwable -> L7f
                g4.l$c r0 = g4.l.b(r0)     // Catch: java.lang.Throwable -> L7f
                g4.l$c r3 = g4.l.c.RUNNING     // Catch: java.lang.Throwable -> L7f
                if (r0 != r3) goto L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                g4.l r0 = g4.l.this     // Catch: java.lang.Throwable -> L7f
                g4.l.e(r0)     // Catch: java.lang.Throwable -> L7f
                g4.l r0 = g4.l.this     // Catch: java.lang.Throwable -> L7f
                g4.l.c(r0, r3)     // Catch: java.lang.Throwable -> L7f
                r0 = 1
            L2b:
                g4.l r3 = g4.l.this     // Catch: java.lang.Throwable -> L7f
                java.util.Deque r3 = g4.l.a(r3)     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L7f
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L7f
                r8.f22032a = r3     // Catch: java.lang.Throwable -> L7f
                if (r3 != 0) goto L4d
                g4.l r0 = g4.l.this     // Catch: java.lang.Throwable -> L7f
                g4.l$c r3 = g4.l.c.IDLE     // Catch: java.lang.Throwable -> L7f
                g4.l.c(r0, r3)     // Catch: java.lang.Throwable -> L7f
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L4c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4c:
                return
            L4d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L82
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f22032a     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
                r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            L59:
                r8.f22032a = r2     // Catch: java.lang.Throwable -> L82
                goto L2
            L5c:
                r0 = move-exception
                goto L7c
            L5e:
                r3 = move-exception
                java.util.logging.Logger r4 = g4.l.f()     // Catch: java.lang.Throwable -> L5c
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
                r6.<init>()     // Catch: java.lang.Throwable -> L5c
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.Runnable r7 = r8.f22032a     // Catch: java.lang.Throwable -> L5c
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
                goto L59
            L7c:
                r8.f22032a = r2     // Catch: java.lang.Throwable -> L82
                throw r0     // Catch: java.lang.Throwable -> L82
            L7f:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                throw r0     // Catch: java.lang.Throwable -> L82
            L82:
                r0 = move-exception
                if (r1 == 0) goto L8c
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g4.l.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e8) {
                synchronized (l.this.f22026b) {
                    l.this.f22027c = c.IDLE;
                    throw e8;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f22032a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + l.this.f22027c + "}";
        }
    }

    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    l(Executor executor) {
        this.f22025a = (Executor) o.j(executor);
    }

    static /* synthetic */ long e(l lVar) {
        long j8 = lVar.f22028d;
        lVar.f22028d = 1 + j8;
        return j8;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        o.j(runnable);
        synchronized (this.f22026b) {
            c cVar2 = this.f22027c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j8 = this.f22028d;
                a aVar = new a(runnable);
                this.f22026b.add(aVar);
                c cVar3 = c.QUEUING;
                this.f22027c = cVar3;
                try {
                    this.f22025a.execute(this.f22029e);
                    if (this.f22027c != cVar3) {
                        return;
                    }
                    synchronized (this.f22026b) {
                        if (this.f22028d == j8 && this.f22027c == cVar3) {
                            this.f22027c = cVar;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e8) {
                    synchronized (this.f22026b) {
                        c cVar4 = this.f22027c;
                        if ((cVar4 != c.IDLE && cVar4 != c.QUEUING) || !this.f22026b.removeLastOccurrence(aVar)) {
                            z = false;
                        }
                        if (!(e8 instanceof RejectedExecutionException) || z) {
                            throw e8;
                        }
                    }
                    return;
                }
            }
            this.f22026b.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f22025a + "}";
    }
}
