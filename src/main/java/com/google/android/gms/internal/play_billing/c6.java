package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class c6 extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19481b;

    protected c6(int i8, int i9) {
        a6.b(i9, i8, "index");
        this.f19480a = i8;
        this.f19481b = i9;
    }

    protected abstract Object a(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f19481b < this.f19480a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19481b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f19481b;
        this.f19481b = i8 + 1;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19481b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f19481b - 1;
        this.f19481b = i8;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19481b - 1;
    }
}
