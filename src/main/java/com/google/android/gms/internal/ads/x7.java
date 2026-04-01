package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
abstract class x7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w1 f17071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s0 f17072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s7 f17073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f17074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f17075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f17076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f17077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17078i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f17080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17081l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f17082m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f17070a = new q7();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private u7 f17079j = new u7();

    protected abstract long a(dq2 dq2Var);

    protected void b(boolean z7) {
        int i8;
        if (z7) {
            this.f17079j = new u7();
            this.f17075f = 0L;
            i8 = 0;
        } else {
            i8 = 1;
        }
        this.f17077h = i8;
        this.f17074e = -1L;
        this.f17076g = 0L;
    }

    protected abstract boolean c(dq2 dq2Var, long j8, u7 u7Var);

    final int d(q0 q0Var, n1 n1Var) throws EOFException, InterruptedIOException {
        uu1.b(this.f17071b);
        int i8 = nz2.f12300a;
        int i9 = this.f17077h;
        if (i9 == 0) {
            while (this.f17070a.e(q0Var)) {
                long jN = q0Var.n();
                long j8 = this.f17075f;
                this.f17080k = jN - j8;
                if (!c(this.f17070a.a(), j8, this.f17079j)) {
                    nb nbVar = this.f17079j.f15519a;
                    this.f17078i = nbVar.f11807z;
                    if (!this.f17082m) {
                        this.f17071b.e(nbVar);
                        this.f17082m = true;
                    }
                    s7 s7Var = this.f17079j.f15520b;
                    if (s7Var != null) {
                        this.f17073d = s7Var;
                    } else if (q0Var.p() == -1) {
                        this.f17073d = new w7(null);
                    } else {
                        r7 r7VarB = this.f17070a.b();
                        this.f17073d = new l7(this, this.f17075f, q0Var.p(), r7VarB.f13959d + r7VarB.f13960e, r7VarB.f13957b, (r7VarB.f13956a & 4) != 0);
                    }
                    this.f17077h = 2;
                    this.f17070a.d();
                    return 0;
                }
                this.f17075f = q0Var.n();
            }
            this.f17077h = 3;
            return -1;
        }
        if (i9 == 1) {
            ((f0) q0Var).d((int) this.f17075f, false);
            this.f17077h = 2;
            return 0;
        }
        if (i9 != 2) {
            return -1;
        }
        long jA = this.f17073d.a(q0Var);
        if (jA >= 0) {
            n1Var.f11591a = jA;
            return 1;
        }
        if (jA < -1) {
            h(-(jA + 2));
        }
        if (!this.f17081l) {
            q1 q1VarM = this.f17073d.m();
            uu1.b(q1VarM);
            this.f17072c.r(q1VarM);
            this.f17081l = true;
        }
        if (this.f17080k <= 0 && !this.f17070a.e(q0Var)) {
            this.f17077h = 3;
            return -1;
        }
        this.f17080k = 0L;
        dq2 dq2VarA = this.f17070a.a();
        long jA2 = a(dq2VarA);
        if (jA2 >= 0) {
            long j9 = this.f17076g;
            if (j9 + jA2 >= this.f17074e) {
                long jE = e(j9);
                u1.b(this.f17071b, dq2VarA, dq2VarA.m());
                this.f17071b.a(jE, 1, dq2VarA.m(), 0, null);
                this.f17074e = -1L;
            }
        }
        this.f17076g += jA2;
        return 0;
    }

    protected final long e(long j8) {
        return (j8 * 1000000) / ((long) this.f17078i);
    }

    protected final long f(long j8) {
        return (((long) this.f17078i) * j8) / 1000000;
    }

    final void g(s0 s0Var, w1 w1Var) {
        this.f17072c = s0Var;
        this.f17071b = w1Var;
        b(true);
    }

    protected void h(long j8) {
        this.f17076g = j8;
    }

    final void i(long j8, long j9) {
        this.f17070a.c();
        if (j8 == 0) {
            b(!this.f17081l);
            return;
        }
        if (this.f17077h != 0) {
            long jF = f(j9);
            this.f17074e = jF;
            s7 s7Var = this.f17073d;
            int i8 = nz2.f12300a;
            s7Var.p(jF);
            this.f17077h = 2;
        }
    }
}
