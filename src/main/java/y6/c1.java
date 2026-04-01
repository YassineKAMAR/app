package y6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 extends b1 implements n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f27482d;

    public c1(Executor executor) {
        this.f27482d = executor;
        d7.c.a(i0());
    }

    private final void h0(h6.g gVar, RejectedExecutionException rejectedExecutionException) {
        n1.c(gVar, a1.a("The task was rejected", rejectedExecutionException));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorI0 = i0();
        ExecutorService executorService = executorI0 instanceof ExecutorService ? (ExecutorService) executorI0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // y6.b0
    public void e0(h6.g gVar, Runnable runnable) {
        try {
            Executor executorI0 = i0();
            c.a();
            executorI0.execute(runnable);
        } catch (RejectedExecutionException e8) {
            c.a();
            h0(gVar, e8);
            s0.b().e0(gVar, runnable);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof c1) && ((c1) obj).i0() == i0();
    }

    public int hashCode() {
        return System.identityHashCode(i0());
    }

    public Executor i0() {
        return this.f27482d;
    }

    @Override // y6.b0
    public String toString() {
        return i0().toString();
    }
}
