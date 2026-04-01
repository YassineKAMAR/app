package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class r12 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f13864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f13865b;

    public r12(w84 w84Var, w84 w84Var2) {
        this.f13864a = w84Var;
        this.f13865b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Context contextA = ((io0) this.f13864a).a();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new q12(contextA, lg3Var);
    }
}
