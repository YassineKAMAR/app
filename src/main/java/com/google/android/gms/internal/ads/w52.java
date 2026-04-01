package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w52 implements e32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ye1 f16644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f16645c;

    public w52(Context context, ye1 ye1Var, Executor executor) {
        this.f16643a = context;
        this.f16644b = ye1Var;
        this.f16645c = executor;
    }

    private static final boolean c(ks2 ks2Var, int i8) {
        return ks2Var.f10322a.f8947a.f15305g.contains(Integer.toString(i8));
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final void a(ks2 ks2Var, wr2 wr2Var, a32 a32Var) throws ys2 {
        qt2 qt2Var = (qt2) a32Var.f5001b;
        ts2 ts2Var = ks2Var.f10322a.f8947a;
        String string = wr2Var.f16909x.toString();
        String strL = j2.y0.l(wr2Var.f16905u);
        g50 g50Var = (g50) a32Var.f5002c;
        ts2 ts2Var2 = ks2Var.f10322a.f8947a;
        qt2Var.u(this.f16643a, ts2Var.f15302d, string, strL, g50Var, ts2Var2.f15307i, ts2Var2.f15305g);
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final /* bridge */ /* synthetic */ Object b(ks2 ks2Var, wr2 wr2Var, a32 a32Var) throws y62, ys2 {
        qg1 qg1VarI;
        l50 l50VarD = ((qt2) a32Var.f5001b).d();
        m50 m50VarE = ((qt2) a32Var.f5001b).e();
        p50 p50VarI = ((qt2) a32Var.f5001b).i();
        if (p50VarI != null && c(ks2Var, 6)) {
            qg1VarI = qg1.g0(p50VarI);
        } else if (l50VarD != null && c(ks2Var, 6)) {
            qg1VarI = qg1.J(l50VarD);
        } else if (l50VarD != null && c(ks2Var, 2)) {
            qg1VarI = qg1.H(l50VarD);
        } else if (m50VarE != null && c(ks2Var, 6)) {
            qg1VarI = qg1.K(m50VarE);
        } else {
            if (m50VarE == null || !c(ks2Var, 1)) {
                throw new y62(1, "No native ad mappers");
            }
            qg1VarI = qg1.I(m50VarE);
        }
        ts2 ts2Var = ks2Var.f10322a.f8947a;
        if (!ts2Var.f15305g.contains(Integer.toString(qg1VarI.P()))) {
            throw new y62(1, "No corresponding native ad listener");
        }
        sg1 sg1VarD = this.f16644b.d(new d01(ks2Var, wr2Var, a32Var.f5000a), new ch1(qg1VarI), new vi1(m50VarE, l50VarD, p50VarI));
        ((v42) a32Var.f5002c).P5(sg1VarD.g());
        sg1VarD.c().w0(new xu0((qt2) a32Var.f5001b), this.f16645c);
        return sg1VarD.h();
    }
}
