package t4;

/* JADX INFO: loaded from: classes.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f26505a;

    private b() {
    }

    public static b b() {
        if (f26505a == null) {
            f26505a = new b();
        }
        return f26505a;
    }

    @Override // t4.a
    public long a() {
        return System.currentTimeMillis();
    }
}
