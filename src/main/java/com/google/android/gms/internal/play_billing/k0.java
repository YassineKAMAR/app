package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class k0 extends j0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final byte[] f19606e;

    k0(byte[] bArr) {
        bArr.getClass();
        this.f19606e = bArr;
    }

    protected int A() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.n0
    public byte a(int i8) {
        return this.f19606e[i8];
    }

    @Override // com.google.android.gms.internal.play_billing.n0
    byte e(int i8) {
        return this.f19606e[i8];
    }

    @Override // com.google.android.gms.internal.play_billing.n0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n0) || g() != ((n0) obj).g()) {
            return false;
        }
        if (g() == 0) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return obj.equals(this);
        }
        k0 k0Var = (k0) obj;
        int iX = x();
        int iX2 = k0Var.x();
        if (iX != 0 && iX2 != 0 && iX != iX2) {
            return false;
        }
        int iG = g();
        if (iG > k0Var.g()) {
            throw new IllegalArgumentException("Length too large: " + iG + g());
        }
        if (iG > k0Var.g()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iG + ", " + k0Var.g());
        }
        byte[] bArr = this.f19606e;
        byte[] bArr2 = k0Var.f19606e;
        k0Var.A();
        int i8 = 0;
        int i9 = 0;
        while (i8 < iG) {
            if (bArr[i8] != bArr2[i9]) {
                return false;
            }
            i8++;
            i9++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.n0
    public int g() {
        return this.f19606e.length;
    }

    @Override // com.google.android.gms.internal.play_billing.n0
    protected final int i(int i8, int i9, int i10) {
        return s1.b(i8, this.f19606e, 0, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.n0
    public final n0 n(int i8, int i9) {
        int iW = n0.w(0, i9, g());
        return iW == 0 ? n0.f19633b : new h0(this.f19606e, 0, iW);
    }

    @Override // com.google.android.gms.internal.play_billing.n0
    protected final String p(Charset charset) {
        return new String(this.f19606e, 0, g(), charset);
    }

    @Override // com.google.android.gms.internal.play_billing.n0
    final void u(d0 d0Var) {
        ((s0) d0Var).B(this.f19606e, 0, g());
    }

    @Override // com.google.android.gms.internal.play_billing.n0
    public final boolean v() {
        return i4.e(this.f19606e, 0, g());
    }
}
