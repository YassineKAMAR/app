package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
final class s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dq2 f14520a = new dq2(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14521b;

    private final long b(q0 q0Var) {
        int i8;
        f0 f0Var = (f0) q0Var;
        int i9 = 0;
        f0Var.L(this.f14520a.i(), 0, 1, false);
        int i10 = this.f14520a.i()[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while (true) {
            i8 = i12 + 1;
            if ((i10 & i11) != 0) {
                break;
            }
            i11 >>= 1;
            i12 = i8;
        }
        int i13 = i10 & (~i11);
        f0Var.L(this.f14520a.i(), 1, i12, false);
        while (i9 < i12) {
            i9++;
            i13 = (this.f14520a.i()[i9] & 255) + (i13 << 8);
        }
        this.f14521b += i8;
        return i13;
    }

    public final boolean a(q0 q0Var) throws EOFException, InterruptedIOException {
        long jP = q0Var.p();
        long j8 = 1024;
        if (jP != -1 && jP <= 1024) {
            j8 = jP;
        }
        f0 f0Var = (f0) q0Var;
        f0Var.L(this.f14520a.i(), 0, 4, false);
        long jC = this.f14520a.C();
        this.f14521b = 4;
        while (jC != 440786851) {
            int i8 = (int) j8;
            int i9 = this.f14521b + 1;
            this.f14521b = i9;
            if (i9 == i8) {
                return false;
            }
            f0Var.L(this.f14520a.i(), 0, 1, false);
            jC = ((jC << 8) & (-256)) | ((long) (this.f14520a.i()[0] & 255));
        }
        long jB = b(q0Var);
        long j9 = this.f14521b;
        if (jB != Long.MIN_VALUE) {
            long j10 = j9 + jB;
            if (jP == -1 || j10 < jP) {
                while (true) {
                    long j11 = this.f14521b;
                    if (j11 < j10) {
                        if (b(q0Var) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jB2 = b(q0Var);
                        if (jB2 < 0) {
                            return false;
                        }
                        if (jB2 != 0) {
                            int i10 = (int) jB2;
                            f0Var.c(i10, false);
                            this.f14521b += i10;
                        }
                    } else if (j11 == j10) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
