package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    public static td0 a(q0 q0Var, boolean z7) throws Throwable {
        td0 td0VarA = new i1().a(q0Var, z7 ? null : n4.f11671a);
        if (td0VarA == null || td0VarA.b() == 0) {
            return null;
        }
        return td0VarA;
    }

    public static b1 b(dq2 dq2Var) {
        dq2Var.h(1);
        int iW = dq2Var.w();
        long jL = dq2Var.l();
        long j8 = iW;
        int i8 = iW / 18;
        long[] jArrCopyOf = new long[i8];
        long[] jArrCopyOf2 = new long[i8];
        int i9 = 0;
        while (true) {
            if (i9 >= i8) {
                break;
            }
            long jB = dq2Var.B();
            if (jB == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i9);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i9);
                break;
            }
            jArrCopyOf[i9] = jB;
            jArrCopyOf2[i9] = dq2Var.B();
            dq2Var.h(2);
            i9++;
        }
        dq2Var.h((int) ((jL + j8) - ((long) dq2Var.l())));
        return new b1(jArrCopyOf, jArrCopyOf2);
    }
}
