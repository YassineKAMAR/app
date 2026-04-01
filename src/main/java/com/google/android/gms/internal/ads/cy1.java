package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class cy1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f6506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f6507b;

    public cy1(w84 w84Var, w84 w84Var2) {
        this.f6506a = w84Var;
        this.f6507b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final by1 k() {
        return new by1(((io0) this.f6506a).a(), (ScheduledExecutorService) this.f6507b.k());
    }
}
