package m7;

import e6.s;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class t<T> implements n1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p6.p<u6.c<Object>, List<? extends u6.i>, i7.b<T>> f25014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f25015b;

    public static final class a extends ClassValue<m1<T>> {
        a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(p6.p<? super u6.c<Object>, ? super List<? extends u6.i>, ? extends i7.b<T>> compute) {
        kotlin.jvm.internal.q.f(compute, "compute");
        this.f25014a = compute;
        this.f25015b = b();
    }

    private final a b() {
        return new a();
    }

    @Override // m7.n1
    public Object a(u6.c<Object> key, List<? extends u6.i> types) {
        Object objB;
        kotlin.jvm.internal.q.f(key, "key");
        kotlin.jvm.internal.q.f(types, "types");
        ConcurrentHashMap concurrentHashMap = ((m1) this.f25015b.get(o6.a.a(key))).f24968a;
        Object obj = concurrentHashMap.get(types);
        if (obj == null) {
            try {
                s.a aVar = e6.s.f21442b;
                objB = e6.s.b(this.f25014a.invoke(key, types));
            } catch (Throwable th) {
                s.a aVar2 = e6.s.f21442b;
                objB = e6.s.b(e6.t.a(th));
            }
            e6.s sVarA = e6.s.a(objB);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(types, sVarA);
            obj = objPutIfAbsent == null ? sVarA : objPutIfAbsent;
        }
        kotlin.jvm.internal.q.e(obj, "serializers.getOrPut(typ… { producer() }\n        }");
        return ((e6.s) obj).j();
    }
}
