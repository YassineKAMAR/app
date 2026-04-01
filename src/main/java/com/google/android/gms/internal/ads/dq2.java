package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class dq2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ob3 f6865d = ob3.C(x73.f17096a, x73.f17098c, x73.f17101f, x73.f17099d, x73.f17100e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f6866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6868c;

    public dq2() {
        this.f6866a = nz2.f12305f;
    }

    public dq2(int i8) {
        this.f6866a = new byte[i8];
        this.f6868c = i8;
    }

    public dq2(byte[] bArr) {
        this.f6866a = bArr;
        this.f6868c = bArr.length;
    }

    public dq2(byte[] bArr, int i8) {
        this.f6866a = bArr;
        this.f6868c = i8;
    }

    public final long A() {
        byte[] bArr = this.f6866a;
        int i8 = this.f6867b;
        int i9 = i8 + 1;
        long j8 = bArr[i8];
        int i10 = i9 + 1;
        long j9 = bArr[i9];
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        this.f6867b = i11 + 1;
        return ((((long) bArr[i11]) & 255) << 24) | (j8 & 255) | ((j9 & 255) << 8) | ((j10 & 255) << 16);
    }

    public final long B() {
        byte[] bArr = this.f6866a;
        int i8 = this.f6867b;
        int i9 = i8 + 1;
        long j8 = bArr[i8];
        int i10 = i9 + 1;
        long j9 = bArr[i9];
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        long j12 = bArr[i12];
        int i14 = i13 + 1;
        long j13 = bArr[i13];
        int i15 = i14 + 1;
        long j14 = bArr[i14];
        this.f6867b = i15 + 1;
        return (((long) bArr[i15]) & 255) | ((j8 & 255) << 56) | ((j9 & 255) << 48) | ((j10 & 255) << 40) | ((j11 & 255) << 32) | ((j12 & 255) << 24) | ((j13 & 255) << 16) | ((j14 & 255) << 8);
    }

    public final long C() {
        byte[] bArr = this.f6866a;
        int i8 = this.f6867b;
        int i9 = i8 + 1;
        long j8 = bArr[i8];
        int i10 = i9 + 1;
        long j9 = bArr[i9];
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        this.f6867b = i11 + 1;
        return (((long) bArr[i11]) & 255) | ((j8 & 255) << 24) | ((j9 & 255) << 16) | ((j10 & 255) << 8);
    }

    public final long D() {
        long jB = B();
        if (jB >= 0) {
            return jB;
        }
        throw new IllegalStateException("Top bit not zero: " + jB);
    }

    public final long E() {
        int i8;
        int i9;
        long j8 = this.f6866a[this.f6867b];
        int i10 = 7;
        while (true) {
            i8 = 0;
            if (i10 < 0) {
                break;
            }
            int i11 = 1 << i10;
            if ((((long) i11) & j8) != 0) {
                i10--;
            } else if (i10 < 6) {
                j8 &= (long) (i11 - 1);
                i8 = 7 - i10;
            } else if (i10 == 7) {
                i8 = 1;
            }
        }
        if (i8 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j8);
        }
        for (i9 = 1; i9 < i8; i9++) {
            byte b8 = this.f6866a[this.f6867b + i9];
            if ((b8 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j8);
            }
            j8 = (j8 << 6) | ((long) (b8 & 63));
        }
        this.f6867b += i8;
        return j8;
    }

    public final String F(char c8) {
        int i8 = this.f6868c;
        int i9 = this.f6867b;
        if (i8 - i9 == 0) {
            return null;
        }
        while (i9 < this.f6868c && this.f6866a[i9] != 0) {
            i9++;
        }
        byte[] bArr = this.f6866a;
        int i10 = this.f6867b;
        String strK = nz2.K(bArr, i10, i9 - i10);
        this.f6867b = i9;
        if (i9 < this.f6868c) {
            this.f6867b = i9 + 1;
        }
        return strK;
    }

    public final String G(int i8) {
        if (i8 == 0) {
            return "";
        }
        int i9 = this.f6867b;
        int i10 = (i9 + i8) - 1;
        String strK = nz2.K(this.f6866a, i9, (i10 >= this.f6868c || this.f6866a[i10] != 0) ? i8 : i8 - 1);
        this.f6867b += i8;
        return strK;
    }

    public final String H(int i8, Charset charset) {
        byte[] bArr = this.f6866a;
        int i9 = this.f6867b;
        String str = new String(bArr, i9, i8, charset);
        this.f6867b = i9 + i8;
        return str;
    }

    public final short I() {
        byte[] bArr = this.f6866a;
        int i8 = this.f6867b;
        int i9 = i8 + 1;
        int i10 = bArr[i8] & 255;
        this.f6867b = i9 + 1;
        return (short) ((bArr[i9] & 255) | (i10 << 8));
    }

    public final void a(int i8) {
        byte[] bArr = this.f6866a;
        if (i8 > bArr.length) {
            this.f6866a = Arrays.copyOf(bArr, i8);
        }
    }

    public final void b(cp2 cp2Var, int i8) {
        c(cp2Var.f6432a, 0, i8);
        cp2Var.j(0);
    }

    public final void c(byte[] bArr, int i8, int i9) {
        System.arraycopy(this.f6866a, this.f6867b, bArr, i8, i9);
        this.f6867b += i9;
    }

    public final void d(int i8) {
        byte[] bArr = this.f6866a;
        if (bArr.length < i8) {
            bArr = new byte[i8];
        }
        e(bArr, i8);
    }

    public final void e(byte[] bArr, int i8) {
        this.f6866a = bArr;
        this.f6868c = i8;
        this.f6867b = 0;
    }

    public final void f(int i8) {
        boolean z7 = false;
        if (i8 >= 0 && i8 <= this.f6866a.length) {
            z7 = true;
        }
        uu1.d(z7);
        this.f6868c = i8;
    }

    public final void g(int i8) {
        boolean z7 = false;
        if (i8 >= 0 && i8 <= this.f6868c) {
            z7 = true;
        }
        uu1.d(z7);
        this.f6867b = i8;
    }

    public final void h(int i8) {
        g(this.f6867b + i8);
    }

    public final byte[] i() {
        return this.f6866a;
    }

    public final int j() {
        return this.f6868c - this.f6867b;
    }

    public final int k() {
        return this.f6866a.length;
    }

    public final int l() {
        return this.f6867b;
    }

    public final int m() {
        return this.f6868c;
    }

    public final int n() {
        return this.f6866a[this.f6867b] & 255;
    }

    public final int o() {
        byte[] bArr = this.f6866a;
        int i8 = this.f6867b;
        int i9 = i8 + 1;
        int i10 = bArr[i8] & 255;
        int i11 = i9 + 1;
        int i12 = bArr[i9] & 255;
        int i13 = i11 + 1;
        int i14 = bArr[i11] & 255;
        this.f6867b = i13 + 1;
        return (bArr[i13] & 255) | (i10 << 24) | (i12 << 16) | (i14 << 8);
    }

    public final int p() {
        byte[] bArr = this.f6866a;
        int i8 = this.f6867b;
        int i9 = i8 + 1;
        int i10 = bArr[i8] & 255;
        int i11 = i9 + 1;
        int i12 = bArr[i9] & 255;
        this.f6867b = i11 + 1;
        return (bArr[i11] & 255) | ((i10 << 24) >> 8) | (i12 << 8);
    }

    public final int q() {
        byte[] bArr = this.f6866a;
        int i8 = this.f6867b;
        int i9 = i8 + 1;
        int i10 = bArr[i8] & 255;
        int i11 = i9 + 1;
        int i12 = bArr[i9] & 255;
        int i13 = i11 + 1;
        int i14 = bArr[i11] & 255;
        this.f6867b = i13 + 1;
        return ((bArr[i13] & 255) << 24) | i10 | (i12 << 8) | (i14 << 16);
    }

    public final int r() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        throw new IllegalStateException("Top bit not zero: " + iQ);
    }

    public final int s() {
        byte[] bArr = this.f6866a;
        int i8 = this.f6867b;
        int i9 = i8 + 1;
        int i10 = bArr[i8] & 255;
        this.f6867b = i9 + 1;
        return ((bArr[i9] & 255) << 8) | i10;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f6866a;
        int i8 = this.f6867b;
        this.f6867b = i8 + 1;
        return bArr[i8] & 255;
    }

    public final int v() {
        byte[] bArr = this.f6866a;
        int i8 = this.f6867b;
        int i9 = i8 + 1;
        int i10 = bArr[i8] & 255;
        int i11 = bArr[i9] & 255;
        this.f6867b = i9 + 1 + 2;
        return i11 | (i10 << 8);
    }

    public final int w() {
        byte[] bArr = this.f6866a;
        int i8 = this.f6867b;
        int i9 = i8 + 1;
        int i10 = bArr[i8] & 255;
        int i11 = i9 + 1;
        int i12 = bArr[i9] & 255;
        this.f6867b = i11 + 1;
        return (bArr[i11] & 255) | (i10 << 16) | (i12 << 8);
    }

    public final int x() {
        int iO = o();
        if (iO >= 0) {
            return iO;
        }
        throw new IllegalStateException("Top bit not zero: " + iO);
    }

    public final int y() {
        byte[] bArr = this.f6866a;
        int i8 = this.f6867b;
        int i9 = i8 + 1;
        int i10 = bArr[i8] & 255;
        this.f6867b = i9 + 1;
        return (bArr[i9] & 255) | (i10 << 8);
    }

    public final long z() {
        byte[] bArr = this.f6866a;
        int i8 = this.f6867b;
        int i9 = i8 + 1;
        long j8 = bArr[i8];
        int i10 = i9 + 1;
        long j9 = bArr[i9];
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        long j12 = bArr[i12];
        int i14 = i13 + 1;
        long j13 = bArr[i13];
        int i15 = i14 + 1;
        long j14 = bArr[i14];
        this.f6867b = i15 + 1;
        return ((bArr[i15] & 255) << 56) | ((j14 & 255) << 48) | (j8 & 255) | ((j9 & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((j12 & 255) << 32) | ((j13 & 255) << 40);
    }
}
