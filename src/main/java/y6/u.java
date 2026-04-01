package y6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f27551b = AtomicIntegerFieldUpdater.newUpdater(u.class, "_handled");
    private volatile int _handled;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f27552a;

    public u(Throwable th, boolean z7) {
        this.f27552a = th;
        this._handled = z7 ? 1 : 0;
    }

    public /* synthetic */ u(Throwable th, boolean z7, int i8, kotlin.jvm.internal.j jVar) {
        this(th, (i8 & 2) != 0 ? false : z7);
    }

    public final boolean a() {
        return f27551b.get(this) != 0;
    }

    public final boolean b() {
        return f27551b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return i0.a(this) + '[' + this.f27552a + ']';
    }
}
