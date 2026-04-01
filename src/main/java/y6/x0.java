package y6;

import java.util.concurrent.locks.LockSupport;
import y6.w0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x0 extends v0 {
    protected abstract Thread q0();

    protected void r0(long j8, w0.a aVar) {
        j0.f27501i.D0(j8, aVar);
    }

    protected final void s0() {
        Thread threadQ0 = q0();
        if (Thread.currentThread() != threadQ0) {
            c.a();
            LockSupport.unpark(threadQ0);
        }
    }
}
