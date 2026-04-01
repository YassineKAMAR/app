package m3;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import t3.f;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o2 f24766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f24767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f24768c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f24769d = new AtomicReference();

    l0(o2 o2Var, Executor executor) {
        this.f24766a = o2Var;
        this.f24767b = executor;
    }

    final /* synthetic */ void a(g0 g0Var) {
        final AtomicReference atomicReference = this.f24769d;
        g0Var.c(new f.b() { // from class: m3.i0
            @Override // t3.f.b
            public final void b(t3.b bVar) {
                atomicReference.set(bVar);
            }
        }, new f.a() { // from class: m3.j0
            @Override // t3.f.a
            public final void a(t3.e eVar) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(eVar.b())));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, m3.z] */
    public final void b(f.b bVar, f.a aVar) {
        p1.a();
        n0 n0Var = (n0) this.f24768c.get();
        if (n0Var == null) {
            aVar.a(new t2(3, "No available form can be built.").a());
            return;
        }
        ?? K = this.f24766a.k();
        K.a(n0Var);
        K.k().j().c(bVar, aVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, m3.z] */
    public final void c() {
        n0 n0Var = (n0) this.f24768c.get();
        if (n0Var == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        ?? K = this.f24766a.k();
        K.a(n0Var);
        final g0 g0VarJ = K.k().j();
        g0VarJ.f24687m = true;
        p1.f24788a.post(new Runnable() { // from class: m3.k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f24759a.a(g0VarJ);
            }
        });
    }

    public final void d(n0 n0Var) {
        this.f24768c.set(n0Var);
    }

    public final boolean e() {
        return this.f24768c.get() != null;
    }
}
