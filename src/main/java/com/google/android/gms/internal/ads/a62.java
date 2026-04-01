package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class a62 implements e32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ye1 f5041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p50 f5042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wg0 f5043d;

    public a62(Context context, ye1 ye1Var, wg0 wg0Var) {
        this.f5040a = context;
        this.f5041b = ye1Var;
        this.f5043d = wg0Var;
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final void a(ks2 ks2Var, wr2 wr2Var, a32 a32Var) throws ys2 {
        try {
            ((y60) a32Var.f5001b).j5(wr2Var.f16868b0);
            y52 y52Var = null;
            if (this.f5043d.f16725c < ((Integer) h2.y.c().b(ns.F1)).intValue()) {
                ((y60) a32Var.f5001b).U1(wr2Var.W, wr2Var.f16909x.toString(), ks2Var.f10322a.f8947a.f15302d, g3.b.k3(this.f5040a), new z52(this, a32Var, y52Var), (g50) a32Var.f5002c);
            } else {
                ((y60) a32Var.f5001b).F2(wr2Var.W, wr2Var.f16909x.toString(), ks2Var.f10322a.f8947a.f15302d, g3.b.k3(this.f5040a), new z52(this, a32Var, y52Var), (g50) a32Var.f5002c, ks2Var.f10322a.f8947a.f15307i);
            }
        } catch (RemoteException e8) {
            throw new ys2(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final /* bridge */ /* synthetic */ Object b(ks2 ks2Var, wr2 wr2Var, a32 a32Var) throws y62 {
        if (!ks2Var.f10322a.f8947a.f15305g.contains(Integer.toString(6))) {
            throw new y62(2, "Unified must be used for RTB.");
        }
        qg1 qg1VarG0 = qg1.g0(this.f5042c);
        ts2 ts2Var = ks2Var.f10322a.f8947a;
        if (!ts2Var.f15305g.contains(Integer.toString(qg1VarG0.P()))) {
            throw new y62(1, "No corresponding native ad listener");
        }
        sg1 sg1VarD = this.f5041b.d(new d01(ks2Var, wr2Var, a32Var.f5000a), new ch1(qg1VarG0), new vi1(null, null, this.f5042c));
        ((v42) a32Var.f5002c).P5(sg1VarD.f());
        return sg1VarD.h();
    }
}
