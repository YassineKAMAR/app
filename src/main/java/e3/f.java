package e3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    @Deprecated
    public static <T> List<T> a(T t7) {
        return Collections.singletonList(t7);
    }

    @Deprecated
    public static <T> List<T> b(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : Collections.singletonList(tArr[0]) : Collections.emptyList();
    }

    public static <K, V> Map<K, V> c(K k8, V v7, K k9, V v8, K k10, V v9) {
        Map mapG = g(3, false);
        mapG.put(k8, v7);
        mapG.put(k9, v8);
        mapG.put(k10, v9);
        return Collections.unmodifiableMap(mapG);
    }

    public static <K, V> Map<K, V> d(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        }
        if (length == 0) {
            return Collections.emptyMap();
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapG = g(length, false);
        for (int i8 = 0; i8 < kArr.length; i8++) {
            mapG.put(kArr[i8], vArr[i8]);
        }
        return Collections.unmodifiableMap(mapG);
    }

    @Deprecated
    public static <T> Set<T> e(T t7, T t8, T t9) {
        Set setH = h(3, false);
        setH.add(t7);
        setH.add(t8);
        setH.add(t9);
        return Collections.unmodifiableSet(setH);
    }

    @Deprecated
    public static <T> Set<T> f(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t7 = tArr[0];
            T t8 = tArr[1];
            Set setH = h(2, false);
            setH.add(t7);
            setH.add(t8);
            return Collections.unmodifiableSet(setH);
        }
        if (length == 3) {
            return e(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setH2 = h(length, false);
            Collections.addAll(setH2, tArr);
            return Collections.unmodifiableSet(setH2);
        }
        T t9 = tArr[0];
        T t10 = tArr[1];
        T t11 = tArr[2];
        T t12 = tArr[3];
        Set setH3 = h(4, false);
        setH3.add(t9);
        setH3.add(t10);
        setH3.add(t11);
        setH3.add(t12);
        return Collections.unmodifiableSet(setH3);
    }

    private static Map g(int i8, boolean z7) {
        return i8 <= 256 ? new p.a(i8) : new HashMap(i8, 1.0f);
    }

    private static Set h(int i8, boolean z7) {
        if (i8 <= (true != z7 ? 256 : 128)) {
            return new p.b(i8);
        }
        return new HashSet(i8, true != z7 ? 1.0f : 0.75f);
    }
}
