package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class h21 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f8603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f8604b;

    public h21(w84 w84Var, w84 w84Var2) {
        this.f8603a = w84Var;
        this.f8604b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        return new yb1((s81) this.f8603a.k(), (Executor) this.f8604b.k());
    }
}
