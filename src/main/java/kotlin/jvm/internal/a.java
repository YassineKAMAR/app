package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class a<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T[] f24294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24295b;

    public a(T[] array) {
        q.f(array, "array");
        this.f24294a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24295b < this.f24294a.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f24294a;
            int i8 = this.f24295b;
            this.f24295b = i8 + 1;
            return tArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f24295b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
