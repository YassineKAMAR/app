package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public abstract class e8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile int f18680d = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f18681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18683c;

    private e8() {
        this.f18681a = f18680d;
        this.f18682b = Integer.MAX_VALUE;
        this.f18683c = false;
    }

    public static long b(long j8) {
        return (-(j8 & 1)) ^ (j8 >>> 1);
    }

    static e8 c(byte[] bArr, int i8, int i9, boolean z7) {
        d8 d8Var = new d8(bArr, i9);
        try {
            d8Var.a(i9);
            return d8Var;
        } catch (k9 e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static int e(int i8) {
        return (-(i8 & 1)) ^ (i8 >>> 1);
    }

    public abstract int a(int i8);

    public abstract int d();
}
