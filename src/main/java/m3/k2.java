package m3;

/* JADX INFO: loaded from: classes.dex */
public final class k2 implements o2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f24763c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile o2 f24764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f24765b = f24763c;

    private k2(o2 o2Var) {
        this.f24764a = o2Var;
    }

    public static o2 a(o2 o2Var) {
        return o2Var instanceof k2 ? o2Var : new k2(o2Var);
    }

    @Override // m3.o2
    public final Object k() {
        Object objK = this.f24765b;
        Object obj = f24763c;
        if (objK == obj) {
            synchronized (this) {
                objK = this.f24765b;
                if (objK == obj) {
                    objK = this.f24764a.k();
                    Object obj2 = this.f24765b;
                    if (obj2 != obj && obj2 != objK) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objK + ". This is likely due to a circular dependency.");
                    }
                    this.f24765b = objK;
                    this.f24764a = null;
                }
            }
        }
        return objK;
    }
}
