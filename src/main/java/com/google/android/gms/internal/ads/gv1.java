package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class gv1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f8523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f8524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f8525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f8526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f8527e;

    public gv1(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5) {
        this.f8523a = w84Var;
        this.f8524b = w84Var2;
        this.f8525c = w84Var3;
        this.f8526d = w84Var4;
        this.f8527e = w84Var5;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fv1 k() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f8523a.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        lg3 lg3Var2 = eh0.f7323b;
        r84.b(lg3Var2);
        return new fv1(scheduledExecutorService, lg3Var, lg3Var2, ((yv1) this.f8526d).k(), i84.a(this.f8527e));
    }
}
