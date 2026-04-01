package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
final class oa {
    public static Pair a(q0 q0Var) throws yh0, EOFException, InterruptedIOException {
        q0Var.t();
        na naVarD = d(1684108385, q0Var, new dq2(8));
        ((f0) q0Var).d(8, false);
        return Pair.create(Long.valueOf(q0Var.n()), Long.valueOf(naVarD.f11757b));
    }

    public static la b(q0 q0Var) throws yh0, EOFException, InterruptedIOException {
        byte[] bArr;
        dq2 dq2Var = new dq2(16);
        na naVarD = d(1718449184, q0Var, dq2Var);
        uu1.f(naVarD.f11757b >= 16);
        f0 f0Var = (f0) q0Var;
        f0Var.L(dq2Var.i(), 0, 16, false);
        dq2Var.g(0);
        int iS = dq2Var.s();
        int iS2 = dq2Var.s();
        int iR = dq2Var.r();
        int iR2 = dq2Var.r();
        int iS3 = dq2Var.s();
        int iS4 = dq2Var.s();
        int i8 = ((int) naVarD.f11757b) - 16;
        if (i8 > 0) {
            bArr = new byte[i8];
            f0Var.L(bArr, 0, i8, false);
        } else {
            bArr = nz2.f12305f;
        }
        byte[] bArr2 = bArr;
        ((f0) q0Var).d((int) (q0Var.m() - q0Var.n()), false);
        return new la(iS, iS2, iR, iR2, iS3, iS4, bArr2);
    }

    public static boolean c(q0 q0Var) {
        dq2 dq2Var = new dq2(8);
        int i8 = na.a(q0Var, dq2Var).f11756a;
        if (i8 != 1380533830 && i8 != 1380333108) {
            return false;
        }
        ((f0) q0Var).L(dq2Var.i(), 0, 4, false);
        dq2Var.g(0);
        int iO = dq2Var.o();
        if (iO == 1463899717) {
            return true;
        }
        pf2.c("WavHeaderReader", "Unsupported form type: " + iO);
        return false;
    }

    private static na d(int i8, q0 q0Var, dq2 dq2Var) throws yh0, EOFException, InterruptedIOException {
        while (true) {
            na naVarA = na.a(q0Var, dq2Var);
            int i9 = naVarA.f11756a;
            if (i9 == i8) {
                return naVarA;
            }
            pf2.f("WavHeaderReader", "Ignoring unknown WAV chunk: " + i9);
            long j8 = naVarA.f11757b + 8;
            if (j8 > 2147483647L) {
                throw yh0.c("Chunk is too large (~2GB+) to skip; id: " + naVarA.f11756a);
            }
            ((f0) q0Var).d((int) j8, false);
        }
    }
}
