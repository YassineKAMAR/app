package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zx2 implements mx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx2 f18508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ux2 f18509b;

    public zx2(wx2 wx2Var, ux2 ux2Var) {
        this.f18508a = wx2Var;
        this.f18509b = ux2Var;
    }

    @Override // com.google.android.gms.internal.ads.mx2
    public final void a(lx2 lx2Var) {
    }

    @Override // com.google.android.gms.internal.ads.mx2
    public final String b(lx2 lx2Var) {
        ux2 ux2Var = this.f18509b;
        Map mapJ = lx2Var.j();
        ux2Var.a(mapJ);
        return this.f18508a.a(mapJ);
    }
}
