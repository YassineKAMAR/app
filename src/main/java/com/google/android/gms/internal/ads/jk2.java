package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class jk2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f9673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f9674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f9675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f9676d;

    public jk2(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4) {
        this.f9673a = w84Var;
        this.f9674b = w84Var2;
        this.f9675c = w84Var3;
        this.f9676d = w84Var4;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Context contextA = ((io0) this.f9674b).a();
        String strA = ((sl2) this.f9675c).a();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new hk2(null, contextA, strA, lg3Var);
    }
}
