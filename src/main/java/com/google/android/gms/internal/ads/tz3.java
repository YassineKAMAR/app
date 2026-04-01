package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class tz3 extends zz3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f15412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f15413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f15414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f15415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f15416j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f15417k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f15418l;

    /* synthetic */ tz3(byte[] bArr, int i8, int i9, boolean z7, sz3 sz3Var) {
        super(null);
        this.f15418l = Integer.MAX_VALUE;
        this.f15412f = bArr;
        this.f15413g = i9 + i8;
        this.f15415i = i8;
        this.f15416j = i8;
    }

    private final void D() {
        int i8 = this.f15413g + this.f15414h;
        this.f15413g = i8;
        int i9 = i8 - this.f15416j;
        int i10 = this.f15418l;
        if (i9 <= i10) {
            this.f15414h = 0;
            return;
        }
        int i11 = i9 - i10;
        this.f15414h = i11;
        this.f15413g = i8 - i11;
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final String A() throws m14 {
        int iG = G();
        if (iG > 0) {
            int i8 = this.f15413g;
            int i9 = this.f15415i;
            if (iG <= i8 - i9) {
                String strH = l44.h(this.f15412f, i9, iG);
                this.f15415i += iG;
                return strH;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG <= 0) {
            throw m14.f();
        }
        throw m14.j();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final void B(int i8) throws m14 {
        if (this.f15417k != i8) {
            throw m14.b();
        }
    }

    public final void C(int i8) throws m14 {
        if (i8 >= 0) {
            int i9 = this.f15413g;
            int i10 = this.f15415i;
            if (i8 <= i9 - i10) {
                this.f15415i = i10 + i8;
                return;
            }
        }
        if (i8 >= 0) {
            throw m14.j();
        }
        throw m14.f();
    }

    public final byte E() throws m14 {
        int i8 = this.f15415i;
        if (i8 == this.f15413g) {
            throw m14.j();
        }
        byte[] bArr = this.f15412f;
        this.f15415i = i8 + 1;
        return bArr[i8];
    }

    public final int F() throws m14 {
        int i8 = this.f15415i;
        if (this.f15413g - i8 < 4) {
            throw m14.j();
        }
        byte[] bArr = this.f15412f;
        this.f15415i = i8 + 4;
        int i9 = bArr[i8] & 255;
        int i10 = bArr[i8 + 1] & 255;
        int i11 = bArr[i8 + 2] & 255;
        return ((bArr[i8 + 3] & 255) << 24) | (i10 << 8) | i9 | (i11 << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2[r3] < 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int G() {
        /*
            r5 = this;
            int r0 = r5.f15415i
            int r1 = r5.f15413g
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.f15412f
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f15415i = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6d
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L6a
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L6a
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L6a
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L6a
            goto L6d
        L6a:
            r5.f15415i = r1
            return r0
        L6d:
            long r0 = r5.J()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tz3.G():int");
    }

    public final long H() throws m14 {
        int i8 = this.f15415i;
        if (this.f15413g - i8 < 8) {
            throw m14.j();
        }
        byte[] bArr = this.f15412f;
        this.f15415i = i8 + 8;
        long j8 = bArr[i8];
        long j9 = (((long) bArr[i8 + 1]) & 255) << 8;
        long j10 = bArr[i8 + 2];
        long j11 = bArr[i8 + 3];
        return ((((long) bArr[i8 + 7]) & 255) << 56) | (j8 & 255) | j9 | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
    }

    public final long I() {
        long j8;
        long j9;
        long j10;
        long j11;
        int i8;
        int i9 = this.f15415i;
        int i10 = this.f15413g;
        if (i10 != i9) {
            byte[] bArr = this.f15412f;
            int i11 = i9 + 1;
            byte b8 = bArr[i9];
            if (b8 >= 0) {
                this.f15415i = i11;
                return b8;
            }
            if (i10 - i11 >= 9) {
                int i12 = i11 + 1;
                int i13 = b8 ^ (bArr[i11] << 7);
                if (i13 >= 0) {
                    int i14 = i12 + 1;
                    int i15 = i13 ^ (bArr[i12] << 14);
                    if (i15 >= 0) {
                        j8 = i15 ^ 16256;
                    } else {
                        i12 = i14 + 1;
                        int i16 = i15 ^ (bArr[i14] << 21);
                        if (i16 < 0) {
                            i8 = i16 ^ (-2080896);
                        } else {
                            i14 = i12 + 1;
                            long j12 = ((long) i16) ^ (((long) bArr[i12]) << 28);
                            if (j12 < 0) {
                                int i17 = i14 + 1;
                                long j13 = j12 ^ (((long) bArr[i14]) << 35);
                                if (j13 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i14 = i17 + 1;
                                    j12 = j13 ^ (((long) bArr[i17]) << 42);
                                    if (j12 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i17 = i14 + 1;
                                        j13 = j12 ^ (((long) bArr[i14]) << 49);
                                        if (j13 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i14 = i17 + 1;
                                            j8 = (j13 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                i17 = i14 + 1;
                                                if (bArr[i14] >= 0) {
                                                    j9 = j8;
                                                    i12 = i17;
                                                    this.f15415i = i12;
                                                    return j9;
                                                }
                                            }
                                        }
                                    }
                                }
                                j9 = j10 ^ j13;
                                i12 = i17;
                                this.f15415i = i12;
                                return j9;
                            }
                            j11 = 266354560;
                            j8 = j12 ^ j11;
                        }
                    }
                    i12 = i14;
                    j9 = j8;
                    this.f15415i = i12;
                    return j9;
                }
                i8 = i13 ^ (-128);
                j9 = i8;
                this.f15415i = i12;
                return j9;
            }
        }
        return J();
    }

    final long J() throws m14 {
        long j8 = 0;
        for (int i8 = 0; i8 < 64; i8 += 7) {
            byte bE = E();
            j8 |= ((long) (bE & 127)) << i8;
            if ((bE & 128) == 0) {
                return j8;
            }
        }
        throw m14.e();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final void a(int i8) {
        this.f15418l = i8;
        D();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final boolean b() {
        return this.f15415i == this.f15413g;
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final boolean c() {
        return I() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final boolean d(int i8) throws m14 {
        int iR;
        int i9 = i8 & 7;
        int i10 = 0;
        if (i9 == 0) {
            if (this.f15413g - this.f15415i < 10) {
                while (i10 < 10) {
                    if (E() < 0) {
                        i10++;
                    }
                }
                throw m14.e();
            }
            while (i10 < 10) {
                byte[] bArr = this.f15412f;
                int i11 = this.f15415i;
                this.f15415i = i11 + 1;
                if (bArr[i11] < 0) {
                    i10++;
                }
            }
            throw m14.e();
            return true;
        }
        if (i9 == 1) {
            C(8);
            return true;
        }
        if (i9 == 2) {
            C(G());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 5) {
                throw m14.a();
            }
            C(4);
            return true;
        }
        do {
            iR = r();
            if (iR == 0) {
                break;
            }
        } while (d(iR));
        B(((i8 >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final double i() {
        return Double.longBitsToDouble(H());
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final float j() {
        return Float.intBitsToFloat(F());
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int k() {
        return this.f15415i - this.f15416j;
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int l(int i8) {
        if (i8 < 0) {
            throw m14.f();
        }
        int i9 = i8 + (this.f15415i - this.f15416j);
        if (i9 < 0) {
            throw m14.g();
        }
        int i10 = this.f15418l;
        if (i9 > i10) {
            throw m14.j();
        }
        this.f15418l = i9;
        D();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int m() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int n() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int o() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int p() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int q() {
        return zz3.e(G());
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int r() throws m14 {
        if (b()) {
            this.f15417k = 0;
            return 0;
        }
        int iG = G();
        this.f15417k = iG;
        if ((iG >>> 3) != 0) {
            return iG;
        }
        throw m14.c();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int s() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final long t() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final long u() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final long v() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final long w() {
        return zz3.f(I());
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final long x() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final rz3 y() throws m14 {
        int iG = G();
        if (iG > 0) {
            int i8 = this.f15413g;
            int i9 = this.f15415i;
            if (iG <= i8 - i9) {
                rz3 rz3VarL = rz3.L(this.f15412f, i9, iG);
                this.f15415i += iG;
                return rz3VarL;
            }
        }
        if (iG == 0) {
            return rz3.f14393b;
        }
        if (iG > 0) {
            int i10 = this.f15413g;
            int i11 = this.f15415i;
            if (iG <= i10 - i11) {
                int i12 = iG + i11;
                this.f15415i = i12;
                return new nz3(Arrays.copyOfRange(this.f15412f, i11, i12));
            }
        }
        if (iG <= 0) {
            throw m14.f();
        }
        throw m14.j();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final String z() throws m14 {
        int iG = G();
        if (iG > 0) {
            int i8 = this.f15413g;
            int i9 = this.f15415i;
            if (iG <= i8 - i9) {
                String str = new String(this.f15412f, i9, iG, k14.f9885b);
                this.f15415i += iG;
                return str;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG < 0) {
            throw m14.f();
        }
        throw m14.j();
    }
}
