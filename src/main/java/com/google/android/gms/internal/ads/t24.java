package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class t24 extends bz3 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final t24 f14929d = new t24(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f14930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14931c;

    private t24(Object[] objArr, int i8, boolean z7) {
        super(z7);
        this.f14930b = objArr;
        this.f14931c = i8;
    }

    public static t24 e() {
        return f14929d;
    }

    private final String g(int i8) {
        return "Index:" + i8 + ", Size:" + this.f14931c;
    }

    private final void i(int i8) {
        if (i8 < 0 || i8 >= this.f14931c) {
            throw new IndexOutOfBoundsException(g(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i8, Object obj) {
        int i9;
        a();
        if (i8 < 0 || i8 > (i9 = this.f14931c)) {
            throw new IndexOutOfBoundsException(g(i8));
        }
        int i10 = i8 + 1;
        Object[] objArr = this.f14930b;
        if (i9 < objArr.length) {
            System.arraycopy(objArr, i8, objArr, i10, i9 - i8);
        } else {
            Object[] objArr2 = new Object[((i9 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i8);
            System.arraycopy(this.f14930b, i8, objArr2, i10, this.f14931c - i8);
            this.f14930b = objArr2;
        }
        this.f14930b[i8] = obj;
        this.f14931c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i8 = this.f14931c;
        Object[] objArr = this.f14930b;
        if (i8 == objArr.length) {
            this.f14930b = Arrays.copyOf(objArr, ((i8 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f14930b;
        int i9 = this.f14931c;
        this.f14931c = i9 + 1;
        objArr2[i9] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.j14
    public final /* bridge */ /* synthetic */ j14 f(int i8) {
        if (i8 >= this.f14931c) {
            return new t24(Arrays.copyOf(this.f14930b, i8), this.f14931c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i8) {
        i(i8);
        return this.f14930b[i8];
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.List
    public final Object remove(int i8) {
        a();
        i(i8);
        Object[] objArr = this.f14930b;
        Object obj = objArr[i8];
        if (i8 < this.f14931c - 1) {
            System.arraycopy(objArr, i8 + 1, objArr, i8, (r2 - i8) - 1);
        }
        this.f14931c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i8, Object obj) {
        a();
        i(i8);
        Object[] objArr = this.f14930b;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14931c;
    }
}
