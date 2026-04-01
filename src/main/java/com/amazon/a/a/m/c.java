package com.amazon.a.a.m;

import com.amazon.a.a.k.d;

/* JADX INFO: loaded from: classes.dex */
public class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3744a = "DATA_AUTHENTICATION_KEY";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f3745b = "APPLICATION_LICENSE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f3746c = "LICENSE_FAILURE_CONTENT";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f3747d = "LICENSE_FAILURE_RAW_EXCEPTION";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f3748e = "TEST_MODE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f3749f = "PACKAGE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f3750g = "COMMAND";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.k.b f3751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f3752i = new b();

    public <T> T a(String str) {
        return (T) this.f3752i.b(str);
    }

    public <T> void a(String str, a aVar) {
        this.f3752i.a(str, aVar);
    }

    public <T> void a(String str, T t7) {
        this.f3752i.a(str, t7);
    }

    public boolean b(String str) {
        return this.f3752i.a(str);
    }

    public void c(String str) {
        this.f3752i.c(str);
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        this.f3751h.b(this.f3752i);
    }

    public String toString() {
        return this.f3752i.toString();
    }
}
