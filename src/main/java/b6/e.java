package b6;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static void a(String str) {
        t0.b.c(c(str));
    }

    public static void b(String str, int i8) {
        t0.b.a(c(str), i8);
    }

    private static String c(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void d() {
        t0.b.f();
    }

    public static void e(String str, int i8) {
        t0.b.d(c(str), i8);
    }
}
