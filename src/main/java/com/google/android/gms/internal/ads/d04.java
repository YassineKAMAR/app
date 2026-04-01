package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class d04 extends h04 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f6532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f6533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f6534g;

    d04(byte[] bArr, int i8, int i9) {
        super(null);
        int length = bArr.length;
        if (((length - i9) | i9) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i9)));
        }
        this.f6532e = bArr;
        this.f6534g = 0;
        this.f6533f = i9;
    }

    public final void D(byte[] bArr, int i8, int i9) throws e04 {
        try {
            System.arraycopy(bArr, i8, this.f6532e, this.f6534g, i9);
            this.f6534g += i9;
        } catch (IndexOutOfBoundsException e8) {
            throw new e04(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6534g), Integer.valueOf(this.f6533f), Integer.valueOf(i9)), e8);
        }
    }

    public final void E(String str) throws e04 {
        int i8 = this.f6534g;
        try {
            int iB = h04.b(str.length() * 3);
            int iB2 = h04.b(str.length());
            if (iB2 != iB) {
                w(l44.e(str));
                byte[] bArr = this.f6532e;
                int i9 = this.f6534g;
                this.f6534g = l44.d(str, bArr, i9, this.f6533f - i9);
                return;
            }
            int i10 = i8 + iB2;
            this.f6534g = i10;
            int iD = l44.d(str, this.f6532e, i10, this.f6533f - i10);
            this.f6534g = i8;
            w((iD - i8) - iB2);
            this.f6534g = iD;
        } catch (k44 e8) {
            this.f6534g = i8;
            f(str, e8);
        } catch (IndexOutOfBoundsException e9) {
            throw new e04(e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.h04, com.google.android.gms.internal.ads.gz3
    public final void a(byte[] bArr, int i8, int i9) throws e04 {
        D(bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void i(byte b8) throws e04 {
        try {
            byte[] bArr = this.f6532e;
            int i8 = this.f6534g;
            this.f6534g = i8 + 1;
            bArr[i8] = b8;
        } catch (IndexOutOfBoundsException e8) {
            throw new e04(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6534g), Integer.valueOf(this.f6533f), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void j(int i8, boolean z7) throws e04 {
        w(i8 << 3);
        i(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void k(int i8, rz3 rz3Var) throws e04 {
        w((i8 << 3) | 2);
        w(rz3Var.n());
        rz3Var.C(this);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final int l() {
        return this.f6533f - this.f6534g;
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void m(int i8, int i9) throws e04 {
        w((i8 << 3) | 5);
        n(i9);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void n(int i8) throws e04 {
        try {
            byte[] bArr = this.f6532e;
            int i9 = this.f6534g;
            int i10 = i9 + 1;
            bArr[i9] = (byte) (i8 & 255);
            int i11 = i10 + 1;
            bArr[i10] = (byte) ((i8 >> 8) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((i8 >> 16) & 255);
            this.f6534g = i12 + 1;
            bArr[i12] = (byte) ((i8 >> 24) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new e04(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6534g), Integer.valueOf(this.f6533f), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void o(int i8, long j8) throws e04 {
        w((i8 << 3) | 1);
        p(j8);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void p(long j8) throws e04 {
        try {
            byte[] bArr = this.f6532e;
            int i8 = this.f6534g;
            int i9 = i8 + 1;
            bArr[i8] = (byte) (((int) j8) & 255);
            int i10 = i9 + 1;
            bArr[i9] = (byte) (((int) (j8 >> 8)) & 255);
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) (j8 >> 16)) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j8 >> 24)) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((int) (j8 >> 32)) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j8 >> 40)) & 255);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j8 >> 48)) & 255);
            this.f6534g = i15 + 1;
            bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new e04(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6534g), Integer.valueOf(this.f6533f), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void q(int i8, int i9) throws e04 {
        w(i8 << 3);
        r(i9);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void r(int i8) throws e04 {
        if (i8 >= 0) {
            w(i8);
        } else {
            y(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.h04
    final void s(int i8, k24 k24Var, e34 e34Var) throws e04 {
        w((i8 << 3) | 2);
        w(((az3) k24Var).b(e34Var));
        e34Var.h(k24Var, this.f8590a);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void t(int i8, String str) throws e04 {
        w((i8 << 3) | 2);
        E(str);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void u(int i8, int i9) throws e04 {
        w((i8 << 3) | i9);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void v(int i8, int i9) throws e04 {
        w(i8 << 3);
        w(i9);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void w(int i8) throws e04 {
        while ((i8 & (-128)) != 0) {
            try {
                byte[] bArr = this.f6532e;
                int i9 = this.f6534g;
                this.f6534g = i9 + 1;
                bArr[i9] = (byte) ((i8 & 127) | 128);
                i8 >>>= 7;
            } catch (IndexOutOfBoundsException e8) {
                throw new e04(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6534g), Integer.valueOf(this.f6533f), 1), e8);
            }
        }
        byte[] bArr2 = this.f6532e;
        int i10 = this.f6534g;
        this.f6534g = i10 + 1;
        bArr2[i10] = (byte) i8;
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void x(int i8, long j8) throws e04 {
        w(i8 << 3);
        y(j8);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void y(long j8) throws e04 {
        if (!h04.f8588c || this.f6533f - this.f6534g < 10) {
            while ((j8 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f6532e;
                    int i8 = this.f6534g;
                    this.f6534g = i8 + 1;
                    bArr[i8] = (byte) ((((int) j8) & 127) | 128);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new e04(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6534g), Integer.valueOf(this.f6533f), 1), e8);
                }
            }
            byte[] bArr2 = this.f6532e;
            int i9 = this.f6534g;
            this.f6534g = i9 + 1;
            bArr2[i9] = (byte) j8;
            return;
        }
        while (true) {
            int i10 = (int) j8;
            if ((j8 & (-128)) == 0) {
                byte[] bArr3 = this.f6532e;
                int i11 = this.f6534g;
                this.f6534g = i11 + 1;
                g44.y(bArr3, i11, (byte) i10);
                return;
            }
            byte[] bArr4 = this.f6532e;
            int i12 = this.f6534g;
            this.f6534g = i12 + 1;
            g44.y(bArr4, i12, (byte) ((i10 & 127) | 128));
            j8 >>>= 7;
        }
    }
}
