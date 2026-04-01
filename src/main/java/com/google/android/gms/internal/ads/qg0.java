package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final z83 f13447a = z83.b(4000);

    static String a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        return str + " @" + stackTrace[3].getLineNumber();
    }

    public static void b(String str) {
        if (j(3)) {
            if (str == null || str.length() <= 4000) {
                Log.d("Ads", str);
                return;
            }
            boolean z7 = true;
            for (String str2 : f13447a.d(str)) {
                if (z7) {
                    Log.d("Ads", str2);
                } else {
                    Log.d("Ads-cont", str2);
                }
                z7 = false;
            }
        }
    }

    public static void c(String str, Throwable th) {
        if (j(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void d(String str) {
        if (j(6)) {
            if (str == null || str.length() <= 4000) {
                Log.e("Ads", str);
                return;
            }
            boolean z7 = true;
            for (String str2 : f13447a.d(str)) {
                if (z7) {
                    Log.e("Ads", str2);
                } else {
                    Log.e("Ads-cont", str2);
                }
                z7 = false;
            }
        }
    }

    public static void e(String str, Throwable th) {
        if (j(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void f(String str) {
        if (j(4)) {
            if (str == null || str.length() <= 4000) {
                Log.i("Ads", str);
                return;
            }
            boolean z7 = true;
            for (String str2 : f13447a.d(str)) {
                if (z7) {
                    Log.i("Ads", str2);
                } else {
                    Log.i("Ads-cont", str2);
                }
                z7 = false;
            }
        }
    }

    public static void g(String str) {
        if (j(5)) {
            if (str == null || str.length() <= 4000) {
                Log.w("Ads", str);
                return;
            }
            boolean z7 = true;
            for (String str2 : f13447a.d(str)) {
                if (z7) {
                    Log.w("Ads", str2);
                } else {
                    Log.w("Ads-cont", str2);
                }
                z7 = false;
            }
        }
    }

    public static void h(String str, Throwable th) {
        if (j(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void i(String str, Throwable th) {
        if (j(5)) {
            String strA = a(str);
            if (th != null) {
                h(strA, th);
            } else {
                g(strA);
            }
        }
    }

    public static boolean j(int i8) {
        return i8 >= 5 || Log.isLoggable("Ads", i8);
    }
}
