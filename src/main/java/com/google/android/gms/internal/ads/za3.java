package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class za3 extends ab3 implements Map {
    protected za3() {
    }

    @Override // java.util.Map
    public final void clear() {
        d().clear();
    }

    public boolean containsKey(Object obj) {
        return d().containsKey(obj);
    }

    protected abstract Map d();

    public abstract Set entrySet();

    protected final int g() {
        return gd3.a(entrySet());
    }

    protected final boolean h(Object obj) {
        zb3 zb3Var = new zb3(entrySet().iterator());
        if (obj == null) {
            while (zb3Var.hasNext()) {
                if (zb3Var.next() == null) {
                    return true;
                }
            }
        } else {
            while (zb3Var.hasNext()) {
                if (obj.equals(zb3Var.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    protected final boolean i(Object obj) {
        return ec3.b(this, obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return d().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        d().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return d().remove(obj);
    }

    public int size() {
        return d().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return d().values();
    }
}
