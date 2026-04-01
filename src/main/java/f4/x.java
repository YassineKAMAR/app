package f4;

/* JADX INFO: loaded from: classes.dex */
public class x<T> implements o4.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f21777c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f21778a = f21777c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile o4.b<T> f21779b;

    public x(o4.b<T> bVar) {
        this.f21779b = bVar;
    }

    @Override // o4.b
    public T get() {
        T t7 = (T) this.f21778a;
        Object obj = f21777c;
        if (t7 == obj) {
            synchronized (this) {
                t7 = (T) this.f21778a;
                if (t7 == obj) {
                    t7 = this.f21779b.get();
                    this.f21778a = t7;
                    this.f21779b = null;
                }
            }
        }
        return t7;
    }
}
