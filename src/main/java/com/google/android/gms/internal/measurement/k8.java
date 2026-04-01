package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class k8 implements zc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h8 f18875a;

    private k8(h8 h8Var) {
        h8 h8Var2 = (h8) a9.f(h8Var, "output");
        this.f18875a = h8Var2;
        h8Var2.f18775a = this;
    }

    public static k8 P(h8 h8Var) {
        k8 k8Var = h8Var.f18775a;
        return k8Var != null ? k8Var : new k8(h8Var);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void A(int i8, o7 o7Var) {
        this.f18875a.p(i8, o7Var);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void B(int i8, int i9) {
        this.f18875a.f0(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void C(int i8, List<Integer> list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f18875a.n(i8, list.get(i9).intValue());
                i9++;
            }
            return;
        }
        this.f18875a.Z(i8, 2);
        int iG0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iG0 += h8.g0(list.get(i10).intValue());
        }
        this.f18875a.Y(iG0);
        while (i9 < list.size()) {
            this.f18875a.m(list.get(i9).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final <K, V> void D(int i8, ha<K, V> haVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f18875a.Z(i8, 2);
            this.f18875a.Y(ea.a(haVar, entry.getKey(), entry.getValue()));
            ea.b(this.f18875a, haVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void E(int i8, List<Integer> list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f18875a.f0(i8, list.get(i9).intValue());
                i9++;
            }
            return;
        }
        this.f18875a.Z(i8, 2);
        int iZ0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iZ0 += h8.z0(list.get(i10).intValue());
        }
        this.f18875a.Y(iZ0);
        while (i9 < list.size()) {
            this.f18875a.Y(list.get(i9).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void F(int i8, List<String> list) {
        int i9 = 0;
        if (!(list instanceof r9)) {
            while (i9 < list.size()) {
                this.f18875a.s(i8, list.get(i9));
                i9++;
            }
            return;
        }
        r9 r9Var = (r9) list;
        while (i9 < list.size()) {
            Object objD = r9Var.d(i9);
            if (objD instanceof String) {
                this.f18875a.s(i8, (String) objD);
            } else {
                this.f18875a.p(i8, (o7) objD);
            }
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void G(int i8, int i9) {
        this.f18875a.n(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void H(int i8, List<?> list, eb ebVar) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            z(i8, list.get(i9), ebVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void I(int i8, long j8) {
        this.f18875a.u0(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void J(int i8, Object obj, eb ebVar) {
        h8 h8Var = this.f18875a;
        h8Var.Z(i8, 3);
        ebVar.c((ma) obj, h8Var.f18775a);
        h8Var.Z(i8, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void K(int i8, List<Float> list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f18875a.N(i8, list.get(i9).floatValue());
                i9++;
            }
            return;
        }
        this.f18875a.Z(i8, 2);
        int iD = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iD += h8.d(list.get(i10).floatValue());
        }
        this.f18875a.Y(iD);
        while (i9 < list.size()) {
            this.f18875a.K(list.get(i9).floatValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void L(int i8, int i9) {
        this.f18875a.C0(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void M(int i8, long j8) {
        this.f18875a.P(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void N(int i8, List<o7> list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.f18875a.p(i8, list.get(i9));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void O(int i8, List<?> list, eb ebVar) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            J(i8, list.get(i9), ebVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void a(int i8, List<Integer> list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f18875a.O(i8, list.get(i9).intValue());
                i9++;
            }
            return;
        }
        this.f18875a.Z(i8, 2);
        int iB0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iB0 += h8.b0(list.get(i10).intValue());
        }
        this.f18875a.Y(iB0);
        while (i9 < list.size()) {
            this.f18875a.L(list.get(i9).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    @Deprecated
    public final void b(int i8) {
        this.f18875a.Z(i8, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void c(int i8, long j8) {
        this.f18875a.o(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    @Deprecated
    public final void d(int i8) {
        this.f18875a.Z(i8, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void e(int i8, List<Long> list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f18875a.u0(i8, list.get(i9).longValue());
                i9++;
            }
            return;
        }
        this.f18875a.Z(i8, 2);
        int iN0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iN0 += h8.n0(list.get(i10).longValue());
        }
        this.f18875a.Y(iN0);
        while (i9 < list.size()) {
            this.f18875a.v0(list.get(i9).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void f(int i8, String str) {
        this.f18875a.s(i8, str);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void g(int i8, List<Long> list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f18875a.o(i8, list.get(i9).longValue());
                i9++;
            }
            return;
        }
        this.f18875a.Z(i8, 2);
        int iJ0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iJ0 += h8.j0(list.get(i10).longValue());
        }
        this.f18875a.Y(iJ0);
        while (i9 < list.size()) {
            this.f18875a.u(list.get(i9).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void h(int i8, List<Long> list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f18875a.P(i8, list.get(i9).longValue());
                i9++;
            }
            return;
        }
        this.f18875a.Z(i8, 2);
        int iR0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iR0 += h8.r0(list.get(i10).longValue());
        }
        this.f18875a.Y(iR0);
        while (i9 < list.size()) {
            this.f18875a.R(list.get(i9).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void i(int i8, List<Integer> list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f18875a.O(i8, list.get(i9).intValue());
                i9++;
            }
            return;
        }
        this.f18875a.Z(i8, 2);
        int iK0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iK0 += h8.k0(list.get(i10).intValue());
        }
        this.f18875a.Y(iK0);
        while (i9 < list.size()) {
            this.f18875a.L(list.get(i9).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final int j() {
        return cd.f18627a;
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void k(int i8, boolean z7) {
        this.f18875a.t(i8, z7);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void l(int i8, List<Integer> list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f18875a.n(i8, list.get(i9).intValue());
                i9++;
            }
            return;
        }
        this.f18875a.Z(i8, 2);
        int iO0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iO0 += h8.o0(list.get(i10).intValue());
        }
        this.f18875a.Y(iO0);
        while (i9 < list.size()) {
            this.f18875a.m(list.get(i9).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void m(int i8, long j8) {
        this.f18875a.P(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void n(int i8, int i9) {
        this.f18875a.n(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void o(int i8, List<Boolean> list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f18875a.t(i8, list.get(i9).booleanValue());
                i9++;
            }
            return;
        }
        this.f18875a.Z(i8, 2);
        int iJ = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iJ += h8.j(list.get(i10).booleanValue());
        }
        this.f18875a.Y(iJ);
        while (i9 < list.size()) {
            this.f18875a.S(list.get(i9).booleanValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void p(int i8, List<Long> list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f18875a.P(i8, list.get(i9).longValue());
                i9++;
            }
            return;
        }
        this.f18875a.Z(i8, 2);
        int iE0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iE0 += h8.e0(list.get(i10).longValue());
        }
        this.f18875a.Y(iE0);
        while (i9 < list.size()) {
            this.f18875a.R(list.get(i9).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void q(int i8, int i9) {
        this.f18875a.O(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void r(int i8, long j8) {
        this.f18875a.o(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void s(int i8, Object obj) {
        if (obj instanceof o7) {
            this.f18875a.Q(i8, (o7) obj);
        } else {
            this.f18875a.q(i8, (ma) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void t(int i8, List<Double> list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f18875a.M(i8, list.get(i9).doubleValue());
                i9++;
            }
            return;
        }
        this.f18875a.Z(i8, 2);
        int iC = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iC += h8.c(list.get(i10).doubleValue());
        }
        this.f18875a.Y(iC);
        while (i9 < list.size()) {
            this.f18875a.J(list.get(i9).doubleValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void u(int i8, List<Integer> list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f18875a.C0(i8, list.get(i9).intValue());
                i9++;
            }
            return;
        }
        this.f18875a.Z(i8, 2);
        int iS0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iS0 += h8.s0(list.get(i10).intValue());
        }
        this.f18875a.Y(iS0);
        while (i9 < list.size()) {
            this.f18875a.B0(list.get(i9).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void v(int i8, int i9) {
        this.f18875a.O(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void w(int i8, double d8) {
        this.f18875a.M(i8, d8);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void x(int i8, float f8) {
        this.f18875a.N(i8, f8);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void y(int i8, List<Long> list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f18875a.o(i8, list.get(i9).longValue());
                i9++;
            }
            return;
        }
        this.f18875a.Z(i8, 2);
        int iW = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iW += h8.W(list.get(i10).longValue());
        }
        this.f18875a.Y(iW);
        while (i9 < list.size()) {
            this.f18875a.u(list.get(i9).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void z(int i8, Object obj, eb ebVar) {
        this.f18875a.r(i8, (ma) obj, ebVar);
    }
}
