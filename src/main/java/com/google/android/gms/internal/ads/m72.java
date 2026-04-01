package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class m72 implements e32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pm1 f11200b;

    public m72(Context context, pm1 pm1Var) {
        this.f11199a = context;
        this.f11200b = pm1Var;
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final void a(ks2 ks2Var, wr2 wr2Var, a32 a32Var) {
        try {
            ((y60) a32Var.f5001b).j5(wr2Var.f16868b0);
            if (ks2Var.f10322a.f8947a.f15313o.f8488a == 3) {
                ((y60) a32Var.f5001b).T2(wr2Var.W, wr2Var.f16909x.toString(), ks2Var.f10322a.f8947a.f15302d, g3.b.k3(this.f11199a), new l72(this, a32Var, null), (g50) a32Var.f5002c);
            } else {
                ((y60) a32Var.f5001b).l3(wr2Var.W, wr2Var.f16909x.toString(), ks2Var.f10322a.f8947a.f15302d, g3.b.k3(this.f11199a), new l72(this, a32Var, null), (g50) a32Var.f5002c);
            }
        } catch (RemoteException e8) {
            j2.v1.l("Remote exception loading a rewarded RTB ad", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final /* bridge */ /* synthetic */ Object b(ks2 ks2Var, wr2 wr2Var, a32 a32Var) {
        e52 e52Var = new e52(wr2Var, (y60) a32Var.f5001b, z1.b.REWARDED);
        km1 km1VarB = this.f11200b.b(new d01(ks2Var, wr2Var, a32Var.f5000a), new lm1(e52Var));
        e52Var.b(km1VarB.b());
        ((v42) a32Var.f5002c).P5(km1VarB.n());
        return km1VarB.k();
    }
}
