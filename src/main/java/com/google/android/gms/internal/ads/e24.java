package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e24 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e24 f7103b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7104a;

    static {
        e24 e24Var = new e24();
        f7103b = e24Var;
        e24Var.f7104a = false;
    }

    private e24() {
        this.f7104a = true;
    }

    private e24(Map map) {
        super(map);
        this.f7104a = true;
    }

    public static e24 c() {
        return f7103b;
    }

    private static int n(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof c14) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = k14.f9887d;
        int length = bArr.length;
        int iB = k14.b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    private final void o() {
        if (!this.f7104a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final e24 h() {
        return isEmpty() ? new e24() : new e24(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iN = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iN += n(entry.getValue()) ^ n(entry.getKey());
        }
        return iN;
    }

    public final void i() {
        this.f7104a = false;
    }

    public final void k(e24 e24Var) {
        o();
        if (e24Var.isEmpty()) {
            return;
        }
        putAll(e24Var);
    }

    public final boolean l() {
        return this.f7104a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        o();
        byte[] bArr = k14.f9887d;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        o();
        for (Object obj : map.keySet()) {
            byte[] bArr = k14.f9887d;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        o();
        return super.remove(obj);
    }
}
