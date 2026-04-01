package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class vz3 extends zz3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Iterable f16544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Iterator f16545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteBuffer f16546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f16547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f16548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f16549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f16550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f16551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f16552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f16553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f16554p;

    /* synthetic */ vz3(Iterable iterable, int i8, boolean z7, uz3 uz3Var) {
        super(null);
        this.f16549k = Integer.MAX_VALUE;
        this.f16547i = i8;
        this.f16544f = iterable;
        this.f16545g = iterable.iterator();
        this.f16551m = 0;
        if (i8 != 0) {
            H();
            return;
        }
        this.f16546h = k14.f9888e;
        this.f16552n = 0L;
        this.f16553o = 0L;
        this.f16554p = 0L;
    }

    private final int D() {
        return (int) ((((long) (this.f16547i - this.f16551m)) - this.f16552n) + this.f16553o);
    }

    private final void E() throws m14 {
        if (!this.f16545g.hasNext()) {
            throw m14.j();
        }
        H();
    }

    private final void F(byte[] bArr, int i8, int i9) throws m14 {
        if (i9 > D()) {
            if (i9 > 0) {
                throw m14.j();
            }
            return;
        }
        int i10 = i9;
        while (i10 > 0) {
            if (this.f16554p - this.f16552n == 0) {
                E();
            }
            int iMin = Math.min(i10, (int) (this.f16554p - this.f16552n));
            long j8 = iMin;
            g44.w(this.f16552n, bArr, i9 - i10, j8);
            i10 -= iMin;
            this.f16552n += j8;
        }
    }

    private final void G() {
        int i8 = this.f16547i + this.f16548j;
        this.f16547i = i8;
        int i9 = this.f16549k;
        if (i8 <= i9) {
            this.f16548j = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f16548j = i10;
        this.f16547i = i8 - i10;
    }

    private final void H() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f16545g.next();
        this.f16546h = byteBuffer;
        this.f16551m += (int) (this.f16552n - this.f16553o);
        long jPosition = byteBuffer.position();
        this.f16552n = jPosition;
        this.f16553o = jPosition;
        this.f16554p = this.f16546h.limit();
        long jM = g44.m(this.f16546h);
        this.f16552n += jM;
        this.f16553o += jM;
        this.f16554p += jM;
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final String A() throws m14 {
        int iK = K();
        if (iK > 0) {
            long j8 = this.f16554p;
            long j9 = this.f16552n;
            long j10 = iK;
            if (j10 <= j8 - j9) {
                String strG = l44.g(this.f16546h, (int) (j9 - this.f16553o), iK);
                this.f16552n += j10;
                return strG;
            }
        }
        if (iK >= 0 && iK <= D()) {
            byte[] bArr = new byte[iK];
            F(bArr, 0, iK);
            return l44.h(bArr, 0, iK);
        }
        if (iK == 0) {
            return "";
        }
        if (iK <= 0) {
            throw m14.f();
        }
        throw m14.j();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final void B(int i8) throws m14 {
        if (this.f16550l != i8) {
            throw m14.b();
        }
    }

    public final void C(int i8) throws m14 {
        if (i8 >= 0) {
            if (i8 <= (((long) (this.f16547i - this.f16551m)) - this.f16552n) + this.f16553o) {
                while (i8 > 0) {
                    if (this.f16554p - this.f16552n == 0) {
                        E();
                    }
                    int iMin = Math.min(i8, (int) (this.f16554p - this.f16552n));
                    i8 -= iMin;
                    this.f16552n += (long) iMin;
                }
                return;
            }
        }
        if (i8 >= 0) {
            throw m14.j();
        }
        throw m14.f();
    }

    public final byte I() throws m14 {
        if (this.f16554p - this.f16552n == 0) {
            E();
        }
        long j8 = this.f16552n;
        this.f16552n = 1 + j8;
        return g44.i(j8);
    }

    public final int J() {
        long j8 = this.f16554p;
        long j9 = this.f16552n;
        if (j8 - j9 < 4) {
            int I = I() & 255;
            int I2 = (I() & 255) << 8;
            return I | I2 | ((I() & 255) << 16) | ((I() & 255) << 24);
        }
        this.f16552n = 4 + j9;
        int i8 = g44.i(j9) & 255;
        int i9 = (g44.i(1 + j9) & 255) << 8;
        return i8 | i9 | ((g44.i(2 + j9) & 255) << 16) | ((g44.i(j9 + 3) & 255) << 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (com.google.android.gms.internal.ads.g44.i(r4) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int K() {
        /*
            r10 = this;
            long r0 = r10.f16552n
            long r2 = r10.f16554p
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.g44.i(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.f16552n
            long r4 = r4 + r2
            r10.f16552n = r4
            return r0
        L1a:
            long r6 = r10.f16554p
            long r8 = r10.f16552n
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.g44.i(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.g44.i(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.g44.i(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.g44.i(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.g44.i(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.g44.i(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.g44.i(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.g44.i(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.g44.i(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.f16552n = r6
            return r0
        L8c:
            long r0 = r10.N()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vz3.K():int");
    }

    public final long L() {
        long j8 = this.f16554p;
        long j9 = this.f16552n;
        if (j8 - j9 < 8) {
            long jI = ((long) I()) & 255;
            long jI2 = (((long) I()) & 255) << 8;
            long jI3 = (((long) I()) & 255) << 16;
            long jI4 = (((long) I()) & 255) << 24;
            long jI5 = (((long) I()) & 255) << 32;
            long jI6 = (((long) I()) & 255) << 40;
            return jI | jI2 | jI3 | jI4 | jI5 | jI6 | ((((long) I()) & 255) << 48) | ((((long) I()) & 255) << 56);
        }
        this.f16552n = 8 + j9;
        long jI7 = ((long) g44.i(j9)) & 255;
        long jI8 = (((long) g44.i(1 + j9)) & 255) << 8;
        long jI9 = (((long) g44.i(j9 + 2)) & 255) << 16;
        long jI10 = (((long) g44.i(j9 + 3)) & 255) << 24;
        long jI11 = (((long) g44.i(4 + j9)) & 255) << 32;
        long jI12 = (((long) g44.i(j9 + 5)) & 255) << 40;
        return jI7 | jI8 | jI9 | jI10 | jI11 | jI12 | ((((long) g44.i(j9 + 6)) & 255) << 48) | ((((long) g44.i(j9 + 7)) & 255) << 56);
    }

    public final long M() {
        long jI;
        long j8;
        long j9;
        int i8;
        long j10 = this.f16552n;
        if (this.f16554p != j10) {
            long j11 = j10 + 1;
            byte bI = g44.i(j10);
            if (bI >= 0) {
                this.f16552n++;
                return bI;
            }
            if (this.f16554p - this.f16552n >= 10) {
                long j12 = j11 + 1;
                int i9 = bI ^ (g44.i(j11) << 7);
                if (i9 >= 0) {
                    long j13 = j12 + 1;
                    int i10 = i9 ^ (g44.i(j12) << 14);
                    if (i10 >= 0) {
                        jI = i10 ^ 16256;
                    } else {
                        j12 = j13 + 1;
                        int i11 = i10 ^ (g44.i(j13) << 21);
                        if (i11 < 0) {
                            i8 = i11 ^ (-2080896);
                        } else {
                            j13 = j12 + 1;
                            long jI2 = ((long) i11) ^ (((long) g44.i(j12)) << 28);
                            if (jI2 < 0) {
                                long j14 = j13 + 1;
                                long jI3 = jI2 ^ (((long) g44.i(j13)) << 35);
                                if (jI3 < 0) {
                                    j8 = -34093383808L;
                                } else {
                                    j13 = j14 + 1;
                                    jI2 = jI3 ^ (((long) g44.i(j14)) << 42);
                                    if (jI2 >= 0) {
                                        j9 = 4363953127296L;
                                    } else {
                                        j14 = j13 + 1;
                                        jI3 = jI2 ^ (((long) g44.i(j13)) << 49);
                                        if (jI3 >= 0) {
                                            j13 = j14 + 1;
                                            jI = (jI3 ^ (((long) g44.i(j14)) << 56)) ^ 71499008037633920L;
                                            if (jI < 0) {
                                                long j15 = 1 + j13;
                                                if (g44.i(j13) >= 0) {
                                                    j12 = j15;
                                                }
                                            }
                                            this.f16552n = j12;
                                            return jI;
                                        }
                                        j8 = -558586000294016L;
                                    }
                                }
                                jI = jI3 ^ j8;
                                j12 = j14;
                                this.f16552n = j12;
                                return jI;
                            }
                            j9 = 266354560;
                            jI = jI2 ^ j9;
                        }
                    }
                    j12 = j13;
                    this.f16552n = j12;
                    return jI;
                }
                i8 = i9 ^ (-128);
                jI = i8;
                this.f16552n = j12;
                return jI;
            }
        }
        return N();
    }

    final long N() throws m14 {
        long j8 = 0;
        for (int i8 = 0; i8 < 64; i8 += 7) {
            byte bI = I();
            j8 |= ((long) (bI & 127)) << i8;
            if ((bI & 128) == 0) {
                return j8;
            }
        }
        throw m14.e();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final void a(int i8) {
        this.f16549k = i8;
        G();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final boolean b() {
        return (((long) this.f16551m) + this.f16552n) - this.f16553o == ((long) this.f16547i);
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final boolean c() {
        return M() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final boolean d(int i8) throws m14 {
        int iR;
        int i9 = i8 & 7;
        if (i9 == 0) {
            for (int i10 = 0; i10 < 10; i10++) {
                if (I() >= 0) {
                    return true;
                }
            }
            throw m14.e();
        }
        if (i9 == 1) {
            C(8);
            return true;
        }
        if (i9 == 2) {
            C(K());
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
        return Double.longBitsToDouble(L());
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final float j() {
        return Float.intBitsToFloat(J());
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int k() {
        return (int) ((((long) this.f16551m) + this.f16552n) - this.f16553o);
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int l(int i8) throws m14 {
        if (i8 < 0) {
            throw m14.f();
        }
        int iK = i8 + k();
        int i9 = this.f16549k;
        if (iK > i9) {
            throw m14.j();
        }
        this.f16549k = iK;
        G();
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int m() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int n() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int o() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int p() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int q() {
        return zz3.e(K());
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int r() throws m14 {
        if (b()) {
            this.f16550l = 0;
            return 0;
        }
        int iK = K();
        this.f16550l = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw m14.c();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int s() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final long t() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final long u() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final long v() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final long w() {
        return zz3.f(M());
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final long x() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final rz3 y() throws m14 {
        int iK = K();
        if (iK > 0) {
            long j8 = this.f16554p;
            long j9 = this.f16552n;
            long j10 = iK;
            if (j10 <= j8 - j9) {
                byte[] bArr = new byte[iK];
                g44.w(j9, bArr, 0L, j10);
                this.f16552n += j10;
                return new nz3(bArr);
            }
        }
        if (iK > 0 && iK <= D()) {
            byte[] bArr2 = new byte[iK];
            F(bArr2, 0, iK);
            return new nz3(bArr2);
        }
        if (iK == 0) {
            return rz3.f14393b;
        }
        if (iK < 0) {
            throw m14.f();
        }
        throw m14.j();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final String z() throws m14 {
        int iK = K();
        if (iK > 0) {
            long j8 = this.f16554p;
            long j9 = this.f16552n;
            long j10 = iK;
            if (j10 <= j8 - j9) {
                byte[] bArr = new byte[iK];
                g44.w(j9, bArr, 0L, j10);
                String str = new String(bArr, k14.f9885b);
                this.f16552n += j10;
                return str;
            }
        }
        if (iK > 0 && iK <= D()) {
            byte[] bArr2 = new byte[iK];
            F(bArr2, 0, iK);
            return new String(bArr2, k14.f9885b);
        }
        if (iK == 0) {
            return "";
        }
        if (iK < 0) {
            throw m14.f();
        }
        throw m14.j();
    }
}
