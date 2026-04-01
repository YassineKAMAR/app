package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
abstract class f44 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Unsafe f7625a;

    f44(Unsafe unsafe) {
        this.f7625a = unsafe;
    }

    public abstract byte a(long j8);

    public abstract double b(Object obj, long j8);

    public abstract float c(Object obj, long j8);

    public abstract void d(long j8, byte[] bArr, long j9, long j10);

    public abstract void e(Object obj, long j8, boolean z7);

    public abstract void f(Object obj, long j8, byte b8);

    public abstract void g(Object obj, long j8, double d8);

    public abstract void h(Object obj, long j8, float f8);

    public abstract boolean i(Object obj, long j8);
}
