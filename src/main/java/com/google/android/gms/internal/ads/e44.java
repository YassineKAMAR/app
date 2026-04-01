package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class e44 extends f44 {
    e44(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.f44
    public final byte a(long j8) {
        return Memory.peekByte(j8);
    }

    @Override // com.google.android.gms.internal.ads.f44
    public final double b(Object obj, long j8) {
        return Double.longBitsToDouble(this.f7625a.getLong(obj, j8));
    }

    @Override // com.google.android.gms.internal.ads.f44
    public final float c(Object obj, long j8) {
        return Float.intBitsToFloat(this.f7625a.getInt(obj, j8));
    }

    @Override // com.google.android.gms.internal.ads.f44
    public final void d(long j8, byte[] bArr, long j9, long j10) {
        Memory.peekByteArray(j8, bArr, (int) j9, (int) j10);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.g44.s(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.g44.t(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z7' boolean)' in method call: com.google.android.gms.internal.ads.g44.s(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z7' boolean)' in method call: com.google.android.gms.internal.ads.g44.t(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.f44
    public final void e(Object obj, long j8, boolean z7) {
        if (g44.f8213i) {
            g44.s(obj, j8, z7);
        } else {
            g44.t(obj, j8, z7);
        }
    }

    @Override // com.google.android.gms.internal.ads.f44
    public final void f(Object obj, long j8, byte b8) {
        if (g44.f8213i) {
            g44.g(obj, j8, b8);
        } else {
            g44.h(obj, j8, b8);
        }
    }

    @Override // com.google.android.gms.internal.ads.f44
    public final void g(Object obj, long j8, double d8) {
        this.f7625a.putLong(obj, j8, Double.doubleToLongBits(d8));
    }

    @Override // com.google.android.gms.internal.ads.f44
    public final void h(Object obj, long j8, float f8) {
        this.f7625a.putInt(obj, j8, Float.floatToIntBits(f8));
    }

    @Override // com.google.android.gms.internal.ads.f44
    public final boolean i(Object obj, long j8) {
        return g44.f8213i ? g44.E(obj, j8) : g44.F(obj, j8);
    }
}
