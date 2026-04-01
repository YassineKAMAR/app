package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
abstract class ba3 extends ea3 implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Map f5679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f5680e;

    protected ba3(Map map) {
        l83.e(map.isEmpty());
        this.f5679d = map;
    }

    static /* bridge */ /* synthetic */ void q(ba3 ba3Var, Object obj) {
        Object objRemove;
        try {
            objRemove = ba3Var.f5679d.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            ba3Var.f5680e -= size;
        }
    }

    @Override // com.google.android.gms.internal.ads.fc3
    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f5679d.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f5680e++;
            return true;
        }
        Collection collectionG = g();
        if (!collectionG.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f5680e++;
        this.f5679d.put(obj, collectionG);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ea3
    final Collection b() {
        return new da3(this);
    }

    @Override // com.google.android.gms.internal.ads.ea3
    final Iterator c() {
        return new k93(this);
    }

    abstract Collection g();

    abstract Collection h(Collection collection);

    abstract Collection i(Object obj, Collection collection);

    final List k(Object obj, List list, y93 y93Var) {
        return list instanceof RandomAccess ? new u93(this, obj, list, y93Var) : new aa3(this, obj, list, y93Var);
    }

    @Override // com.google.android.gms.internal.ads.fc3
    public final int m() {
        return this.f5680e;
    }

    final Map n() {
        Map map = this.f5679d;
        return map instanceof NavigableMap ? new s93(this, (NavigableMap) map) : map instanceof SortedMap ? new v93(this, (SortedMap) map) : new n93(this, map);
    }

    final Set o() {
        Map map = this.f5679d;
        return map instanceof NavigableMap ? new t93(this, (NavigableMap) map) : map instanceof SortedMap ? new w93(this, (SortedMap) map) : new r93(this, map);
    }

    @Override // com.google.android.gms.internal.ads.fc3
    public final void y() {
        Iterator it = this.f5679d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f5679d.clear();
        this.f5680e = 0;
    }
}
