package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class h62 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f8645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f8646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f8647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f8648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f8649e;

    public h62(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5) {
        this.f8645a = w84Var;
        this.f8646b = w84Var2;
        this.f8647c = w84Var3;
        this.f8648d = w84Var4;
        this.f8649e = w84Var5;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final e62 k() {
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new e62(lg3Var, (ScheduledExecutorService) this.f8646b.k(), (rz0) this.f8647c.k(), (v62) this.f8648d.k(), (fz2) this.f8649e.k());
    }
}
