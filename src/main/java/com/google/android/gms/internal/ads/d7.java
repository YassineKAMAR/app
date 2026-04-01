package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f6600a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(q0 q0Var) {
        return c(q0Var, true, false);
    }

    public static boolean b(q0 q0Var, boolean z7) {
        return c(q0Var, false, false);
    }

    private static boolean c(q0 q0Var, boolean z7, boolean z8) {
        boolean z9;
        long jP = q0Var.p();
        long j8 = -1;
        long j9 = 4096;
        if (jP != -1 && jP <= 4096) {
            j9 = jP;
        }
        dq2 dq2Var = new dq2(64);
        int i8 = (int) j9;
        int i9 = 0;
        boolean z10 = false;
        while (i9 < i8) {
            dq2Var.d(8);
            if (!q0Var.L(dq2Var.i(), 0, 8, true)) {
                break;
            }
            long jC = dq2Var.C();
            int iO = dq2Var.o();
            int i10 = 16;
            if (jC == 1) {
                q0Var.N(dq2Var.i(), 8, 8);
                dq2Var.f(16);
                jC = dq2Var.B();
            } else {
                if (jC == 0) {
                    long jP2 = q0Var.p();
                    if (jP2 != j8) {
                        jC = (jP2 - q0Var.m()) + 8;
                    }
                }
                i10 = 8;
            }
            long j10 = i10;
            if (jC < j10) {
                return false;
            }
            i9 += i10;
            if (iO == 1836019574) {
                i8 += (int) jC;
                if (jP != -1 && i8 > jP) {
                    i8 = (int) jP;
                }
            } else {
                if (iO == 1836019558 || iO == 1836475768) {
                    z9 = true;
                    break;
                }
                long j11 = jP;
                long j12 = jC;
                if ((((long) i9) + jC) - j10 >= i8) {
                    break;
                }
                int i11 = (int) (j12 - j10);
                i9 += i11;
                if (iO == 1718909296) {
                    if (i11 < 8) {
                        return false;
                    }
                    dq2Var.d(i11);
                    q0Var.N(dq2Var.i(), 0, i11);
                    int i12 = i11 >> 2;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (i13 != 1) {
                            int iO2 = dq2Var.o();
                            if ((iO2 >>> 8) != 3368816) {
                                if (iO2 == 1751476579) {
                                    iO2 = 1751476579;
                                }
                                int[] iArr = f6600a;
                                for (int i14 = 0; i14 < 29; i14++) {
                                    if (iArr[i14] != iO2) {
                                    }
                                }
                            }
                            z10 = true;
                            break;
                        }
                        dq2Var.h(4);
                    }
                    if (!z10) {
                        return false;
                    }
                } else if (i11 != 0) {
                    q0Var.F(i11);
                }
                jP = j11;
            }
            j8 = -1;
        }
        z9 = false;
        return z10 && z7 == z9;
    }
}
