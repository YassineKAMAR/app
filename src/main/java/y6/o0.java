package y6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class o0<T> extends d7.d0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f27516e = AtomicIntegerFieldUpdater.newUpdater(o0.class, "_decision");
    private volatile int _decision;

    private final boolean C0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f27516e;
        do {
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 != 0) {
                if (i8 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f27516e.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // d7.d0, y6.q1
    protected void l(Object obj) {
        y0(obj);
    }

    @Override // d7.d0, y6.a
    protected void y0(Object obj) {
        if (C0()) {
            return;
        }
        d7.k.c(i6.c.c(this.f21013d), y.a(obj, this.f21013d), null, 2, null);
    }
}
