package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class lv1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f11066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f11067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f11068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f11069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f11070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f11071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f11072g;

    public lv1(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6, w84 w84Var7) {
        this.f11066a = w84Var;
        this.f11067b = w84Var2;
        this.f11068c = w84Var3;
        this.f11069d = w84Var4;
        this.f11070e = w84Var5;
        this.f11071f = w84Var6;
        this.f11072g = w84Var7;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Context contextA = ((io0) this.f11066a).a();
        ts2 ts2VarA = ((x31) this.f11067b).a();
        ku1 ku1VarK = ((lu1) this.f11068c).k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new kv1(contextA, ts2VarA, ku1VarK, lg3Var, (ScheduledExecutorService) this.f11070e.k(), (m02) this.f11071f.k(), (qy2) this.f11072g.k());
    }
}
