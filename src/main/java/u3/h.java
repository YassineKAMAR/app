package u3;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static String a(int i8, int i9, String str) {
        if (i8 < 0) {
            return j.a("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return j.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i9);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String b(int i8, int i9, String str) {
        if (i8 < 0) {
            return j.a("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return j.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i9);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String c(int i8, int i9, int i10) {
        return (i8 < 0 || i8 > i10) ? b(i8, i10, "start index") : (i9 < 0 || i9 > i10) ? b(i9, i10, "end index") : j.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i8));
    }

    public static void d(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z7, String str, int i8, int i9) {
        if (!z7) {
            throw new IllegalArgumentException(j.a(str, Integer.valueOf(i8), Integer.valueOf(i9)));
        }
    }

    public static int g(int i8, int i9) {
        return h(i8, i9, "index");
    }

    public static int h(int i8, int i9, String str) {
        if (i8 < 0 || i8 >= i9) {
            throw new IndexOutOfBoundsException(a(i8, i9, str));
        }
        return i8;
    }

    public static <T> T i(T t7) {
        t7.getClass();
        return t7;
    }

    public static <T> T j(T t7, Object obj) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int k(int i8, int i9) {
        return l(i8, i9, "index");
    }

    public static int l(int i8, int i9, String str) {
        if (i8 < 0 || i8 > i9) {
            throw new IndexOutOfBoundsException(b(i8, i9, str));
        }
        return i8;
    }

    public static void m(int i8, int i9, int i10) {
        if (i8 < 0 || i9 < i8 || i9 > i10) {
            throw new IndexOutOfBoundsException(c(i8, i9, i10));
        }
    }

    public static void n(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void o(boolean z7, String str, Object obj) {
        if (!z7) {
            throw new IllegalStateException(j.a(str, obj));
        }
    }
}
