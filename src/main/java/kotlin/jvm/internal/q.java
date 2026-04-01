package kotlin.jvm.internal;

import e6.h0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class q {
    private q() {
    }

    public static boolean a(Double d8, Double d9) {
        if (d8 == null) {
            if (d9 == null) {
                return true;
            }
        } else if (d9 != null && d8.doubleValue() == d9.doubleValue()) {
            return true;
        }
        return false;
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void c(Object obj) {
        if (obj == null) {
            n();
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            o(str);
        }
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) k(new NullPointerException(str + " must not be null")));
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            p(str);
        }
    }

    public static int g(int i8, int i9) {
        if (i8 < i9) {
            return -1;
        }
        return i8 == i9 ? 0 : 1;
    }

    public static int h(long j8, long j9) {
        if (j8 < j9) {
            return -1;
        }
        return j8 == j9 ? 0 : 1;
    }

    private static String i(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = q.class.getName();
        int i8 = 0;
        while (!stackTrace[i8].getClassName().equals(name)) {
            i8++;
        }
        while (stackTrace[i8].getClassName().equals(name)) {
            i8++;
        }
        StackTraceElement stackTraceElement = stackTrace[i8];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void j(int i8, String str) {
        q();
    }

    private static <T extends Throwable> T k(T t7) {
        return (T) l(t7, q.class.getName());
    }

    static <T extends Throwable> T l(T t7, String str) {
        StackTraceElement[] stackTrace = t7.getStackTrace();
        int length = stackTrace.length;
        int i8 = -1;
        for (int i9 = 0; i9 < length; i9++) {
            if (str.equals(stackTrace[i9].getClassName())) {
                i8 = i9;
            }
        }
        t7.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i8 + 1, length));
        return t7;
    }

    public static String m(String str, Object obj) {
        return str + obj;
    }

    public static void n() {
        throw ((NullPointerException) k(new NullPointerException()));
    }

    public static void o(String str) {
        throw ((NullPointerException) k(new NullPointerException(str)));
    }

    private static void p(String str) {
        throw ((NullPointerException) k(new NullPointerException(i(str))));
    }

    public static void q() {
        r("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void r(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void s(String str) {
        throw ((h0) k(new h0(str)));
    }

    public static void t(String str) {
        s("lateinit property " + str + " has not been initialized");
    }
}
