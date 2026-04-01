package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class hj2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f8781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f8782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f8783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f8784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f8785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f8786f;

    public hj2(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6) {
        this.f8781a = w84Var;
        this.f8782b = w84Var2;
        this.f8783c = w84Var3;
        this.f8784d = w84Var4;
        this.f8785e = w84Var5;
        this.f8786f = w84Var6;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        j2.x1 x1VarK = ((go0) this.f8781a).k();
        Context contextA = ((io0) this.f8782b).a();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new ej2(x1VarK, contextA, lg3Var, (ScheduledExecutorService) this.f8784d.k(), ((w22) this.f8785e).k(), ((x31) this.f8786f).a());
    }
}
