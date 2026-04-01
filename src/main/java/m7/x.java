package m7;

import e6.s;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class x<T> implements n1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p6.p<u6.c<Object>, List<? extends u6.i>, i7.b<T>> f25032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<Class<?>, m1<T>> f25033b;

    /* JADX WARN: Multi-variable type inference failed */
    public x(p6.p<? super u6.c<Object>, ? super List<? extends u6.i>, ? extends i7.b<T>> compute) {
        kotlin.jvm.internal.q.f(compute, "compute");
        this.f25032a = compute;
        this.f25033b = new ConcurrentHashMap<>();
    }

    @Override // m7.n1
    public Object a(u6.c<Object> key, List<? extends u6.i> types) {
        Object objB;
        m1<T> m1VarPutIfAbsent;
        kotlin.jvm.internal.q.f(key, "key");
        kotlin.jvm.internal.q.f(types, "types");
        ConcurrentHashMap<Class<?>, m1<T>> concurrentHashMap = this.f25033b;
        Class<?> clsA = o6.a.a(key);
        m1<T> m1Var = concurrentHashMap.get(clsA);
        if (m1Var == null && (m1VarPutIfAbsent = concurrentHashMap.putIfAbsent(clsA, (m1Var = new m1<>()))) != null) {
            m1Var = m1VarPutIfAbsent;
        }
        ConcurrentHashMap concurrentHashMap2 = ((m1) m1Var).f24968a;
        Object obj = concurrentHashMap2.get(types);
        if (obj == null) {
            try {
                s.a aVar = e6.s.f21442b;
                objB = e6.s.b(this.f25032a.invoke(key, types));
            } catch (Throwable th) {
                s.a aVar2 = e6.s.f21442b;
                objB = e6.s.b(e6.t.a(th));
            }
            e6.s sVarA = e6.s.a(objB);
            Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(types, sVarA);
            obj = objPutIfAbsent == null ? sVarA : objPutIfAbsent;
        }
        kotlin.jvm.internal.q.e(obj, "serializers.getOrPut(typ… { producer() }\n        }");
        return ((e6.s) obj).j();
    }
}
