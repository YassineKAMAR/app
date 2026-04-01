package m3;

import android.app.Application;
import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class i3 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o2 f24730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o2 f24731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o2 f24732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o2 f24733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o2 f24734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o2 f24735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o2 f24736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o2 f24737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o2 f24738i;

    public i3(o2 o2Var, o2 o2Var2, o2 o2Var3, o2 o2Var4, o2 o2Var5, o2 o2Var6, o2 o2Var7, o2 o2Var8, o2 o2Var9) {
        this.f24730a = o2Var;
        this.f24731b = o2Var2;
        this.f24732c = o2Var3;
        this.f24733d = o2Var4;
        this.f24734e = o2Var5;
        this.f24735f = o2Var6;
        this.f24736g = o2Var7;
        this.f24737h = o2Var8;
        this.f24738i = o2Var9;
    }

    @Override // m3.o2
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h3 k() {
        Application application = (Application) this.f24730a.k();
        f fVar = (f) this.f24731b.k();
        Handler handler = p1.f24788a;
        n2.a(handler);
        Executor executor = p1.f24789b;
        n2.a(executor);
        return new h3(application, fVar, handler, executor, (t) this.f24734e.k(), (l0) this.f24735f.k(), ((a3) this.f24736g).k(), ((e) this.f24737h).k(), (r2) this.f24738i.k());
    }
}
