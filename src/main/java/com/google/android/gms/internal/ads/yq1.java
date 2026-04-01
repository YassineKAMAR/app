package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class yq1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tq1 f17899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f17900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f17901c;

    public yq1(tq1 tq1Var, w84 w84Var, w84 w84Var2) {
        this.f17899a = tq1Var;
        this.f17900b = w84Var;
        this.f17901c = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        dr1 dr1Var = (dr1) this.f17900b.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        Set setE = tq1.e(dr1Var, lg3Var);
        r84.b(setE);
        return setE;
    }
}
