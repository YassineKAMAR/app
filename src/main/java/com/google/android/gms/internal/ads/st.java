package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class st implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f14817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f14818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f14819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f14820d;

    public st(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4) {
        this.f14817a = w84Var;
        this.f14818b = w84Var2;
        this.f14819c = w84Var3;
        this.f14820d = w84Var4;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* synthetic */ Object k() {
        return new rt(((io0) this.f14817a).a(), (ScheduledExecutorService) this.f14818b.k(), new tt(), (qy2) this.f14820d.k());
    }
}
