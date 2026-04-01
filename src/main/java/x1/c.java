package x1;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p1.b<x1.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f27229a = new c();
    }

    public static c a() {
        return a.f27229a;
    }

    public static x1.a b() {
        return (x1.a) p1.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // d6.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public x1.a get() {
        return b();
    }
}
