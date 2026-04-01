package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class uv0 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f15879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f15880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f15881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f15882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f15883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f15884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f15885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w84 f15886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w84 f15887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w84 f15888j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w84 f15889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w84 f15890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final w84 f15891m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w84 f15892n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final w84 f15893o;

    public uv0(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6, w84 w84Var7, w84 w84Var8, w84 w84Var9, w84 w84Var10, w84 w84Var11, w84 w84Var12, w84 w84Var13, w84 w84Var14, w84 w84Var15) {
        this.f15879a = w84Var;
        this.f15880b = w84Var2;
        this.f15881c = w84Var3;
        this.f15882d = w84Var4;
        this.f15883e = w84Var5;
        this.f15884f = w84Var6;
        this.f15885g = w84Var7;
        this.f15886h = w84Var8;
        this.f15887i = w84Var9;
        this.f15888j = w84Var10;
        this.f15889k = w84Var11;
        this.f15890l = w84Var12;
        this.f15891m = w84Var13;
        this.f15892n = w84Var14;
        this.f15893o = w84Var15;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* synthetic */ Object k() {
        Context contextA = ((io0) this.f15879a).a();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new tv0(contextA, lg3Var, (Executor) this.f15881c.k(), (ScheduledExecutorService) this.f15882d.k(), ((h01) this.f15883e).a(), ((e01) this.f15884f).a(), (fz2) this.f15885g.k(), (dt2) this.f15886h.k(), (View) this.f15887i.k(), (fm0) this.f15888j.k(), (gh) this.f15889k.k(), (rt) this.f15890l.k(), new tt(), (qy2) this.f15892n.k(), ((t31) this.f15893o).a());
    }
}
