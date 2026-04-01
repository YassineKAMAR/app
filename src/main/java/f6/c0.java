package f6;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class c0<T> implements Iterable<b0<? extends T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p6.a<Iterator<T>> f21797a;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(p6.a<? extends Iterator<? extends T>> iteratorFactory) {
        kotlin.jvm.internal.q.f(iteratorFactory, "iteratorFactory");
        this.f21797a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator<b0<T>> iterator() {
        return new d0(this.f21797a.invoke());
    }
}
