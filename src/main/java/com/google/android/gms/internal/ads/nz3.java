package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class nz3 extends mz3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final byte[] f12315e;

    nz3(byte[] bArr) {
        bArr.getClass();
        this.f12315e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.rz3
    protected final String A(Charset charset) {
        return new String(this.f12315e, R(), n(), charset);
    }

    @Override // com.google.android.gms.internal.ads.rz3
    public final ByteBuffer B() {
        return ByteBuffer.wrap(this.f12315e, R(), n()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.rz3
    final void C(gz3 gz3Var) {
        gz3Var.a(this.f12315e, R(), n());
    }

    @Override // com.google.android.gms.internal.ads.rz3
    public final boolean D() {
        int iR = R();
        return l44.j(this.f12315e, iR, n() + iR);
    }

    @Override // com.google.android.gms.internal.ads.mz3
    final boolean Q(rz3 rz3Var, int i8, int i9) {
        if (i9 > rz3Var.n()) {
            throw new IllegalArgumentException("Length too large: " + i9 + n());
        }
        int i10 = i8 + i9;
        if (i10 > rz3Var.n()) {
            throw new IllegalArgumentException("Ran off end of other: " + i8 + ", " + i9 + ", " + rz3Var.n());
        }
        if (!(rz3Var instanceof nz3)) {
            return rz3Var.y(i8, i10).equals(y(0, i9));
        }
        nz3 nz3Var = (nz3) rz3Var;
        byte[] bArr = this.f12315e;
        byte[] bArr2 = nz3Var.f12315e;
        int iR = R() + i9;
        int iR2 = R();
        int iR3 = nz3Var.R() + i8;
        while (iR2 < iR) {
            if (bArr[iR2] != bArr2[iR3]) {
                return false;
            }
            iR2++;
            iR3++;
        }
        return true;
    }

    protected int R() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.rz3
    public byte e(int i8) {
        return this.f12315e[i8];
    }

    @Override // com.google.android.gms.internal.ads.rz3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rz3) || n() != ((rz3) obj).n()) {
            return false;
        }
        if (n() == 0) {
            return true;
        }
        if (!(obj instanceof nz3)) {
            return obj.equals(this);
        }
        nz3 nz3Var = (nz3) obj;
        int iH = H();
        int iH2 = nz3Var.H();
        if (iH == 0 || iH2 == 0 || iH == iH2) {
            return Q(nz3Var, 0, n());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.rz3
    byte g(int i8) {
        return this.f12315e[i8];
    }

    @Override // com.google.android.gms.internal.ads.rz3
    public int n() {
        return this.f12315e.length;
    }

    @Override // com.google.android.gms.internal.ads.rz3
    protected void p(byte[] bArr, int i8, int i9, int i10) {
        System.arraycopy(this.f12315e, i8, bArr, i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.rz3
    protected final int w(int i8, int i9, int i10) {
        return k14.b(i8, this.f12315e, R() + i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.rz3
    protected final int x(int i8, int i9, int i10) {
        int iR = R() + i9;
        return l44.f(i8, this.f12315e, iR, i10 + iR);
    }

    @Override // com.google.android.gms.internal.ads.rz3
    public final rz3 y(int i8, int i9) {
        int iE = rz3.E(i8, i9, n());
        return iE == 0 ? rz3.f14393b : new kz3(this.f12315e, R() + i8, iE);
    }

    @Override // com.google.android.gms.internal.ads.rz3
    public final zz3 z() {
        return zz3.h(this.f12315e, R(), n(), true);
    }
}
