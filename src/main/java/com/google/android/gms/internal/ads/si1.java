package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class si1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f14708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f14709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f14710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f14711d;

    public si1(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4) {
        this.f14708a = w84Var;
        this.f14709b = w84Var2;
        this.f14710c = w84Var3;
        this.f14711d = w84Var4;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        qg1 qg1VarA = ((kh1) this.f14708a).a();
        vg1 vg1VarK = ((rf1) this.f14709b).k();
        Executor executor = (Executor) this.f14710c.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new ri1(qg1VarA, vg1VarK, executor, lg3Var);
    }
}
