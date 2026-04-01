package f6;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
class i0 {
    public static final <K, V> V a(Map<K, ? extends V> map, K k8) {
        kotlin.jvm.internal.q.f(map, "<this>");
        if (map instanceof g0) {
            return (V) ((g0) map).e(k8);
        }
        V v7 = map.get(k8);
        if (v7 != null || map.containsKey(k8)) {
            return v7;
        }
        throw new NoSuchElementException("Key " + k8 + " is missing in the map.");
    }
}
