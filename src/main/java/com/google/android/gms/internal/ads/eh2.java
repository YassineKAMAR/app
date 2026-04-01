package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class eh2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f7329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f7330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f7331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f7332d;

    public eh2(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4) {
        this.f7329a = w84Var;
        this.f7330b = w84Var2;
        this.f7331c = w84Var3;
        this.f7332d = w84Var4;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Context contextA = ((io0) this.f7329a).a();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new ch2(contextA, lg3Var, ((x31) this.f7331c).a(), ((uo0) this.f7332d).a());
    }
}
