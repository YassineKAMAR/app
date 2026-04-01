package m3;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public final class a3 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o2 f24615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o2 f24616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o2 f24617c;

    public a3(o2 o2Var, o2 o2Var2, o2 o2Var3) {
        this.f24615a = o2Var;
        this.f24616b = o2Var2;
        this.f24617c = o2Var3;
    }

    @Override // m3.o2
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w2 k() {
        return new w2((Application) this.f24615a.k(), ((b0) this.f24616b).k(), (t) this.f24617c.k());
    }
}
