package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class mb3 implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient ob3 f11222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient ob3 f11223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient eb3 f11224c;

    mb3() {
    }

    public static mb3 c(Map map) {
        Set setEntrySet = map.entrySet();
        lb3 lb3Var = new lb3(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        lb3Var.b(setEntrySet);
        return lb3Var.c();
    }

    public static mb3 d() {
        return zc3.f18154g;
    }

    public static mb3 f(Object obj, Object obj2) {
        fa3.b("dialog_not_shown_reason", obj2);
        return zc3.k(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    abstract eb3 a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final eb3 values() {
        eb3 eb3Var = this.f11224c;
        if (eb3Var != null) {
            return eb3Var;
        }
        eb3 eb3VarA = a();
        this.f11224c = eb3VarA;
        return eb3VarA;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return ec3.b(this, obj);
    }

    abstract ob3 g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    abstract ob3 h();

    @Override // java.util.Map
    public final int hashCode() {
        return gd3.a(entrySet());
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final ob3 entrySet() {
        ob3 ob3Var = this.f11222a;
        if (ob3Var != null) {
            return ob3Var;
        }
        ob3 ob3VarG = g();
        this.f11222a = ob3VarG;
        return ob3VarG;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final ob3 keySet() {
        ob3 ob3Var = this.f11223b;
        if (ob3Var != null) {
            return ob3Var;
        }
        ob3 ob3VarH = h();
        this.f11223b = ob3VarH;
        return ob3VarH;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        fa3.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z7 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z7) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z7 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
