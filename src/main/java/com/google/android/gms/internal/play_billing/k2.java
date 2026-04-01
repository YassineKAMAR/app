package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k2 f19609b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19610a;

    static {
        k2 k2Var = new k2();
        f19609b = k2Var;
        k2Var.f19610a = false;
    }

    private k2() {
        this.f19610a = true;
    }

    private k2(Map map) {
        super(map);
        this.f19610a = true;
    }

    public static k2 c() {
        return f19609b;
    }

    private static int n(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = s1.f19671d;
        int length = bArr.length;
        int iB = s1.b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    private final void o() {
        if (!this.f19610a) {
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

    public final k2 h() {
        return isEmpty() ? new k2() : new k2(this);
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
        this.f19610a = false;
    }

    public final void k(k2 k2Var) {
        o();
        if (k2Var.isEmpty()) {
            return;
        }
        putAll(k2Var);
    }

    public final boolean l() {
        return this.f19610a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        o();
        byte[] bArr = s1.f19671d;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        o();
        for (Object obj : map.keySet()) {
            byte[] bArr = s1.f19671d;
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
