package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class j8 extends i7<Double> implements xa, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j8 f18832d = new j8(new double[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f18833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18834c;

    j8() {
        this(new double[10], 0, true);
    }

    private j8(double[] dArr, int i8, boolean z7) {
        super(z7);
        this.f18833b = dArr;
        this.f18834c = i8;
    }

    private final String g(int i8) {
        return "Index:" + i8 + ", Size:" + this.f18834c;
    }

    private final void i(int i8) {
        if (i8 < 0 || i8 >= this.f18834c) {
            throw new IndexOutOfBoundsException(g(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f18834c)) {
            throw new IndexOutOfBoundsException(g(i8));
        }
        double[] dArr = this.f18833b;
        if (i9 < dArr.length) {
            System.arraycopy(dArr, i8, dArr, i8 + 1, i9 - i8);
        } else {
            double[] dArr2 = new double[((i9 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            System.arraycopy(this.f18833b, i8, dArr2, i8 + 1, this.f18834c - i8);
            this.f18833b = dArr2;
        }
        this.f18833b[i8] = dDoubleValue;
        this.f18834c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        a9.e(collection);
        if (!(collection instanceof j8)) {
            return super.addAll(collection);
        }
        j8 j8Var = (j8) collection;
        int i8 = j8Var.f18834c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f18834c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        double[] dArr = this.f18833b;
        if (i10 > dArr.length) {
            this.f18833b = Arrays.copyOf(dArr, i10);
        }
        System.arraycopy(j8Var.f18833b, 0, this.f18833b, this.f18834c, j8Var.f18834c);
        this.f18834c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.h9
    public final /* synthetic */ h9 b(int i8) {
        if (i8 >= this.f18834c) {
            return new j8(Arrays.copyOf(this.f18833b, i8), this.f18834c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(double d8) {
        a();
        int i8 = this.f18834c;
        double[] dArr = this.f18833b;
        if (i8 == dArr.length) {
            double[] dArr2 = new double[((i8 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            this.f18833b = dArr2;
        }
        double[] dArr3 = this.f18833b;
        int i9 = this.f18834c;
        this.f18834c = i9 + 1;
        dArr3[i9] = d8;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8)) {
            return super.equals(obj);
        }
        j8 j8Var = (j8) obj;
        if (this.f18834c != j8Var.f18834c) {
            return false;
        }
        double[] dArr = j8Var.f18833b;
        for (int i8 = 0; i8 < this.f18834c; i8++) {
            if (Double.doubleToLongBits(this.f18833b[i8]) != Double.doubleToLongBits(dArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        i(i8);
        return Double.valueOf(this.f18833b[i8]);
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i8 = 0; i8 < this.f18834c; i8++) {
            iB = (iB * 31) + a9.b(Double.doubleToLongBits(this.f18833b[i8]));
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f18833b[i8] == dDoubleValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i8) {
        a();
        i(i8);
        double[] dArr = this.f18833b;
        double d8 = dArr[i8];
        if (i8 < this.f18834c - 1) {
            System.arraycopy(dArr, i8 + 1, dArr, i8, (r3 - i8) - 1);
        }
        this.f18834c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f18833b;
        System.arraycopy(dArr, i9, dArr, i8, this.f18834c - i9);
        this.f18834c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i8, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        i(i8);
        double[] dArr = this.f18833b;
        double d8 = dArr[i8];
        dArr[i8] = dDoubleValue;
        return Double.valueOf(d8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18834c;
    }
}
