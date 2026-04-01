package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class db<E> extends i7<E> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final db<Object> f18651d = new db<>(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private E[] f18652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18653c;

    private db(E[] eArr, int i8, boolean z7) {
        super(z7);
        this.f18652b = eArr;
        this.f18653c = i8;
    }

    private final String e(int i8) {
        return "Index:" + i8 + ", Size:" + this.f18653c;
    }

    private final void g(int i8) {
        if (i8 < 0 || i8 >= this.f18653c) {
            throw new IndexOutOfBoundsException(e(i8));
        }
    }

    public static <E> db<E> i() {
        return (db<E>) f18651d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i8, E e8) {
        int i9;
        a();
        if (i8 < 0 || i8 > (i9 = this.f18653c)) {
            throw new IndexOutOfBoundsException(e(i8));
        }
        E[] eArr = this.f18652b;
        if (i9 < eArr.length) {
            System.arraycopy(eArr, i8, eArr, i8 + 1, i9 - i8);
        } else {
            E[] eArr2 = (E[]) new Object[((i9 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i8);
            System.arraycopy(this.f18652b, i8, eArr2, i8 + 1, this.f18653c - i8);
            this.f18652b = eArr2;
        }
        this.f18652b[i8] = e8;
        this.f18653c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e8) {
        a();
        int i8 = this.f18653c;
        E[] eArr = this.f18652b;
        if (i8 == eArr.length) {
            this.f18652b = (E[]) Arrays.copyOf(eArr, ((i8 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f18652b;
        int i9 = this.f18653c;
        this.f18653c = i9 + 1;
        eArr2[i9] = e8;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.h9
    public final /* synthetic */ h9 b(int i8) {
        if (i8 >= this.f18653c) {
            return new db(Arrays.copyOf(this.f18652b, i8), this.f18653c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i8) {
        g(i8);
        return this.f18652b[i8];
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.List
    public final E remove(int i8) {
        a();
        g(i8);
        E[] eArr = this.f18652b;
        E e8 = eArr[i8];
        if (i8 < this.f18653c - 1) {
            System.arraycopy(eArr, i8 + 1, eArr, i8, (r2 - i8) - 1);
        }
        this.f18653c--;
        ((AbstractList) this).modCount++;
        return e8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i8, E e8) {
        a();
        g(i8);
        E[] eArr = this.f18652b;
        E e9 = eArr[i8];
        eArr[i8] = e8;
        ((AbstractList) this).modCount++;
        return e9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18653c;
    }
}
