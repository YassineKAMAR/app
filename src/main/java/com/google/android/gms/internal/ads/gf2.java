package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class gf2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f8307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f8308b;

    public gf2(w84 w84Var, w84 w84Var2) {
        this.f8307a = w84Var;
        this.f8308b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Context context = (Context) this.f8307a.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new ef2(context, lg3Var);
    }
}
