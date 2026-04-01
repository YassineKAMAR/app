package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f12754a;

    static {
        int i8 = nz2.f12300a;
        f12754a = "OpusHead".getBytes(x73.f17098c);
    }

    public static td0 a(e6 e6Var) {
        r33 r33Var;
        f6 f6VarD = e6Var.d(1751411826);
        f6 f6VarD2 = e6Var.d(1801812339);
        f6 f6VarD3 = e6Var.d(1768715124);
        if (f6VarD == null || f6VarD2 == null || f6VarD3 == null || h(f6VarD.f7629b) != 1835299937) {
            return null;
        }
        dq2 dq2Var = f6VarD2.f7629b;
        dq2Var.g(12);
        int iO = dq2Var.o();
        String[] strArr = new String[iO];
        for (int i8 = 0; i8 < iO; i8++) {
            int iO2 = dq2Var.o();
            dq2Var.h(4);
            strArr[i8] = dq2Var.H(iO2 - 8, x73.f17098c);
        }
        dq2 dq2Var2 = f6VarD3.f7629b;
        dq2Var2.g(8);
        ArrayList arrayList = new ArrayList();
        while (dq2Var2.j() > 8) {
            int iL = dq2Var2.l() + dq2Var2.o();
            int iO3 = dq2Var2.o() - 1;
            if (iO3 < 0 || iO3 >= iO) {
                pf2.f("AtomParsers", "Skipped metadata with unknown key index: " + iO3);
            } else {
                String str = strArr[iO3];
                String[] strArr2 = w6.f16646a;
                while (true) {
                    int iL2 = dq2Var2.l();
                    if (iL2 >= iL) {
                        r33Var = null;
                        break;
                    }
                    int iO4 = dq2Var2.o();
                    if (dq2Var2.o() == 1684108385) {
                        int iO5 = dq2Var2.o();
                        int iO6 = dq2Var2.o();
                        int i9 = iO4 - 16;
                        byte[] bArr = new byte[i9];
                        dq2Var2.c(bArr, 0, i9);
                        r33Var = new r33(str, bArr, iO6, iO5);
                        break;
                    }
                    dq2Var2.g(iL2 + iO4);
                }
                if (r33Var != null) {
                    arrayList.add(r33Var);
                }
            }
            dq2Var2.g(iL);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new td0(arrayList);
    }

    public static td0 b(f6 f6Var) {
        dq2 dq2Var = f6Var.f7629b;
        dq2Var.g(8);
        td0 td0Var = new td0(-9223372036854775807L, new tc0[0]);
        while (dq2Var.j() >= 8) {
            int iL = dq2Var.l();
            int iO = dq2Var.o() + iL;
            int iO2 = dq2Var.o();
            td0 td0Var2 = null;
            if (iO2 == 1835365473) {
                dq2Var.g(iL);
                dq2Var.h(8);
                e(dq2Var);
                while (true) {
                    if (dq2Var.l() >= iO) {
                        break;
                    }
                    int iL2 = dq2Var.l();
                    int iO3 = dq2Var.o() + iL2;
                    if (dq2Var.o() == 1768715124) {
                        dq2Var.g(iL2);
                        dq2Var.h(8);
                        ArrayList arrayList = new ArrayList();
                        while (dq2Var.l() < iO3) {
                            tc0 tc0VarA = w6.a(dq2Var);
                            if (tc0VarA != null) {
                                arrayList.add(tc0VarA);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            td0Var2 = new td0(arrayList);
                        }
                    } else {
                        dq2Var.g(iO3);
                    }
                }
            } else if (iO2 == 1936553057) {
                dq2Var.g(iL);
                dq2Var.h(12);
                while (true) {
                    if (dq2Var.l() >= iO) {
                        break;
                    }
                    int iL3 = dq2Var.l();
                    int iO4 = dq2Var.o();
                    if (dq2Var.o() != 1935766900) {
                        dq2Var.g(iL3 + iO4);
                    } else if (iO4 >= 14) {
                        dq2Var.h(5);
                        int iU = dq2Var.u();
                        float f8 = 120.0f;
                        if (iU != 12) {
                            if (iU == 13) {
                            }
                        } else if (iU == 12) {
                            f8 = 240.0f;
                        }
                        dq2Var.h(1);
                        td0Var2 = new td0(-9223372036854775807L, new e5(f8, dq2Var.u()));
                    }
                }
            } else {
                if (iO2 == -1451722374) {
                    td0Var = td0Var.e(l(dq2Var));
                }
                dq2Var.g(iO);
            }
            td0Var = td0Var.e(td0Var2);
            dq2Var.g(iO);
        }
        return td0Var;
    }

    public static p93 c(dq2 dq2Var) {
        long jB;
        long jB2;
        dq2Var.g(8);
        if (g6.a(dq2Var.o()) == 0) {
            jB = dq2Var.C();
            jB2 = dq2Var.C();
        } else {
            jB = dq2Var.B();
            jB2 = dq2Var.B();
        }
        return new p93(jB, jB2, dq2Var.C());
    }

    /* JADX WARN: Removed duplicated region for block: B:354:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0a53 A[PHI: r8
  0x0a53: PHI (r8v44 int) = (r8v43 int), (r8v43 int), (r8v71 int), (r8v43 int) binds: [B:435:0x09ae, B:442:0x09c8, B:459:0x0a52, B:441:0x09c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0b54 A[ADDED_TO_REGION, LOOP:13: B:503:0x0b54->B:507:0x0b5e, LOOP_START, PHI: r21
  0x0b54: PHI (r21v11 int) = (r21v10 int), (r21v12 int) binds: [B:502:0x0b52, B:507:0x0b5e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0b64  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0bb6  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0c03  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0c06  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0c29  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0c41  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0cdb  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0ce1  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0d27 A[PHI: r7
  0x0d27: PHI (r7v49 int A[IMMUTABLE_TYPE]) = (r7v48 int), (r7v60 int) binds: [B:553:0x0cdf, B:561:0x0d26] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0d2c  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0d2e  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0d43  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0dae  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0db0  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0db5  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0db9  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0dbd  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0dc0  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0dc5  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0dc7  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0dcb  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0dcf  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0ddd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0ea0  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0ead A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0da4 A[EDGE_INSN: B:642:0x0da4->B:584:0x0da4 BREAK  A[LOOP:6: B:567:0x0d3c->B:583:0x0d99], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0b49 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List d(com.google.android.gms.internal.ads.e6 r58, com.google.android.gms.internal.ads.g1 r59, long r60, com.google.android.gms.internal.ads.e2 r62, boolean r63, boolean r64, com.google.android.gms.internal.ads.z73 r65) throws com.google.android.gms.internal.ads.yh0 {
        /*
            Method dump skipped, instruction units count: 3767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p6.d(com.google.android.gms.internal.ads.e6, com.google.android.gms.internal.ads.g1, long, com.google.android.gms.internal.ads.e2, boolean, boolean, com.google.android.gms.internal.ads.z73):java.util.List");
    }

    public static void e(dq2 dq2Var) {
        int iL = dq2Var.l();
        dq2Var.h(4);
        if (dq2Var.o() != 1751411826) {
            iL += 4;
        }
        dq2Var.g(iL);
    }

    private static int f(int i8) {
        if (i8 == 1936684398) {
            return 1;
        }
        if (i8 == 1986618469) {
            return 2;
        }
        if (i8 == 1952807028 || i8 == 1935832172 || i8 == 1937072756 || i8 == 1668047728) {
            return 3;
        }
        return i8 == 1835365473 ? 5 : -1;
    }

    private static int g(dq2 dq2Var) {
        int iU = dq2Var.u();
        int i8 = iU & 127;
        while ((iU & 128) == 128) {
            iU = dq2Var.u();
            i8 = (i8 << 7) | (iU & 127);
        }
        return i8;
    }

    private static int h(dq2 dq2Var) {
        dq2Var.g(16);
        return dq2Var.o();
    }

    private static Pair i(e6 e6Var) {
        f6 f6VarD = e6Var.d(1701606260);
        if (f6VarD == null) {
            return null;
        }
        dq2 dq2Var = f6VarD.f7629b;
        dq2Var.g(8);
        int iA = g6.a(dq2Var.o());
        int iX = dq2Var.x();
        long[] jArr = new long[iX];
        long[] jArr2 = new long[iX];
        for (int i8 = 0; i8 < iX; i8++) {
            jArr[i8] = iA == 1 ? dq2Var.D() : dq2Var.C();
            jArr2[i8] = iA == 1 ? dq2Var.B() : dq2Var.o();
            if (dq2Var.I() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            dq2Var.h(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair j(dq2 dq2Var) {
        dq2Var.g(8);
        int iA = g6.a(dq2Var.o());
        dq2Var.h(iA == 0 ? 8 : 16);
        long jC = dq2Var.C();
        dq2Var.h(iA == 0 ? 4 : 8);
        int iY = dq2Var.y();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((iY >> 10) & 31) + 96));
        sb.append((char) (((iY >> 5) & 31) + 96));
        sb.append((char) ((iY & 31) + 96));
        return Pair.create(Long.valueOf(jC), sb.toString());
    }

    private static Pair k(dq2 dq2Var, int i8, int i9) throws yh0 {
        Integer num;
        f7 f7Var;
        Pair pairCreate;
        int i10;
        int i11;
        byte[] bArr;
        int iL = dq2Var.l();
        while (iL - i8 < i9) {
            dq2Var.g(iL);
            int iO = dq2Var.o();
            t0.b(iO > 0, "childAtomSize must be positive");
            if (dq2Var.o() == 1936289382) {
                int i12 = iL + 8;
                int i13 = -1;
                int i14 = 0;
                String strH = null;
                Integer numValueOf = null;
                while (i12 - iL < iO) {
                    dq2Var.g(i12);
                    int iO2 = dq2Var.o();
                    int iO3 = dq2Var.o();
                    if (iO3 == 1718775137) {
                        numValueOf = Integer.valueOf(dq2Var.o());
                    } else if (iO3 == 1935894637) {
                        dq2Var.h(4);
                        strH = dq2Var.H(4, x73.f17098c);
                    } else if (iO3 == 1935894633) {
                        i13 = i12;
                        i14 = iO2;
                    }
                    i12 += iO2;
                }
                if ("cenc".equals(strH) || "cbc1".equals(strH) || "cens".equals(strH) || "cbcs".equals(strH)) {
                    t0.b(numValueOf != null, "frma atom is mandatory");
                    t0.b(i13 != -1, "schi atom is mandatory");
                    int i15 = i13 + 8;
                    while (true) {
                        if (i15 - i13 >= i14) {
                            num = numValueOf;
                            f7Var = null;
                            break;
                        }
                        dq2Var.g(i15);
                        int iO4 = dq2Var.o();
                        if (dq2Var.o() == 1952804451) {
                            int iA = g6.a(dq2Var.o());
                            dq2Var.h(1);
                            if (iA == 0) {
                                dq2Var.h(1);
                                i10 = 0;
                                i11 = 0;
                            } else {
                                int iU = dq2Var.u();
                                int i16 = (iU & 240) >> 4;
                                i10 = iU & 15;
                                i11 = i16;
                            }
                            boolean z7 = dq2Var.u() == 1;
                            int iU2 = dq2Var.u();
                            byte[] bArr2 = new byte[16];
                            dq2Var.c(bArr2, 0, 16);
                            if (z7 && iU2 == 0) {
                                int iU3 = dq2Var.u();
                                byte[] bArr3 = new byte[iU3];
                                dq2Var.c(bArr3, 0, iU3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            f7Var = new f7(z7, strH, iU2, bArr2, i11, i10, bArr);
                        } else {
                            i15 += iO4;
                        }
                    }
                    t0.b(f7Var != null, "tenc atom is mandatory");
                    int i17 = nz2.f12300a;
                    pairCreate = Pair.create(num, f7Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iL += iO;
        }
        return null;
    }

    private static td0 l(dq2 dq2Var) {
        short sI = dq2Var.I();
        dq2Var.h(2);
        String strH = dq2Var.H(sI, x73.f17098c);
        int iMax = Math.max(strH.lastIndexOf(43), strH.lastIndexOf(45));
        try {
            return new td0(-9223372036854775807L, new n63(Float.parseFloat(strH.substring(0, iMax)), Float.parseFloat(strH.substring(iMax, strH.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static j6 m(dq2 dq2Var, int i8) {
        dq2Var.g(i8 + 12);
        dq2Var.h(1);
        g(dq2Var);
        dq2Var.h(2);
        int iU = dq2Var.u();
        if ((iU & 128) != 0) {
            dq2Var.h(2);
        }
        if ((iU & 64) != 0) {
            dq2Var.h(dq2Var.u());
        }
        if ((iU & 32) != 0) {
            dq2Var.h(2);
        }
        dq2Var.h(1);
        g(dq2Var);
        String strD = xg0.d(dq2Var.u());
        if ("audio/mpeg".equals(strD) || "audio/vnd.dts".equals(strD) || "audio/vnd.dts.hd".equals(strD)) {
            return new j6(strD, null, -1L, -1L);
        }
        dq2Var.h(4);
        long jC = dq2Var.C();
        long jC2 = dq2Var.C();
        dq2Var.h(1);
        int iG = g(dq2Var);
        byte[] bArr = new byte[iG];
        dq2Var.c(bArr, 0, iG);
        return new j6(strD, bArr, jC2 <= 0 ? -1L : jC2, jC > 0 ? jC : -1L);
    }

    private static ByteBuffer n() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void o(com.google.android.gms.internal.ads.dq2 r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, com.google.android.gms.internal.ads.e2 r33, com.google.android.gms.internal.ads.l6 r34, int r35) throws com.google.android.gms.internal.ads.yh0 {
        /*
            Method dump skipped, instruction units count: 1207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p6.o(com.google.android.gms.internal.ads.dq2, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.e2, com.google.android.gms.internal.ads.l6, int):void");
    }

    private static boolean p(long[] jArr, long j8, long j9, long j10) {
        int length = jArr.length;
        int i8 = length - 1;
        return jArr[0] <= j9 && j9 < jArr[Math.max(0, Math.min(4, i8))] && jArr[Math.max(0, Math.min(length + (-4), i8))] < j10 && j10 <= j8;
    }
}
