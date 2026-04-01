package m3;

import android.app.Application;
import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o2 f24857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o2 f24858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o2 f24859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o2 f24860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o2 f24861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o2 f24862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o2 f24863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o2 f24864h;

    public z0(o2 o2Var, o2 o2Var2, o2 o2Var3, o2 o2Var4, o2 o2Var5, o2 o2Var6, o2 o2Var7, o2 o2Var8) {
        this.f24857a = o2Var;
        this.f24858b = o2Var2;
        this.f24859c = o2Var3;
        this.f24860d = o2Var4;
        this.f24861e = o2Var5;
        this.f24862f = o2Var6;
        this.f24863g = o2Var7;
        this.f24864h = o2Var8;
    }

    @Override // m3.o2
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y0 k() {
        Application application = (Application) this.f24857a.k();
        t0 t0Var = (t0) this.f24858b.k();
        Handler handler = p1.f24788a;
        n2.a(handler);
        Executor executor = p1.f24789b;
        n2.a(executor);
        return new y0(application, t0Var, handler, executor, (r2) this.f24861e.k(), ((s) this.f24862f).k(), (g0) this.f24863g.k(), (t) this.f24864h.k());
    }
}
