package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class dp0 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f6848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f6849b;

    public dp0(w84 w84Var, w84 w84Var2) {
        this.f6848a = w84Var;
        this.f6849b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jb0 k() {
        Context contextA = ((io0) this.f6848a).a();
        ty2 ty2Var = (ty2) this.f6849b.k();
        c40 c40VarB = g2.t.h().b(contextA, wg0.g(), ty2Var);
        v30 v30Var = y30.f17575b;
        c40VarB.a("google.afma.request.getAdDictionary", v30Var, v30Var);
        return new ib0(contextA, g2.t.h().b(contextA, wg0.g(), ty2Var).a("google.afma.sdkConstants.getSdkConstants", v30Var, v30Var));
    }
}
