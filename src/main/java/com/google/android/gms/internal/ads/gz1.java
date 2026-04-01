package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class gz1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f8567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f8568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f8569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f8570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f8571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f8572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f8573g;

    public gz1(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6, w84 w84Var7) {
        this.f8567a = w84Var;
        this.f8568b = w84Var2;
        this.f8569c = w84Var3;
        this.f8570d = w84Var4;
        this.f8571e = w84Var5;
        this.f8572f = w84Var6;
        this.f8573g = w84Var7;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.ek2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.ck2, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.w84
    public final /* synthetic */ Object k() {
        Context contextA = ((io0) this.f8567a).a();
        w84 w84Var = this.f8569c;
        ?? K = this.f8568b.k();
        ?? K2 = w84Var.k();
        kz1 kz1Var = new kz1();
        nz1 nz1VarK = ((oz1) this.f8571e).k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new fz1(contextA, K, K2, kz1Var, nz1VarK, lg3Var, new kb0());
    }
}
