package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class x8 extends i7<Float> implements xa, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final x8 f19383d = new x8(new float[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f19384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19385c;

    x8() {
        this(new float[10], 0, true);
    }

    private x8(float[] fArr, int i8, boolean z7) {
        super(z7);
        this.f19384b = fArr;
        this.f19385c = i8;
    }

    private final String g(int i8) {
        return "Index:" + i8 + ", Size:" + this.f19385c;
    }

    private final void i(int i8) {
        if (i8 < 0 || i8 >= this.f19385c) {
            throw new IndexOutOfBoundsException(g(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f19385c)) {
            throw new IndexOutOfBoundsException(g(i8));
        }
        float[] fArr = this.f19384b;
        if (i9 < fArr.length) {
            System.arraycopy(fArr, i8, fArr, i8 + 1, i9 - i8);
        } else {
            float[] fArr2 = new float[((i9 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            System.arraycopy(this.f19384b, i8, fArr2, i8 + 1, this.f19385c - i8);
            this.f19384b = fArr2;
        }
        this.f19384b[i8] = fFloatValue;
        this.f19385c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        a9.e(collection);
        if (!(collection instanceof x8)) {
            return super.addAll(collection);
        }
        x8 x8Var = (x8) collection;
        int i8 = x8Var.f19385c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f19385c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        float[] fArr = this.f19384b;
        if (i10 > fArr.length) {
            this.f19384b = Arrays.copyOf(fArr, i10);
        }
        System.arraycopy(x8Var.f19384b, 0, this.f19384b, this.f19385c, x8Var.f19385c);
        this.f19385c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.h9
    public final /* synthetic */ h9 b(int i8) {
        if (i8 >= this.f19385c) {
            return new x8(Arrays.copyOf(this.f19384b, i8), this.f19385c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(float f8) {
        a();
        int i8 = this.f19385c;
        float[] fArr = this.f19384b;
        if (i8 == fArr.length) {
            float[] fArr2 = new float[((i8 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            this.f19384b = fArr2;
        }
        float[] fArr3 = this.f19384b;
        int i9 = this.f19385c;
        this.f19385c = i9 + 1;
        fArr3[i9] = f8;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8)) {
            return super.equals(obj);
        }
        x8 x8Var = (x8) obj;
        if (this.f19385c != x8Var.f19385c) {
            return false;
        }
        float[] fArr = x8Var.f19384b;
        for (int i8 = 0; i8 < this.f19385c; i8++) {
            if (Float.floatToIntBits(this.f19384b[i8]) != Float.floatToIntBits(fArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        i(i8);
        return Float.valueOf(this.f19384b[i8]);
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i8 = 0; i8 < this.f19385c; i8++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f19384b[i8]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f19384b[i8] == fFloatValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i8) {
        a();
        i(i8);
        float[] fArr = this.f19384b;
        float f8 = fArr[i8];
        if (i8 < this.f19385c - 1) {
            System.arraycopy(fArr, i8 + 1, fArr, i8, (r2 - i8) - 1);
        }
        this.f19385c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f19384b;
        System.arraycopy(fArr, i9, fArr, i8, this.f19385c - i9);
        this.f19385c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i8, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        i(i8);
        float[] fArr = this.f19384b;
        float f8 = fArr[i8];
        fArr[i8] = fFloatValue;
        return Float.valueOf(f8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19385c;
    }
}
