package y6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
final class h1 extends l1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f27498f = AtomicIntegerFieldUpdater.newUpdater(h1.class, "_invoked");
    private volatile int _invoked;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p6.l<Throwable, e6.i0> f27499e;

    /* JADX WARN: Multi-variable type inference failed */
    public h1(p6.l<? super Throwable, e6.i0> lVar) {
        this.f27499e = lVar;
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ e6.i0 invoke(Throwable th) {
        s(th);
        return e6.i0.f21430a;
    }

    @Override // y6.w
    public void s(Throwable th) {
        if (f27498f.compareAndSet(this, 0, 1)) {
            this.f27499e.invoke(th);
        }
    }
}
