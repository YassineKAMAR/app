package com.amazon.a.a.o.a;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f3889a = true;

    public static void a() {
        a(Looper.getMainLooper().getThread().getId());
    }

    public static void a(long j8) {
        if (Thread.currentThread().getId() != j8) {
            a("Executing thread must be thread: " + j8 + ", was: " + Thread.currentThread().getId());
        }
    }

    public static void a(Object obj, Object obj2, String str) {
        a(a(obj, obj2), str);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            a("Argument: " + str + " cannot be null");
        }
    }

    public static void a(String str) {
        throw new b(str);
    }

    public static void a(String str, Throwable th) {
        throw new b(str, th);
    }

    public static void a(boolean z7, String str) {
        if (z7) {
            return;
        }
        a(str);
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        a(obj != null, str);
    }

    public static void b(boolean z7, String str) {
        if (z7) {
            a(str);
        }
    }

    public static void c(Object obj, String str) {
        a(obj == null, str);
    }
}
