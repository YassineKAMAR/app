package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class b4 extends c4 {
    b4(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.c4
    public final double a(Object obj, long j8) {
        return Double.longBitsToDouble(this.f19479a.getLong(obj, j8));
    }

    @Override // com.google.android.gms.internal.play_billing.c4
    public final float b(Object obj, long j8) {
        return Float.intBitsToFloat(this.f19479a.getInt(obj, j8));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.play_billing.d4.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.play_billing.d4.o(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z7' boolean)' in method call: com.google.android.gms.internal.play_billing.d4.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z7' boolean)' in method call: com.google.android.gms.internal.play_billing.d4.o(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.play_billing.c4
    public final void c(Object obj, long j8, boolean z7) {
        if (d4.f19496h) {
            d4.n(obj, j8, z7);
        } else {
            d4.o(obj, j8, z7);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.c4
    public final void d(Object obj, long j8, byte b8) {
        if (d4.f19496h) {
            d4.d(obj, j8, b8);
        } else {
            d4.e(obj, j8, b8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.c4
    public final void e(Object obj, long j8, double d8) {
        this.f19479a.putLong(obj, j8, Double.doubleToLongBits(d8));
    }

    @Override // com.google.android.gms.internal.play_billing.c4
    public final void f(Object obj, long j8, float f8) {
        this.f19479a.putInt(obj, j8, Float.floatToIntBits(f8));
    }

    @Override // com.google.android.gms.internal.play_billing.c4
    public final boolean g(Object obj, long j8) {
        return d4.f19496h ? d4.y(obj, j8) : d4.z(obj, j8);
    }
}
