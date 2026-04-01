package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class xz3 extends zz3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InputStream f17516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f17517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f17518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f17522l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f17523m;

    /* synthetic */ xz3(InputStream inputStream, int i8, wz3 wz3Var) {
        super(null);
        this.f17523m = Integer.MAX_VALUE;
        byte[] bArr = k14.f9887d;
        this.f17516f = inputStream;
        this.f17517g = new byte[4096];
        this.f17518h = 0;
        this.f17520j = 0;
        this.f17522l = 0;
    }

    private final List D(int i8) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i8 > 0) {
            int iMin = Math.min(i8, 4096);
            byte[] bArr = new byte[iMin];
            int i9 = 0;
            while (i9 < iMin) {
                int i10 = this.f17516f.read(bArr, i9, iMin - i9);
                if (i10 == -1) {
                    throw m14.j();
                }
                this.f17522l += i10;
                i9 += i10;
            }
            i8 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void E() {
        int i8 = this.f17518h + this.f17519i;
        this.f17518h = i8;
        int i9 = this.f17522l + i8;
        int i10 = this.f17523m;
        if (i9 <= i10) {
            this.f17519i = 0;
            return;
        }
        int i11 = i9 - i10;
        this.f17519i = i11;
        this.f17518h = i8 - i11;
    }

    private final void F(int i8) throws m14 {
        if (G(i8)) {
            return;
        }
        if (i8 <= (Integer.MAX_VALUE - this.f17522l) - this.f17520j) {
            throw m14.j();
        }
        throw m14.i();
    }

    private final boolean G(int i8) throws IOException {
        int i9 = this.f17520j;
        int i10 = i9 + i8;
        int i11 = this.f17518h;
        if (i10 <= i11) {
            throw new IllegalStateException("refillBuffer() called when " + i8 + " bytes were already available in buffer");
        }
        int i12 = this.f17522l;
        if (i8 > (Integer.MAX_VALUE - i12) - i9 || i12 + i9 + i8 > this.f17523m) {
            return false;
        }
        if (i9 > 0) {
            if (i11 > i9) {
                byte[] bArr = this.f17517g;
                System.arraycopy(bArr, i9, bArr, 0, i11 - i9);
            }
            i12 = this.f17522l + i9;
            this.f17522l = i12;
            i11 = this.f17518h - i9;
            this.f17518h = i11;
            this.f17520j = 0;
        }
        try {
            int i13 = this.f17516f.read(this.f17517g, i11, Math.min(4096 - i11, (Integer.MAX_VALUE - i12) - i11));
            if (i13 == 0 || i13 < -1 || i13 > 4096) {
                throw new IllegalStateException(String.valueOf(this.f17516f.getClass()) + "#read(byte[]) returned invalid result: " + i13 + "\nThe InputStream implementation is buggy.");
            }
            if (i13 <= 0) {
                return false;
            }
            this.f17518h += i13;
            E();
            if (this.f17518h >= i8) {
                return true;
            }
            return G(i8);
        } catch (m14 e8) {
            e8.k();
            throw e8;
        }
    }

    private final byte[] H(int i8, boolean z7) throws IOException {
        byte[] bArrI = I(i8);
        if (bArrI != null) {
            return bArrI;
        }
        int i9 = this.f17520j;
        int i10 = this.f17518h;
        int i11 = i10 - i9;
        this.f17522l += i10;
        this.f17520j = 0;
        this.f17518h = 0;
        List<byte[]> listD = D(i8 - i11);
        byte[] bArr = new byte[i8];
        System.arraycopy(this.f17517g, i9, bArr, 0, i11);
        for (byte[] bArr2 : listD) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i11, length);
            i11 += length;
        }
        return bArr;
    }

    private final byte[] I(int i8) throws IOException {
        if (i8 == 0) {
            return k14.f9887d;
        }
        if (i8 < 0) {
            throw m14.f();
        }
        int i9 = this.f17522l;
        int i10 = this.f17520j;
        int i11 = i9 + i10 + i8;
        if ((-2147483647) + i11 > 0) {
            throw m14.i();
        }
        int i12 = this.f17523m;
        if (i11 > i12) {
            C((i12 - i9) - i10);
            throw m14.j();
        }
        int i13 = this.f17518h - i10;
        int i14 = i8 - i13;
        if (i14 >= 4096) {
            try {
                if (i14 > this.f17516f.available()) {
                    return null;
                }
            } catch (m14 e8) {
                e8.k();
                throw e8;
            }
        }
        byte[] bArr = new byte[i8];
        System.arraycopy(this.f17517g, this.f17520j, bArr, 0, i13);
        this.f17522l += this.f17518h;
        this.f17520j = 0;
        this.f17518h = 0;
        while (i13 < i8) {
            try {
                int i15 = this.f17516f.read(bArr, i13, i8 - i13);
                if (i15 == -1) {
                    throw m14.j();
                }
                this.f17522l += i15;
                i13 += i15;
            } catch (m14 e9) {
                e9.k();
                throw e9;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final String A() throws IOException {
        byte[] bArrH;
        int iL = L();
        int i8 = this.f17520j;
        int i9 = this.f17518h;
        if (iL <= i9 - i8 && iL > 0) {
            bArrH = this.f17517g;
            this.f17520j = i8 + iL;
        } else {
            if (iL == 0) {
                return "";
            }
            if (iL <= i9) {
                F(iL);
                bArrH = this.f17517g;
                this.f17520j = iL;
            } else {
                bArrH = H(iL, false);
            }
            i8 = 0;
        }
        return l44.h(bArrH, i8, iL);
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final void B(int i8) throws m14 {
        if (this.f17521k != i8) {
            throw m14.b();
        }
    }

    public final void C(int i8) throws m14 {
        int i9 = this.f17518h;
        int i10 = this.f17520j;
        int i11 = i9 - i10;
        if (i8 <= i11 && i8 >= 0) {
            this.f17520j = i10 + i8;
            return;
        }
        if (i8 < 0) {
            throw m14.f();
        }
        int i12 = this.f17522l;
        int i13 = i12 + i10;
        int i14 = this.f17523m;
        if (i13 + i8 > i14) {
            C((i14 - i12) - i10);
            throw m14.j();
        }
        this.f17522l = i13;
        this.f17518h = 0;
        this.f17520j = 0;
        while (i11 < i8) {
            try {
                long j8 = i8 - i11;
                try {
                    long jSkip = this.f17516f.skip(j8);
                    if (jSkip < 0 || jSkip > j8) {
                        throw new IllegalStateException(String.valueOf(this.f17516f.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i11 += (int) jSkip;
                    }
                } catch (m14 e8) {
                    e8.k();
                    throw e8;
                }
            } finally {
                this.f17522l += i11;
                E();
            }
        }
        if (i11 >= i8) {
            return;
        }
        int i15 = this.f17518h;
        int i16 = i15 - this.f17520j;
        this.f17520j = i15;
        while (true) {
            F(1);
            int i17 = i8 - i16;
            int i18 = this.f17518h;
            if (i17 <= i18) {
                this.f17520j = i17;
                return;
            } else {
                i16 += i18;
                this.f17520j = i18;
            }
        }
    }

    public final byte J() throws m14 {
        if (this.f17520j == this.f17518h) {
            F(1);
        }
        byte[] bArr = this.f17517g;
        int i8 = this.f17520j;
        this.f17520j = i8 + 1;
        return bArr[i8];
    }

    public final int K() throws m14 {
        int i8 = this.f17520j;
        if (this.f17518h - i8 < 4) {
            F(4);
            i8 = this.f17520j;
        }
        byte[] bArr = this.f17517g;
        this.f17520j = i8 + 4;
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
    public final int L() {
        /*
            r5 = this;
            int r0 = r5.f17520j
            int r1 = r5.f17518h
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.f17517g
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f17520j = r3
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
            r5.f17520j = r1
            return r0
        L6d:
            long r0 = r5.O()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xz3.L():int");
    }

    public final long M() throws m14 {
        int i8 = this.f17520j;
        if (this.f17518h - i8 < 8) {
            F(8);
            i8 = this.f17520j;
        }
        byte[] bArr = this.f17517g;
        this.f17520j = i8 + 8;
        long j8 = bArr[i8];
        long j9 = (((long) bArr[i8 + 1]) & 255) << 8;
        long j10 = bArr[i8 + 2];
        long j11 = bArr[i8 + 3];
        return ((((long) bArr[i8 + 7]) & 255) << 56) | (j8 & 255) | j9 | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
    }

    public final long N() {
        long j8;
        long j9;
        long j10;
        long j11;
        int i8;
        int i9 = this.f17520j;
        int i10 = this.f17518h;
        if (i10 != i9) {
            byte[] bArr = this.f17517g;
            int i11 = i9 + 1;
            byte b8 = bArr[i9];
            if (b8 >= 0) {
                this.f17520j = i11;
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
                                                    this.f17520j = i12;
                                                    return j9;
                                                }
                                            }
                                        }
                                    }
                                }
                                j9 = j10 ^ j13;
                                i12 = i17;
                                this.f17520j = i12;
                                return j9;
                            }
                            j11 = 266354560;
                            j8 = j12 ^ j11;
                        }
                    }
                    i12 = i14;
                    j9 = j8;
                    this.f17520j = i12;
                    return j9;
                }
                i8 = i13 ^ (-128);
                j9 = i8;
                this.f17520j = i12;
                return j9;
            }
        }
        return O();
    }

    final long O() throws m14 {
        long j8 = 0;
        for (int i8 = 0; i8 < 64; i8 += 7) {
            byte bJ = J();
            j8 |= ((long) (bJ & 127)) << i8;
            if ((bJ & 128) == 0) {
                return j8;
            }
        }
        throw m14.e();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final void a(int i8) {
        this.f17523m = i8;
        E();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final boolean b() {
        return this.f17520j == this.f17518h && !G(1);
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final boolean c() {
        return N() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final boolean d(int i8) throws m14 {
        int iR;
        int i9 = i8 & 7;
        int i10 = 0;
        if (i9 == 0) {
            if (this.f17518h - this.f17520j < 10) {
                while (i10 < 10) {
                    if (J() < 0) {
                        i10++;
                    }
                }
                throw m14.e();
            }
            while (i10 < 10) {
                byte[] bArr = this.f17517g;
                int i11 = this.f17520j;
                this.f17520j = i11 + 1;
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
            C(L());
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
        return Double.longBitsToDouble(M());
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final float j() {
        return Float.intBitsToFloat(K());
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int k() {
        return this.f17522l + this.f17520j;
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int l(int i8) throws m14 {
        if (i8 < 0) {
            throw m14.f();
        }
        int i9 = this.f17522l + this.f17520j;
        int i10 = this.f17523m;
        int i11 = i8 + i9;
        if (i11 > i10) {
            throw m14.j();
        }
        this.f17523m = i11;
        E();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int m() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int n() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int o() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int p() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int q() {
        return zz3.e(L());
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int r() throws m14 {
        if (b()) {
            this.f17521k = 0;
            return 0;
        }
        int iL = L();
        this.f17521k = iL;
        if ((iL >>> 3) != 0) {
            return iL;
        }
        throw m14.c();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final int s() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final long t() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final long u() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final long v() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final long w() {
        return zz3.f(N());
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final long x() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final rz3 y() throws IOException {
        int iL = L();
        int i8 = this.f17518h;
        int i9 = this.f17520j;
        if (iL <= i8 - i9 && iL > 0) {
            rz3 rz3VarL = rz3.L(this.f17517g, i9, iL);
            this.f17520j += iL;
            return rz3VarL;
        }
        if (iL == 0) {
            return rz3.f14393b;
        }
        byte[] bArrI = I(iL);
        if (bArrI != null) {
            return rz3.L(bArrI, 0, bArrI.length);
        }
        int i10 = this.f17520j;
        int i11 = this.f17518h;
        int i12 = i11 - i10;
        this.f17522l += i11;
        this.f17520j = 0;
        this.f17518h = 0;
        List<byte[]> listD = D(iL - i12);
        byte[] bArr = new byte[iL];
        System.arraycopy(this.f17517g, i10, bArr, 0, i12);
        for (byte[] bArr2 : listD) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return new nz3(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zz3
    public final String z() throws m14 {
        int iL = L();
        if (iL > 0) {
            int i8 = this.f17518h;
            int i9 = this.f17520j;
            if (iL <= i8 - i9) {
                String str = new String(this.f17517g, i9, iL, k14.f9885b);
                this.f17520j += iL;
                return str;
            }
        }
        if (iL == 0) {
            return "";
        }
        if (iL > this.f17518h) {
            return new String(H(iL, false), k14.f9885b);
        }
        F(iL);
        String str2 = new String(this.f17517g, this.f17520j, iL, k14.f9885b);
        this.f17520j += iL;
        return str2;
    }
}
