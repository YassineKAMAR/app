package com.amazon.device.iap.internal.a;

/* JADX INFO: loaded from: classes.dex */
public class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f4246a = 7955687159702952249L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4248c;

    public e(String str, String str2) {
        this.f4247b = str;
        this.f4248c = str2;
    }

    public e(String str, String str2, Throwable th) {
        super(th);
        this.f4247b = str;
        this.f4248c = str2;
    }

    public String a() {
        return this.f4247b;
    }

    public String b() {
        return this.f4248c;
    }
}
