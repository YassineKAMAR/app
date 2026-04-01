package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class r32 implements e32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xw0 f13882b;

    r32(Context context, xw0 xw0Var) {
        this.f13881a = context;
        this.f13882b = xw0Var;
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final void a(ks2 ks2Var, wr2 wr2Var, a32 a32Var) throws ys2 {
        try {
            ((y60) a32Var.f5001b).j5(wr2Var.f16868b0);
            ((y60) a32Var.f5001b).E1(wr2Var.W, wr2Var.f16909x.toString(), ks2Var.f10322a.f8947a.f15302d, g3.b.k3(this.f13881a), new q32(a32Var, null), (g50) a32Var.f5002c);
        } catch (RemoteException e8) {
            j2.v1.l("Remote exception loading an app open RTB ad", e8);
            throw new ys2(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final /* bridge */ /* synthetic */ Object b(ks2 ks2Var, wr2 wr2Var, a32 a32Var) {
        e52 e52Var = new e52(wr2Var, (y60) a32Var.f5001b, z1.b.APP_OPEN_AD);
        uw0 uw0VarA = this.f13882b.a(new d01(ks2Var, wr2Var, a32Var.f5000a), new fd1(e52Var, null), new vw0(wr2Var.f16870c0));
        e52Var.b(uw0VarA.b());
        ((v42) a32Var.f5002c).P5(uw0VarA.f());
        return uw0VarA.h();
    }
}
