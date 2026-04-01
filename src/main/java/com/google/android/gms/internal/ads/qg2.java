package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f13473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f13474b = new long[32];

    public qg2(int i8) {
    }

    public final int a() {
        return this.f13473a;
    }

    public final long b(int i8) {
        if (i8 >= 0 && i8 < this.f13473a) {
            return this.f13474b[i8];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i8 + ", size is " + this.f13473a);
    }

    public final void c(long j8) {
        int i8 = this.f13473a;
        long[] jArr = this.f13474b;
        if (i8 == jArr.length) {
            this.f13474b = Arrays.copyOf(jArr, i8 + i8);
        }
        long[] jArr2 = this.f13474b;
        int i9 = this.f13473a;
        this.f13473a = i9 + 1;
        jArr2[i9] = j8;
    }
}
