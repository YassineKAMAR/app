package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class m52 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f11180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f11181b;

    public m52(w84 w84Var, w84 w84Var2) {
        this.f11180a = w84Var;
        this.f11181b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l52 k() {
        return new l52((Context) this.f11180a.k(), (ce1) this.f11181b.k());
    }
}
