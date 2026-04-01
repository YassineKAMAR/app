package v3;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class a<E> extends r0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26849b;

    protected a(int i8, int i9) {
        u3.h.k(i9, i8);
        this.f26848a = i8;
        this.f26849b = i9;
    }

    protected abstract E a(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f26849b < this.f26848a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f26849b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f26849b;
        this.f26849b = i8 + 1;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f26849b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f26849b - 1;
        this.f26849b = i8;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f26849b - 1;
    }
}
