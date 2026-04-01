package f6;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class d0<T> implements Iterator<b0<? extends T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator<T> f21800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21801b;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(Iterator<? extends T> iterator) {
        kotlin.jvm.internal.q.f(iterator, "iterator");
        this.f21800a = iterator;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b0<T> next() {
        int i8 = this.f21801b;
        this.f21801b = i8 + 1;
        if (i8 < 0) {
            o.l();
        }
        return new b0<>(i8, this.f21800a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21800a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
