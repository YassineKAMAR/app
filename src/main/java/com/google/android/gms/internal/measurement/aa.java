package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class aa extends i7<Long> implements i9, xa, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final aa f18551d = new aa(new long[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f18552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18553c;

    aa() {
        this(new long[10], 0, true);
    }

    private aa(long[] jArr, int i8, boolean z7) {
        super(z7);
        this.f18552b = jArr;
        this.f18553c = i8;
    }

    public static aa g() {
        return f18551d;
    }

    private final String i(int i8) {
        return "Index:" + i8 + ", Size:" + this.f18553c;
    }

    private final void n(int i8) {
        if (i8 < 0 || i8 >= this.f18553c) {
            throw new IndexOutOfBoundsException(i(i8));
        }
    }

    @Override // com.google.android.gms.internal.measurement.h9
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final i9 b(int i8) {
        if (i8 >= this.f18553c) {
            return new aa(Arrays.copyOf(this.f18552b, i8), this.f18553c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f18553c)) {
            throw new IndexOutOfBoundsException(i(i8));
        }
        long[] jArr = this.f18552b;
        if (i9 < jArr.length) {
            System.arraycopy(jArr, i8, jArr, i8 + 1, i9 - i8);
        } else {
            long[] jArr2 = new long[((i9 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            System.arraycopy(this.f18552b, i8, jArr2, i8 + 1, this.f18553c - i8);
            this.f18552b = jArr2;
        }
        this.f18552b[i8] = jLongValue;
        this.f18553c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        a9.e(collection);
        if (!(collection instanceof aa)) {
            return super.addAll(collection);
        }
        aa aaVar = (aa) collection;
        int i8 = aaVar.f18553c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f18553c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        long[] jArr = this.f18552b;
        if (i10 > jArr.length) {
            this.f18552b = Arrays.copyOf(jArr, i10);
        }
        System.arraycopy(aaVar.f18552b, 0, this.f18552b, this.f18553c, aaVar.f18553c);
        this.f18553c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.i9
    public final long d(int i8) {
        n(i8);
        return this.f18552b[i8];
    }

    public final void e(long j8) {
        a();
        int i8 = this.f18553c;
        long[] jArr = this.f18552b;
        if (i8 == jArr.length) {
            long[] jArr2 = new long[((i8 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            this.f18552b = jArr2;
        }
        long[] jArr3 = this.f18552b;
        int i9 = this.f18553c;
        this.f18553c = i9 + 1;
        jArr3[i9] = j8;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return super.equals(obj);
        }
        aa aaVar = (aa) obj;
        if (this.f18553c != aaVar.f18553c) {
            return false;
        }
        long[] jArr = aaVar.f18552b;
        for (int i8 = 0; i8 < this.f18553c; i8++) {
            if (this.f18552b[i8] != jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        return Long.valueOf(d(i8));
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i8 = 0; i8 < this.f18553c; i8++) {
            iB = (iB * 31) + a9.b(this.f18552b[i8]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f18552b[i8] == jLongValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i8) {
        a();
        n(i8);
        long[] jArr = this.f18552b;
        long j8 = jArr[i8];
        if (i8 < this.f18553c - 1) {
            System.arraycopy(jArr, i8 + 1, jArr, i8, (r3 - i8) - 1);
        }
        this.f18553c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f18552b;
        System.arraycopy(jArr, i9, jArr, i8, this.f18553c - i9);
        this.f18553c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i8, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        n(i8);
        long[] jArr = this.f18552b;
        long j8 = jArr[i8];
        jArr[i8] = jLongValue;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18553c;
    }
}
