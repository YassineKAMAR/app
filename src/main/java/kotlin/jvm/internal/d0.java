package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class d0 {
    public static Object a(Object obj, int i8) {
        if (obj != null && !c(obj, i8)) {
            f(obj, "kotlin.jvm.functions.Function" + i8);
        }
        return obj;
    }

    public static int b(Object obj) {
        if (obj instanceof m) {
            return ((m) obj).getArity();
        }
        if (obj instanceof p6.a) {
            return 0;
        }
        if (obj instanceof p6.l) {
            return 1;
        }
        if (obj instanceof p6.p) {
            return 2;
        }
        if (obj instanceof p6.q) {
            return 3;
        }
        if (obj instanceof p6.r) {
            return 4;
        }
        if (obj instanceof p6.s) {
            return 5;
        }
        if (obj instanceof p6.t) {
            return 6;
        }
        if (obj instanceof p6.u) {
            return 7;
        }
        if (obj instanceof p6.v) {
            return 8;
        }
        if (obj instanceof p6.w) {
            return 9;
        }
        if (obj instanceof p6.b) {
            return 10;
        }
        if (obj instanceof p6.c) {
            return 11;
        }
        if (obj instanceof p6.d) {
            return 12;
        }
        if (obj instanceof p6.e) {
            return 13;
        }
        if (obj instanceof p6.f) {
            return 14;
        }
        if (obj instanceof p6.g) {
            return 15;
        }
        if (obj instanceof p6.h) {
            return 16;
        }
        if (obj instanceof p6.i) {
            return 17;
        }
        if (obj instanceof p6.j) {
            return 18;
        }
        if (obj instanceof p6.k) {
            return 19;
        }
        if (obj instanceof p6.m) {
            return 20;
        }
        if (obj instanceof p6.n) {
            return 21;
        }
        return obj instanceof p6.o ? 22 : -1;
    }

    public static boolean c(Object obj, int i8) {
        return (obj instanceof e6.g) && b(obj) == i8;
    }

    private static <T extends Throwable> T d(T t7) {
        return (T) q.l(t7, d0.class.getName());
    }

    public static ClassCastException e(ClassCastException classCastException) {
        throw ((ClassCastException) d(classCastException));
    }

    public static void f(Object obj, String str) {
        g((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void g(String str) {
        throw e(new ClassCastException(str));
    }
}
