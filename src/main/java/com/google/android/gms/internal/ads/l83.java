package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class l83 {
    public static int a(int i8, int i9, String str) {
        String strB;
        if (i8 >= 0 && i8 < i9) {
            return i8;
        }
        if (i8 < 0) {
            strB = b93.b("%s (%s) must not be negative", "index", Integer.valueOf(i8));
        } else {
            if (i9 < 0) {
                throw new IllegalArgumentException("negative size: " + i9);
            }
            strB = b93.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(strB);
    }

    public static int b(int i8, int i9, String str) {
        if (i8 < 0 || i8 > i9) {
            throw new IndexOutOfBoundsException(k(i8, i9, "index"));
        }
        return i8;
    }

    public static Object c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object d(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(b93.b(str, obj2));
    }

    public static void e(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void g(boolean z7, String str, long j8) {
        if (!z7) {
            throw new IllegalArgumentException(b93.b(str, Long.valueOf(j8)));
        }
    }

    public static void h(int i8, int i9, int i10) {
        if (i8 < 0 || i9 < i8 || i9 > i10) {
            throw new IndexOutOfBoundsException((i8 < 0 || i8 > i10) ? k(i8, i10, "start index") : (i9 < 0 || i9 > i10) ? k(i9, i10, "end index") : b93.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i8)));
        }
    }

    public static void i(boolean z7) {
        if (!z7) {
            throw new IllegalStateException();
        }
    }

    public static void j(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String k(int i8, int i9, String str) {
        if (i8 < 0) {
            return b93.b("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return b93.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException("negative size: " + i9);
    }
}
