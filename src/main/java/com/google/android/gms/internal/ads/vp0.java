package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
final class vp0 extends fk2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sj2 f16395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zp0 f16396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vp0 f16397c = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f16398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f16399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f16400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f16401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w84 f16402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w84 f16403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w84 f16404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w84 f16405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w84 f16406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final w84 f16407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w84 f16408n;

    /* synthetic */ vp0(zp0 zp0Var, sj2 sj2Var, up0 up0Var) {
        this.f16396b = zp0Var;
        this.f16395a = sj2Var;
        this.f16398d = i84.b(new ry2(zp0Var.H));
        bk2 bk2Var = new bk2(sj2Var);
        this.f16399e = bk2Var;
        w84 w84VarB = i84.b(cp1.a());
        this.f16400f = w84VarB;
        w84 w84VarB2 = i84.b(ap1.a());
        this.f16401g = w84VarB2;
        w84 w84VarB3 = i84.b(ep1.a());
        this.f16402h = w84VarB3;
        w84 w84VarB4 = i84.b(gp1.a());
        this.f16403i = w84VarB4;
        m84 m84VarB = n84.b(4);
        m84VarB.b(vw2.GMS_SIGNALS, w84VarB);
        m84VarB.b(vw2.BUILD_URL, w84VarB2);
        m84VarB.b(vw2.HTTP, w84VarB3);
        m84VarB.b(vw2.PRE_PROCESS, w84VarB4);
        n84 n84VarC = m84VarB.c();
        this.f16404j = n84VarC;
        w84 w84VarB5 = i84.b(new hp1(bk2Var, zp0Var.f18324h, vv2.a(), n84VarC));
        this.f16405k = w84VarB5;
        t84 t84VarA = u84.a(0, 1);
        t84VarA.a(w84VarB5);
        u84 u84VarC = t84VarA.c();
        this.f16406l = u84VarC;
        ex2 ex2Var = new ex2(u84VarC);
        this.f16407m = ex2Var;
        this.f16408n = i84.b(new dx2(vv2.a(), zp0Var.f18336n, ex2Var));
    }

    @Override // com.google.android.gms.internal.ads.fk2
    public final ri2 a() {
        Context contextA = this.f16396b.f18312b.a();
        r84.b(contextA);
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        lf0 lf0Var = new lf0();
        r84.b(lg3Var);
        oi2 oi2VarA = bm2.a(new el2(lf0Var, lg3Var, uj2.a(this.f16395a)), og2.a(), (ScheduledExecutorService) this.f16396b.f18336n.k(), 0);
        u80 u80Var = new u80();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f16396b.f18336n.k();
        Context contextA2 = this.f16396b.f18312b.a();
        r84.b(contextA2);
        oi2 oi2VarB = bm2.b(new ol2(u80Var, scheduledExecutorService, contextA2), (ScheduledExecutorService) this.f16396b.f18336n.k());
        of0 of0Var = new of0();
        Context contextA3 = this.f16396b.f18312b.a();
        r84.b(contextA3);
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f16396b.f18336n.k();
        r84.b(lg3Var);
        sj2 sj2Var = this.f16395a;
        oi2 oi2VarA2 = cm2.a(mj2.a(of0Var, contextA3, scheduledExecutorService2, lg3Var, vj2.a(sj2Var), xj2.a(sj2Var), yj2.a(sj2Var)), (ScheduledExecutorService) this.f16396b.f18336n.k());
        r84.b(lg3Var);
        oi2 oi2VarC = bm2.c(new km2(lg3Var), (ScheduledExecutorService) this.f16396b.f18336n.k());
        zl2 zl2Var = zl2.f18283a;
        Context contextA4 = this.f16396b.f18312b.a();
        r84.b(contextA4);
        String strA = uj2.a(this.f16395a);
        r84.b(lg3Var);
        hk2 hk2Var = new hk2(null, contextA4, strA, lg3Var);
        kn knVar = new kn();
        r84.b(lg3Var);
        Context contextA5 = this.f16396b.f18312b.a();
        r84.b(contextA5);
        xr xrVar = new xr();
        r84.b(lg3Var);
        of0 of0Var2 = new of0();
        r84.b(lg3Var);
        sj2 sj2Var2 = this.f16395a;
        of0 of0Var3 = new of0();
        sj2 sj2Var3 = this.f16395a;
        zp0 zp0Var = this.f16396b;
        int iA = vj2.a(sj2Var3);
        Context contextA6 = zp0Var.f18312b.a();
        r84.b(contextA6);
        zf0 zf0Var = (zf0) this.f16396b.f18327i0.k();
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.f16396b.f18336n.k();
        r84.b(lg3Var);
        String strA2 = uj2.a(this.f16395a);
        xm xmVar = new xm();
        zf0 zf0Var2 = (zf0) this.f16396b.f18327i0.k();
        ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) this.f16396b.f18336n.k();
        r84.b(lg3Var);
        return new ri2(contextA, lg3Var, ob3.D(oi2VarA, oi2VarB, oi2VarA2, oi2VarC, zl2Var, hk2Var, new xk2(knVar, lg3Var, contextA5), new il2(xrVar, lg3Var, wj2.a(this.f16395a)), new qj2(of0Var2, lg3Var, zj2.a(sj2Var2), ak2.a(sj2Var2), vj2.a(sj2Var2)), new sk2(of0Var3, iA, contextA6, zf0Var, scheduledExecutorService3, lg3Var, uj2.a(this.f16395a)), (oi2) this.f16396b.L0.k(), ok2.a(strA2, xmVar, zf0Var2, scheduledExecutorService4, lg3Var)), (qy2) this.f16398d.k(), (eq1) this.f16396b.f18311a0.k());
    }

    @Override // com.google.android.gms.internal.ads.fk2
    public final bx2 b() {
        return (bx2) this.f16408n.k();
    }
}
