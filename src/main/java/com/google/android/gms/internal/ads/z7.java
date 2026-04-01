package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class z7 extends x7 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private y7 f18050n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f18051o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f18052p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b2 f18053q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private z1 f18054r;

    z7() {
    }

    @Override // com.google.android.gms.internal.ads.x7
    protected final long a(dq2 dq2Var) {
        if ((dq2Var.i()[0] & 1) == 1) {
            return -1L;
        }
        byte b8 = dq2Var.i()[0];
        y7 y7Var = this.f18050n;
        uu1.b(y7Var);
        int i8 = !y7Var.f17602d[(b8 >> 1) & (255 >>> (8 - y7Var.f17603e))].f4954a ? y7Var.f17599a.f5573e : y7Var.f17599a.f5574f;
        int i9 = this.f18052p ? (this.f18051o + i8) / 4 : 0;
        if (dq2Var.k() < dq2Var.m() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(dq2Var.i(), dq2Var.m() + 4);
            dq2Var.e(bArrCopyOf, bArrCopyOf.length);
        } else {
            dq2Var.f(dq2Var.m() + 4);
        }
        long j8 = i9;
        byte[] bArrI = dq2Var.i();
        bArrI[dq2Var.m() - 4] = (byte) (j8 & 255);
        bArrI[dq2Var.m() - 3] = (byte) ((j8 >>> 8) & 255);
        bArrI[dq2Var.m() - 2] = (byte) ((j8 >>> 16) & 255);
        bArrI[dq2Var.m() - 1] = (byte) ((j8 >>> 24) & 255);
        this.f18052p = true;
        this.f18051o = i8;
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.x7
    protected final void b(boolean z7) {
        super.b(z7);
        if (z7) {
            this.f18050n = null;
            this.f18053q = null;
            this.f18054r = null;
        }
        this.f18051o = 0;
        this.f18052p = false;
    }

    @Override // com.google.android.gms.internal.ads.x7
    protected final boolean c(dq2 dq2Var, long j8, u7 u7Var) throws yh0 {
        y7 y7Var;
        int i8;
        int iB;
        int i9;
        b2 b2Var;
        if (this.f18050n != null) {
            u7Var.f15519a.getClass();
            return false;
        }
        b2 b2Var2 = this.f18053q;
        int i10 = 4;
        if (b2Var2 == null) {
            c2.d(1, dq2Var, false);
            int iR = dq2Var.r();
            int iU = dq2Var.u();
            int iR2 = dq2Var.r();
            int iQ = dq2Var.q();
            int i11 = iQ <= 0 ? -1 : iQ;
            int iQ2 = dq2Var.q();
            int i12 = iQ2 <= 0 ? -1 : iQ2;
            int iQ3 = dq2Var.q();
            int i13 = iQ3 <= 0 ? -1 : iQ3;
            int iU2 = dq2Var.u();
            this.f18053q = new b2(iR, iU, iR2, i11, i12, i13, (int) Math.pow(2.0d, iU2 & 15), (int) Math.pow(2.0d, (iU2 & 240) >> 4), 1 == (dq2Var.u() & 1), Arrays.copyOf(dq2Var.i(), dq2Var.m()));
        } else {
            z1 z1Var = this.f18054r;
            if (z1Var == null) {
                this.f18054r = c2.c(dq2Var, true, true);
            } else {
                byte[] bArr = new byte[dq2Var.m()];
                System.arraycopy(dq2Var.i(), 0, bArr, 0, dq2Var.m());
                int i14 = b2Var2.f5569a;
                int i15 = 5;
                c2.d(5, dq2Var, false);
                int iU3 = dq2Var.u() + 1;
                y1 y1Var = new y1(dq2Var.i());
                y1Var.c(dq2Var.l() * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 2;
                    int i18 = 16;
                    if (i16 >= iU3) {
                        b2 b2Var3 = b2Var2;
                        int i19 = 6;
                        int iB2 = y1Var.b(6) + 1;
                        for (int i20 = 0; i20 < iB2; i20++) {
                            if (y1Var.b(16) != 0) {
                                throw yh0.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i21 = 1;
                        int iB3 = y1Var.b(6) + 1;
                        int i22 = 0;
                        while (true) {
                            int i23 = 3;
                            if (i22 < iB3) {
                                int iB4 = y1Var.b(i18);
                                if (iB4 == 0) {
                                    i9 = iB3;
                                    int i24 = 8;
                                    y1Var.c(8);
                                    y1Var.c(16);
                                    y1Var.c(16);
                                    y1Var.c(6);
                                    y1Var.c(8);
                                    int iB5 = y1Var.b(4) + 1;
                                    int i25 = 0;
                                    while (i25 < iB5) {
                                        y1Var.c(i24);
                                        i25++;
                                        i24 = 8;
                                    }
                                } else {
                                    if (iB4 != i21) {
                                        throw yh0.a("floor type greater than 1 not decodable: " + iB4, null);
                                    }
                                    int iB6 = y1Var.b(i15);
                                    int[] iArr = new int[iB6];
                                    int i26 = -1;
                                    for (int i27 = 0; i27 < iB6; i27++) {
                                        int iB7 = y1Var.b(4);
                                        iArr[i27] = iB7;
                                        if (iB7 > i26) {
                                            i26 = iB7;
                                        }
                                    }
                                    int i28 = i26 + 1;
                                    int[] iArr2 = new int[i28];
                                    int i29 = 0;
                                    while (i29 < i28) {
                                        iArr2[i29] = y1Var.b(i23) + 1;
                                        int iB8 = y1Var.b(i17);
                                        int i30 = 8;
                                        if (iB8 > 0) {
                                            y1Var.c(8);
                                        }
                                        int i31 = iB3;
                                        int i32 = 0;
                                        for (int i33 = 1; i32 < (i33 << iB8); i33 = 1) {
                                            y1Var.c(i30);
                                            i32++;
                                            i30 = 8;
                                        }
                                        i29++;
                                        iB3 = i31;
                                        i17 = 2;
                                        i23 = 3;
                                    }
                                    i9 = iB3;
                                    y1Var.c(2);
                                    int iB9 = y1Var.b(4);
                                    int i34 = 0;
                                    int i35 = 0;
                                    for (int i36 = 0; i36 < iB6; i36++) {
                                        i34 += iArr2[iArr[i36]];
                                        while (i35 < i34) {
                                            y1Var.c(iB9);
                                            i35++;
                                        }
                                    }
                                }
                                i22++;
                                iB3 = i9;
                                i19 = 6;
                                i18 = 16;
                                i17 = 2;
                                i21 = 1;
                                i15 = 5;
                            } else {
                                int i37 = 1;
                                int iB10 = y1Var.b(i19) + 1;
                                int i38 = 0;
                                while (i38 < iB10) {
                                    if (y1Var.b(16) > 2) {
                                        throw yh0.a("residueType greater than 2 is not decodable", null);
                                    }
                                    y1Var.c(24);
                                    y1Var.c(24);
                                    y1Var.c(24);
                                    int iB11 = y1Var.b(i19) + i37;
                                    int i39 = 8;
                                    y1Var.c(8);
                                    int[] iArr3 = new int[iB11];
                                    for (int i40 = 0; i40 < iB11; i40++) {
                                        iArr3[i40] = ((y1Var.d() ? y1Var.b(5) : 0) * 8) + y1Var.b(3);
                                    }
                                    int i41 = 0;
                                    while (i41 < iB11) {
                                        int i42 = 0;
                                        while (i42 < i39) {
                                            if ((iArr3[i41] & (1 << i42)) != 0) {
                                                y1Var.c(i39);
                                            }
                                            i42++;
                                            i39 = 8;
                                        }
                                        i41++;
                                        i39 = 8;
                                    }
                                    i38++;
                                    i19 = 6;
                                    i37 = 1;
                                }
                                int iB12 = y1Var.b(i19) + 1;
                                for (int i43 = 0; i43 < iB12; i43++) {
                                    int iB13 = y1Var.b(16);
                                    if (iB13 != 0) {
                                        pf2.c("VorbisUtil", "mapping type other than 0 not supported: " + iB13);
                                    } else {
                                        if (y1Var.d()) {
                                            i8 = 1;
                                            iB = y1Var.b(4) + 1;
                                        } else {
                                            i8 = 1;
                                            iB = 1;
                                        }
                                        if (y1Var.d()) {
                                            int iB14 = y1Var.b(8) + i8;
                                            for (int i44 = 0; i44 < iB14; i44++) {
                                                int i45 = i14 - 1;
                                                y1Var.c(c2.a(i45));
                                                y1Var.c(c2.a(i45));
                                            }
                                        }
                                        if (y1Var.b(2) != 0) {
                                            throw yh0.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iB > 1) {
                                            for (int i46 = 0; i46 < i14; i46++) {
                                                y1Var.c(4);
                                            }
                                        }
                                        for (int i47 = 0; i47 < iB; i47++) {
                                            y1Var.c(8);
                                            y1Var.c(8);
                                            y1Var.c(8);
                                        }
                                    }
                                }
                                int iB15 = y1Var.b(6) + 1;
                                a2[] a2VarArr = new a2[iB15];
                                for (int i48 = 0; i48 < iB15; i48++) {
                                    a2VarArr[i48] = new a2(y1Var.d(), y1Var.b(16), y1Var.b(16), y1Var.b(8));
                                }
                                if (!y1Var.d()) {
                                    throw yh0.a("framing bit after modes not set as expected", null);
                                }
                                y7Var = new y7(b2Var3, z1Var, bArr, a2VarArr, c2.a(iB15 - 1));
                            }
                        }
                    } else {
                        if (y1Var.b(24) != 5653314) {
                            throw yh0.a("expected code book to start with [0x56, 0x43, 0x42] at " + y1Var.a(), null);
                        }
                        int iB16 = y1Var.b(16);
                        int iB17 = y1Var.b(24);
                        if (y1Var.d()) {
                            y1Var.c(5);
                            for (int iB18 = 0; iB18 < iB17; iB18 += y1Var.b(c2.a(iB17 - iB18))) {
                            }
                        } else {
                            boolean zD = y1Var.d();
                            for (int i49 = 0; i49 < iB17; i49++) {
                                if (!zD || y1Var.d()) {
                                    y1Var.c(5);
                                }
                            }
                        }
                        int iB19 = y1Var.b(i10);
                        if (iB19 > 2) {
                            throw yh0.a("lookup type greater than 2 not decodable: " + iB19, null);
                        }
                        if (iB19 != 1) {
                            if (iB19 != 2) {
                                b2Var = b2Var2;
                            }
                            i16++;
                            b2Var2 = b2Var;
                            i10 = 4;
                        } else {
                            i17 = iB19;
                        }
                        y1Var.c(32);
                        y1Var.c(32);
                        int iB20 = y1Var.b(i10) + 1;
                        y1Var.c(1);
                        b2Var = b2Var2;
                        y1Var.c((int) ((i17 == 1 ? iB16 != 0 ? (long) Math.floor(Math.pow(iB17, 1.0d / ((double) iB16))) : 0L : ((long) iB16) * ((long) iB17)) * ((long) iB20)));
                        i16++;
                        b2Var2 = b2Var;
                        i10 = 4;
                    }
                }
            }
        }
        y7Var = null;
        this.f18050n = y7Var;
        if (y7Var == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        b2 b2Var4 = y7Var.f17599a;
        arrayList.add(b2Var4.f5575g);
        arrayList.add(y7Var.f17601c);
        td0 td0VarB = c2.b(jb3.y(y7Var.f17600b.f17971b));
        l9 l9Var = new l9();
        l9Var.u("audio/vorbis");
        l9Var.j0(b2Var4.f5572d);
        l9Var.q(b2Var4.f5571c);
        l9Var.k0(b2Var4.f5569a);
        l9Var.v(b2Var4.f5570b);
        l9Var.k(arrayList);
        l9Var.o(td0VarB);
        u7Var.f15519a = l9Var.D();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.x7
    protected final void h(long j8) {
        super.h(j8);
        this.f18052p = j8 != 0;
        b2 b2Var = this.f18053q;
        this.f18051o = b2Var != null ? b2Var.f5573e : 0;
    }
}
