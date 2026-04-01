package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class s0 extends v0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f19665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19667g;

    s0(byte[] bArr, int i8, int i9) {
        super(null);
        int length = bArr.length;
        if (((length - i9) | i9) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i9)));
        }
        this.f19665e = bArr;
        this.f19667g = 0;
        this.f19666f = i9;
    }

    public final void B(byte[] bArr, int i8, int i9) {
        try {
            System.arraycopy(bArr, 0, this.f19665e, this.f19667g, i9);
            this.f19667g += i9;
        } catch (IndexOutOfBoundsException e8) {
            throw new t0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19667g), Integer.valueOf(this.f19666f), Integer.valueOf(i9)), e8);
        }
    }

    public final void C(String str) throws t0 {
        int i8 = this.f19667g;
        try {
            int iY = v0.y(str.length() * 3);
            int iY2 = v0.y(str.length());
            if (iY2 != iY) {
                r(i4.c(str));
                byte[] bArr = this.f19665e;
                int i9 = this.f19667g;
                this.f19667g = i4.b(str, bArr, i9, this.f19666f - i9);
                return;
            }
            int i10 = i8 + iY2;
            this.f19667g = i10;
            int iB = i4.b(str, this.f19665e, i10, this.f19666f - i10);
            this.f19667g = i8;
            r((iB - i8) - iY2);
            this.f19667g = iB;
        } catch (h4 e8) {
            this.f19667g = i8;
            b(str, e8);
        } catch (IndexOutOfBoundsException e9) {
            throw new t0(e9);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final int d() {
        return this.f19666f - this.f19667g;
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final void e(byte b8) throws t0 {
        try {
            byte[] bArr = this.f19665e;
            int i8 = this.f19667g;
            this.f19667g = i8 + 1;
            bArr[i8] = b8;
        } catch (IndexOutOfBoundsException e8) {
            throw new t0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19667g), Integer.valueOf(this.f19666f), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final void f(int i8, boolean z7) throws t0 {
        r(i8 << 3);
        e(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final void g(int i8, n0 n0Var) {
        r((i8 << 3) | 2);
        r(n0Var.g());
        n0Var.u(this);
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final void h(int i8, int i9) throws t0 {
        r((i8 << 3) | 5);
        i(i9);
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final void i(int i8) throws t0 {
        try {
            byte[] bArr = this.f19665e;
            int i9 = this.f19667g;
            int i10 = i9 + 1;
            bArr[i9] = (byte) (i8 & 255);
            int i11 = i10 + 1;
            bArr[i10] = (byte) ((i8 >> 8) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((i8 >> 16) & 255);
            this.f19667g = i12 + 1;
            bArr[i12] = (byte) ((i8 >> 24) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new t0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19667g), Integer.valueOf(this.f19666f), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final void j(int i8, long j8) throws t0 {
        r((i8 << 3) | 1);
        k(j8);
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final void k(long j8) throws t0 {
        try {
            byte[] bArr = this.f19665e;
            int i8 = this.f19667g;
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
            this.f19667g = i15 + 1;
            bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new t0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19667g), Integer.valueOf(this.f19666f), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final void l(int i8, int i9) throws t0 {
        r(i8 << 3);
        m(i9);
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final void m(int i8) throws t0 {
        if (i8 >= 0) {
            r(i8);
        } else {
            t(i8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final void n(byte[] bArr, int i8, int i9) {
        B(bArr, 0, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final void o(int i8, String str) throws t0 {
        r((i8 << 3) | 2);
        C(str);
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final void p(int i8, int i9) {
        r((i8 << 3) | i9);
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final void q(int i8, int i9) {
        r(i8 << 3);
        r(i9);
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final void r(int i8) {
        while ((i8 & (-128)) != 0) {
            try {
                byte[] bArr = this.f19665e;
                int i9 = this.f19667g;
                this.f19667g = i9 + 1;
                bArr[i9] = (byte) ((i8 & 127) | 128);
                i8 >>>= 7;
            } catch (IndexOutOfBoundsException e8) {
                throw new t0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19667g), Integer.valueOf(this.f19666f), 1), e8);
            }
        }
        byte[] bArr2 = this.f19665e;
        int i10 = this.f19667g;
        this.f19667g = i10 + 1;
        bArr2[i10] = (byte) i8;
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final void s(int i8, long j8) throws t0 {
        r(i8 << 3);
        t(j8);
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final void t(long j8) throws t0 {
        if (!v0.f19700c || this.f19666f - this.f19667g < 10) {
            while ((j8 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f19665e;
                    int i8 = this.f19667g;
                    this.f19667g = i8 + 1;
                    bArr[i8] = (byte) ((((int) j8) & 127) | 128);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new t0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19667g), Integer.valueOf(this.f19666f), 1), e8);
                }
            }
            byte[] bArr2 = this.f19665e;
            int i9 = this.f19667g;
            this.f19667g = i9 + 1;
            bArr2[i9] = (byte) j8;
            return;
        }
        while (true) {
            int i10 = (int) j8;
            if ((j8 & (-128)) == 0) {
                byte[] bArr3 = this.f19665e;
                int i11 = this.f19667g;
                this.f19667g = i11 + 1;
                d4.s(bArr3, i11, (byte) i10);
                return;
            }
            byte[] bArr4 = this.f19665e;
            int i12 = this.f19667g;
            this.f19667g = i12 + 1;
            d4.s(bArr4, i12, (byte) ((i10 & 127) | 128));
            j8 >>>= 7;
        }
    }
}
