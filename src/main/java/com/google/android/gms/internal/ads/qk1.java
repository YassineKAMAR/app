package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class qk1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f13537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f13538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f13539c;

    public qk1(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f13537a = w84Var;
        this.f13538b = w84Var2;
        this.f13539c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        return new ok1((Executor) this.f13537a.k(), (pw0) this.f13538b.k(), (ac1) this.f13539c.k());
    }
}
