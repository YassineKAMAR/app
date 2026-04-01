package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class sh1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f14663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f14664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f14665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f14666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f14667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f14668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f14669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w84 f14670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w84 f14671i;

    public sh1(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6, w84 w84Var7, w84 w84Var8, w84 w84Var9) {
        this.f14663a = w84Var;
        this.f14664b = w84Var2;
        this.f14665c = w84Var3;
        this.f14666d = w84Var4;
        this.f14667e = w84Var5;
        this.f14668f = w84Var6;
        this.f14669g = w84Var7;
        this.f14670h = w84Var8;
        this.f14671i = w84Var9;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rh1 k() {
        j2.x1 x1VarK = ((go0) this.f14663a).k();
        ts2 ts2VarA = ((x31) this.f14664b).a();
        vg1 vg1Var = (vg1) this.f14665c.k();
        qg1 qg1VarA = ((kh1) this.f14666d).a();
        di1 di1Var = (di1) this.f14667e.k();
        mi1 mi1Var = (mi1) this.f14668f.k();
        Executor executor = (Executor) this.f14669g.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new rh1(x1VarK, ts2VarA, vg1Var, qg1VarA, di1Var, mi1Var, executor, lg3Var, (ng1) this.f14671i.k());
    }
}
