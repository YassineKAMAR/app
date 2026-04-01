package com.amazon.device.iap.internal.a;

/* JADX INFO: loaded from: classes.dex */
public class f extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f4256a = 3715222306172636179L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f4259d;

    public f(String str, String str2, String str3) {
        this.f4257b = str;
        this.f4258c = str2;
        this.f4259d = str3;
    }

    public f(String str, String str2, String str3, Throwable th) {
        super(th);
        this.f4257b = str;
        this.f4258c = str2;
        this.f4259d = str3;
    }

    public String a() {
        return this.f4257b;
    }

    public String b() {
        return this.f4258c;
    }

    public String c() {
        return this.f4259d;
    }
}
