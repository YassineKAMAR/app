package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class i04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h04 f9036a;

    private i04(h04 h04Var) {
        byte[] bArr = k14.f9887d;
        this.f9036a = h04Var;
        h04Var.f8590a = this;
    }

    public static i04 l(h04 h04Var) {
        i04 i04Var = h04Var.f8590a;
        return i04Var != null ? i04Var : new i04(h04Var);
    }

    public final void A(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9036a.m(i8, Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
                i9++;
            }
            return;
        }
        this.f9036a.u(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Float) list.get(i11)).floatValue();
            i10 += 4;
        }
        this.f9036a.w(i10);
        while (i9 < list.size()) {
            this.f9036a.n(Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
            i9++;
        }
    }

    public final void B(int i8, Object obj, e34 e34Var) {
        h04 h04Var = this.f9036a;
        h04Var.u(i8, 3);
        e34Var.h((k24) obj, h04Var.f8590a);
        h04Var.u(i8, 4);
    }

    public final void C(int i8, int i9) {
        this.f9036a.q(i8, i9);
    }

    public final void D(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9036a.q(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f9036a.u(i8, 2);
        int iA = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iA += h04.A(((Integer) list.get(i10)).intValue());
        }
        this.f9036a.w(iA);
        while (i9 < list.size()) {
            this.f9036a.r(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public final void E(int i8, long j8) {
        this.f9036a.x(i8, j8);
    }

    public final void F(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9036a.x(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f9036a.u(i8, 2);
        int iC = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iC += h04.c(((Long) list.get(i10)).longValue());
        }
        this.f9036a.w(iC);
        while (i9 < list.size()) {
            this.f9036a.y(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public final void G(int i8, Object obj, e34 e34Var) {
        this.f9036a.s(i8, (k24) obj, e34Var);
    }

    public final void H(int i8, int i9) {
        this.f9036a.m(i8, i9);
    }

    public final void I(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9036a.m(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f9036a.u(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Integer) list.get(i11)).intValue();
            i10 += 4;
        }
        this.f9036a.w(i10);
        while (i9 < list.size()) {
            this.f9036a.n(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public final void J(int i8, long j8) {
        this.f9036a.o(i8, j8);
    }

    public final void K(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9036a.o(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f9036a.u(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).longValue();
            i10 += 8;
        }
        this.f9036a.w(i10);
        while (i9 < list.size()) {
            this.f9036a.p(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public final void a(int i8, int i9) {
        this.f9036a.v(i8, (i9 >> 31) ^ (i9 + i9));
    }

    public final void b(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                h04 h04Var = this.f9036a;
                int iIntValue = ((Integer) list.get(i9)).intValue();
                h04Var.v(i8, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i9++;
            }
            return;
        }
        this.f9036a.u(i8, 2);
        int iB = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int iIntValue2 = ((Integer) list.get(i10)).intValue();
            iB += h04.b((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.f9036a.w(iB);
        while (i9 < list.size()) {
            h04 h04Var2 = this.f9036a;
            int iIntValue3 = ((Integer) list.get(i9)).intValue();
            h04Var2.w((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i9++;
        }
    }

    public final void c(int i8, long j8) {
        this.f9036a.x(i8, (j8 >> 63) ^ (j8 + j8));
    }

    public final void d(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                h04 h04Var = this.f9036a;
                long jLongValue = ((Long) list.get(i9)).longValue();
                h04Var.x(i8, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i9++;
            }
            return;
        }
        this.f9036a.u(i8, 2);
        int iC = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            long jLongValue2 = ((Long) list.get(i10)).longValue();
            iC += h04.c((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f9036a.w(iC);
        while (i9 < list.size()) {
            h04 h04Var2 = this.f9036a;
            long jLongValue3 = ((Long) list.get(i9)).longValue();
            h04Var2.y((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i9++;
        }
    }

    @Deprecated
    public final void e(int i8) {
        this.f9036a.u(i8, 3);
    }

    public final void f(int i8, String str) {
        this.f9036a.t(i8, str);
    }

    public final void g(int i8, List list) {
        int i9 = 0;
        if (!(list instanceof r14)) {
            while (i9 < list.size()) {
                this.f9036a.t(i8, (String) list.get(i9));
                i9++;
            }
            return;
        }
        r14 r14Var = (r14) list;
        while (i9 < list.size()) {
            Object objC = r14Var.c(i9);
            if (objC instanceof String) {
                this.f9036a.t(i8, (String) objC);
            } else {
                this.f9036a.k(i8, (rz3) objC);
            }
            i9++;
        }
    }

    public final void h(int i8, int i9) {
        this.f9036a.v(i8, i9);
    }

    public final void i(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9036a.v(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f9036a.u(i8, 2);
        int iB = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iB += h04.b(((Integer) list.get(i10)).intValue());
        }
        this.f9036a.w(iB);
        while (i9 < list.size()) {
            this.f9036a.w(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public final void j(int i8, long j8) {
        this.f9036a.x(i8, j8);
    }

    public final void k(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9036a.x(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f9036a.u(i8, 2);
        int iC = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iC += h04.c(((Long) list.get(i10)).longValue());
        }
        this.f9036a.w(iC);
        while (i9 < list.size()) {
            this.f9036a.y(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public final void m(int i8, boolean z7) {
        this.f9036a.j(i8, z7);
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
    public final void n(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9036a.j(i8, ((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
            return;
        }
        this.f9036a.u(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Boolean) list.get(i11)).booleanValue();
            i10++;
        }
        this.f9036a.w(i10);
        while (i9 < list.size()) {
            this.f9036a.i(((Boolean) list.get(i9)).booleanValue() ? (byte) 1 : (byte) 0);
            i9++;
        }
    }

    public final void o(int i8, rz3 rz3Var) {
        this.f9036a.k(i8, rz3Var);
    }

    public final void p(int i8, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.f9036a.k(i8, (rz3) list.get(i9));
        }
    }

    public final void q(int i8, double d8) {
        this.f9036a.o(i8, Double.doubleToRawLongBits(d8));
    }

    public final void r(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9036a.o(i8, Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
                i9++;
            }
            return;
        }
        this.f9036a.u(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Double) list.get(i11)).doubleValue();
            i10 += 8;
        }
        this.f9036a.w(i10);
        while (i9 < list.size()) {
            this.f9036a.p(Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
            i9++;
        }
    }

    @Deprecated
    public final void s(int i8) {
        this.f9036a.u(i8, 4);
    }

    public final void t(int i8, int i9) {
        this.f9036a.q(i8, i9);
    }

    public final void u(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9036a.q(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f9036a.u(i8, 2);
        int iA = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iA += h04.A(((Integer) list.get(i10)).intValue());
        }
        this.f9036a.w(iA);
        while (i9 < list.size()) {
            this.f9036a.r(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public final void v(int i8, int i9) {
        this.f9036a.m(i8, i9);
    }

    public final void w(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9036a.m(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f9036a.u(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Integer) list.get(i11)).intValue();
            i10 += 4;
        }
        this.f9036a.w(i10);
        while (i9 < list.size()) {
            this.f9036a.n(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public final void x(int i8, long j8) {
        this.f9036a.o(i8, j8);
    }

    public final void y(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9036a.o(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f9036a.u(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).longValue();
            i10 += 8;
        }
        this.f9036a.w(i10);
        while (i9 < list.size()) {
            this.f9036a.p(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public final void z(int i8, float f8) {
        this.f9036a.m(i8, Float.floatToRawIntBits(f8));
    }
}
