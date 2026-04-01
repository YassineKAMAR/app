package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class dx2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f7047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f7048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f7049c;

    public dx2(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f7047a = w84Var;
        this.f7048b = w84Var2;
        this.f7049c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new bx2(lg3Var, (ScheduledExecutorService) this.f7048b.k(), ((ex2) this.f7049c).k());
    }
}
