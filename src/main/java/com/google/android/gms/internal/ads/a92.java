package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class a92 implements x22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nt f5124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg3 f5125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bx2 f5126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k92 f5127d;

    public a92(bx2 bx2Var, lg3 lg3Var, nt ntVar, k92 k92Var) {
        this.f5126c = bx2Var;
        this.f5125b = lg3Var;
        this.f5124a = ntVar;
        this.f5127d = k92Var;
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final x3.d a(ks2 ks2Var, wr2 wr2Var) {
        jh0 jh0Var = new jh0();
        f92 f92Var = new f92();
        f92Var.b(new z82(this, jh0Var, ks2Var, wr2Var, f92Var));
        cs2 cs2Var = wr2Var.f16905u;
        final ht htVar = new ht(f92Var, cs2Var.f6466b, cs2Var.f6465a);
        vw2 vw2Var = vw2.CUSTOM_RENDER_SYN;
        return lw2.d(new ew2() { // from class: com.google.android.gms.internal.ads.y82
            @Override // com.google.android.gms.internal.ads.ew2
            public final void j() {
                this.f17634a.c(htVar);
            }
        }, this.f5125b, vw2Var, this.f5126c).b(vw2.CUSTOM_RENDER_ACK).d(jh0Var).a();
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final boolean b(ks2 ks2Var, wr2 wr2Var) {
        cs2 cs2Var;
        return (this.f5124a == null || (cs2Var = wr2Var.f16905u) == null || cs2Var.f6465a == null) ? false : true;
    }

    final /* synthetic */ void c(ht htVar) {
        this.f5124a.V0(htVar);
    }
}
