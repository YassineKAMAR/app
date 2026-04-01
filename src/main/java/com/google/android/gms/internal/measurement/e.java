package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v3.q<String> f18659d = v3.q.C("_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f18660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f18661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f18662c;

    public e(String str, long j8, Map<String, Object> map) {
        this.f18660a = str;
        this.f18661b = j8;
        HashMap map2 = new HashMap();
        this.f18662c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object c(String str, Object obj, Object obj2) {
        if (!f18659d.contains(str) || !(obj2 instanceof Double)) {
            if (str.startsWith("_")) {
                return ((obj instanceof String) || obj == null) ? obj2 : obj;
            }
            if (obj instanceof Double) {
                return obj2;
            }
            if (!(obj instanceof Long)) {
                return obj instanceof String ? obj2.toString() : obj2;
            }
        }
        return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
    }

    public final long a() {
        return this.f18661b;
    }

    public final Object b(String str) {
        if (this.f18662c.containsKey(str)) {
            return this.f18662c.get(str);
        }
        return null;
    }

    public final /* synthetic */ Object clone() {
        return new e(this.f18660a, this.f18661b, new HashMap(this.f18662c));
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f18662c.remove(str);
        } else {
            this.f18662c.put(str, c(str, this.f18662c.get(str), obj));
        }
    }

    public final String e() {
        return this.f18660a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f18661b == eVar.f18661b && this.f18660a.equals(eVar.f18660a)) {
            return this.f18662c.equals(eVar.f18662c);
        }
        return false;
    }

    public final void f(String str) {
        this.f18660a = str;
    }

    public final Map<String, Object> g() {
        return this.f18662c;
    }

    public final int hashCode() {
        int iHashCode = this.f18660a.hashCode() * 31;
        long j8 = this.f18661b;
        return ((iHashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f18662c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f18660a + "', timestamp=" + this.f18661b + ", params=" + String.valueOf(this.f18662c) + "}";
    }
}
