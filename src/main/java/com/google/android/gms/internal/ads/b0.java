package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public static void a(long j8, dq2 dq2Var, w1[] w1VarArr) {
        int iO;
        while (true) {
            if (dq2Var.j() <= 1) {
                return;
            }
            int iC = c(dq2Var);
            int iC2 = c(dq2Var);
            int iL = dq2Var.l() + iC2;
            if (iC2 == -1 || iC2 > dq2Var.j()) {
                pf2.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iL = dq2Var.m();
            } else if (iC == 4 && iC2 >= 8) {
                int iU = dq2Var.u();
                int iY = dq2Var.y();
                if (iY == 49) {
                    iO = dq2Var.o();
                    iY = 49;
                } else {
                    iO = 0;
                }
                int iU2 = dq2Var.u();
                if (iY == 47) {
                    dq2Var.h(1);
                    iY = 47;
                }
                boolean z7 = iU == 181 && (iY == 49 || iY == 47) && iU2 == 3;
                if (iY == 49) {
                    z7 &= iO == 1195456820;
                }
                if (z7) {
                    b(j8, dq2Var, w1VarArr);
                }
            }
            dq2Var.g(iL);
        }
    }

    public static void b(long j8, dq2 dq2Var, w1[] w1VarArr) {
        int iU = dq2Var.u();
        if ((iU & 64) != 0) {
            int i8 = iU & 31;
            dq2Var.h(1);
            int iL = dq2Var.l();
            for (w1 w1Var : w1VarArr) {
                int i9 = i8 * 3;
                dq2Var.g(iL);
                w1Var.d(dq2Var, i9);
                if (j8 != -9223372036854775807L) {
                    w1Var.a(j8, 1, i9, 0, null);
                }
            }
        }
    }

    private static int c(dq2 dq2Var) {
        int i8 = 0;
        while (dq2Var.j() != 0) {
            int iU = dq2Var.u();
            i8 += iU;
            if (iU != 255) {
                return i8;
            }
        }
        return -1;
    }
}
