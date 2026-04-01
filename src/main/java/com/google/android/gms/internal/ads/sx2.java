package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sx2 implements mx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx2 f14854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ux2 f14855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ix2 f14856c;

    public sx2(ix2 ix2Var, wx2 wx2Var, ux2 ux2Var) {
        this.f14856c = ix2Var;
        this.f14854a = wx2Var;
        this.f14855b = ux2Var;
    }

    @Override // com.google.android.gms.internal.ads.mx2
    public final void a(lx2 lx2Var) {
        this.f14856c.b(b(lx2Var));
    }

    @Override // com.google.android.gms.internal.ads.mx2
    public final String b(lx2 lx2Var) {
        ux2 ux2Var = this.f14855b;
        Map mapJ = lx2Var.j();
        ux2Var.a(mapJ);
        return this.f14854a.a(mapJ);
    }
}
