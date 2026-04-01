package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class cf2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f6331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f6332b;

    public cf2(w84 w84Var, w84 w84Var2) {
        this.f6331a = w84Var;
        this.f6332b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Context contextA = ((io0) this.f6331a).a();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new bf2(contextA, lg3Var);
    }
}
