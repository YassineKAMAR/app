package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class n7 extends x7 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c1 f11710n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m7 f11711o;

    n7() {
    }

    private static boolean j(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.x7
    protected final long a(dq2 dq2Var) {
        if (!j(dq2Var.i())) {
            return -1L;
        }
        int i8 = (dq2Var.i()[2] & 255) >> 4;
        if (i8 == 6) {
            dq2Var.h(4);
            dq2Var.E();
        } else if (i8 == 7) {
            i8 = 7;
            dq2Var.h(4);
            dq2Var.E();
        }
        int iA = y0.a(dq2Var, i8);
        dq2Var.g(0);
        return iA;
    }

    @Override // com.google.android.gms.internal.ads.x7
    protected final void b(boolean z7) {
        super.b(z7);
        if (z7) {
            this.f11710n = null;
            this.f11711o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.x7
    protected final boolean c(dq2 dq2Var, long j8, u7 u7Var) {
        byte[] bArrI = dq2Var.i();
        c1 c1Var = this.f11710n;
        if (c1Var == null) {
            c1 c1Var2 = new c1(bArrI, 17);
            this.f11710n = c1Var2;
            u7Var.f15519a = c1Var2.c(Arrays.copyOfRange(bArrI, 9, dq2Var.m()), null);
            return true;
        }
        if ((bArrI[0] & 127) == 3) {
            b1 b1VarB = z0.b(dq2Var);
            c1 c1VarF = c1Var.f(b1VarB);
            this.f11710n = c1VarF;
            this.f11711o = new m7(c1VarF, b1VarB);
            return true;
        }
        if (!j(bArrI)) {
            return true;
        }
        m7 m7Var = this.f11711o;
        if (m7Var != null) {
            m7Var.b(j8);
            u7Var.f15520b = this.f11711o;
        }
        u7Var.f15519a.getClass();
        return false;
    }
}
