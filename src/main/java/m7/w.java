package m7;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class w<T> implements c2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p6.l<u6.c<?>, i7.b<T>> f25026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<Class<?>, m<T>> f25027b;

    /* JADX WARN: Multi-variable type inference failed */
    public w(p6.l<? super u6.c<?>, ? extends i7.b<T>> compute) {
        kotlin.jvm.internal.q.f(compute, "compute");
        this.f25026a = compute;
        this.f25027b = new ConcurrentHashMap<>();
    }

    @Override // m7.c2
    public i7.b<T> a(u6.c<Object> key) {
        m<T> mVarPutIfAbsent;
        kotlin.jvm.internal.q.f(key, "key");
        ConcurrentHashMap<Class<?>, m<T>> concurrentHashMap = this.f25027b;
        Class<?> clsA = o6.a.a(key);
        m<T> mVar = concurrentHashMap.get(clsA);
        if (mVar == null && (mVarPutIfAbsent = concurrentHashMap.putIfAbsent(clsA, (mVar = new m<>(this.f25026a.invoke(key))))) != null) {
            mVar = mVarPutIfAbsent;
        }
        return mVar.f24967a;
    }
}
