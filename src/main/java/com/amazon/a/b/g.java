package com.amazon.a.b;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f4001a = "license";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4002b = "customerId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4003c = "deviceId";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f4004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f4005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f4006f;

    public g(Map<String, String> map) throws com.amazon.a.a.n.a.a.g {
        if (map == null) {
            throw com.amazon.a.a.n.a.a.g.d();
        }
        this.f4004d = a(f4001a, map);
        this.f4005e = a(f4002b, map);
        this.f4006f = a(f4003c, map);
    }

    private String a(String str, Map<String, String> map) throws com.amazon.a.a.n.a.a.g {
        String str2 = map.get(str);
        if (a(str2)) {
            throw com.amazon.a.a.n.a.a.g.a(str);
        }
        return str2;
    }

    private boolean a(String str) {
        return str == null || str.length() == 0;
    }

    public String a() {
        return this.f4005e;
    }

    public String b() {
        return this.f4006f;
    }

    public String c() {
        return this.f4004d;
    }
}
