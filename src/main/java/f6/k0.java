package f6;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class k0 extends j0 {
    public static <K, V> Map<K, V> e() {
        z zVar = z.f21811a;
        kotlin.jvm.internal.q.d(zVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return zVar;
    }

    public static <K, V> V f(Map<K, ? extends V> map, K k8) {
        kotlin.jvm.internal.q.f(map, "<this>");
        return (V) i0.a(map, k8);
    }

    public static <K, V> Map<K, V> g(e6.r<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.q.f(pairs, "pairs");
        return pairs.length > 0 ? s(pairs, new LinkedHashMap(j0.b(pairs.length))) : e();
    }

    public static <K, V> Map<K, V> h(Map<? extends K, ? extends V> map, Iterable<? extends K> keys) {
        kotlin.jvm.internal.q.f(map, "<this>");
        kotlin.jvm.internal.q.f(keys, "keys");
        Map mapT = t(map);
        t.r(mapT.keySet(), keys);
        return i(mapT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> i(Map<K, ? extends V> map) {
        kotlin.jvm.internal.q.f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : j0.d(map) : e();
    }

    public static <K, V> Map<K, V> j(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        kotlin.jvm.internal.q.f(map, "<this>");
        kotlin.jvm.internal.q.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static <K, V> void k(Map<? super K, ? super V> map, Iterable<? extends e6.r<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.q.f(map, "<this>");
        kotlin.jvm.internal.q.f(pairs, "pairs");
        for (e6.r<? extends K, ? extends V> rVar : pairs) {
            map.put(rVar.a(), rVar.b());
        }
    }

    public static final <K, V> void l(Map<? super K, ? super V> map, v6.b<? extends e6.r<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.q.f(map, "<this>");
        kotlin.jvm.internal.q.f(pairs, "pairs");
        for (e6.r<? extends K, ? extends V> rVar : pairs) {
            map.put(rVar.a(), rVar.b());
        }
    }

    public static final <K, V> void m(Map<? super K, ? super V> map, e6.r<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.q.f(map, "<this>");
        kotlin.jvm.internal.q.f(pairs, "pairs");
        for (e6.r<? extends K, ? extends V> rVar : pairs) {
            map.put(rVar.a(), rVar.b());
        }
    }

    public static <K, V> Map<K, V> n(Iterable<? extends e6.r<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return i(o(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return e();
        }
        if (size != 1) {
            return o(iterable, new LinkedHashMap(j0.b(collection.size())));
        }
        return j0.c(iterable instanceof List ? (e6.r<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M o(Iterable<? extends e6.r<? extends K, ? extends V>> iterable, M destination) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        kotlin.jvm.internal.q.f(destination, "destination");
        k(destination, iterable);
        return destination;
    }

    public static <K, V> Map<K, V> p(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.q.f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? t(map) : j0.d(map) : e();
    }

    public static <K, V> Map<K, V> q(v6.b<? extends e6.r<? extends K, ? extends V>> bVar) {
        kotlin.jvm.internal.q.f(bVar, "<this>");
        return i(r(bVar, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M r(v6.b<? extends e6.r<? extends K, ? extends V>> bVar, M destination) {
        kotlin.jvm.internal.q.f(bVar, "<this>");
        kotlin.jvm.internal.q.f(destination, "destination");
        l(destination, bVar);
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M s(e6.r<? extends K, ? extends V>[] rVarArr, M destination) {
        kotlin.jvm.internal.q.f(rVarArr, "<this>");
        kotlin.jvm.internal.q.f(destination, "destination");
        m(destination, rVarArr);
        return destination;
    }

    public static <K, V> Map<K, V> t(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.q.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
