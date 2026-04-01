package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class f9 implements p9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nb f7670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kx2 f7671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w1 f7672c;

    public f9(String str) {
        l9 l9Var = new l9();
        l9Var.u(str);
        this.f7670a = l9Var.D();
    }

    @Override // com.google.android.gms.internal.ads.p9
    public final void a(dq2 dq2Var) {
        uu1.b(this.f7671b);
        int i8 = nz2.f12300a;
        long jD = this.f7671b.d();
        long jE = this.f7671b.e();
        if (jD == -9223372036854775807L || jE == -9223372036854775807L) {
            return;
        }
        nb nbVar = this.f7670a;
        if (jE != nbVar.f11797p) {
            l9 l9VarB = nbVar.b();
            l9VarB.y(jE);
            nb nbVarD = l9VarB.D();
            this.f7670a = nbVarD;
            this.f7672c.e(nbVarD);
        }
        int iJ = dq2Var.j();
        this.f7672c.d(dq2Var, iJ);
        this.f7672c.a(jD, 1, iJ, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.p9
    public final void b(kx2 kx2Var, s0 s0Var, ca caVar) {
        this.f7671b = kx2Var;
        caVar.c();
        w1 w1VarF = s0Var.f(caVar.a(), 5);
        this.f7672c = w1VarF;
        w1VarF.e(this.f7670a);
    }
}
