package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class nx2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f12282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f12283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f12284c;

    public nx2(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f12282a = w84Var;
        this.f12283b = w84Var2;
        this.f12284c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        c84 c84VarA = i84.a(this.f12282a);
        c84 c84VarA2 = i84.a(this.f12283b);
        Object px2Var = ((Boolean) h2.y.c().b(ns.s8)).booleanValue() ? new px2((mx2) c84VarA.k(), (ScheduledExecutorService) this.f12284c.k()) : (mx2) c84VarA2.k();
        r84.b(px2Var);
        return px2Var;
    }
}
