package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
abstract class c04 extends h04 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final byte[] f6084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f6085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f6086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f6087h;

    c04(int i8) {
        super(null);
        if (i8 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i8, 20)];
        this.f6084e = bArr;
        this.f6085f = bArr.length;
    }

    final void D(byte b8) {
        int i8 = this.f6086g;
        this.f6086g = i8 + 1;
        this.f6084e[i8] = b8;
        this.f6087h++;
    }

    final void E(int i8) {
        int i9 = this.f6086g;
        int i10 = i9 + 1;
        byte[] bArr = this.f6084e;
        bArr[i9] = (byte) (i8 & 255);
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((i8 >> 8) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i8 >> 16) & 255);
        this.f6086g = i12 + 1;
        bArr[i12] = (byte) ((i8 >> 24) & 255);
        this.f6087h += 4;
    }

    final void F(long j8) {
        int i8 = this.f6086g;
        int i9 = i8 + 1;
        byte[] bArr = this.f6084e;
        bArr[i8] = (byte) (j8 & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((j8 >> 8) & 255);
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((j8 >> 16) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) (255 & (j8 >> 24));
        int i13 = i12 + 1;
        bArr[i12] = (byte) (((int) (j8 >> 32)) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (((int) (j8 >> 40)) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (((int) (j8 >> 48)) & 255);
        this.f6086g = i15 + 1;
        bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
        this.f6087h += 8;
    }

    final void G(int i8) {
        int i9;
        if (h04.f8588c) {
            long j8 = this.f6086g;
            while ((i8 & (-128)) != 0) {
                byte[] bArr = this.f6084e;
                int i10 = this.f6086g;
                this.f6086g = i10 + 1;
                g44.y(bArr, i10, (byte) ((i8 & 127) | 128));
                i8 >>>= 7;
            }
            byte[] bArr2 = this.f6084e;
            int i11 = this.f6086g;
            this.f6086g = i11 + 1;
            g44.y(bArr2, i11, (byte) i8);
            i9 = this.f6087h + ((int) (((long) this.f6086g) - j8));
        } else {
            while ((i8 & (-128)) != 0) {
                byte[] bArr3 = this.f6084e;
                int i12 = this.f6086g;
                this.f6086g = i12 + 1;
                bArr3[i12] = (byte) ((i8 & 127) | 128);
                this.f6087h++;
                i8 >>>= 7;
            }
            byte[] bArr4 = this.f6084e;
            int i13 = this.f6086g;
            this.f6086g = i13 + 1;
            bArr4[i13] = (byte) i8;
            i9 = this.f6087h + 1;
        }
        this.f6087h = i9;
    }

    final void H(long j8) {
        if (h04.f8588c) {
            long j9 = this.f6086g;
            while (true) {
                int i8 = (int) j8;
                if ((j8 & (-128)) == 0) {
                    byte[] bArr = this.f6084e;
                    int i9 = this.f6086g;
                    this.f6086g = i9 + 1;
                    g44.y(bArr, i9, (byte) i8);
                    this.f6087h += (int) (((long) this.f6086g) - j9);
                    return;
                }
                byte[] bArr2 = this.f6084e;
                int i10 = this.f6086g;
                this.f6086g = i10 + 1;
                g44.y(bArr2, i10, (byte) ((i8 & 127) | 128));
                j8 >>>= 7;
            }
        } else {
            while (true) {
                int i11 = (int) j8;
                if ((j8 & (-128)) == 0) {
                    byte[] bArr3 = this.f6084e;
                    int i12 = this.f6086g;
                    this.f6086g = i12 + 1;
                    bArr3[i12] = (byte) i11;
                    this.f6087h++;
                    return;
                }
                byte[] bArr4 = this.f6084e;
                int i13 = this.f6086g;
                this.f6086g = i13 + 1;
                bArr4[i13] = (byte) ((i11 & 127) | 128);
                this.f6087h++;
                j8 >>>= 7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h04
    public final int l() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
