package d7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class t<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21062a = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_cur");
    private volatile Object _cur;

    public t(boolean z7) {
        this._cur = new u(8, z7);
    }

    public final boolean a(E e8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21062a;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            int iA = uVar.a(e8);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.concurrent.futures.b.a(f21062a, this, uVar, uVar.i());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21062a;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            if (uVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f21062a, this, uVar, uVar.i());
            }
        }
    }

    public final int c() {
        return ((u) f21062a.get(this)).f();
    }

    public final E d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21062a;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            E e8 = (E) uVar.j();
            if (e8 != u.f21066h) {
                return e8;
            }
            androidx.concurrent.futures.b.a(f21062a, this, uVar, uVar.i());
        }
    }
}
