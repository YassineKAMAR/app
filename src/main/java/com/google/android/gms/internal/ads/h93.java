package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class h93 extends ld3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8686b;

    protected h93(int i8, int i9) {
        l83.b(i9, i8, "index");
        this.f8685a = i8;
        this.f8686b = i9;
    }

    protected abstract Object a(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f8686b < this.f8685a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8686b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f8686b;
        this.f8686b = i8 + 1;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8686b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f8686b - 1;
        this.f8686b = i8;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8686b - 1;
    }
}
