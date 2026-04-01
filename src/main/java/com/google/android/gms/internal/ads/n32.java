package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class n32 implements e32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xw0 f11665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f11666c;

    n32(Context context, xw0 xw0Var, Executor executor) {
        this.f11664a = context;
        this.f11665b = xw0Var;
        this.f11666c = executor;
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final void a(ks2 ks2Var, wr2 wr2Var, a32 a32Var) throws ys2 {
        qt2 qt2Var = (qt2) a32Var.f5001b;
        ts2 ts2Var = ks2Var.f10322a.f8947a;
        qt2Var.q(this.f11664a, ts2Var.f15302d, wr2Var.f16909x.toString(), (g50) a32Var.f5002c);
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final /* bridge */ /* synthetic */ Object b(ks2 ks2Var, wr2 wr2Var, final a32 a32Var) {
        uw0 uw0VarA = this.f11665b.a(new d01(ks2Var, wr2Var, a32Var.f5000a), new fd1(new ke1() { // from class: com.google.android.gms.internal.ads.m32
            @Override // com.google.android.gms.internal.ads.ke1
            public final void a(boolean z7, Context context, t41 t41Var) throws je1 {
                a32 a32Var2 = a32Var;
                try {
                    ((qt2) a32Var2.f5001b).A(z7);
                    ((qt2) a32Var2.f5001b).B(context);
                } catch (ys2 e8) {
                    throw new je1(e8.getCause());
                }
            }
        }, null), new vw0(wr2Var.f16870c0));
        uw0VarA.c().w0(new xu0((qt2) a32Var.f5001b), this.f11666c);
        ((v42) a32Var.f5002c).P5(uw0VarA.g());
        return uw0VarA.h();
    }
}
