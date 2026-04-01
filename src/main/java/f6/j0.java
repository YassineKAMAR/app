package f6;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class j0 extends i0 {
    public static int b(int i8) {
        if (i8 < 0) {
            return i8;
        }
        if (i8 < 3) {
            return i8 + 1;
        }
        if (i8 < 1073741824) {
            return (int) ((i8 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> c(e6.r<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.q.f(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.c(), pair.d());
        kotlin.jvm.internal.q.e(mapSingletonMap, "singletonMap(pair.first, pair.second)");
        return mapSingletonMap;
    }

    public static final <K, V> Map<K, V> d(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.q.f(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.q.e(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return mapSingletonMap;
    }
}
