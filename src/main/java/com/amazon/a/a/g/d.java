package com.amazon.a.a.g;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f3623a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f3624b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f3625c = true;

    private static String a(String str) {
        return "Appstore SDK - Sandbox Mode: " + str;
    }

    @Override // com.amazon.a.a.g.c
    public void a(String str, String str2) {
        Log.d(str, a(str2));
    }

    @Override // com.amazon.a.a.g.c
    public boolean a() {
        return true;
    }

    @Override // com.amazon.a.a.g.c
    public void b(String str, String str2) {
        Log.e(str, a(str2));
    }

    @Override // com.amazon.a.a.g.c
    public boolean b() {
        return true;
    }

    @Override // com.amazon.a.a.g.c
    public void c(String str, String str2) {
        Log.v(str, a(str2));
    }

    @Override // com.amazon.a.a.g.c
    public boolean c() {
        return true;
    }
}
