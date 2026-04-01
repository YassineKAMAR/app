package b6;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static <T> T a(T t7) {
        t7.getClass();
        return t7;
    }

    public static void b(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
