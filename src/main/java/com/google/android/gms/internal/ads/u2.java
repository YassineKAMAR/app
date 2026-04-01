package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
final class u2 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c1 f15444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x0 f15446c = new x0();

    /* synthetic */ u2(c1 c1Var, int i8, t2 t2Var) {
        this.f15444a = c1Var;
        this.f15445b = i8;
    }

    private final long b(q0 q0Var) throws EOFException, InterruptedIOException {
        while (q0Var.m() < q0Var.p() - 6) {
            c1 c1Var = this.f15444a;
            int i8 = this.f15445b;
            x0 x0Var = this.f15446c;
            long jM = q0Var.m();
            byte[] bArr = new byte[2];
            f0 f0Var = (f0) q0Var;
            f0Var.L(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i8) {
                q0Var.t();
                f0Var.c((int) (jM - q0Var.n()), false);
            } else {
                dq2 dq2Var = new dq2(16);
                System.arraycopy(bArr, 0, dq2Var.i(), 0, 2);
                dq2Var.f(t0.a(q0Var, dq2Var.i(), 2, 14));
                q0Var.t();
                f0Var.c((int) (jM - q0Var.n()), false);
                if (y0.c(dq2Var, c1Var, i8, x0Var)) {
                    break;
                }
            }
            f0Var.c(1, false);
        }
        if (q0Var.m() < q0Var.p() - 6) {
            return this.f15446c.f16990a;
        }
        ((f0) q0Var).c((int) (q0Var.p() - q0Var.m()), false);
        return this.f15444a.f6097j;
    }

    @Override // com.google.android.gms.internal.ads.z
    public final y a(q0 q0Var, long j8) throws EOFException, InterruptedIOException {
        int i8 = this.f15444a.f6090c;
        long jN = q0Var.n();
        long jB = b(q0Var);
        long jM = q0Var.m();
        ((f0) q0Var).c(Math.max(6, i8), false);
        long jB2 = b(q0Var);
        return (jB > j8 || jB2 <= j8) ? jB2 <= j8 ? y.f(jB2, q0Var.m()) : y.d(jB, jN) : y.e(jM);
    }

    @Override // com.google.android.gms.internal.ads.z
    public final /* synthetic */ void k() {
    }
}
