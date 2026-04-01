package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class h1 extends y implements RandomAccess, y2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h1 f19562d = new h1(new float[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f19563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19564c;

    h1() {
        this(new float[10], 0, true);
    }

    private h1(float[] fArr, int i8, boolean z7) {
        super(z7);
        this.f19563b = fArr;
        this.f19564c = i8;
    }

    private final String g(int i8) {
        return "Index:" + i8 + ", Size:" + this.f19564c;
    }

    private final void i(int i8) {
        if (i8 < 0 || i8 >= this.f19564c) {
            throw new IndexOutOfBoundsException(g(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f19564c)) {
            throw new IndexOutOfBoundsException(g(i8));
        }
        int i10 = i8 + 1;
        float[] fArr = this.f19563b;
        if (i9 < fArr.length) {
            System.arraycopy(fArr, i8, fArr, i10, i9 - i8);
        } else {
            float[] fArr2 = new float[((i9 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            System.arraycopy(this.f19563b, i8, fArr2, i10, this.f19564c - i8);
            this.f19563b = fArr2;
        }
        this.f19563b[i8] = fFloatValue;
        this.f19564c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = s1.f19671d;
        collection.getClass();
        if (!(collection instanceof h1)) {
            return super.addAll(collection);
        }
        h1 h1Var = (h1) collection;
        int i8 = h1Var.f19564c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f19564c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        float[] fArr = this.f19563b;
        if (i10 > fArr.length) {
            this.f19563b = Arrays.copyOf(fArr, i10);
        }
        System.arraycopy(h1Var.f19563b, 0, this.f19563b, this.f19564c, h1Var.f19564c);
        this.f19564c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(float f8) {
        a();
        int i8 = this.f19564c;
        float[] fArr = this.f19563b;
        if (i8 == fArr.length) {
            float[] fArr2 = new float[((i8 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            this.f19563b = fArr2;
        }
        float[] fArr3 = this.f19563b;
        int i9 = this.f19564c;
        this.f19564c = i9 + 1;
        fArr3[i9] = f8;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return super.equals(obj);
        }
        h1 h1Var = (h1) obj;
        if (this.f19564c != h1Var.f19564c) {
            return false;
        }
        float[] fArr = h1Var.f19563b;
        for (int i8 = 0; i8 < this.f19564c; i8++) {
            if (Float.floatToIntBits(this.f19563b[i8]) != Float.floatToIntBits(fArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.r1
    public final /* bridge */ /* synthetic */ r1 f(int i8) {
        if (i8 >= this.f19564c) {
            return new h1(Arrays.copyOf(this.f19563b, i8), this.f19564c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        i(i8);
        return Float.valueOf(this.f19563b[i8]);
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i8 = 0; i8 < this.f19564c; i8++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f19563b[i8]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i8 = this.f19564c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f19563b[i9] == fFloatValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        i(i8);
        float[] fArr = this.f19563b;
        float f8 = fArr[i8];
        if (i8 < this.f19564c - 1) {
            System.arraycopy(fArr, i8 + 1, fArr, i8, (r2 - i8) - 1);
        }
        this.f19564c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f19563b;
        System.arraycopy(fArr, i9, fArr, i8, this.f19564c - i9);
        this.f19564c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        i(i8);
        float[] fArr = this.f19563b;
        float f8 = fArr[i8];
        fArr[i8] = fFloatValue;
        return Float.valueOf(f8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19564c;
    }
}
