package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class vh2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg3 f16278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f16279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f16280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ts2 f16281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bo0 f16282f;

    vh2(lg3 lg3Var, ScheduledExecutorService scheduledExecutorService, String str, Context context, ts2 ts2Var, bo0 bo0Var) {
        this.f16278b = lg3Var;
        this.f16279c = scheduledExecutorService;
        this.f16277a = str;
        this.f16280d = context;
        this.f16281e = ts2Var;
        this.f16282f = bo0Var;
    }

    public static /* synthetic */ x3.d a(vh2 vh2Var) {
        String strName = ((Boolean) h2.y.c().b(ns.f12047c7)).booleanValue() ? z1.b.UNKNOWN.name() : vh2Var.f16277a;
        p2.z zVarT = vh2Var.f16282f.t();
        n31 n31Var = new n31();
        n31Var.e(vh2Var.f16280d);
        rs2 rs2Var = new rs2();
        rs2Var.J("adUnitId");
        rs2Var.e(vh2Var.f16281e.f15302d);
        rs2Var.I(new h2.w4());
        rs2Var.O(true);
        n31Var.i(rs2Var.g());
        zVarT.b(n31Var.j());
        p2.e eVar = new p2.e();
        eVar.a(strName);
        zVarT.a(eVar.b());
        new ca1();
        return zf3.e(zf3.m((qf3) zf3.o(qf3.C(zVarT.l().c()), ((Long) h2.y.c().b(ns.f12056d7)).longValue(), TimeUnit.MILLISECONDS, vh2Var.f16279c), new z73() { // from class: com.google.android.gms.internal.ads.sh2
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                p2.o oVar = (p2.o) obj;
                return oVar != null ? new wh2(oVar.f25561a) : new wh2(null);
            }
        }, vh2Var.f16278b), Exception.class, new z73() { // from class: com.google.android.gms.internal.ads.th2
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                qg0.e("", (Exception) obj);
                return new wh2(null);
            }
        }, vh2Var.f16278b);
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return (!((Boolean) h2.y.c().b(ns.f12038b7)).booleanValue() || this.f16281e.f15315q) ? zf3.h(new wh2(null)) : zf3.k(new ef3() { // from class: com.google.android.gms.internal.ads.uh2
            @Override // com.google.android.gms.internal.ads.ef3
            public final x3.d j() {
                return vh2.a(this.f15663a);
            }
        }, this.f16278b);
    }
}
