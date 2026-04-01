package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class w41 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f16627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f16628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f16629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f16630d;

    public w41(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4) {
        this.f16627a = w84Var;
        this.f16628b = w84Var2;
        this.f16629c = w84Var3;
        this.f16630d = w84Var4;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        s41 s41VarK = ((u41) this.f16627a).k();
        Set setK = ((u84) this.f16628b).k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new t41(s41VarK, setK, lg3Var, (ScheduledExecutorService) this.f16630d.k());
    }
}
