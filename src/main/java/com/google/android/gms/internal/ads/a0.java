package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final u f4935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final z f4936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected w f4937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4938d;

    protected a0(x xVar, z zVar, long j8, long j9, long j10, long j11, long j12, long j13, int i8) {
        this.f4936b = zVar;
        this.f4938d = i8;
        this.f4935a = new u(xVar, j8, 0L, j10, j11, j12, j13);
    }

    protected static final int f(q0 q0Var, long j8, n1 n1Var) {
        if (j8 == q0Var.n()) {
            return 0;
        }
        n1Var.f11591a = j8;
        return 1;
    }

    protected static final boolean g(q0 q0Var, long j8) throws EOFException, InterruptedIOException {
        long jN = j8 - q0Var.n();
        if (jN < 0 || jN > 262144) {
            return false;
        }
        ((f0) q0Var).d((int) jN, false);
        return true;
    }

    public final int a(q0 q0Var, n1 n1Var) throws EOFException, InterruptedIOException {
        while (true) {
            w wVar = this.f4937c;
            uu1.b(wVar);
            long j8 = wVar.f16560f;
            long j9 = wVar.f16561g - j8;
            int i8 = this.f4938d;
            long j10 = wVar.f16562h;
            if (j9 <= i8) {
                c(false, j8);
                return f(q0Var, j8, n1Var);
            }
            if (!g(q0Var, j10)) {
                return f(q0Var, j10, n1Var);
            }
            q0Var.t();
            y yVarA = this.f4936b.a(q0Var, wVar.f16556b);
            int i9 = yVarA.f17525a;
            if (i9 == -3) {
                c(false, j10);
                return f(q0Var, j10, n1Var);
            }
            if (i9 == -2) {
                w.h(wVar, yVarA.f17526b, yVarA.f17527c);
            } else {
                if (i9 != -1) {
                    g(q0Var, yVarA.f17527c);
                    c(true, yVarA.f17527c);
                    return f(q0Var, yVarA.f17527c, n1Var);
                }
                w.g(wVar, yVarA.f17526b, yVarA.f17527c);
            }
        }
    }

    public final q1 b() {
        return this.f4935a;
    }

    protected final void c(boolean z7, long j8) {
        this.f4937c = null;
        this.f4936b.k();
    }

    public final void d(long j8) {
        w wVar = this.f4937c;
        if (wVar == null || wVar.f16555a != j8) {
            u uVar = this.f4935a;
            this.f4937c = new w(j8, uVar.f(j8), 0L, uVar.f15421c, uVar.f15422d, uVar.f15423e, uVar.f15424f);
        }
    }

    public final boolean e() {
        return this.f4937c != null;
    }
}
