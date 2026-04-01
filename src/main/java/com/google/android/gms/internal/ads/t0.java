package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    public static int a(q0 q0Var, byte[] bArr, int i8, int i9) {
        int i10 = 0;
        while (i10 < i9) {
            int iK = q0Var.K(bArr, i8 + i10, i9 - i10);
            if (iK == -1) {
                break;
            }
            i10 += iK;
        }
        return i10;
    }

    public static void b(boolean z7, String str) throws yh0 {
        if (!z7) {
            throw yh0.a(str, null);
        }
    }

    public static boolean c(q0 q0Var, byte[] bArr, int i8, int i9, boolean z7) throws EOFException {
        try {
            return q0Var.L(bArr, 0, i9, z7);
        } catch (EOFException e8) {
            if (z7) {
                return false;
            }
            throw e8;
        }
    }

    public static boolean d(q0 q0Var, byte[] bArr, int i8, int i9) throws InterruptedIOException {
        try {
            ((f0) q0Var).J(bArr, i8, i9, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(q0 q0Var, int i8) throws InterruptedIOException {
        try {
            ((f0) q0Var).d(i8, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
