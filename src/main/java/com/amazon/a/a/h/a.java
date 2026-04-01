package com.amazon.a.a.h;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3626a = "name";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f3627b = "time";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f3628c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f3629d;

    public a(String str) {
        HashMap map = new HashMap();
        this.f3629d = map;
        map.put("name", str);
        map.put(f3627b, String.valueOf(System.currentTimeMillis()));
    }

    public a a(String str, String str2) {
        this.f3629d.put(str, str2);
        return this;
    }

    public Map<String, String> a() {
        return this.f3629d;
    }

    public String toString() {
        return "Metric: [" + this.f3629d.toString() + "]";
    }
}
