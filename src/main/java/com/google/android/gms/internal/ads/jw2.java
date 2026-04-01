package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class jw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f9827a = new long[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f9828b = new Object[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9830d;

    public jw2(int i8) {
    }

    private final Object f() {
        uu1.f(this.f9830d > 0);
        Object[] objArr = this.f9828b;
        int i8 = this.f9829c;
        Object obj = objArr[i8];
        objArr[i8] = null;
        this.f9829c = (i8 + 1) % objArr.length;
        this.f9830d--;
        return obj;
    }

    public final synchronized int a() {
        return this.f9830d;
    }

    public final synchronized Object b() {
        if (this.f9830d == 0) {
            return null;
        }
        return f();
    }

    public final synchronized Object c(long j8) {
        Object objF;
        objF = null;
        while (this.f9830d > 0 && j8 - this.f9827a[this.f9829c] >= 0) {
            objF = f();
        }
        return objF;
    }

    public final synchronized void d(long j8, Object obj) {
        if (this.f9830d > 0) {
            if (j8 <= this.f9827a[((this.f9829c + r0) - 1) % this.f9828b.length]) {
                e();
            }
        }
        int length = this.f9828b.length;
        if (this.f9830d >= length) {
            int i8 = length + length;
            long[] jArr = new long[i8];
            Object[] objArr = new Object[i8];
            int i9 = this.f9829c;
            int i10 = length - i9;
            System.arraycopy(this.f9827a, i9, jArr, 0, i10);
            System.arraycopy(this.f9828b, this.f9829c, objArr, 0, i10);
            int i11 = this.f9829c;
            if (i11 > 0) {
                System.arraycopy(this.f9827a, 0, jArr, i10, i11);
                System.arraycopy(this.f9828b, 0, objArr, i10, this.f9829c);
            }
            this.f9827a = jArr;
            this.f9828b = objArr;
            this.f9829c = 0;
        }
        int i12 = this.f9829c;
        int i13 = this.f9830d;
        Object[] objArr2 = this.f9828b;
        int length2 = (i12 + i13) % objArr2.length;
        this.f9827a[length2] = j8;
        objArr2[length2] = obj;
        this.f9830d = i13 + 1;
    }

    public final synchronized void e() {
        this.f9829c = 0;
        this.f9830d = 0;
        Arrays.fill(this.f9828b, (Object) null);
    }
}
