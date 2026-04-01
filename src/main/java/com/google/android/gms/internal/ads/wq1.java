package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wq1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tq1 f16857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f16858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f16859c;

    public wq1(tq1 tq1Var, w84 w84Var, w84 w84Var2) {
        this.f16857a = tq1Var;
        this.f16858b = w84Var;
        this.f16859c = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        dr1 dr1Var = (dr1) this.f16858b.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        Set setC = tq1.c(dr1Var, lg3Var);
        r84.b(setC);
        return setC;
    }
}
