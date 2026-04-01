package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class mj2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f11333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f11334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f11335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f11336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f11337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f11338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f11339g;

    public mj2(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6, w84 w84Var7) {
        this.f11333a = w84Var;
        this.f11334b = w84Var2;
        this.f11335c = w84Var3;
        this.f11336d = w84Var4;
        this.f11337e = w84Var5;
        this.f11338f = w84Var6;
        this.f11339g = w84Var7;
    }

    public static kj2 a(of0 of0Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i8, boolean z7, boolean z8) {
        return new kj2(of0Var, context, scheduledExecutorService, executor, i8, z7, z8);
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        of0 of0Var = new of0();
        Context contextA = ((io0) this.f11334b).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f11335c.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new kj2(of0Var, contextA, scheduledExecutorService, lg3Var, ((tl2) this.f11337e).k().intValue(), ((ul2) this.f11338f).k().booleanValue(), ((xl2) this.f11339g).k().booleanValue());
    }
}
