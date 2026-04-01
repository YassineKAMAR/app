package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class c0 extends y implements RandomAccess, y2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c0 f19476d = new c0(new boolean[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f19477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19478c;

    c0() {
        this(new boolean[10], 0, true);
    }

    private c0(boolean[] zArr, int i8, boolean z7) {
        super(z7);
        this.f19477b = zArr;
        this.f19478c = i8;
    }

    private final String g(int i8) {
        return "Index:" + i8 + ", Size:" + this.f19478c;
    }

    private final void i(int i8) {
        if (i8 < 0 || i8 >= this.f19478c) {
            throw new IndexOutOfBoundsException(g(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f19478c)) {
            throw new IndexOutOfBoundsException(g(i8));
        }
        int i10 = i8 + 1;
        boolean[] zArr = this.f19477b;
        if (i9 < zArr.length) {
            System.arraycopy(zArr, i8, zArr, i10, i9 - i8);
        } else {
            boolean[] zArr2 = new boolean[((i9 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            System.arraycopy(this.f19477b, i8, zArr2, i10, this.f19478c - i8);
            this.f19477b = zArr2;
        }
        this.f19477b[i8] = zBooleanValue;
        this.f19478c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = s1.f19671d;
        collection.getClass();
        if (!(collection instanceof c0)) {
            return super.addAll(collection);
        }
        c0 c0Var = (c0) collection;
        int i8 = c0Var.f19478c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f19478c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        boolean[] zArr = this.f19477b;
        if (i10 > zArr.length) {
            this.f19477b = Arrays.copyOf(zArr, i10);
        }
        System.arraycopy(c0Var.f19477b, 0, this.f19477b, this.f19478c, c0Var.f19478c);
        this.f19478c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(boolean z7) {
        a();
        int i8 = this.f19478c;
        boolean[] zArr = this.f19477b;
        if (i8 == zArr.length) {
            boolean[] zArr2 = new boolean[((i8 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            this.f19477b = zArr2;
        }
        boolean[] zArr3 = this.f19477b;
        int i9 = this.f19478c;
        this.f19478c = i9 + 1;
        zArr3[i9] = z7;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return super.equals(obj);
        }
        c0 c0Var = (c0) obj;
        if (this.f19478c != c0Var.f19478c) {
            return false;
        }
        boolean[] zArr = c0Var.f19477b;
        for (int i8 = 0; i8 < this.f19478c; i8++) {
            if (this.f19477b[i8] != zArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.r1
    public final /* bridge */ /* synthetic */ r1 f(int i8) {
        if (i8 >= this.f19478c) {
            return new c0(Arrays.copyOf(this.f19477b, i8), this.f19478c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        i(i8);
        return Boolean.valueOf(this.f19477b[i8]);
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i8 = 0; i8 < this.f19478c; i8++) {
            iA = (iA * 31) + s1.a(this.f19477b[i8]);
        }
        return iA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i8 = this.f19478c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f19477b[i9] == zBooleanValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        i(i8);
        boolean[] zArr = this.f19477b;
        boolean z7 = zArr[i8];
        if (i8 < this.f19478c - 1) {
            System.arraycopy(zArr, i8 + 1, zArr, i8, (r2 - i8) - 1);
        }
        this.f19478c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z7);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f19477b;
        System.arraycopy(zArr, i9, zArr, i8, this.f19478c - i9);
        this.f19478c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        i(i8);
        boolean[] zArr = this.f19477b;
        boolean z7 = zArr[i8];
        zArr[i8] = zBooleanValue;
        return Boolean.valueOf(z7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19478c;
    }
}
