package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class sw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mx2 f14838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final eq1 f14839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ks2 f14840c;

    public sw0(eq1 eq1Var, ks2 ks2Var, mx2 mx2Var) {
        this.f14838a = mx2Var;
        this.f14839b = eq1Var;
        this.f14840c = ks2Var;
    }

    private static String b(int i8) {
        int i9 = i8 - 1;
        return i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void a(long j8, int i8) {
        if (((Boolean) h2.y.c().b(ns.r8)).booleanValue()) {
            mx2 mx2Var = this.f14838a;
            ks2 ks2Var = this.f14840c;
            lx2 lx2VarB = lx2.b("ad_closed");
            lx2VarB.g(ks2Var.f10323b.f9793b);
            lx2VarB.a("show_time", String.valueOf(j8));
            lx2VarB.a("ad_format", "app_open_ad");
            lx2VarB.a("acr", b(i8));
            mx2Var.a(lx2VarB);
            return;
        }
        eq1 eq1Var = this.f14839b;
        ks2 ks2Var2 = this.f14840c;
        dq1 dq1VarA = eq1Var.a();
        dq1VarA.e(ks2Var2.f10323b.f9793b);
        dq1VarA.b("action", "ad_closed");
        dq1VarA.b("show_time", String.valueOf(j8));
        dq1VarA.b("ad_format", "app_open_ad");
        dq1VarA.b("acr", b(i8));
        dq1VarA.g();
    }
}
