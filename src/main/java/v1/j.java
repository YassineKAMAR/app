package v1;

/* JADX INFO: loaded from: classes.dex */
public final class j implements p1.b<e> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final j f26791a = new j();
    }

    public static j a() {
        return a.f26791a;
    }

    public static e c() {
        return (e) p1.d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // d6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c();
    }
}
