package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class n72 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f11713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f11714b;

    public n72(w84 w84Var, w84 w84Var2) {
        this.f11713a = w84Var;
        this.f11714b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m72 k() {
        return new m72((Context) this.f11713a.k(), (pm1) this.f11714b.k());
    }
}
