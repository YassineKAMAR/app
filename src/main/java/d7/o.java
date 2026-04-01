package d7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends y6.b0 implements y6.n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f21044h = AtomicIntegerFieldUpdater.newUpdater(o.class, "runningWorkers");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y6.b0 f21045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ y6.n0 f21047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t<Runnable> f21048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f21049g;
    private volatile int runningWorkers;

    private final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Runnable f21050a;

        public a(Runnable runnable) {
            this.f21050a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8 = 0;
            while (true) {
                try {
                    this.f21050a.run();
                } catch (Throwable th) {
                    y6.d0.a(h6.h.f22443a, th);
                }
                Runnable runnableJ0 = o.this.j0();
                if (runnableJ0 == null) {
                    return;
                }
                this.f21050a = runnableJ0;
                i8++;
                if (i8 >= 16 && o.this.f21045c.f0(o.this)) {
                    o.this.f21045c.e0(o.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(y6.b0 b0Var, int i8) {
        this.f21045c = b0Var;
        this.f21046d = i8;
        y6.n0 n0Var = b0Var instanceof y6.n0 ? (y6.n0) b0Var : null;
        this.f21047e = n0Var == null ? y6.k0.a() : n0Var;
        this.f21048f = new t<>(false);
        this.f21049g = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable j0() {
        while (true) {
            Runnable runnableD = this.f21048f.d();
            if (runnableD != null) {
                return runnableD;
            }
            synchronized (this.f21049g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f21044h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f21048f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    private final boolean k0() {
        boolean z7;
        synchronized (this.f21049g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f21044h;
            if (atomicIntegerFieldUpdater.get(this) >= this.f21046d) {
                z7 = false;
            } else {
                atomicIntegerFieldUpdater.incrementAndGet(this);
                z7 = true;
            }
        }
        return z7;
    }

    @Override // y6.b0
    public void e0(h6.g gVar, Runnable runnable) {
        Runnable runnableJ0;
        this.f21048f.a(runnable);
        if (f21044h.get(this) >= this.f21046d || !k0() || (runnableJ0 = j0()) == null) {
            return;
        }
        this.f21045c.e0(this, new a(runnableJ0));
    }
}
