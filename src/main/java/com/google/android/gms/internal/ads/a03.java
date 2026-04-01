package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class a03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4942b;

    private a03(String str, String str2) {
        this.f4941a = str;
        this.f4942b = str2;
    }

    public static a03 a(String str, String str2) {
        h13.a(str, "Name is null or empty");
        h13.a(str2, "Version is null or empty");
        return new a03(str, str2);
    }

    public final String b() {
        return this.f4941a;
    }

    public final String c() {
        return this.f4942b;
    }
}
