package com.amazon.a.a.o.b.a;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.amazon.a.a.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3924a = "DATA_AUTH_KEY_LOAD_FAILURE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f3925b = 1;

    private a(String str, Throwable th) {
        super(f3924a, str, th);
    }

    public static a a(Throwable th) {
        return new a("CERT_FAILED_TO_LOAD", th);
    }

    public static a b(Throwable th) {
        return new a("FAILED_TO_ESTABLISH_TRUST", th);
    }

    public static a d() {
        return new a("CERT_NOT_FOUND", null);
    }

    public static a e() {
        return new a("CERT_INVALID", null);
    }

    public static a f() {
        return new a("VERIFICATION_FAILED", null);
    }
}
