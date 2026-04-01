package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class pb implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparable f19044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f19045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ ib f19046c;

    pb(ib ibVar, Comparable comparable, Object obj) {
        this.f19046c = ibVar;
        this.f19044a = comparable;
        this.f19045b = obj;
    }

    pb(ib ibVar, Map.Entry entry) {
        this(ibVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((pb) obj).getKey());
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
        return a(this.f19044a, entry.getKey()) && a(this.f19045b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f19044a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19045b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f19044a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f19045b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f19046c.r();
        Object obj2 = this.f19045b;
        this.f19045b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f19044a) + com.amazon.a.a.o.b.f.f3943b + String.valueOf(this.f19045b);
    }
}
