package x1;

/* JADX INFO: loaded from: classes.dex */
public final class d implements p1.b<x1.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f27230a = new d();
    }

    public static d a() {
        return a.f27230a;
    }

    public static x1.a c() {
        return (x1.a) p1.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // d6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x1.a get() {
        return c();
    }
}
