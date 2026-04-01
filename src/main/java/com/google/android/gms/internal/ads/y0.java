package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {
    public static int a(dq2 dq2Var, int i8) {
        switch (i8) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i8 - 2);
            case 6:
                return dq2Var.u() + 1;
            case 7:
                return dq2Var.y() + 1;
            case 8:
            case 9:
            case R.styleable.GradientColor_android_endX /* 10 */:
            case R.styleable.GradientColor_android_endY /* 11 */:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                return 256 << (i8 - 8);
            default:
                return -1;
        }
    }

    public static long b(q0 q0Var, c1 c1Var) throws yh0, EOFException, InterruptedIOException {
        q0Var.t();
        f0 f0Var = (f0) q0Var;
        f0Var.c(1, false);
        byte[] bArr = new byte[1];
        f0Var.L(bArr, 0, 1, false);
        int i8 = bArr[0] & 1;
        boolean z7 = 1 == i8;
        f0Var.c(2, false);
        int i9 = 1 != i8 ? 6 : 7;
        dq2 dq2Var = new dq2(i9);
        dq2Var.f(t0.a(q0Var, dq2Var.i(), 0, i9));
        q0Var.t();
        x0 x0Var = new x0();
        if (d(dq2Var, c1Var, z7, x0Var)) {
            return x0Var.f16990a;
        }
        throw yh0.a(null, null);
    }

    public static boolean c(dq2 dq2Var, c1 c1Var, int i8, x0 x0Var) {
        int iA;
        int iL = dq2Var.l();
        long jC = dq2Var.C();
        long j8 = jC >>> 16;
        if (j8 != i8) {
            return false;
        }
        boolean z7 = (j8 & 1) == 1;
        long j9 = jC >> 12;
        long j10 = jC >> 8;
        long j11 = jC >> 4;
        long j12 = jC >> 1;
        long j13 = jC & 1;
        int i9 = (int) (j11 & 15);
        if (i9 <= 7) {
            if (i9 != c1Var.f6094g - 1) {
                return false;
            }
        } else if (i9 > 10 || c1Var.f6094g != 2) {
            return false;
        }
        int i10 = (int) (j12 & 7);
        if (!(i10 == 0 || i10 == c1Var.f6096i) || j13 == 1 || !d(dq2Var, c1Var, z7, x0Var) || (iA = a(dq2Var, (int) (j9 & 15))) == -1 || iA > c1Var.f6089b) {
            return false;
        }
        int i11 = c1Var.f6092e;
        int i12 = (int) (j10 & 15);
        if (i12 != 0) {
            if (i12 <= 11) {
                if (i12 != c1Var.f6093f) {
                    return false;
                }
            } else if (i12 == 12) {
                if (dq2Var.u() * 1000 != i11) {
                    return false;
                }
            } else {
                if (i12 > 14) {
                    return false;
                }
                int iY = dq2Var.y();
                if (i12 == 14) {
                    iY *= 10;
                }
                if (iY != i11) {
                    return false;
                }
            }
        }
        return dq2Var.u() == nz2.q(dq2Var.i(), iL, dq2Var.l() + (-1), 0);
    }

    private static boolean d(dq2 dq2Var, c1 c1Var, boolean z7, x0 x0Var) {
        try {
            long jE = dq2Var.E();
            if (!z7) {
                jE *= (long) c1Var.f6089b;
            }
            x0Var.f16990a = jE;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
