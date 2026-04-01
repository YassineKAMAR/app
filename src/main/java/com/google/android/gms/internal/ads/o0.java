package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f12322a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.w1
    public final void a(long j8, int i8, int i9, int i10, v1 v1Var) {
    }

    @Override // com.google.android.gms.internal.ads.w1
    public final int b(wl4 wl4Var, int i8, boolean z7, int i9) throws EOFException {
        int iH = wl4Var.H(this.f12322a, 0, Math.min(4096, i8));
        if (iH != -1) {
            return iH;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.w1
    public final void c(dq2 dq2Var, int i8, int i9) {
        dq2Var.h(i8);
    }

    @Override // com.google.android.gms.internal.ads.w1
    public final /* synthetic */ void d(dq2 dq2Var, int i8) {
        u1.b(this, dq2Var, i8);
    }

    @Override // com.google.android.gms.internal.ads.w1
    public final void e(nb nbVar) {
    }

    @Override // com.google.android.gms.internal.ads.w1
    public final /* synthetic */ int f(wl4 wl4Var, int i8, boolean z7) {
        return u1.a(this, wl4Var, i8, z7);
    }
}
