package v1;

/* JADX INFO: loaded from: classes.dex */
public final class i implements p1.b<Integer> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final i f26787a = new i();
    }

    public static i a() {
        return a.f26787a;
    }

    public static int c() {
        return f.c();
    }

    @Override // d6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c());
    }
}
