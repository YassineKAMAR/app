package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dq2 f9037a = new dq2(10);

    public final td0 a(q0 q0Var, l4 l4Var) throws Throwable {
        td0 td0VarA = null;
        int i8 = 0;
        while (true) {
            try {
                ((f0) q0Var).L(this.f9037a.i(), 0, 10, false);
                this.f9037a.g(0);
                if (this.f9037a.w() != 4801587) {
                    break;
                }
                this.f9037a.h(3);
                int iT = this.f9037a.t();
                int i9 = iT + 10;
                if (td0VarA == null) {
                    byte[] bArr = new byte[i9];
                    System.arraycopy(this.f9037a.i(), 0, bArr, 0, 10);
                    ((f0) q0Var).L(bArr, 10, iT, false);
                    td0VarA = n4.a(bArr, i9, l4Var, new n3());
                } else {
                    ((f0) q0Var).c(iT, false);
                }
                i8 += i9;
            } catch (EOFException unused) {
            }
        }
        q0Var.t();
        ((f0) q0Var).c(i8, false);
        return td0VarA;
    }
}
