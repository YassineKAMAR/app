package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class im2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f9281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f9282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f9283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f9284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f9285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f9286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f9287g;

    public im2(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6, w84 w84Var7) {
        this.f9281a = w84Var;
        this.f9282b = w84Var2;
        this.f9283c = w84Var3;
        this.f9284d = w84Var4;
        this.f9285e = w84Var5;
        this.f9286f = w84Var6;
        this.f9287g = w84Var7;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        zf0 zf0Var = (zf0) this.f9281a.k();
        boolean zBooleanValue = ((wl2) this.f9282b).k().booleanValue();
        boolean zBooleanValue2 = ((xl2) this.f9283c).k().booleanValue();
        mf0 mf0Var = new mf0();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new gm2(zf0Var, zBooleanValue, zBooleanValue2, mf0Var, lg3Var, ((sl2) this.f9286f).a(), (ScheduledExecutorService) this.f9287g.k());
    }
}
