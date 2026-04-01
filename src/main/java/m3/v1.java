package m3;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class v1 extends i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24835b;

    protected v1(int i8, int i9) {
        t1.b(i9, i8, "index");
        this.f24834a = i8;
        this.f24835b = i9;
    }

    protected abstract Object a(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f24835b < this.f24834a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f24835b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f24835b;
        this.f24835b = i8 + 1;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f24835b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f24835b - 1;
        this.f24835b = i8;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f24835b - 1;
    }
}
