package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class i3 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparable f19576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f19577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ o3 f19578c;

    i3(o3 o3Var, Comparable comparable, Object obj) {
        this.f19578c = o3Var;
        this.f19576a = comparable;
        this.f19577b = obj;
    }

    private static final boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable a() {
        return this.f19576a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f19576a.compareTo(((i3) obj).f19576a);
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
        return c(this.f19576a, entry.getKey()) && c(this.f19577b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f19576a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19577b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f19576a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f19577b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f19578c.o();
        Object obj2 = this.f19577b;
        this.f19577b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f19576a) + com.amazon.a.a.o.b.f.f3943b + String.valueOf(this.f19577b);
    }
}
