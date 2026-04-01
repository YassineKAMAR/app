package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class w0 implements l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f19723a;

    private w0(v0 v0Var) {
        byte[] bArr = s1.f19671d;
        this.f19723a = v0Var;
        v0Var.f19702a = this;
    }

    public static w0 J(v0 v0Var) {
        w0 w0Var = v0Var.f19702a;
        return w0Var != null ? w0Var : new w0(v0Var);
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void A(int i8, float f8) {
        this.f19723a.h(i8, Float.floatToRawIntBits(f8));
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void B(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                v0 v0Var = this.f19723a;
                int iIntValue = ((Integer) list.get(i9)).intValue();
                v0Var.q(i8, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i9++;
            }
            return;
        }
        this.f19723a.p(i8, 2);
        int iY = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int iIntValue2 = ((Integer) list.get(i10)).intValue();
            iY += v0.y((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.f19723a.r(iY);
        while (i9 < list.size()) {
            v0 v0Var2 = this.f19723a;
            int iIntValue3 = ((Integer) list.get(i9)).intValue();
            v0Var2.r((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void C(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f19723a.s(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f19723a.p(i8, 2);
        int iZ = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iZ += v0.z(((Long) list.get(i10)).longValue());
        }
        this.f19723a.r(iZ);
        while (i9 < list.size()) {
            this.f19723a.t(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void D(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f19723a.s(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f19723a.p(i8, 2);
        int iZ = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iZ += v0.z(((Long) list.get(i10)).longValue());
        }
        this.f19723a.r(iZ);
        while (i9 < list.size()) {
            this.f19723a.t(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void E(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f19723a.h(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f19723a.p(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Integer) list.get(i11)).intValue();
            i10 += 4;
        }
        this.f19723a.r(i10);
        while (i9 < list.size()) {
            this.f19723a.i(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void F(int i8, long j8) {
        this.f19723a.s(i8, j8);
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void G(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f19723a.h(i8, Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
                i9++;
            }
            return;
        }
        this.f19723a.p(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Float) list.get(i11)).floatValue();
            i10 += 4;
        }
        this.f19723a.r(i10);
        while (i9 < list.size()) {
            this.f19723a.i(Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void H(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                v0 v0Var = this.f19723a;
                long jLongValue = ((Long) list.get(i9)).longValue();
                v0Var.s(i8, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i9++;
            }
            return;
        }
        this.f19723a.p(i8, 2);
        int iZ = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            long jLongValue2 = ((Long) list.get(i10)).longValue();
            iZ += v0.z((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f19723a.r(iZ);
        while (i9 < list.size()) {
            v0 v0Var2 = this.f19723a;
            long jLongValue3 = ((Long) list.get(i9)).longValue();
            v0Var2.t((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void I(int i8, long j8) {
        this.f19723a.s(i8, (j8 >> 63) ^ (j8 + j8));
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    @Deprecated
    public final void S(int i8) {
        this.f19723a.p(i8, 4);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.play_billing.l4
    public final void a(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f19723a.f(i8, ((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
            return;
        }
        this.f19723a.p(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Boolean) list.get(i11)).booleanValue();
            i10++;
        }
        this.f19723a.r(i10);
        while (i9 < list.size()) {
            this.f19723a.e(((Boolean) list.get(i9)).booleanValue() ? (byte) 1 : (byte) 0);
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    @Deprecated
    public final void b(int i8) {
        this.f19723a.p(i8, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void c(int i8, int i9) {
        this.f19723a.q(i8, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void d(int i8, long j8) {
        this.f19723a.j(i8, j8);
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void e(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f19723a.h(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f19723a.p(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Integer) list.get(i11)).intValue();
            i10 += 4;
        }
        this.f19723a.r(i10);
        while (i9 < list.size()) {
            this.f19723a.i(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void f(int i8, int i9) {
        this.f19723a.h(i8, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void g(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f19723a.l(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f19723a.p(i8, 2);
        int iV = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iV += v0.v(((Integer) list.get(i10)).intValue());
        }
        this.f19723a.r(iV);
        while (i9 < list.size()) {
            this.f19723a.m(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void h(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f19723a.j(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f19723a.p(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).longValue();
            i10 += 8;
        }
        this.f19723a.r(i10);
        while (i9 < list.size()) {
            this.f19723a.k(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void i(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f19723a.j(i8, Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
                i9++;
            }
            return;
        }
        this.f19723a.p(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Double) list.get(i11)).doubleValue();
            i10 += 8;
        }
        this.f19723a.r(i10);
        while (i9 < list.size()) {
            this.f19723a.k(Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void j(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f19723a.j(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f19723a.p(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).longValue();
            i10 += 8;
        }
        this.f19723a.r(i10);
        while (i9 < list.size()) {
            this.f19723a.k(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void k(int i8, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.f19723a.g(i8, (n0) list.get(i9));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void l(int i8, int i9) {
        this.f19723a.h(i8, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void m(int i8, boolean z7) {
        this.f19723a.f(i8, z7);
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void n(int i8, n0 n0Var) {
        this.f19723a.g(i8, n0Var);
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void o(int i8, int i9) {
        this.f19723a.q(i8, (i9 >> 31) ^ (i9 + i9));
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void p(int i8, String str) {
        this.f19723a.o(i8, str);
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void q(int i8, long j8) {
        this.f19723a.s(i8, j8);
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void r(int i8, Object obj, b3 b3Var) {
        v0 v0Var = this.f19723a;
        v0Var.p(i8, 3);
        b3Var.g((r2) obj, v0Var.f19702a);
        v0Var.p(i8, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void s(int i8, long j8) {
        this.f19723a.j(i8, j8);
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void t(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f19723a.q(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f19723a.p(i8, 2);
        int iY = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iY += v0.y(((Integer) list.get(i10)).intValue());
        }
        this.f19723a.r(iY);
        while (i9 < list.size()) {
            this.f19723a.r(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void u(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f19723a.l(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f19723a.p(i8, 2);
        int iV = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iV += v0.v(((Integer) list.get(i10)).intValue());
        }
        this.f19723a.r(iV);
        while (i9 < list.size()) {
            this.f19723a.m(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void v(int i8, int i9) {
        this.f19723a.l(i8, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void w(int i8, int i9) {
        this.f19723a.l(i8, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void x(int i8, List list) {
        int i9 = 0;
        if (!(list instanceof y1)) {
            while (i9 < list.size()) {
                this.f19723a.o(i8, (String) list.get(i9));
                i9++;
            }
            return;
        }
        y1 y1Var = (y1) list;
        while (i9 < list.size()) {
            Object objC = y1Var.c(i9);
            if (objC instanceof String) {
                this.f19723a.o(i8, (String) objC);
            } else {
                this.f19723a.g(i8, (n0) objC);
            }
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void y(int i8, Object obj, b3 b3Var) {
        r2 r2Var = (r2) obj;
        s0 s0Var = (s0) this.f19723a;
        s0Var.r((i8 << 3) | 2);
        s0Var.r(((x) r2Var).a(b3Var));
        b3Var.g(r2Var, s0Var.f19702a);
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void z(int i8, double d8) {
        this.f19723a.j(i8, Double.doubleToRawLongBits(d8));
    }
}
