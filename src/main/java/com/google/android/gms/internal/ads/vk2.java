package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class vk2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f16319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f16320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f16321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f16322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f16323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f16324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f16325g;

    public vk2(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6, w84 w84Var7) {
        this.f16319a = w84Var;
        this.f16320b = w84Var2;
        this.f16321c = w84Var3;
        this.f16322d = w84Var4;
        this.f16323e = w84Var5;
        this.f16324f = w84Var6;
        this.f16325g = w84Var7;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        of0 of0Var = new of0();
        int iIntValue = ((tl2) this.f16320b).k().intValue();
        Context contextA = ((io0) this.f16321c).a();
        zf0 zf0Var = (zf0) this.f16322d.k();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f16323e.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new sk2(of0Var, iIntValue, contextA, zf0Var, scheduledExecutorService, lg3Var, ((sl2) this.f16325g).a());
    }
}
