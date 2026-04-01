package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class cp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f6432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6435d;

    public cp2() {
        this.f6432a = nz2.f12305f;
    }

    public cp2(byte[] bArr, int i8) {
        this.f6432a = bArr;
        this.f6435d = i8;
    }

    private final void o() {
        int i8;
        int i9 = this.f6433b;
        boolean z7 = true;
        if (i9 < 0 || (i9 >= (i8 = this.f6435d) && (i9 != i8 || this.f6434c != 0))) {
            z7 = false;
        }
        uu1.f(z7);
    }

    public final int a() {
        return ((this.f6435d - this.f6433b) * 8) - this.f6434c;
    }

    public final int b() {
        uu1.f(this.f6434c == 0);
        return this.f6433b;
    }

    public final int c() {
        return (this.f6433b * 8) + this.f6434c;
    }

    public final int d(int i8) {
        int i9;
        if (i8 == 0) {
            return 0;
        }
        this.f6434c += i8;
        int i10 = 0;
        while (true) {
            i9 = this.f6434c;
            if (i9 <= 8) {
                break;
            }
            int i11 = i9 - 8;
            this.f6434c = i11;
            byte[] bArr = this.f6432a;
            int i12 = this.f6433b;
            this.f6433b = i12 + 1;
            i10 |= (bArr[i12] & 255) << i11;
        }
        byte[] bArr2 = this.f6432a;
        int i13 = this.f6433b;
        int i14 = i10 | ((bArr2[i13] & 255) >> (8 - i9));
        int i15 = 32 - i8;
        if (i9 == 8) {
            this.f6434c = 0;
            this.f6433b = i13 + 1;
        }
        int i16 = ((-1) >>> i15) & i14;
        o();
        return i16;
    }

    public final void e() {
        if (this.f6434c == 0) {
            return;
        }
        this.f6434c = 0;
        this.f6433b++;
        o();
    }

    public final void f(int i8, int i9) {
        int iMin = Math.min(8 - this.f6434c, 14);
        int i10 = this.f6434c;
        int i11 = (8 - i10) - iMin;
        byte[] bArr = this.f6432a;
        int i12 = this.f6433b;
        byte b8 = (byte) (((65280 >> i10) | ((1 << i11) - 1)) & bArr[i12]);
        bArr[i12] = b8;
        int i13 = 14 - iMin;
        int i14 = i8 & 16383;
        bArr[i12] = (byte) (b8 | ((i14 >>> i13) << i11));
        int i15 = i12 + 1;
        while (i13 > 8) {
            i13 -= 8;
            this.f6432a[i15] = (byte) (i14 >>> i13);
            i15++;
        }
        byte[] bArr2 = this.f6432a;
        byte b9 = (byte) (bArr2[i15] & ((1 << r0) - 1));
        bArr2[i15] = b9;
        bArr2[i15] = (byte) (((i14 & ((1 << i13) - 1)) << (8 - i13)) | b9);
        l(14);
        o();
    }

    public final void g(byte[] bArr, int i8, int i9) {
        int i10;
        int i11 = 0;
        while (true) {
            i10 = i9 >> 3;
            if (i11 >= i10) {
                break;
            }
            byte[] bArr2 = this.f6432a;
            int i12 = this.f6433b;
            int i13 = i12 + 1;
            this.f6433b = i13;
            byte b8 = bArr2[i12];
            int i14 = this.f6434c;
            byte b9 = (byte) (b8 << i14);
            bArr[i11] = b9;
            bArr[i11] = (byte) (((bArr2[i13] & 255) >> (8 - i14)) | b9);
            i11++;
        }
        int i15 = i9 & 7;
        if (i15 == 0) {
            return;
        }
        byte b10 = (byte) (bArr[i10] & (255 >> i15));
        bArr[i10] = b10;
        int i16 = this.f6434c;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f6432a;
            int i17 = this.f6433b;
            this.f6433b = i17 + 1;
            b10 = (byte) (b10 | ((bArr3[i17] & 255) << i16));
            bArr[i10] = b10;
            i16 -= 8;
        }
        int i18 = i16 + i15;
        this.f6434c = i18;
        byte[] bArr4 = this.f6432a;
        int i19 = this.f6433b;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | b10);
        if (i18 == 8) {
            this.f6434c = 0;
            this.f6433b = i19 + 1;
        }
        o();
    }

    public final void h(dq2 dq2Var) {
        i(dq2Var.i(), dq2Var.m());
        j(dq2Var.l() * 8);
    }

    public final void i(byte[] bArr, int i8) {
        this.f6432a = bArr;
        this.f6433b = 0;
        this.f6434c = 0;
        this.f6435d = i8;
    }

    public final void j(int i8) {
        int i9 = i8 / 8;
        this.f6433b = i9;
        this.f6434c = i8 - (i9 * 8);
        o();
    }

    public final void k() {
        int i8 = this.f6434c + 1;
        this.f6434c = i8;
        if (i8 == 8) {
            this.f6434c = 0;
            this.f6433b++;
        }
        o();
    }

    public final void l(int i8) {
        int i9 = i8 / 8;
        int i10 = this.f6433b + i9;
        this.f6433b = i10;
        int i11 = this.f6434c + (i8 - (i9 * 8));
        this.f6434c = i11;
        if (i11 > 7) {
            this.f6433b = i10 + 1;
            this.f6434c = i11 - 8;
        }
        o();
    }

    public final void m(int i8) {
        uu1.f(this.f6434c == 0);
        this.f6433b += i8;
        o();
    }

    public final boolean n() {
        int i8 = this.f6432a[this.f6433b] & (128 >> this.f6434c);
        k();
        return i8 != 0;
    }
}
