package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class hv0 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f8982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f8983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f8984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f8985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f8986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f8987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f8988g;

    public hv0(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6, w84 w84Var7) {
        this.f8982a = w84Var;
        this.f8983b = w84Var2;
        this.f8984c = w84Var3;
        this.f8985d = w84Var4;
        this.f8986e = w84Var5;
        this.f8987f = w84Var6;
        this.f8988g = w84Var7;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Context contextA = ((io0) this.f8982a).a();
        j2.x1 x1VarK = ((go0) this.f8983b).k();
        t22 t22Var = (t22) this.f8984c.k();
        ln1 ln1Var = (ln1) this.f8985d.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new gv0(contextA, x1VarK, t22Var, ln1Var, lg3Var, (lg3) this.f8987f.k(), (ScheduledExecutorService) this.f8988g.k());
    }
}
