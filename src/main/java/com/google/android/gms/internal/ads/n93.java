package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class n93 extends dc3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Map f11744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ba3 f11745d;

    n93(ba3 ba3Var, Map map) {
        this.f11745d = ba3Var;
        this.f11744c = map;
    }

    @Override // com.google.android.gms.internal.ads.dc3
    protected final Set a() {
        return new l93(this);
    }

    final Map.Entry b(Map.Entry entry) {
        Object key = entry.getKey();
        return new fb3(key, this.f11745d.i(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        ba3 ba3Var = this.f11745d;
        if (this.f11744c == ba3Var.f5679d) {
            ba3Var.y();
        } else {
            ub3.b(new m93(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f11744c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f11744c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) ec3.a(this.f11744c, obj);
        if (collection == null) {
            return null;
        }
        return this.f11745d.i(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f11744c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.f11745d.f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f11744c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionG = this.f11745d.g();
        collectionG.addAll(collection);
        this.f11745d.f5680e -= collection.size();
        collection.clear();
        return collectionG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f11744c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f11744c.toString();
    }
}
