package p1;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static <T> void a(T t7, Class<T> cls) {
        if (t7 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static <T> T b(T t7) {
        t7.getClass();
        return t7;
    }

    public static <T> T c(T t7, String str) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(str);
    }
}
