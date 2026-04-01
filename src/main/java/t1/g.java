package t1;

/* JADX INFO: loaded from: classes.dex */
public final class g implements p1.b<u1.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d6.a<x1.a> f26481a;

    public g(d6.a<x1.a> aVar) {
        this.f26481a = aVar;
    }

    public static u1.f a(x1.a aVar) {
        return (u1.f) p1.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(d6.a<x1.a> aVar) {
        return new g(aVar);
    }

    @Override // d6.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u1.f get() {
        return a(this.f26481a.get());
    }
}
