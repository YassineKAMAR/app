package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class h52 implements e32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ce1 f8630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wg0 f8631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f8632d;

    public h52(Context context, wg0 wg0Var, ce1 ce1Var, Executor executor) {
        this.f8629a = context;
        this.f8631c = wg0Var;
        this.f8630b = ce1Var;
        this.f8632d = executor;
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final void a(ks2 ks2Var, wr2 wr2Var, a32 a32Var) throws ys2 {
        qt2 qt2Var = (qt2) a32Var.f5001b;
        ts2 ts2Var = ks2Var.f10322a.f8947a;
        qt2Var.t(this.f8629a, ts2Var.f15302d, wr2Var.f16909x.toString(), j2.y0.l(wr2Var.f16905u), (g50) a32Var.f5002c);
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final /* bridge */ /* synthetic */ Object b(ks2 ks2Var, wr2 wr2Var, final a32 a32Var) {
        bd1 bd1VarC = this.f8630b.c(new d01(ks2Var, wr2Var, a32Var.f5000a), new fd1(new ke1() { // from class: com.google.android.gms.internal.ads.g52
            @Override // com.google.android.gms.internal.ads.ke1
            public final void a(boolean z7, Context context, t41 t41Var) throws je1 {
                this.f8214a.c(a32Var, z7, context, t41Var);
            }
        }, null));
        bd1VarC.c().w0(new xu0((qt2) a32Var.f5001b), this.f8632d);
        ((v42) a32Var.f5002c).P5(bd1VarC.g());
        return bd1VarC.i();
    }

    final /* synthetic */ void c(a32 a32Var, boolean z7, Context context, t41 t41Var) throws je1 {
        try {
            ((qt2) a32Var.f5001b).A(z7);
            if (this.f8631c.f16725c < ((Integer) h2.y.c().b(ns.G0)).intValue()) {
                ((qt2) a32Var.f5001b).C();
            } else {
                ((qt2) a32Var.f5001b).D(context);
            }
        } catch (ys2 e8) {
            qg0.f("Cannot show interstitial.");
            throw new je1(e8.getCause());
        }
    }
}
