package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class g3 implements p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s0 f8173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8176e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b5 f8178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q0 f8179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j3 f8180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a7 f8181j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dq2 f8172a = new dq2(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f8177f = -1;

    private final int a(q0 q0Var) {
        this.f8172a.d(2);
        ((f0) q0Var).L(this.f8172a.i(), 0, 2, false);
        return this.f8172a.y();
    }

    private final void b() {
        c(new tc0[0]);
        s0 s0Var = this.f8173b;
        s0Var.getClass();
        s0Var.d();
        this.f8173b.r(new p1(-9223372036854775807L, 0L));
        this.f8174c = 6;
    }

    private final void c(tc0... tc0VarArr) {
        s0 s0Var = this.f8173b;
        s0Var.getClass();
        w1 w1VarF = s0Var.f(1024, 4);
        l9 l9Var = new l9();
        l9Var.b("image/jpeg");
        l9Var.o(new td0(-9223372036854775807L, tc0VarArr));
        w1VarF.e(l9Var.D());
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void e(long j8, long j9) {
        if (j8 == 0) {
            this.f8174c = 0;
            this.f8181j = null;
        } else if (this.f8174c == 5) {
            a7 a7Var = this.f8181j;
            a7Var.getClass();
            a7Var.e(j8, j9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    @Override // com.google.android.gms.internal.ads.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(com.google.android.gms.internal.ads.q0 r24, com.google.android.gms.internal.ads.n1 r25) throws com.google.android.gms.internal.ads.yh0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g3.f(com.google.android.gms.internal.ads.q0, com.google.android.gms.internal.ads.n1):int");
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final boolean g(q0 q0Var) throws EOFException, InterruptedIOException {
        if (a(q0Var) != 65496) {
            return false;
        }
        int iA = a(q0Var);
        this.f8175d = iA;
        if (iA == 65504) {
            this.f8172a.d(2);
            f0 f0Var = (f0) q0Var;
            f0Var.L(this.f8172a.i(), 0, 2, false);
            f0Var.c(this.f8172a.y() - 2, false);
            iA = a(q0Var);
            this.f8175d = iA;
        }
        if (iA == 65505) {
            f0 f0Var2 = (f0) q0Var;
            f0Var2.c(2, false);
            this.f8172a.d(6);
            f0Var2.L(this.f8172a.i(), 0, 6, false);
            if (this.f8172a.C() == 1165519206 && this.f8172a.y() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void h(s0 s0Var) {
        this.f8173b = s0Var;
    }
}
