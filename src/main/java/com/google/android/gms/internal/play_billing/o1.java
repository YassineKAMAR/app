package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class o1 extends y implements RandomAccess, y2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o1 f19640d = new o1(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f19641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19642c;

    o1() {
        this(new int[10], 0, true);
    }

    private o1(int[] iArr, int i8, boolean z7) {
        super(z7);
        this.f19641b = iArr;
        this.f19642c = i8;
    }

    private final void S(int i8) {
        if (i8 < 0 || i8 >= this.f19642c) {
            throw new IndexOutOfBoundsException(i(i8));
        }
    }

    private final String i(int i8) {
        return "Index:" + i8 + ", Size:" + this.f19642c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f19642c)) {
            throw new IndexOutOfBoundsException(i(i8));
        }
        int i10 = i8 + 1;
        int[] iArr = this.f19641b;
        if (i9 < iArr.length) {
            System.arraycopy(iArr, i8, iArr, i10, i9 - i8);
        } else {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            System.arraycopy(this.f19641b, i8, iArr2, i10, this.f19642c - i8);
            this.f19641b = iArr2;
        }
        this.f19641b[i8] = iIntValue;
        this.f19642c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = s1.f19671d;
        collection.getClass();
        if (!(collection instanceof o1)) {
            return super.addAll(collection);
        }
        o1 o1Var = (o1) collection;
        int i8 = o1Var.f19642c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f19642c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        int[] iArr = this.f19641b;
        if (i10 > iArr.length) {
            this.f19641b = Arrays.copyOf(iArr, i10);
        }
        System.arraycopy(o1Var.f19641b, 0, this.f19641b, this.f19642c, o1Var.f19642c);
        this.f19642c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i8) {
        S(i8);
        return this.f19641b[i8];
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return super.equals(obj);
        }
        o1 o1Var = (o1) obj;
        if (this.f19642c != o1Var.f19642c) {
            return false;
        }
        int[] iArr = o1Var.f19641b;
        for (int i8 = 0; i8 < this.f19642c; i8++) {
            if (this.f19641b[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.r1
    public final /* bridge */ /* synthetic */ r1 f(int i8) {
        if (i8 >= this.f19642c) {
            return new o1(Arrays.copyOf(this.f19641b, i8), this.f19642c, true);
        }
        throw new IllegalArgumentException();
    }

    public final void g(int i8) {
        a();
        int i9 = this.f19642c;
        int[] iArr = this.f19641b;
        if (i9 == iArr.length) {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            this.f19641b = iArr2;
        }
        int[] iArr3 = this.f19641b;
        int i10 = this.f19642c;
        this.f19642c = i10 + 1;
        iArr3[i10] = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        S(i8);
        return Integer.valueOf(this.f19641b[i8]);
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f19642c; i9++) {
            i8 = (i8 * 31) + this.f19641b[i9];
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i8 = this.f19642c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f19641b[i9] == iIntValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        S(i8);
        int[] iArr = this.f19641b;
        int i9 = iArr[i8];
        if (i8 < this.f19642c - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (r2 - i8) - 1);
        }
        this.f19642c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f19641b;
        System.arraycopy(iArr, i9, iArr, i8, this.f19642c - i9);
        this.f19642c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        S(i8);
        int[] iArr = this.f19641b;
        int i9 = iArr[i8];
        iArr[i8] = iIntValue;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19642c;
    }
}
