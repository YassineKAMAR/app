package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class u42 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f15482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f15483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f15484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f15485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f15486e;

    public u42(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5) {
        this.f15482a = w84Var;
        this.f15483b = w84Var2;
        this.f15484c = w84Var3;
        this.f15485d = w84Var4;
        this.f15486e = w84Var5;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t42 k() {
        hy0 hy0Var = (hy0) this.f15482a.k();
        z32 z32VarK = ((a42) this.f15483b).k();
        i41 i41Var = (i41) this.f15484c.k();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f15485d.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new t42(hy0Var, z32VarK, i41Var, scheduledExecutorService, lg3Var);
    }
}
