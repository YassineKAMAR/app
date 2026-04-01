package y6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f27514c = AtomicIntegerFieldUpdater.newUpdater(n.class, "_resumed");
    private volatile int _resumed;

    public n(h6.d<?> dVar, Throwable th, boolean z7) {
        if (th == null) {
            th = new CancellationException("Continuation " + dVar + " was cancelled normally");
        }
        super(th, z7);
        this._resumed = 0;
    }

    public final boolean c() {
        return f27514c.compareAndSet(this, 0, 1);
    }
}
