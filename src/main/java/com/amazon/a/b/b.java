package com.amazon.a.b;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Date f3978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f3979e;

    public b(com.amazon.a.a.o.b.f fVar) {
        this.f3975a = a("checksum", fVar);
        this.f3976b = a("customerId", fVar);
        this.f3977c = a("deviceId", fVar);
        this.f3979e = a("packageName", fVar);
        this.f3978d = b("expiration", fVar);
    }

    private String a(String str, com.amazon.a.a.o.b.f fVar) throws com.amazon.a.a.o.b.a.b {
        String strA = fVar.a(str);
        if (com.amazon.a.a.o.e.a(strA)) {
            throw com.amazon.a.a.o.b.a.b.a(str);
        }
        return strA;
    }

    private Date b(String str, com.amazon.a.a.o.b.f fVar) throws com.amazon.a.a.o.b.a.b {
        String strA = a(str, fVar);
        try {
            return new Date(Long.parseLong(strA));
        } catch (NumberFormatException unused) {
            throw com.amazon.a.a.o.b.a.b.a(str, strA);
        }
    }

    public String a() {
        return this.f3975a;
    }

    public String b() {
        return this.f3976b;
    }

    public String c() {
        return this.f3977c;
    }

    public Date d() {
        return this.f3978d;
    }

    public String e() {
        return this.f3979e;
    }
}
