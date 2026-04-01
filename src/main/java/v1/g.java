package v1;

/* JADX INFO: loaded from: classes.dex */
public final class g implements p1.b<String> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f26784a = new g();
    }

    public static g a() {
        return a.f26784a;
    }

    public static String b() {
        return (String) p1.d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // d6.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
