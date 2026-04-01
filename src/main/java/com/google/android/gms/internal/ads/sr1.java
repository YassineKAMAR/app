package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class sr1 implements fr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final db2 f14799b;

    sr1(long j8, Context context, kr1 kr1Var, bo0 bo0Var, String str) {
        this.f14798a = j8;
        zp2 zp2VarY = bo0Var.y();
        zp2VarY.b(context);
        zp2VarY.a(new h2.w4());
        zp2VarY.c(str);
        db2 db2VarJ = zp2VarY.p().j();
        this.f14799b = db2VarJ;
        db2VarJ.S1(new qr1(this, kr1Var));
    }

    @Override // com.google.android.gms.internal.ads.fr1
    public final void a(h2.r4 r4Var) {
        this.f14799b.v2(r4Var);
    }

    @Override // com.google.android.gms.internal.ads.fr1
    public final void j() {
        this.f14799b.D();
    }

    @Override // com.google.android.gms.internal.ads.fr1
    public final void l() {
        this.f14799b.s4(g3.b.k3(null));
    }
}
