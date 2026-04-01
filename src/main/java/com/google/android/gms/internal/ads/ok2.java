package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class ok2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f12518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f12519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f12520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f12521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f12522e;

    public ok2(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5) {
        this.f12518a = w84Var;
        this.f12519b = w84Var2;
        this.f12520c = w84Var3;
        this.f12521d = w84Var4;
        this.f12522e = w84Var5;
    }

    public static mk2 a(String str, xm xmVar, zf0 zf0Var, ScheduledExecutorService scheduledExecutorService, lg3 lg3Var) {
        return new mk2(str, xmVar, zf0Var, scheduledExecutorService, lg3Var);
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        String strA = ((sl2) this.f12518a).a();
        xm xmVar = new xm();
        zf0 zf0Var = (zf0) this.f12520c.k();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f12521d.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new mk2(strA, xmVar, zf0Var, scheduledExecutorService, lg3Var);
    }
}
