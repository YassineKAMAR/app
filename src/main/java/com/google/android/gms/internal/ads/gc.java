package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8286a = "Volley";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f8287b = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f8288c = gc.class.getName();

    public static void a(String str, Object... objArr) {
        Log.d(f8286a, e(str, objArr));
    }

    public static void b(String str, Object... objArr) {
        Log.e(f8286a, e(str, objArr));
    }

    public static void c(Throwable th, String str, Object... objArr) {
        Log.e(f8286a, e(str, objArr), th);
    }

    public static void d(String str, Object... objArr) {
        if (f8287b) {
            Log.v(f8286a, e(str, objArr));
        }
    }

    private static String e(String str, Object... objArr) {
        String str2;
        String str3 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i8 = 2;
        while (true) {
            if (i8 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i8].getClassName().equals(f8288c)) {
                String className = stackTrace[i8].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i8].getMethodName();
                break;
            }
            i8++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str3);
    }
}
