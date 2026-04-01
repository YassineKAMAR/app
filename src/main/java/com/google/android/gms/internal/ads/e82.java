package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e82 implements e32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f7187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pm1 f7188c;

    public e82(Context context, Executor executor, pm1 pm1Var) {
        this.f7186a = context;
        this.f7187b = executor;
        this.f7188c = pm1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ks2 ks2Var, wr2 wr2Var, a32 a32Var) {
        try {
            ((qt2) a32Var.f5001b).p(ks2Var.f10322a.f8947a.f15302d, wr2Var.f16909x.toString());
        } catch (Exception e8) {
            qg0.h("Fail to load ad from adapter ".concat(String.valueOf(a32Var.f5000a)), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final void a(ks2 ks2Var, wr2 wr2Var, a32 a32Var) throws ys2 {
        if (((qt2) a32Var.f5001b).c()) {
            e(ks2Var, wr2Var, a32Var);
            return;
        }
        ((w42) a32Var.f5002c).Q5(new c82(this, ks2Var, wr2Var, a32Var));
        Object obj = a32Var.f5001b;
        Context context = this.f7186a;
        ts2 ts2Var = ks2Var.f10322a.f8947a;
        ((qt2) obj).m(context, ts2Var.f15302d, null, (ac0) a32Var.f5002c, wr2Var.f16909x.toString());
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final /* bridge */ /* synthetic */ Object b(ks2 ks2Var, wr2 wr2Var, final a32 a32Var) {
        km1 km1VarB = this.f7188c.b(new d01(ks2Var, wr2Var, a32Var.f5000a), new lm1(new ke1() { // from class: com.google.android.gms.internal.ads.a82
            @Override // com.google.android.gms.internal.ads.ke1
            public final void a(boolean z7, Context context, t41 t41Var) throws je1 {
                a32 a32Var2 = a32Var;
                try {
                    ((qt2) a32Var2.f5001b).A(z7);
                    ((qt2) a32Var2.f5001b).a();
                } catch (ys2 e8) {
                    qg0.h("Cannot show rewarded video.", e8);
                    throw new je1(e8.getCause());
                }
            }
        }));
        km1VarB.c().w0(new xu0((qt2) a32Var.f5001b), this.f7187b);
        o51 o51VarD = km1VarB.d();
        e41 e41VarA = km1VarB.a();
        ((w42) a32Var.f5002c).P5(new d82(this, km1VarB.h(), e41VarA, o51VarD, km1VarB.i()));
        return km1VarB.k();
    }
}
