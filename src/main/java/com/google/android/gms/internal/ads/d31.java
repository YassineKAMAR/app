package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class d31 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f6553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f6554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f6555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f6556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f6557e;

    public d31(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5) {
        this.f6553a = w84Var;
        this.f6554b = w84Var2;
        this.f6555c = w84Var3;
        this.f6556d = w84Var4;
        this.f6557e = w84Var5;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        z41 z41Var = (z41) this.f6553a.k();
        wr2 wr2VarA = ((e01) this.f6554b).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f6555c.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new c31(z41Var, wr2VarA, scheduledExecutorService, lg3Var, ((f01) this.f6557e).a());
    }
}
