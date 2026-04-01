package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class c9 extends i7<Integer> implements f9, xa, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c9 f18621d = new c9(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f18622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18623c;

    c9() {
        this(new int[10], 0, true);
    }

    private c9(int[] iArr, int i8, boolean z7) {
        super(z7);
        this.f18622b = iArr;
        this.f18623c = i8;
    }

    public static c9 g() {
        return f18621d;
    }

    private final String n(int i8) {
        return "Index:" + i8 + ", Size:" + this.f18623c;
    }

    private final void p(int i8) {
        if (i8 < 0 || i8 >= this.f18623c) {
            throw new IndexOutOfBoundsException(n(i8));
        }
    }

    @Override // com.google.android.gms.internal.measurement.h9
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final f9 b(int i8) {
        if (i8 >= this.f18623c) {
            return new c9(Arrays.copyOf(this.f18622b, i8), this.f18623c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f18623c)) {
            throw new IndexOutOfBoundsException(n(i8));
        }
        int[] iArr = this.f18622b;
        if (i9 < iArr.length) {
            System.arraycopy(iArr, i8, iArr, i8 + 1, i9 - i8);
        } else {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            System.arraycopy(this.f18622b, i8, iArr2, i8 + 1, this.f18623c - i8);
            this.f18622b = iArr2;
        }
        this.f18622b[i8] = iIntValue;
        this.f18623c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        a9.e(collection);
        if (!(collection instanceof c9)) {
            return super.addAll(collection);
        }
        c9 c9Var = (c9) collection;
        int i8 = c9Var.f18623c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f18623c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        int[] iArr = this.f18622b;
        if (i10 > iArr.length) {
            this.f18622b = Arrays.copyOf(iArr, i10);
        }
        System.arraycopy(c9Var.f18622b, 0, this.f18622b, this.f18623c, c9Var.f18623c);
        this.f18623c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i8) {
        p(i8);
        return this.f18622b[i8];
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9)) {
            return super.equals(obj);
        }
        c9 c9Var = (c9) obj;
        if (this.f18623c != c9Var.f18623c) {
            return false;
        }
        int[] iArr = c9Var.f18622b;
        for (int i8 = 0; i8 < this.f18623c; i8++) {
            if (this.f18622b[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        return Integer.valueOf(e(i8));
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f18623c; i9++) {
            i8 = (i8 * 31) + this.f18622b[i9];
        }
        return i8;
    }

    public final void i(int i8) {
        a();
        int i9 = this.f18623c;
        int[] iArr = this.f18622b;
        if (i9 == iArr.length) {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            this.f18622b = iArr2;
        }
        int[] iArr3 = this.f18622b;
        int i10 = this.f18623c;
        this.f18623c = i10 + 1;
        iArr3[i10] = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f18622b[i8] == iIntValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i8) {
        a();
        p(i8);
        int[] iArr = this.f18622b;
        int i9 = iArr[i8];
        if (i8 < this.f18623c - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (r2 - i8) - 1);
        }
        this.f18623c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f18622b;
        System.arraycopy(iArr, i9, iArr, i8, this.f18623c - i9);
        this.f18623c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i8, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        p(i8);
        int[] iArr = this.f18622b;
        int i9 = iArr[i8];
        iArr[i8] = iIntValue;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18623c;
    }
}
