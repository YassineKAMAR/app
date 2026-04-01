package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class ix0 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f9394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f9395b;

    public ix0(w84 w84Var, w84 w84Var2) {
        this.f9394a = w84Var;
        this.f9395b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z61 k() {
        return new z61((ScheduledExecutorService) this.f9394a.k(), (e3.e) this.f9395b.k());
    }
}
