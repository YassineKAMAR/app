package v3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class g0 {
    static <T> T[] a(Object[] objArr, int i8, int i9, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i8, i9, tArr.getClass());
    }

    static <T> T[] b(T[] tArr, int i8) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i8));
    }

    static <K, V> Map<K, V> c() {
        return h.s();
    }
}
