package y6;

/* JADX INFO: loaded from: classes2.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b2 f27479a = new b2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<v0> f27480b = d7.m0.a(new d7.h0("ThreadLocalEventLoop"));

    private b2() {
    }

    public final v0 a() {
        ThreadLocal<v0> threadLocal = f27480b;
        v0 v0Var = threadLocal.get();
        if (v0Var != null) {
            return v0Var;
        }
        v0 v0VarA = y0.a();
        threadLocal.set(v0VarA);
        return v0VarA;
    }

    public final void b() {
        f27480b.set(null);
    }

    public final void c(v0 v0Var) {
        f27480b.set(v0Var);
    }
}
