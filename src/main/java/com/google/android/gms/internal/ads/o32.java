package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class o32 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f12356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f12357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f12358c;

    public o32(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f12356a = w84Var;
        this.f12357b = w84Var2;
        this.f12358c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Context context = (Context) this.f12356a.k();
        xw0 xw0Var = (xw0) this.f12357b.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new n32(context, xw0Var, lg3Var);
    }
}
