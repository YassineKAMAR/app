package m;

import java.util.HashMap;
import java.util.Map;
import m.b;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<K, b.c<K, V>> f24423e = new HashMap<>();

    public boolean contains(K k8) {
        return this.f24423e.containsKey(k8);
    }

    @Override // m.b
    protected b.c<K, V> e(K k8) {
        return this.f24423e.get(k8);
    }

    @Override // m.b
    public V p(K k8, V v7) {
        b.c<K, V> cVarE = e(k8);
        if (cVarE != null) {
            return cVarE.f24429b;
        }
        this.f24423e.put(k8, n(k8, v7));
        return null;
    }

    @Override // m.b
    public V u(K k8) {
        V v7 = (V) super.u(k8);
        this.f24423e.remove(k8);
        return v7;
    }

    public Map.Entry<K, V> v(K k8) {
        if (contains(k8)) {
            return this.f24423e.get(k8).f24431d;
        }
        return null;
    }
}
