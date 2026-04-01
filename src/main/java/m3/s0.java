package m3;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o2 f24812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o2 f24813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o2 f24814c;

    public s0(o2 o2Var, o2 o2Var2, o2 o2Var3) {
        this.f24812a = o2Var;
        this.f24813b = o2Var2;
        this.f24814c = o2Var3;
    }

    @Override // m3.o2
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r0 k() {
        t0 t0Var = (t0) this.f24812a.k();
        Handler handler = p1.f24788a;
        n2.a(handler);
        return new r0(t0Var, handler, ((z0) this.f24814c).k());
    }
}
