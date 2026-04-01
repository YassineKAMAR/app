package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class t7 extends x7 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f14984o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f14985p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f14986n;

    t7() {
    }

    public static boolean j(dq2 dq2Var) {
        return k(dq2Var, f14984o);
    }

    private static boolean k(dq2 dq2Var, byte[] bArr) {
        if (dq2Var.j() < 8) {
            return false;
        }
        int iL = dq2Var.l();
        byte[] bArr2 = new byte[8];
        dq2Var.c(bArr2, 0, 8);
        dq2Var.g(iL);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.x7
    protected final long a(dq2 dq2Var) {
        return f(m1.d(dq2Var.i()));
    }

    @Override // com.google.android.gms.internal.ads.x7
    protected final void b(boolean z7) {
        super.b(z7);
        if (z7) {
            this.f14986n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.x7
    protected final boolean c(dq2 dq2Var, long j8, u7 u7Var) {
        nb nbVarD;
        if (k(dq2Var, f14984o)) {
            byte[] bArrCopyOf = Arrays.copyOf(dq2Var.i(), dq2Var.m());
            int i8 = bArrCopyOf[9] & 255;
            List listE = m1.e(bArrCopyOf);
            if (u7Var.f15519a != null) {
                return true;
            }
            l9 l9Var = new l9();
            l9Var.u("audio/opus");
            l9Var.k0(i8);
            l9Var.v(48000);
            l9Var.k(listE);
            nbVarD = l9Var.D();
        } else {
            if (!k(dq2Var, f14985p)) {
                uu1.b(u7Var.f15519a);
                return false;
            }
            uu1.b(u7Var.f15519a);
            if (this.f14986n) {
                return true;
            }
            this.f14986n = true;
            dq2Var.h(8);
            td0 td0VarB = c2.b(jb3.y(c2.c(dq2Var, false, false).f17971b));
            if (td0VarB == null) {
                return true;
            }
            l9 l9VarB = u7Var.f15519a.b();
            l9VarB.o(td0VarB.e(u7Var.f15519a.f11791j));
            nbVarD = l9VarB.D();
        }
        u7Var.f15519a = nbVarD;
        return true;
    }
}
