package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class l52 implements e32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ce1 f10462b;

    public l52(Context context, ce1 ce1Var) {
        this.f10461a = context;
        this.f10462b = ce1Var;
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final void a(ks2 ks2Var, wr2 wr2Var, a32 a32Var) throws ys2 {
        try {
            ((y60) a32Var.f5001b).j5(wr2Var.f16868b0);
            ((y60) a32Var.f5001b).s2(wr2Var.W, wr2Var.f16909x.toString(), ks2Var.f10322a.f8947a.f15302d, g3.b.k3(this.f10461a), new k52(this, a32Var, null), (g50) a32Var.f5002c);
        } catch (RemoteException e8) {
            j2.v1.l("Remote exception loading a interstitial RTB ad", e8);
            throw new ys2(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final /* bridge */ /* synthetic */ Object b(ks2 ks2Var, wr2 wr2Var, a32 a32Var) {
        e52 e52Var = new e52(wr2Var, (y60) a32Var.f5001b, z1.b.INTERSTITIAL);
        bd1 bd1VarC = this.f10462b.c(new d01(ks2Var, wr2Var, a32Var.f5000a), new fd1(e52Var, null));
        e52Var.b(bd1VarC.b());
        ((v42) a32Var.f5002c).P5(bd1VarC.f());
        return bd1VarC.i();
    }
}
