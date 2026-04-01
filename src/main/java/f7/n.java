package f7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21862b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f21863c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f21864d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f21865e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray<h> f21866a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    private final h b(h hVar) {
        if (d() == 127) {
            return hVar;
        }
        if (hVar.f21850b.b() == 1) {
            f21865e.incrementAndGet(this);
        }
        int i8 = f21863c.get(this) & 127;
        while (this.f21866a.get(i8) != null) {
            Thread.yield();
        }
        this.f21866a.lazySet(i8, hVar);
        f21863c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar != null) {
            if (hVar.f21850b.b() == 1) {
                f21865e.decrementAndGet(this);
            }
        }
    }

    private final int d() {
        return f21863c.get(this) - f21864d.get(this);
    }

    private final h i() {
        h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f21864d;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 - f21863c.get(this) == 0) {
                return null;
            }
            int i9 = i8 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 + 1) && (andSet = this.f21866a.getAndSet(i9, null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(d dVar) {
        h hVarI = i();
        if (hVarI == null) {
            return false;
        }
        dVar.a(hVarI);
        return true;
    }

    private final h k(boolean z7) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f21862b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                if ((hVar.f21850b.b() == 1) == z7) {
                }
            }
            int i8 = f21864d.get(this);
            int i9 = f21863c.get(this);
            while (i8 != i9) {
                if (z7 && f21865e.get(this) == 0) {
                    return null;
                }
                i9--;
                h hVarM = m(i9, z7);
                if (hVarM != null) {
                    return hVarM;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, hVar, null));
        return hVar;
    }

    private final h l(int i8) {
        int i9 = f21864d.get(this);
        int i10 = f21863c.get(this);
        boolean z7 = i8 == 1;
        while (i9 != i10) {
            if (z7 && f21865e.get(this) == 0) {
                return null;
            }
            int i11 = i9 + 1;
            h hVarM = m(i9, z7);
            if (hVarM != null) {
                return hVarM;
            }
            i9 = i11;
        }
        return null;
    }

    private final h m(int i8, boolean z7) {
        int i9 = i8 & 127;
        h hVar = this.f21866a.get(i9);
        if (hVar != null) {
            if ((hVar.f21850b.b() == 1) == z7 && a7.h.a(this.f21866a, i9, hVar, null)) {
                if (z7) {
                    f21865e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, f7.h, java.lang.Object] */
    private final long o(int i8, y<h> yVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r12;
        do {
            atomicReferenceFieldUpdater = f21862b;
            r12 = (h) atomicReferenceFieldUpdater.get(this);
            if (r12 == 0) {
                return -2L;
            }
            if (((r12.f21850b.b() == 1 ? 1 : 2) & i8) == 0) {
                return -2L;
            }
            long jA = l.f21858f.a() - r12.f21849a;
            long j8 = l.f21854b;
            if (jA < j8) {
                return j8 - jA;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, r12, null));
        yVar.f24325a = r12;
        return -1L;
    }

    public final h a(h hVar, boolean z7) {
        if (z7) {
            return b(hVar);
        }
        h hVar2 = (h) f21862b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int e() {
        return f21862b.get(this) != null ? d() + 1 : d();
    }

    public final void f(d dVar) {
        h hVar = (h) f21862b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (j(dVar)) {
        }
    }

    public final h g() {
        h hVar = (h) f21862b.getAndSet(this, null);
        return hVar == null ? i() : hVar;
    }

    public final h h() {
        return k(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long n(int i8, y<h> yVar) {
        T tI = i8 == 3 ? i() : l(i8);
        if (tI == 0) {
            return o(i8, yVar);
        }
        yVar.f24325a = tI;
        return -1L;
    }
}
