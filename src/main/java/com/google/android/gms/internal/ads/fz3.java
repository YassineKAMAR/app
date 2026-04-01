package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class fz3 extends bz3 implements RandomAccess, r24 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final fz3 f8140d = new fz3(new boolean[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f8141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8142c;

    fz3() {
        this(new boolean[10], 0, true);
    }

    private fz3(boolean[] zArr, int i8, boolean z7) {
        super(z7);
        this.f8141b = zArr;
        this.f8142c = i8;
    }

    private final String g(int i8) {
        return "Index:" + i8 + ", Size:" + this.f8142c;
    }

    private final void i(int i8) {
        if (i8 < 0 || i8 >= this.f8142c) {
            throw new IndexOutOfBoundsException(g(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f8142c)) {
            throw new IndexOutOfBoundsException(g(i8));
        }
        int i10 = i8 + 1;
        boolean[] zArr = this.f8141b;
        if (i9 < zArr.length) {
            System.arraycopy(zArr, i8, zArr, i10, i9 - i8);
        } else {
            boolean[] zArr2 = new boolean[((i9 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            System.arraycopy(this.f8141b, i8, zArr2, i10, this.f8142c - i8);
            this.f8141b = zArr2;
        }
        this.f8141b[i8] = zBooleanValue;
        this.f8142c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = k14.f9887d;
        collection.getClass();
        if (!(collection instanceof fz3)) {
            return super.addAll(collection);
        }
        fz3 fz3Var = (fz3) collection;
        int i8 = fz3Var.f8142c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f8142c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        boolean[] zArr = this.f8141b;
        if (i10 > zArr.length) {
            this.f8141b = Arrays.copyOf(zArr, i10);
        }
        System.arraycopy(fz3Var.f8141b, 0, this.f8141b, this.f8142c, fz3Var.f8142c);
        this.f8142c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(boolean z7) {
        a();
        int i8 = this.f8142c;
        boolean[] zArr = this.f8141b;
        if (i8 == zArr.length) {
            boolean[] zArr2 = new boolean[((i8 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            this.f8141b = zArr2;
        }
        boolean[] zArr3 = this.f8141b;
        int i9 = this.f8142c;
        this.f8142c = i9 + 1;
        zArr3[i9] = z7;
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz3)) {
            return super.equals(obj);
        }
        fz3 fz3Var = (fz3) obj;
        if (this.f8142c != fz3Var.f8142c) {
            return false;
        }
        boolean[] zArr = fz3Var.f8141b;
        for (int i8 = 0; i8 < this.f8142c; i8++) {
            if (this.f8141b[i8] != zArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.j14
    public final /* bridge */ /* synthetic */ j14 f(int i8) {
        if (i8 >= this.f8142c) {
            return new fz3(Arrays.copyOf(this.f8141b, i8), this.f8142c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        i(i8);
        return Boolean.valueOf(this.f8141b[i8]);
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i8 = 0; i8 < this.f8142c; i8++) {
            iA = (iA * 31) + k14.a(this.f8141b[i8]);
        }
        return iA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i8 = this.f8142c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f8141b[i9] == zBooleanValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        i(i8);
        boolean[] zArr = this.f8141b;
        boolean z7 = zArr[i8];
        if (i8 < this.f8142c - 1) {
            System.arraycopy(zArr, i8 + 1, zArr, i8, (r2 - i8) - 1);
        }
        this.f8142c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z7);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f8141b;
        System.arraycopy(zArr, i9, zArr, i8, this.f8142c - i9);
        this.f8142c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        i(i8);
        boolean[] zArr = this.f8141b;
        boolean z7 = zArr[i8];
        zArr[i8] = zBooleanValue;
        return Boolean.valueOf(z7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8142c;
    }
}
