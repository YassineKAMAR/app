package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class i52 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f9067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f9068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f9069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f9070d;

    public i52(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4) {
        this.f9067a = w84Var;
        this.f9068b = w84Var2;
        this.f9069c = w84Var3;
        this.f9070d = w84Var4;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Context context = (Context) this.f9067a.k();
        wg0 wg0VarA = ((uo0) this.f9068b).a();
        ce1 ce1Var = (ce1) this.f9069c.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new h52(context, wg0VarA, ce1Var, lg3Var);
    }
}
