package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class uq1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tq1 f15810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f15811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f15812c;

    public uq1(tq1 tq1Var, w84 w84Var, w84 w84Var2) {
        this.f15810a = tq1Var;
        this.f15811b = w84Var;
        this.f15812c = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        dr1 dr1Var = (dr1) this.f15811b.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        Set setA = tq1.a(dr1Var, lg3Var);
        r84.b(setA);
        return setA;
    }
}
