package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class g21 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f8160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f8161b;

    public g21(w84 w84Var, w84 w84Var2) {
        this.f8160a = w84Var;
        this.f8161b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        return new yb1((s81) this.f8160a.k(), (Executor) this.f8161b.k());
    }
}
