package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class l34 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparable f10451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f10452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ r34 f10453c;

    l34(r34 r34Var, Comparable comparable, Object obj) {
        this.f10453c = r34Var;
        this.f10451a = comparable;
        this.f10452b = obj;
    }

    private static final boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable a() {
        return this.f10451a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f10451a.compareTo(((l34) obj).f10451a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return c(this.f10451a, entry.getKey()) && c(this.f10452b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f10451a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10452b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f10451a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f10452b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f10453c.o();
        Object obj2 = this.f10452b;
        this.f10452b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f10451a) + com.amazon.a.a.o.b.f.f3943b + String.valueOf(this.f10452b);
    }
}
