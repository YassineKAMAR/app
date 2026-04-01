package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class m7 extends i7<Boolean> implements xa, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final m7 f18947d = new m7(new boolean[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f18948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18949c;

    m7() {
        this(new boolean[10], 0, true);
    }

    private m7(boolean[] zArr, int i8, boolean z7) {
        super(z7);
        this.f18948b = zArr;
        this.f18949c = i8;
    }

    private final String g(int i8) {
        return "Index:" + i8 + ", Size:" + this.f18949c;
    }

    private final void i(int i8) {
        if (i8 < 0 || i8 >= this.f18949c) {
            throw new IndexOutOfBoundsException(g(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f18949c)) {
            throw new IndexOutOfBoundsException(g(i8));
        }
        boolean[] zArr = this.f18948b;
        if (i9 < zArr.length) {
            System.arraycopy(zArr, i8, zArr, i8 + 1, i9 - i8);
        } else {
            boolean[] zArr2 = new boolean[((i9 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            System.arraycopy(this.f18948b, i8, zArr2, i8 + 1, this.f18949c - i8);
            this.f18948b = zArr2;
        }
        this.f18948b[i8] = zBooleanValue;
        this.f18949c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        a9.e(collection);
        if (!(collection instanceof m7)) {
            return super.addAll(collection);
        }
        m7 m7Var = (m7) collection;
        int i8 = m7Var.f18949c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f18949c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        boolean[] zArr = this.f18948b;
        if (i10 > zArr.length) {
            this.f18948b = Arrays.copyOf(zArr, i10);
        }
        System.arraycopy(m7Var.f18948b, 0, this.f18948b, this.f18949c, m7Var.f18949c);
        this.f18949c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.h9
    public final /* synthetic */ h9 b(int i8) {
        if (i8 >= this.f18949c) {
            return new m7(Arrays.copyOf(this.f18948b, i8), this.f18949c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(boolean z7) {
        a();
        int i8 = this.f18949c;
        boolean[] zArr = this.f18948b;
        if (i8 == zArr.length) {
            boolean[] zArr2 = new boolean[((i8 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            this.f18948b = zArr2;
        }
        boolean[] zArr3 = this.f18948b;
        int i9 = this.f18949c;
        this.f18949c = i9 + 1;
        zArr3[i9] = z7;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7)) {
            return super.equals(obj);
        }
        m7 m7Var = (m7) obj;
        if (this.f18949c != m7Var.f18949c) {
            return false;
        }
        boolean[] zArr = m7Var.f18948b;
        for (int i8 = 0; i8 < this.f18949c; i8++) {
            if (this.f18948b[i8] != zArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        i(i8);
        return Boolean.valueOf(this.f18948b[i8]);
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iC = 1;
        for (int i8 = 0; i8 < this.f18949c; i8++) {
            iC = (iC * 31) + a9.c(this.f18948b[i8]);
        }
        return iC;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f18948b[i8] == zBooleanValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i8) {
        a();
        i(i8);
        boolean[] zArr = this.f18948b;
        boolean z7 = zArr[i8];
        if (i8 < this.f18949c - 1) {
            System.arraycopy(zArr, i8 + 1, zArr, i8, (r2 - i8) - 1);
        }
        this.f18949c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z7);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f18948b;
        System.arraycopy(zArr, i9, zArr, i8, this.f18949c - i9);
        this.f18949c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i8, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        i(i8);
        boolean[] zArr = this.f18948b;
        boolean z7 = zArr[i8];
        zArr[i8] = zBooleanValue;
        return Boolean.valueOf(z7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18949c;
    }
}
