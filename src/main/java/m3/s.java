package m3;

import android.app.Application;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o2 f24809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o2 f24810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o2 f24811c;

    public s(o2 o2Var, o2 o2Var2, o2 o2Var3) {
        this.f24809a = o2Var;
        this.f24810b = o2Var2;
        this.f24811c = o2Var3;
    }

    @Override // m3.o2
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r k() {
        Application application = (Application) this.f24809a.k();
        t tVar = (t) this.f24810b.k();
        Executor executor = p1.f24789b;
        n2.a(executor);
        return new r(application, tVar, executor);
    }
}
