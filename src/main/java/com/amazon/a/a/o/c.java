package com.amazon.a.a.o;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f3947a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f3948b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f3949c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f3950d = "Kiwi";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f3951e;

    public c(String str) {
        this.f3951e = str;
    }

    public static void a() {
        f3949c = true;
    }

    public static boolean b() {
        return f3949c;
    }

    private String d(String str) {
        return this.f3951e + ": " + str;
    }

    public void a(String str) {
        if (f3947a) {
            Log.d(f3950d, d(str));
        }
    }

    public void a(String str, Throwable th) {
        if (f3947a) {
            Log.d(f3950d, d(str), th);
        }
    }

    public void b(String str) {
        if (f3948b) {
            Log.e(f3950d, d(str));
        }
    }

    public void b(String str, Throwable th) {
        if (f3948b) {
            Log.e(f3950d, d(str), th);
        }
    }

    public void c(String str) {
        if (f3949c) {
            Log.e(f3950d, "TEST-" + d(str));
        }
    }
}
