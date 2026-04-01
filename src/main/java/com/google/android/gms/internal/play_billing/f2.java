package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class f2 extends y implements RandomAccess, y2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f2 f19510d = new f2(new long[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f19511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19512c;

    f2() {
        this(new long[10], 0, true);
    }

    private f2(long[] jArr, int i8, boolean z7) {
        super(z7);
        this.f19511b = jArr;
        this.f19512c = i8;
    }

    private final void S(int i8) {
        if (i8 < 0 || i8 >= this.f19512c) {
            throw new IndexOutOfBoundsException(i(i8));
        }
    }

    private final String i(int i8) {
        return "Index:" + i8 + ", Size:" + this.f19512c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f19512c)) {
            throw new IndexOutOfBoundsException(i(i8));
        }
        int i10 = i8 + 1;
        long[] jArr = this.f19511b;
        if (i9 < jArr.length) {
            System.arraycopy(jArr, i8, jArr, i10, i9 - i8);
        } else {
            long[] jArr2 = new long[((i9 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            System.arraycopy(this.f19511b, i8, jArr2, i10, this.f19512c - i8);
            this.f19511b = jArr2;
        }
        this.f19511b[i8] = jLongValue;
        this.f19512c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = s1.f19671d;
        collection.getClass();
        if (!(collection instanceof f2)) {
            return super.addAll(collection);
        }
        f2 f2Var = (f2) collection;
        int i8 = f2Var.f19512c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f19512c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        long[] jArr = this.f19511b;
        if (i10 > jArr.length) {
            this.f19511b = Arrays.copyOf(jArr, i10);
        }
        System.arraycopy(f2Var.f19511b, 0, this.f19511b, this.f19512c, f2Var.f19512c);
        this.f19512c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long e(int i8) {
        S(i8);
        return this.f19511b[i8];
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return super.equals(obj);
        }
        f2 f2Var = (f2) obj;
        if (this.f19512c != f2Var.f19512c) {
            return false;
        }
        long[] jArr = f2Var.f19511b;
        for (int i8 = 0; i8 < this.f19512c; i8++) {
            if (this.f19511b[i8] != jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.r1
    public final /* bridge */ /* synthetic */ r1 f(int i8) {
        if (i8 >= this.f19512c) {
            return new f2(Arrays.copyOf(this.f19511b, i8), this.f19512c, true);
        }
        throw new IllegalArgumentException();
    }

    public final void g(long j8) {
        a();
        int i8 = this.f19512c;
        long[] jArr = this.f19511b;
        if (i8 == jArr.length) {
            long[] jArr2 = new long[((i8 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            this.f19511b = jArr2;
        }
        long[] jArr3 = this.f19511b;
        int i9 = this.f19512c;
        this.f19512c = i9 + 1;
        jArr3[i9] = j8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        S(i8);
        return Long.valueOf(this.f19511b[i8]);
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f19512c; i9++) {
            long j8 = this.f19511b[i9];
            byte[] bArr = s1.f19671d;
            i8 = (i8 * 31) + ((int) (j8 ^ (j8 >>> 32)));
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i8 = this.f19512c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f19511b[i9] == jLongValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        S(i8);
        long[] jArr = this.f19511b;
        long j8 = jArr[i8];
        if (i8 < this.f19512c - 1) {
            System.arraycopy(jArr, i8 + 1, jArr, i8, (r3 - i8) - 1);
        }
        this.f19512c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f19511b;
        System.arraycopy(jArr, i9, jArr, i8, this.f19512c - i9);
        this.f19512c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        S(i8);
        long[] jArr = this.f19511b;
        long j8 = jArr[i8];
        jArr[i8] = jLongValue;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19512c;
    }
}
