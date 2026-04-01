package t0;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f26459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f26460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f26461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f26462d;

    @SuppressLint({"NewApi"})
    public static void a(String str, int i8) {
        try {
            if (f26461c == null) {
                f.a(str, i8);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i8);
    }

    private static void b(String str, int i8) {
        try {
            if (f26461c == null) {
                f26461c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f26461c.invoke(null, Long.valueOf(f26459a), str, Integer.valueOf(i8));
        } catch (Exception e8) {
            g("asyncTraceBegin", e8);
        }
    }

    public static void c(String str) {
        c.a(str);
    }

    @SuppressLint({"NewApi"})
    public static void d(String str, int i8) {
        try {
            if (f26462d == null) {
                f.b(str, i8);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i8);
    }

    private static void e(String str, int i8) {
        try {
            if (f26462d == null) {
                f26462d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f26462d.invoke(null, Long.valueOf(f26459a), str, Integer.valueOf(i8));
        } catch (Exception e8) {
            g("asyncTraceEnd", e8);
        }
    }

    public static void f() {
        c.b();
    }

    private static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    public static boolean h() {
        try {
            if (f26460b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return i();
    }

    private static boolean i() {
        try {
            if (f26460b == null) {
                f26459a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f26460b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f26460b.invoke(null, Long.valueOf(f26459a))).booleanValue();
        } catch (Exception e8) {
            g("isTagEnabled", e8);
            return false;
        }
    }
}
