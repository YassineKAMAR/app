package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class w62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kt2 f16648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final un1 f16649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final eq1 f16650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mx2 f16651d;

    public w62(kt2 kt2Var, un1 un1Var, eq1 eq1Var, mx2 mx2Var) {
        this.f16648a = kt2Var;
        this.f16649b = un1Var;
        this.f16650c = eq1Var;
        this.f16651d = mx2Var;
    }

    public final void a(as2 as2Var, wr2 wr2Var, int i8, b32 b32Var, long j8) {
        if (((Boolean) h2.y.c().b(ns.r8)).booleanValue()) {
            lx2 lx2VarB = lx2.b("adapter_status");
            lx2VarB.g(as2Var);
            lx2VarB.f(wr2Var);
            lx2VarB.a("adapter_l", String.valueOf(j8));
            lx2VarB.a("sc", Integer.toString(i8));
            if (b32Var != null) {
                lx2VarB.a("arec", Integer.toString(b32Var.b().f22383a));
                String strA = this.f16648a.a(b32Var.getMessage());
                if (strA != null) {
                    lx2VarB.a("areec", strA);
                }
            }
            tn1 tn1VarB = this.f16649b.b(wr2Var.f16907v);
            if (tn1VarB != null) {
                lx2VarB.a("ancn", tn1VarB.f15171a);
                m70 m70Var = tn1VarB.f15172b;
                if (m70Var != null) {
                    lx2VarB.a("adapter_v", m70Var.toString());
                }
                m70 m70Var2 = tn1VarB.f15173c;
                if (m70Var2 != null) {
                    lx2VarB.a("adapter_sv", m70Var2.toString());
                }
            }
            this.f16651d.a(lx2VarB);
            return;
        }
        dq1 dq1VarA = this.f16650c.a();
        dq1VarA.e(as2Var);
        dq1VarA.d(wr2Var);
        dq1VarA.b("action", "adapter_status");
        dq1VarA.b("adapter_l", String.valueOf(j8));
        dq1VarA.b("sc", Integer.toString(i8));
        if (b32Var != null) {
            dq1VarA.b("arec", Integer.toString(b32Var.b().f22383a));
            String strA2 = this.f16648a.a(b32Var.getMessage());
            if (strA2 != null) {
                dq1VarA.b("areec", strA2);
            }
        }
        tn1 tn1VarB2 = this.f16649b.b(wr2Var.f16907v);
        if (tn1VarB2 != null) {
            dq1VarA.b("ancn", tn1VarB2.f15171a);
            m70 m70Var3 = tn1VarB2.f15172b;
            if (m70Var3 != null) {
                dq1VarA.b("adapter_v", m70Var3.toString());
            }
            m70 m70Var4 = tn1VarB2.f15173c;
            if (m70Var4 != null) {
                dq1VarA.b("adapter_sv", m70Var4.toString());
            }
        }
        dq1VarA.g();
    }
}
