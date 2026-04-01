package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class qd2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f13411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f13412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f13413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f13414d;

    public qd2(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4) {
        this.f13411a = w84Var;
        this.f13412b = w84Var2;
        this.f13413c = w84Var3;
        this.f13414d = w84Var4;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Context contextA = ((io0) this.f13411a).a();
        zf0 zf0Var = (zf0) this.f13412b.k();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f13413c.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new od2(contextA, zf0Var, scheduledExecutorService, lg3Var);
    }
}
