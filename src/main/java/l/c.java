package l;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile c f24328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Executor f24329d = new Executor() { // from class: l.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.h(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f24330e = new Executor() { // from class: l.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.i(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f24331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f24332b;

    private c() {
        d dVar = new d();
        this.f24332b = dVar;
        this.f24331a = dVar;
    }

    public static Executor f() {
        return f24330e;
    }

    public static c g() {
        if (f24328c != null) {
            return f24328c;
        }
        synchronized (c.class) {
            if (f24328c == null) {
                f24328c = new c();
            }
        }
        return f24328c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Runnable runnable) {
        g().c(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Runnable runnable) {
        g().a(runnable);
    }

    @Override // l.f
    public void a(Runnable runnable) {
        this.f24331a.a(runnable);
    }

    @Override // l.f
    public boolean b() {
        return this.f24331a.b();
    }

    @Override // l.f
    public void c(Runnable runnable) {
        this.f24331a.c(runnable);
    }
}
