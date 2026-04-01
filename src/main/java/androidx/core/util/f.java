package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static int a(int i8) {
        if (i8 >= 0) {
            return i8;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T b(T t7) {
        t7.getClass();
        return t7;
    }

    public static <T> T c(T t7, Object obj) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
