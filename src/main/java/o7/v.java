package o7;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<k7.f, Map<a<Object>, Object>> f25389a = u.a(1);

    public static final class a<T> {
    }

    public final <T> T a(k7.f descriptor, a<T> key) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        kotlin.jvm.internal.q.f(key, "key");
        Map<a<Object>, Object> map = this.f25389a.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    public final <T> T b(k7.f descriptor, a<T> key, p6.a<? extends T> defaultValue) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        kotlin.jvm.internal.q.f(key, "key");
        kotlin.jvm.internal.q.f(defaultValue, "defaultValue");
        T t7 = (T) a(descriptor, key);
        if (t7 != null) {
            return t7;
        }
        T tInvoke = defaultValue.invoke();
        c(descriptor, key, tInvoke);
        return tInvoke;
    }

    public final <T> void c(k7.f descriptor, a<T> key, T value) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        kotlin.jvm.internal.q.f(key, "key");
        kotlin.jvm.internal.q.f(value, "value");
        Map<k7.f, Map<a<Object>, Object>> map = this.f25389a;
        Map<a<Object>, Object> mapA = map.get(descriptor);
        if (mapA == null) {
            mapA = u.a(1);
            map.put(descriptor, mapA);
        }
        mapA.put(key, value);
    }
}
