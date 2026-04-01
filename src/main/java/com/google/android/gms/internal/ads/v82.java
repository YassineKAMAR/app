package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class v82 implements x22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hy0 f16062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nt f16063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final lg3 f16064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bx2 f16065e;

    public v82(Context context, hy0 hy0Var, bx2 bx2Var, lg3 lg3Var, nt ntVar) {
        this.f16061a = context;
        this.f16062b = hy0Var;
        this.f16065e = bx2Var;
        this.f16064d = lg3Var;
        this.f16063c = ntVar;
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final x3.d a(ks2 ks2Var, wr2 wr2Var) {
        t82 t82Var = new t82(this, new View(this.f16061a), null, new lz0() { // from class: com.google.android.gms.internal.ads.r82
            @Override // com.google.android.gms.internal.ads.lz0
            public final h2.p2 j() {
                return null;
            }
        }, (xr2) wr2Var.f16908w.get(0));
        kx0 kx0VarA = this.f16062b.a(new d01(ks2Var, wr2Var, null), t82Var);
        u82 u82VarK = kx0VarA.k();
        cs2 cs2Var = wr2Var.f16905u;
        final ht htVar = new ht(u82VarK, cs2Var.f6466b, cs2Var.f6465a);
        vw2 vw2Var = vw2.CUSTOM_RENDER_SYN;
        return lw2.d(new ew2() { // from class: com.google.android.gms.internal.ads.s82
            @Override // com.google.android.gms.internal.ads.ew2
            public final void j() {
                this.f14565a.c(htVar);
            }
        }, this.f16064d, vw2Var, this.f16065e).b(vw2.CUSTOM_RENDER_ACK).d(zf3.h(kx0VarA.h())).a();
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final boolean b(ks2 ks2Var, wr2 wr2Var) {
        cs2 cs2Var;
        return (this.f16063c == null || (cs2Var = wr2Var.f16905u) == null || cs2Var.f6465a == null) ? false : true;
    }

    final /* synthetic */ void c(ht htVar) {
        this.f16063c.V0(htVar);
    }
}
