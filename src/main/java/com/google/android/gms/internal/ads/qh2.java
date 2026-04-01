package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class qh2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f13481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f13482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f13483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f13484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f13485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f13486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f13487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w84 f13488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w84 f13489i;

    public qh2(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6, w84 w84Var7, w84 w84Var8, w84 w84Var9) {
        this.f13481a = w84Var;
        this.f13482b = w84Var2;
        this.f13483c = w84Var3;
        this.f13484d = w84Var4;
        this.f13485e = w84Var5;
        this.f13486f = w84Var6;
        this.f13487g = w84Var7;
        this.f13488h = w84Var8;
        this.f13489i = w84Var9;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new oh2(lg3Var, (ScheduledExecutorService) this.f13482b.k(), (String) this.f13483c.k(), (q92) this.f13484d.k(), (Context) this.f13485e.k(), ((x31) this.f13486f).a(), (m92) this.f13487g.k(), (xn1) this.f13488h.k(), (ls1) this.f13489i.k());
    }
}
