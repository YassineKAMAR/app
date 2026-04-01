package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
final class f04 extends c04 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final OutputStream f7565i;

    f04(OutputStream outputStream, int i8) {
        super(i8);
        this.f7565i = outputStream;
    }

    private final void I() throws IOException {
        this.f7565i.write(this.f6084e, 0, this.f6086g);
        this.f6086g = 0;
    }

    private final void J(int i8) throws IOException {
        if (this.f6085f - this.f6086g < i8) {
            I();
        }
    }

    public final void K(byte[] bArr, int i8, int i9) throws IOException {
        int i10 = this.f6085f;
        int i11 = this.f6086g;
        int i12 = i10 - i11;
        if (i12 >= i9) {
            System.arraycopy(bArr, i8, this.f6084e, i11, i9);
            this.f6086g += i9;
        } else {
            System.arraycopy(bArr, i8, this.f6084e, i11, i12);
            int i13 = i8 + i12;
            this.f6086g = this.f6085f;
            this.f6087h += i12;
            I();
            i9 -= i12;
            if (i9 <= this.f6085f) {
                System.arraycopy(bArr, i13, this.f6084e, 0, i9);
                this.f6086g = i9;
            } else {
                this.f7565i.write(bArr, i13, i9);
            }
        }
        this.f6087h += i9;
    }

    public final void L(String str) throws IOException {
        int iE;
        try {
            int length = str.length() * 3;
            int iB = h04.b(length);
            int i8 = iB + length;
            int i9 = this.f6085f;
            if (i8 > i9) {
                byte[] bArr = new byte[length];
                int iD = l44.d(str, bArr, 0, length);
                w(iD);
                K(bArr, 0, iD);
                return;
            }
            if (i8 > i9 - this.f6086g) {
                I();
            }
            int iB2 = h04.b(str.length());
            int i10 = this.f6086g;
            try {
                if (iB2 == iB) {
                    int i11 = i10 + iB2;
                    this.f6086g = i11;
                    int iD2 = l44.d(str, this.f6084e, i11, this.f6085f - i11);
                    this.f6086g = i10;
                    iE = (iD2 - i10) - iB2;
                    G(iE);
                    this.f6086g = iD2;
                } else {
                    iE = l44.e(str);
                    G(iE);
                    this.f6086g = l44.d(str, this.f6084e, this.f6086g, iE);
                }
                this.f6087h += iE;
            } catch (k44 e8) {
                this.f6087h -= this.f6086g - i10;
                this.f6086g = i10;
                throw e8;
            } catch (ArrayIndexOutOfBoundsException e9) {
                throw new e04(e9);
            }
        } catch (k44 e10) {
            f(str, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.h04, com.google.android.gms.internal.ads.gz3
    public final void a(byte[] bArr, int i8, int i9) throws IOException {
        K(bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void h() throws IOException {
        if (this.f6086g > 0) {
            I();
        }
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void i(byte b8) throws IOException {
        if (this.f6086g == this.f6085f) {
            I();
        }
        D(b8);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void j(int i8, boolean z7) throws IOException {
        J(11);
        G(i8 << 3);
        D(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void k(int i8, rz3 rz3Var) throws IOException {
        w((i8 << 3) | 2);
        w(rz3Var.n());
        rz3Var.C(this);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void m(int i8, int i9) throws IOException {
        J(14);
        G((i8 << 3) | 5);
        E(i9);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void n(int i8) throws IOException {
        J(4);
        E(i8);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void o(int i8, long j8) throws IOException {
        J(18);
        G((i8 << 3) | 1);
        F(j8);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void p(long j8) throws IOException {
        J(8);
        F(j8);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void q(int i8, int i9) throws IOException {
        J(20);
        G(i8 << 3);
        if (i9 >= 0) {
            G(i9);
        } else {
            H(i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void r(int i8) throws IOException {
        if (i8 >= 0) {
            w(i8);
        } else {
            y(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.h04
    final void s(int i8, k24 k24Var, e34 e34Var) throws IOException {
        w((i8 << 3) | 2);
        w(((az3) k24Var).b(e34Var));
        e34Var.h(k24Var, this.f8590a);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void t(int i8, String str) throws IOException {
        w((i8 << 3) | 2);
        L(str);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void u(int i8, int i9) throws IOException {
        w((i8 << 3) | i9);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void v(int i8, int i9) throws IOException {
        J(20);
        G(i8 << 3);
        G(i9);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void w(int i8) throws IOException {
        J(5);
        G(i8);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void x(int i8, long j8) throws IOException {
        J(20);
        G(i8 << 3);
        H(j8);
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final void y(long j8) throws IOException {
        J(10);
        H(j8);
    }
}
