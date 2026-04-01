package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c21 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f6116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f6117b;

    public c21(w84 w84Var, w84 w84Var2) {
        this.f6116a = w84Var;
        this.f6117b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        return new yb1((s81) this.f6116a.k(), (Executor) this.f6117b.k());
    }
}
