package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class l42 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f10457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f10458b;

    public l42(w84 w84Var, w84 w84Var2) {
        this.f10457a = w84Var;
        this.f10458b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k42 k() {
        return new k42((Context) this.f10457a.k(), (hy0) this.f10458b.k());
    }
}
