package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class e3 extends d3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq2 f7105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dq2 f7106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7110g;

    public e3(w1 w1Var) {
        super(w1Var);
        this.f7105b = new dq2(sd3.f14624a);
        this.f7106c = new dq2(4);
    }

    @Override // com.google.android.gms.internal.ads.d3
    protected final boolean a(dq2 dq2Var) throws c3 {
        int iU = dq2Var.u();
        int i8 = iU >> 4;
        int i9 = iU & 15;
        if (i9 == 7) {
            this.f7110g = i8;
            return i8 != 5;
        }
        throw new c3("Video format not supported: " + i9);
    }

    @Override // com.google.android.gms.internal.ads.d3
    protected final boolean b(dq2 dq2Var, long j8) throws yh0 {
        int iU = dq2Var.u();
        long jP = dq2Var.p();
        if (iU == 0) {
            if (!this.f7108e) {
                dq2 dq2Var2 = new dq2(new byte[dq2Var.j()]);
                dq2Var.c(dq2Var2.i(), 0, dq2Var.j());
                t tVarA = t.a(dq2Var2);
                this.f7107d = tVarA.f14885b;
                l9 l9Var = new l9();
                l9Var.u("video/avc");
                l9Var.l0(tVarA.f14892i);
                l9Var.C(tVarA.f14886c);
                l9Var.h(tVarA.f14887d);
                l9Var.r(tVarA.f14891h);
                l9Var.k(tVarA.f14884a);
                this.f6549a.e(l9Var.D());
                this.f7108e = true;
                return false;
            }
        } else if (iU == 1 && this.f7108e) {
            int i8 = this.f7110g == 1 ? 1 : 0;
            if (!this.f7109f && i8 == 0) {
                return false;
            }
            byte[] bArrI = this.f7106c.i();
            bArrI[0] = 0;
            bArrI[1] = 0;
            bArrI[2] = 0;
            int i9 = 4 - this.f7107d;
            int i10 = 0;
            while (dq2Var.j() > 0) {
                dq2Var.c(this.f7106c.i(), i9, this.f7107d);
                this.f7106c.g(0);
                dq2 dq2Var3 = this.f7106c;
                dq2 dq2Var4 = this.f7105b;
                int iX = dq2Var3.x();
                dq2Var4.g(0);
                this.f6549a.d(this.f7105b, 4);
                this.f6549a.d(dq2Var, iX);
                i10 = i10 + 4 + iX;
            }
            this.f6549a.a(j8 + (jP * 1000), i8, i10, 0, null);
            this.f7109f = true;
            return true;
        }
        return false;
    }
}
