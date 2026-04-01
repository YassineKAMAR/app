package m3;

import android.app.Activity;
import t3.c;
import t3.d;

/* JADX INFO: loaded from: classes.dex */
public final class u2 implements t3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f24824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h3 f24825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l0 f24826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f24827d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f24828e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24829f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24830g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private t3.d f24831h = new d.a().a();

    public u2(t tVar, h3 h3Var, l0 l0Var) {
        this.f24824a = tVar;
        this.f24825b = h3Var;
        this.f24826c = l0Var;
    }

    @Override // t3.c
    public final void a(Activity activity, t3.d dVar, c.b bVar, c.a aVar) {
        synchronized (this.f24827d) {
            this.f24829f = true;
        }
        this.f24831h = dVar;
        this.f24825b.c(activity, dVar, bVar, aVar);
    }

    @Override // t3.c
    public final int b() {
        if (d()) {
            return this.f24824a.a();
        }
        return 0;
    }

    @Override // t3.c
    public final boolean c() {
        return this.f24826c.e();
    }

    public final boolean d() {
        boolean z7;
        synchronized (this.f24827d) {
            z7 = this.f24829f;
        }
        return z7;
    }

    @Override // t3.c
    public final void reset() {
        this.f24826c.d(null);
        this.f24824a.d();
        synchronized (this.f24827d) {
            this.f24829f = false;
        }
    }
}
