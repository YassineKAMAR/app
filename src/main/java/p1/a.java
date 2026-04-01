package p1;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> implements d6.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f25470c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile d6.a<T> f25471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f25472b = f25470c;

    private a(d6.a<T> aVar) {
        this.f25471a = aVar;
    }

    public static <P extends d6.a<T>, T> d6.a<T> a(P p8) {
        d.b(p8);
        return p8 instanceof a ? p8 : new a(p8);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f25470c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // d6.a
    public T get() {
        T t7 = (T) this.f25472b;
        Object obj = f25470c;
        if (t7 == obj) {
            synchronized (this) {
                t7 = (T) this.f25472b;
                if (t7 == obj) {
                    t7 = this.f25471a.get();
                    this.f25472b = b(this.f25472b, t7);
                    this.f25471a = null;
                }
            }
        }
        return t7;
    }
}
