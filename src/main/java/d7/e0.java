package d7;

import d7.e0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import y6.x1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e0<S extends e0<S>> extends e<S> implements x1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f21016d = AtomicIntegerFieldUpdater.newUpdater(e0.class, "cleanedAndPointers");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21017c;
    private volatile int cleanedAndPointers;

    public e0(long j8, S s8, int i8) {
        super(s8);
        this.f21017c = j8;
        this.cleanedAndPointers = i8 << 16;
    }

    @Override // d7.e
    public boolean h() {
        return f21016d.get(this) == n() && !i();
    }

    public final boolean m() {
        return f21016d.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i8, Throwable th, h6.g gVar);

    public final void p() {
        if (f21016d.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f21016d;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            if (!(i8 != n() || i())) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 65536 + i8));
        return true;
    }
}
