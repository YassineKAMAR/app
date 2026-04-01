package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zx1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f18506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f18507b;

    public zx1(w84 w84Var, w84 w84Var2) {
        this.f18506a = w84Var;
        this.f18507b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wx1 k() {
        return new wx1(((io0) this.f18506a).a(), (ScheduledExecutorService) this.f18507b.k());
    }
}
