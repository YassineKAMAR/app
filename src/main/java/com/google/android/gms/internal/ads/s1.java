package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s0 f14451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w1 f14452d;

    public static final boolean d(q0 q0Var, int i8, int i9) {
        dq2 dq2Var = new dq2(2);
        ((f0) q0Var).L(dq2Var.i(), 0, 2, false);
        return dq2Var.y() == i8;
    }

    public final int a(q0 q0Var, n1 n1Var) {
        int i8 = this.f14450b;
        if (i8 != 1) {
            if (i8 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        w1 w1Var = this.f14452d;
        w1Var.getClass();
        int iA = u1.a(w1Var, q0Var, 1024, true);
        if (iA == -1) {
            this.f14450b = 2;
            this.f14452d.a(0L, 1, this.f14449a, 0, null);
            this.f14449a = 0;
        } else {
            this.f14449a += iA;
        }
        return 0;
    }

    public final void b(s0 s0Var, String str) {
        this.f14451c = s0Var;
        w1 w1VarF = s0Var.f(1024, 4);
        this.f14452d = w1VarF;
        l9 l9Var = new l9();
        l9Var.b(str);
        l9Var.z(1);
        l9Var.B(1);
        w1VarF.e(l9Var.D());
        this.f14451c.d();
        this.f14451c.r(new t1(-9223372036854775807L));
        this.f14450b = 1;
    }

    public final void c(long j8) {
        if (j8 == 0 || this.f14450b == 1) {
            this.f14450b = 1;
            this.f14449a = 0;
        }
    }
}
