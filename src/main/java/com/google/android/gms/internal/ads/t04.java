package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class t04 extends bz3 implements RandomAccess, r24 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final t04 f14906d = new t04(new float[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f14907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14908c;

    t04() {
        this(new float[10], 0, true);
    }

    private t04(float[] fArr, int i8, boolean z7) {
        super(z7);
        this.f14907b = fArr;
        this.f14908c = i8;
    }

    private final String g(int i8) {
        return "Index:" + i8 + ", Size:" + this.f14908c;
    }

    private final void i(int i8) {
        if (i8 < 0 || i8 >= this.f14908c) {
            throw new IndexOutOfBoundsException(g(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f14908c)) {
            throw new IndexOutOfBoundsException(g(i8));
        }
        int i10 = i8 + 1;
        float[] fArr = this.f14907b;
        if (i9 < fArr.length) {
            System.arraycopy(fArr, i8, fArr, i10, i9 - i8);
        } else {
            float[] fArr2 = new float[((i9 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            System.arraycopy(this.f14907b, i8, fArr2, i10, this.f14908c - i8);
            this.f14907b = fArr2;
        }
        this.f14907b[i8] = fFloatValue;
        this.f14908c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = k14.f9887d;
        collection.getClass();
        if (!(collection instanceof t04)) {
            return super.addAll(collection);
        }
        t04 t04Var = (t04) collection;
        int i8 = t04Var.f14908c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f14908c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        float[] fArr = this.f14907b;
        if (i10 > fArr.length) {
            this.f14907b = Arrays.copyOf(fArr, i10);
        }
        System.arraycopy(t04Var.f14907b, 0, this.f14907b, this.f14908c, t04Var.f14908c);
        this.f14908c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(float f8) {
        a();
        int i8 = this.f14908c;
        float[] fArr = this.f14907b;
        if (i8 == fArr.length) {
            float[] fArr2 = new float[((i8 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            this.f14907b = fArr2;
        }
        float[] fArr3 = this.f14907b;
        int i9 = this.f14908c;
        this.f14908c = i9 + 1;
        fArr3[i9] = f8;
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t04)) {
            return super.equals(obj);
        }
        t04 t04Var = (t04) obj;
        if (this.f14908c != t04Var.f14908c) {
            return false;
        }
        float[] fArr = t04Var.f14907b;
        for (int i8 = 0; i8 < this.f14908c; i8++) {
            if (Float.floatToIntBits(this.f14907b[i8]) != Float.floatToIntBits(fArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.j14
    public final /* bridge */ /* synthetic */ j14 f(int i8) {
        if (i8 >= this.f14908c) {
            return new t04(Arrays.copyOf(this.f14907b, i8), this.f14908c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        i(i8);
        return Float.valueOf(this.f14907b[i8]);
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i8 = 0; i8 < this.f14908c; i8++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f14907b[i8]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i8 = this.f14908c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f14907b[i9] == fFloatValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        i(i8);
        float[] fArr = this.f14907b;
        float f8 = fArr[i8];
        if (i8 < this.f14908c - 1) {
            System.arraycopy(fArr, i8 + 1, fArr, i8, (r2 - i8) - 1);
        }
        this.f14908c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f14907b;
        System.arraycopy(fArr, i9, fArr, i8, this.f14908c - i9);
        this.f14908c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        i(i8);
        float[] fArr = this.f14907b;
        float f8 = fArr[i8];
        fArr[i8] = fFloatValue;
        return Float.valueOf(f8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14908c;
    }
}
