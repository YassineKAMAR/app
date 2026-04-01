package y6;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import y6.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends w0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j0 f27501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f27502j;

    static {
        Long l8;
        j0 j0Var = new j0();
        f27501i = j0Var;
        v0.m0(j0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l8 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l8 = 1000L;
        }
        f27502j = timeUnit.toNanos(l8.longValue());
    }

    private j0() {
    }

    private final synchronized void H0() {
        if (K0()) {
            debugStatus = 3;
            C0();
            kotlin.jvm.internal.q.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread I0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean J0() {
        return debugStatus == 4;
    }

    private final boolean K0() {
        int i8 = debugStatus;
        return i8 == 2 || i8 == 3;
    }

    private final synchronized boolean L0() {
        if (K0()) {
            return false;
        }
        debugStatus = 1;
        kotlin.jvm.internal.q.d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void M0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // y6.x0
    protected Thread q0() {
        Thread thread = _thread;
        return thread == null ? I0() : thread;
    }

    @Override // y6.x0
    protected void r0(long j8, w0.a aVar) {
        M0();
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zZ0;
        b2.f27479a.c(this);
        c.a();
        try {
            if (!L0()) {
                if (zZ0) {
                    return;
                } else {
                    return;
                }
            }
            long j8 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jA0 = A0();
                if (jA0 == Long.MAX_VALUE) {
                    c.a();
                    long jNanoTime = System.nanoTime();
                    if (j8 == Long.MAX_VALUE) {
                        j8 = f27502j + jNanoTime;
                    }
                    long j9 = j8 - jNanoTime;
                    if (j9 <= 0) {
                        _thread = null;
                        H0();
                        c.a();
                        if (z0()) {
                            return;
                        }
                        q0();
                        return;
                    }
                    jA0 = t6.l.e(jA0, j9);
                } else {
                    j8 = Long.MAX_VALUE;
                }
                if (jA0 > 0) {
                    if (K0()) {
                        _thread = null;
                        H0();
                        c.a();
                        if (z0()) {
                            return;
                        }
                        q0();
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos(this, jA0);
                }
            }
        } finally {
            _thread = null;
            H0();
            c.a();
            if (!z0()) {
                q0();
            }
        }
    }

    @Override // y6.w0, y6.v0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // y6.w0
    public void w0(Runnable runnable) {
        if (J0()) {
            M0();
        }
        super.w0(runnable);
    }
}
