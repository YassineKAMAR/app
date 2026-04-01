package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p7 implements p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w0 f12762d = new w0() { // from class: com.google.android.gms.internal.ads.o7
        @Override // com.google.android.gms.internal.ads.w0
        public final /* synthetic */ p0[] a(Uri uri, Map map) {
            int i8 = v0.f15946a;
            return new p0[]{new p7()};
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s0 f12763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x7 f12764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12765c;

    private final boolean a(q0 q0Var) {
        x7 t7Var;
        r7 r7Var = new r7();
        if (r7Var.b(q0Var, true) && (r7Var.f13956a & 2) == 2) {
            int iMin = Math.min(r7Var.f13960e, 8);
            dq2 dq2Var = new dq2(iMin);
            ((f0) q0Var).L(dq2Var.i(), 0, iMin, false);
            dq2Var.g(0);
            if (dq2Var.j() >= 5 && dq2Var.u() == 127 && dq2Var.C() == 1179402563) {
                t7Var = new n7();
            } else {
                dq2Var.g(0);
                if (c2.d(1, dq2Var, true)) {
                    t7Var = new z7();
                } else {
                    dq2Var.g(0);
                    if (t7.j(dq2Var)) {
                        t7Var = new t7();
                    }
                }
            }
            this.f12764b = t7Var;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void e(long j8, long j9) {
        x7 x7Var = this.f12764b;
        if (x7Var != null) {
            x7Var.i(j8, j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final int f(q0 q0Var, n1 n1Var) throws yh0 {
        uu1.b(this.f12763a);
        if (this.f12764b == null) {
            if (!a(q0Var)) {
                throw yh0.a("Failed to determine bitstream type", null);
            }
            q0Var.t();
        }
        if (!this.f12765c) {
            w1 w1VarF = this.f12763a.f(0, 1);
            this.f12763a.d();
            this.f12764b.g(this.f12763a, w1VarF);
            this.f12765c = true;
        }
        return this.f12764b.d(q0Var, n1Var);
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final boolean g(q0 q0Var) {
        try {
            return a(q0Var);
        } catch (yh0 unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void h(s0 s0Var) {
        this.f12763a = s0Var;
    }
}
