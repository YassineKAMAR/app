package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class cr1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tq1 f6453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f6454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f6455c;

    public cr1(tq1 tq1Var, w84 w84Var, w84 w84Var2) {
        this.f6453a = tq1Var;
        this.f6454b = w84Var;
        this.f6455c = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        dr1 dr1Var = (dr1) this.f6454b.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        Set setI = tq1.i(dr1Var, lg3Var);
        r84.b(setI);
        return setI;
    }
}
