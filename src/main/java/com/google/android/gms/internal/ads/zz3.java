package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class zz3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile int f18528d = 100;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f18529e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f18530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f18531b = f18528d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b04 f18532c;

    /* synthetic */ zz3(yz3 yz3Var) {
    }

    public static int e(int i8) {
        return (i8 >>> 1) ^ (-(i8 & 1));
    }

    public static long f(long j8) {
        return (j8 >>> 1) ^ (-(1 & j8));
    }

    public static zz3 g(InputStream inputStream, int i8) {
        return new xz3(inputStream, 4096, null);
    }

    static zz3 h(byte[] bArr, int i8, int i9, boolean z7) {
        tz3 tz3Var = new tz3(bArr, i8, i9, z7, null);
        try {
            tz3Var.l(i9);
            return tz3Var;
        } catch (m14 e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public abstract String A();

    public abstract void B(int i8);

    public abstract void a(int i8);

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d(int i8);

    public abstract double i();

    public abstract float j();

    public abstract int k();

    public abstract int l(int i8);

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract long w();

    public abstract long x();

    public abstract rz3 y();

    public abstract String z();
}
