package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class s32 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f14507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f14508b;

    public s32(w84 w84Var, w84 w84Var2) {
        this.f14507a = w84Var;
        this.f14508b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r32 k() {
        return new r32((Context) this.f14507a.k(), (xw0) this.f14508b.k());
    }
}
