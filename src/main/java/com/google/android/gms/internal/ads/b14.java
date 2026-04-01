package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class b14 extends bz3 implements RandomAccess, f14, r24 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b14 f5566d = new b14(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f5567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5568c;

    b14() {
        this(new int[10], 0, true);
    }

    private b14(int[] iArr, int i8, boolean z7) {
        super(z7);
        this.f5567b = iArr;
        this.f5568c = i8;
    }

    public static b14 g() {
        return f5566d;
    }

    private final String i(int i8) {
        return "Index:" + i8 + ", Size:" + this.f5568c;
    }

    private final void n(int i8) {
        if (i8 < 0 || i8 >= this.f5568c) {
            throw new IndexOutOfBoundsException(i(i8));
        }
    }

    @Override // com.google.android.gms.internal.ads.j14
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final f14 f(int i8) {
        if (i8 >= this.f5568c) {
            return new b14(Arrays.copyOf(this.f5567b, i8), this.f5568c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.f14
    public final void S(int i8) {
        a();
        int i9 = this.f5568c;
        int[] iArr = this.f5567b;
        if (i9 == iArr.length) {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            this.f5567b = iArr2;
        }
        int[] iArr3 = this.f5567b;
        int i10 = this.f5568c;
        this.f5568c = i10 + 1;
        iArr3[i10] = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f5568c)) {
            throw new IndexOutOfBoundsException(i(i8));
        }
        int i10 = i8 + 1;
        int[] iArr = this.f5567b;
        if (i9 < iArr.length) {
            System.arraycopy(iArr, i8, iArr, i10, i9 - i8);
        } else {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            System.arraycopy(this.f5567b, i8, iArr2, i10, this.f5568c - i8);
            this.f5567b = iArr2;
        }
        this.f5567b[i8] = iIntValue;
        this.f5568c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        S(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = k14.f9887d;
        collection.getClass();
        if (!(collection instanceof b14)) {
            return super.addAll(collection);
        }
        b14 b14Var = (b14) collection;
        int i8 = b14Var.f5568c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f5568c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        int[] iArr = this.f5567b;
        if (i10 > iArr.length) {
            this.f5567b = Arrays.copyOf(iArr, i10);
        }
        System.arraycopy(b14Var.f5567b, 0, this.f5567b, this.f5568c, b14Var.f5568c);
        this.f5568c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i8) {
        n(i8);
        return this.f5567b[i8];
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b14)) {
            return super.equals(obj);
        }
        b14 b14Var = (b14) obj;
        if (this.f5568c != b14Var.f5568c) {
            return false;
        }
        int[] iArr = b14Var.f5567b;
        for (int i8 = 0; i8 < this.f5568c; i8++) {
            if (this.f5567b[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        n(i8);
        return Integer.valueOf(this.f5567b[i8]);
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f5568c; i9++) {
            i8 = (i8 * 31) + this.f5567b[i9];
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i8 = this.f5568c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f5567b[i9] == iIntValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        n(i8);
        int[] iArr = this.f5567b;
        int i9 = iArr[i8];
        if (i8 < this.f5568c - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (r2 - i8) - 1);
        }
        this.f5568c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f5567b;
        System.arraycopy(iArr, i9, iArr, i8, this.f5568c - i9);
        this.f5568c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        n(i8);
        int[] iArr = this.f5567b;
        int i9 = iArr[i8];
        iArr[i8] = iIntValue;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5568c;
    }
}
