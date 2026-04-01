package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class x0 extends y implements RandomAccess, y2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final x0 f19731d = new x0(new double[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f19732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19733c;

    x0() {
        this(new double[10], 0, true);
    }

    private x0(double[] dArr, int i8, boolean z7) {
        super(z7);
        this.f19732b = dArr;
        this.f19733c = i8;
    }

    private final String g(int i8) {
        return "Index:" + i8 + ", Size:" + this.f19733c;
    }

    private final void i(int i8) {
        if (i8 < 0 || i8 >= this.f19733c) {
            throw new IndexOutOfBoundsException(g(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f19733c)) {
            throw new IndexOutOfBoundsException(g(i8));
        }
        int i10 = i8 + 1;
        double[] dArr = this.f19732b;
        if (i9 < dArr.length) {
            System.arraycopy(dArr, i8, dArr, i10, i9 - i8);
        } else {
            double[] dArr2 = new double[((i9 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            System.arraycopy(this.f19732b, i8, dArr2, i10, this.f19733c - i8);
            this.f19732b = dArr2;
        }
        this.f19732b[i8] = dDoubleValue;
        this.f19733c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = s1.f19671d;
        collection.getClass();
        if (!(collection instanceof x0)) {
            return super.addAll(collection);
        }
        x0 x0Var = (x0) collection;
        int i8 = x0Var.f19733c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f19733c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        double[] dArr = this.f19732b;
        if (i10 > dArr.length) {
            this.f19732b = Arrays.copyOf(dArr, i10);
        }
        System.arraycopy(x0Var.f19732b, 0, this.f19732b, this.f19733c, x0Var.f19733c);
        this.f19733c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(double d8) {
        a();
        int i8 = this.f19733c;
        double[] dArr = this.f19732b;
        if (i8 == dArr.length) {
            double[] dArr2 = new double[((i8 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            this.f19732b = dArr2;
        }
        double[] dArr3 = this.f19732b;
        int i9 = this.f19733c;
        this.f19733c = i9 + 1;
        dArr3[i9] = d8;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return super.equals(obj);
        }
        x0 x0Var = (x0) obj;
        if (this.f19733c != x0Var.f19733c) {
            return false;
        }
        double[] dArr = x0Var.f19732b;
        for (int i8 = 0; i8 < this.f19733c; i8++) {
            if (Double.doubleToLongBits(this.f19732b[i8]) != Double.doubleToLongBits(dArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.r1
    public final /* bridge */ /* synthetic */ r1 f(int i8) {
        if (i8 >= this.f19733c) {
            return new x0(Arrays.copyOf(this.f19732b, i8), this.f19733c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        i(i8);
        return Double.valueOf(this.f19732b[i8]);
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f19733c; i9++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f19732b[i9]);
            byte[] bArr = s1.f19671d;
            i8 = (i8 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i8 = this.f19733c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f19732b[i9] == dDoubleValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        i(i8);
        double[] dArr = this.f19732b;
        double d8 = dArr[i8];
        if (i8 < this.f19733c - 1) {
            System.arraycopy(dArr, i8 + 1, dArr, i8, (r3 - i8) - 1);
        }
        this.f19733c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f19732b;
        System.arraycopy(dArr, i9, dArr, i8, this.f19733c - i9);
        this.f19733c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        i(i8);
        double[] dArr = this.f19732b;
        double d8 = dArr[i8];
        dArr[i8] = dDoubleValue;
        return Double.valueOf(d8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19733c;
    }
}
