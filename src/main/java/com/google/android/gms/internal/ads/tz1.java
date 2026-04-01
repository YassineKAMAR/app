package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class tz1 implements lb1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mx2 f15405d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f15402a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f15403b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j2.x1 f15406e = g2.t.q().h();

    public tz1(String str, mx2 mx2Var) {
        this.f15404c = str;
        this.f15405d = mx2Var;
    }

    private final lx2 c(String str) {
        String str2 = this.f15406e.F0() ? "" : this.f15404c;
        lx2 lx2VarB = lx2.b(str);
        lx2VarB.a("tms", Long.toString(g2.t.b().b(), 10));
        lx2VarB.a("tid", str2);
        return lx2VarB;
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void a(String str) {
        lx2 lx2VarC = c("aaia");
        lx2VarC.a("aair", "MalformedJson");
        this.f15405d.a(lx2VarC);
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void b(String str, String str2) {
        lx2 lx2VarC = c("adapter_init_finished");
        lx2VarC.a("ancn", str);
        lx2VarC.a("rqe", str2);
        this.f15405d.a(lx2VarC);
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void e(String str) {
        lx2 lx2VarC = c("adapter_init_started");
        lx2VarC.a("ancn", str);
        this.f15405d.a(lx2VarC);
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void h(String str) {
        lx2 lx2VarC = c("adapter_init_finished");
        lx2VarC.a("ancn", str);
        this.f15405d.a(lx2VarC);
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final synchronized void m() {
        if (this.f15403b) {
            return;
        }
        this.f15405d.a(c("init_finished"));
        this.f15403b = true;
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final synchronized void n() {
        if (this.f15402a) {
            return;
        }
        this.f15405d.a(c("init_started"));
        this.f15402a = true;
    }
}
