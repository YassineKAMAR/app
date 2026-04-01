package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class y14 extends bz3 implements RandomAccess, i14, r24 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final y14 f17553d = new y14(new long[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f17554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17555c;

    y14() {
        this(new long[10], 0, true);
    }

    private y14(long[] jArr, int i8, boolean z7) {
        super(z7);
        this.f17554b = jArr;
        this.f17555c = i8;
    }

    public static y14 g() {
        return f17553d;
    }

    private final String n(int i8) {
        return "Index:" + i8 + ", Size:" + this.f17555c;
    }

    private final void p(int i8) {
        if (i8 < 0 || i8 >= this.f17555c) {
            throw new IndexOutOfBoundsException(n(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f17555c)) {
            throw new IndexOutOfBoundsException(n(i8));
        }
        int i10 = i8 + 1;
        long[] jArr = this.f17554b;
        if (i9 < jArr.length) {
            System.arraycopy(jArr, i8, jArr, i10, i9 - i8);
        } else {
            long[] jArr2 = new long[((i9 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            System.arraycopy(this.f17554b, i8, jArr2, i10, this.f17555c - i8);
            this.f17554b = jArr2;
        }
        this.f17554b[i8] = jLongValue;
        this.f17555c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = k14.f9887d;
        collection.getClass();
        if (!(collection instanceof y14)) {
            return super.addAll(collection);
        }
        y14 y14Var = (y14) collection;
        int i8 = y14Var.f17555c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f17555c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        long[] jArr = this.f17554b;
        if (i10 > jArr.length) {
            this.f17554b = Arrays.copyOf(jArr, i10);
        }
        System.arraycopy(y14Var.f17554b, 0, this.f17554b, this.f17555c, y14Var.f17555c);
        this.f17555c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.j14
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final i14 f(int i8) {
        if (i8 >= this.f17555c) {
            return new y14(Arrays.copyOf(this.f17554b, i8), this.f17555c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long e(int i8) {
        p(i8);
        return this.f17554b[i8];
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y14)) {
            return super.equals(obj);
        }
        y14 y14Var = (y14) obj;
        if (this.f17555c != y14Var.f17555c) {
            return false;
        }
        long[] jArr = y14Var.f17554b;
        for (int i8 = 0; i8 < this.f17555c; i8++) {
            if (this.f17554b[i8] != jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        p(i8);
        return Long.valueOf(this.f17554b[i8]);
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f17555c; i9++) {
            long j8 = this.f17554b[i9];
            byte[] bArr = k14.f9887d;
            i8 = (i8 * 31) + ((int) (j8 ^ (j8 >>> 32)));
        }
        return i8;
    }

    public final void i(long j8) {
        a();
        int i8 = this.f17555c;
        long[] jArr = this.f17554b;
        if (i8 == jArr.length) {
            long[] jArr2 = new long[((i8 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            this.f17554b = jArr2;
        }
        long[] jArr3 = this.f17554b;
        int i9 = this.f17555c;
        this.f17555c = i9 + 1;
        jArr3[i9] = j8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i8 = this.f17555c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f17554b[i9] == jLongValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        p(i8);
        long[] jArr = this.f17554b;
        long j8 = jArr[i8];
        if (i8 < this.f17555c - 1) {
            System.arraycopy(jArr, i8 + 1, jArr, i8, (r3 - i8) - 1);
        }
        this.f17555c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f17554b;
        System.arraycopy(jArr, i9, jArr, i8, this.f17555c - i9);
        this.f17555c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        p(i8);
        long[] jArr = this.f17554b;
        long j8 = jArr[i8];
        jArr[i8] = jLongValue;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17555c;
    }
}
