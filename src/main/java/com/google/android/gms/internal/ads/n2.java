package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final w1 f11609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f11612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f11613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f11619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f11620l;

    public n2(int i8, int i9, long j8, int i10, w1 w1Var) {
        i9 = i9 != 1 ? 2 : i9;
        this.f11612d = j8;
        this.f11613e = i10;
        this.f11609a = w1Var;
        this.f11610b = i(i8, i9 == 2 ? 1667497984 : 1651965952);
        this.f11611c = i9 == 2 ? i(i8, 1650720768) : -1;
        this.f11619k = new long[512];
        this.f11620l = new int[512];
    }

    private static int i(int i8, int i9) {
        return (((i8 % 10) + 48) << 8) | ((i8 / 10) + 48) | i9;
    }

    private final long j(int i8) {
        return (this.f11612d * ((long) i8)) / ((long) this.f11613e);
    }

    private final r1 k(int i8) {
        return new r1(((long) this.f11620l[i8]) * j(1), this.f11619k[i8]);
    }

    public final o1 a(long j8) {
        int iJ = (int) (j8 / j(1));
        int iN = nz2.n(this.f11620l, iJ, true, true);
        if (this.f11620l[iN] == iJ) {
            r1 r1VarK = k(iN);
            return new o1(r1VarK, r1VarK);
        }
        r1 r1VarK2 = k(iN);
        int i8 = iN + 1;
        return i8 < this.f11619k.length ? new o1(r1VarK2, k(i8)) : new o1(r1VarK2, r1VarK2);
    }

    public final void b(long j8) {
        if (this.f11618j == this.f11620l.length) {
            long[] jArr = this.f11619k;
            this.f11619k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f11620l;
            this.f11620l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f11619k;
        int i8 = this.f11618j;
        jArr2[i8] = j8;
        this.f11620l[i8] = this.f11617i;
        this.f11618j = i8 + 1;
    }

    public final void c() {
        this.f11619k = Arrays.copyOf(this.f11619k, this.f11618j);
        this.f11620l = Arrays.copyOf(this.f11620l, this.f11618j);
    }

    public final void d() {
        this.f11617i++;
    }

    public final void e(int i8) {
        this.f11614f = i8;
        this.f11615g = i8;
    }

    public final void f(long j8) {
        int i8;
        if (this.f11618j == 0) {
            i8 = 0;
        } else {
            i8 = this.f11620l[nz2.o(this.f11619k, j8, true, true)];
        }
        this.f11616h = i8;
    }

    public final boolean g(int i8) {
        return this.f11610b == i8 || this.f11611c == i8;
    }

    public final boolean h(q0 q0Var) {
        int i8 = this.f11615g;
        int iF = i8 - this.f11609a.f(q0Var, i8, false);
        this.f11615g = iF;
        boolean z7 = iF == 0;
        if (z7) {
            if (this.f11614f > 0) {
                this.f11609a.a(j(this.f11616h), Arrays.binarySearch(this.f11620l, this.f11616h) >= 0 ? 1 : 0, this.f11614f, 0, null);
            }
            this.f11616h++;
        }
        return z7;
    }
}
