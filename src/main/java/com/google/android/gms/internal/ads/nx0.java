package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class nx0 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f12269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f12270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f12271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f12272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f12273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f12274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f12275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w84 f12276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w84 f12277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w84 f12278j;

    public nx0(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6, w84 w84Var7, w84 w84Var8, w84 w84Var9, w84 w84Var10) {
        this.f12269a = w84Var;
        this.f12270b = w84Var2;
        this.f12271c = w84Var3;
        this.f12272d = w84Var4;
        this.f12273e = w84Var5;
        this.f12274f = w84Var6;
        this.f12275g = w84Var7;
        this.f12276h = w84Var8;
        this.f12277i = w84Var9;
        this.f12278j = w84Var10;
    }

    public static mx0 b(mz0 mz0Var, Context context, xr2 xr2Var, View view, fm0 fm0Var, lz0 lz0Var, bh1 bh1Var, jc1 jc1Var, c84 c84Var, Executor executor) {
        return new mx0(mz0Var, context, xr2Var, view, fm0Var, lz0Var, bh1Var, jc1Var, c84Var, executor);
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mx0 k() {
        return new mx0(((y11) this.f12269a).k(), (Context) this.f12270b.k(), ((ux0) this.f12271c).a(), ((tx0) this.f12272d).a(), ((fy0) this.f12273e).a(), ((vx0) this.f12274f).a(), ((we1) this.f12275g).a(), (jc1) this.f12276h.k(), i84.a(this.f12277i), (Executor) this.f12278j.k());
    }
}
