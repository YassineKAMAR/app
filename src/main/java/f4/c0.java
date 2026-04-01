package f4;

/* JADX INFO: loaded from: classes.dex */
class c0<T> implements o4.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o4.a<Object> f21723c = new o4.a() { // from class: f4.a0
        @Override // o4.a
        public final void a(o4.b bVar) {
            c0.d(bVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o4.b<Object> f21724d = new o4.b() { // from class: f4.b0
        @Override // o4.b
        public final Object get() {
            return c0.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o4.a<T> f21725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile o4.b<T> f21726b;

    private c0(o4.a<T> aVar, o4.b<T> bVar) {
        this.f21725a = aVar;
        this.f21726b = bVar;
    }

    static <T> c0<T> c() {
        return new c0<>(f21723c, f21724d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(o4.b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object e() {
        return null;
    }

    void f(o4.b<T> bVar) {
        o4.a<T> aVar;
        if (this.f21726b != f21724d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f21725a;
            this.f21725a = null;
            this.f21726b = bVar;
        }
        aVar.a(bVar);
    }

    @Override // o4.b
    public T get() {
        return this.f21726b.get();
    }
}
