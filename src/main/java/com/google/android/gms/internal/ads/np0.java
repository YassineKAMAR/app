package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
final class np0 extends nj2 {
    private final w84 A;
    private final w84 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rl2 f11940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zp0 f11941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final np0 f11942c = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f11943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f11944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f11945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f11946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w84 f11947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w84 f11948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w84 f11949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w84 f11950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w84 f11951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final w84 f11952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w84 f11953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final w84 f11954o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final w84 f11955p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final w84 f11956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final w84 f11957r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final w84 f11958s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final w84 f11959t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final w84 f11960u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final w84 f11961v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final w84 f11962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final w84 f11963x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final w84 f11964y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final w84 f11965z;

    /* synthetic */ np0(zp0 zp0Var, rl2 rl2Var, mp0 mp0Var) {
        this.f11941b = zp0Var;
        this.f11940a = rl2Var;
        this.f11943d = i84.b(new ry2(zp0Var.H));
        tl2 tl2Var = new tl2(rl2Var);
        this.f11944e = tl2Var;
        ul2 ul2Var = new ul2(rl2Var);
        this.f11945f = ul2Var;
        xl2 xl2Var = new xl2(rl2Var);
        this.f11946g = xl2Var;
        this.f11947h = new mj2(ot0.f12635a, zp0Var.f18324h, zp0Var.f18336n, vv2.a(), tl2Var, ul2Var, xl2Var);
        sl2 sl2Var = new sl2(rl2Var);
        this.f11948i = sl2Var;
        this.f11949j = new jk2(xo0.f17408a, zp0Var.f18324h, sl2Var, vv2.a());
        this.f11950k = new vk2(ot0.f12635a, tl2Var, zp0Var.f18324h, zp0Var.f18327i0, zp0Var.f18336n, vv2.a(), sl2Var);
        this.f11951l = new zk2(ht0.f8974a, vv2.a(), zp0Var.f18324h);
        this.f11952m = new gl2(jt0.f9800a, vv2.a(), sl2Var);
        this.f11953n = new ql2(mt0.f11537a, zp0Var.f18336n, zp0Var.f18324h);
        this.f11954o = new mm2(vv2.a());
        wl2 wl2Var = new wl2(rl2Var);
        this.f11955p = wl2Var;
        this.f11956q = new im2(zp0Var.f18327i0, wl2Var, xl2Var, qt0.f13761a, vv2.a(), sl2Var, zp0Var.f18336n);
        this.f11957r = new ok2(sl2Var, ft0.f8016a, zp0Var.f18327i0, zp0Var.f18336n, vv2.a());
        yl2 yl2Var = new yl2(rl2Var);
        this.f11958s = yl2Var;
        w84 w84VarB = i84.b(cp1.a());
        this.f11959t = w84VarB;
        w84 w84VarB2 = i84.b(ap1.a());
        this.f11960u = w84VarB2;
        w84 w84VarB3 = i84.b(ep1.a());
        this.f11961v = w84VarB3;
        w84 w84VarB4 = i84.b(gp1.a());
        this.f11962w = w84VarB4;
        m84 m84VarB = n84.b(4);
        m84VarB.b(vw2.GMS_SIGNALS, w84VarB);
        m84VarB.b(vw2.BUILD_URL, w84VarB2);
        m84VarB.b(vw2.HTTP, w84VarB3);
        m84VarB.b(vw2.PRE_PROCESS, w84VarB4);
        n84 n84VarC = m84VarB.c();
        this.f11963x = n84VarC;
        w84 w84VarB5 = i84.b(new hp1(yl2Var, zp0Var.f18324h, vv2.a(), n84VarC));
        this.f11964y = w84VarB5;
        t84 t84VarA = u84.a(0, 1);
        t84VarA.a(w84VarB5);
        u84 u84VarC = t84VarA.c();
        this.f11965z = u84VarC;
        ex2 ex2Var = new ex2(u84VarC);
        this.A = ex2Var;
        this.B = i84.b(new dx2(vv2.a(), zp0Var.f18336n, ex2Var));
    }

    private final qj2 e() {
        of0 of0Var = new of0();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        rl2 rl2Var = this.f11940a;
        return new qj2(of0Var, lg3Var, rl2Var.d(), rl2Var.b(), rl2Var.a());
    }

    private final il2 f() {
        xr xrVar = new xr();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        List listF = this.f11940a.f();
        r84.b(listF);
        return new il2(xrVar, lg3Var, listF);
    }

    @Override // com.google.android.gms.internal.ads.nj2
    public final ri2 a() {
        Context contextA = this.f11941b.f18312b.a();
        r84.b(contextA);
        lf0 lf0Var = new lf0();
        mf0 mf0Var = new mf0();
        Object objK = this.f11941b.L0.k();
        w84 w84Var = this.f11957r;
        w84 w84Var2 = this.f11956q;
        w84 w84Var3 = this.f11954o;
        w84 w84Var4 = this.f11953n;
        w84 w84Var5 = this.f11952m;
        w84 w84Var6 = this.f11951l;
        w84 w84Var7 = this.f11950k;
        w84 w84Var8 = this.f11949j;
        w84 w84Var9 = this.f11947h;
        qj2 qj2VarE = e();
        il2 il2VarF = f();
        c84 c84VarA = i84.a(w84Var9);
        c84 c84VarA2 = i84.a(w84Var8);
        c84 c84VarA3 = i84.a(w84Var7);
        c84 c84VarA4 = i84.a(w84Var6);
        c84 c84VarA5 = i84.a(w84Var5);
        c84 c84VarA6 = i84.a(w84Var4);
        c84 c84VarA7 = i84.a(w84Var3);
        c84 c84VarA8 = i84.a(w84Var2);
        c84 c84VarA9 = i84.a(w84Var);
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return dm2.a(contextA, lf0Var, mf0Var, objK, qj2VarE, il2VarF, c84VarA, c84VarA2, c84VarA3, c84VarA4, c84VarA5, c84VarA6, c84VarA7, c84VarA8, c84VarA9, lg3Var, (qy2) this.f11943d.k(), (eq1) this.f11941b.f18311a0.k());
    }

    @Override // com.google.android.gms.internal.ads.nj2
    public final ri2 b() {
        Context contextA = this.f11941b.f18312b.a();
        r84.b(contextA);
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        lf0 lf0Var = new lf0();
        r84.b(lg3Var);
        String strC = this.f11940a.c();
        r84.b(strC);
        oi2 oi2VarA = bm2.a(new el2(lf0Var, lg3Var, strC), og2.a(), (ScheduledExecutorService) this.f11941b.f18336n.k(), -1);
        u80 u80Var = new u80();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f11941b.f18336n.k();
        Context contextA2 = this.f11941b.f18312b.a();
        r84.b(contextA2);
        oi2 oi2VarB = bm2.b(new ol2(u80Var, scheduledExecutorService, contextA2), (ScheduledExecutorService) this.f11941b.f18336n.k());
        of0 of0Var = new of0();
        Context contextA3 = this.f11941b.f18312b.a();
        r84.b(contextA3);
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f11941b.f18336n.k();
        r84.b(lg3Var);
        rl2 rl2Var = this.f11940a;
        oi2 oi2VarA2 = cm2.a(mj2.a(of0Var, contextA3, scheduledExecutorService2, lg3Var, rl2Var.a(), ul2.b(rl2Var), xl2.b(rl2Var)), (ScheduledExecutorService) this.f11941b.f18336n.k());
        r84.b(lg3Var);
        oi2 oi2VarC = bm2.c(new km2(lg3Var), (ScheduledExecutorService) this.f11941b.f18336n.k());
        zl2 zl2Var = zl2.f18283a;
        Context contextA4 = this.f11941b.f18312b.a();
        r84.b(contextA4);
        String strC2 = this.f11940a.c();
        r84.b(strC2);
        r84.b(lg3Var);
        hk2 hk2Var = new hk2(null, contextA4, strC2, lg3Var);
        kn knVar = new kn();
        r84.b(lg3Var);
        Context contextA5 = this.f11941b.f18312b.a();
        r84.b(contextA5);
        of0 of0Var2 = new of0();
        rl2 rl2Var2 = this.f11940a;
        zp0 zp0Var = this.f11941b;
        int iA = rl2Var2.a();
        Context contextA6 = zp0Var.f18312b.a();
        r84.b(contextA6);
        zf0 zf0Var = (zf0) this.f11941b.f18327i0.k();
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.f11941b.f18336n.k();
        r84.b(lg3Var);
        String strC3 = this.f11940a.c();
        r84.b(strC3);
        String strC4 = this.f11940a.c();
        r84.b(strC4);
        xm xmVar = new xm();
        zf0 zf0Var2 = (zf0) this.f11941b.f18327i0.k();
        ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) this.f11941b.f18336n.k();
        r84.b(lg3Var);
        return new ri2(contextA, lg3Var, ob3.D(oi2VarA, oi2VarB, oi2VarA2, oi2VarC, zl2Var, hk2Var, new xk2(knVar, lg3Var, contextA5), f(), e(), new sk2(of0Var2, iA, contextA6, zf0Var, scheduledExecutorService3, lg3Var, strC3), (oi2) this.f11941b.L0.k(), ok2.a(strC4, xmVar, zf0Var2, scheduledExecutorService4, lg3Var)), (qy2) this.f11943d.k(), (eq1) this.f11941b.f18311a0.k());
    }

    @Override // com.google.android.gms.internal.ads.nj2
    public final bx2 c() {
        return (bx2) this.B.k();
    }

    @Override // com.google.android.gms.internal.ads.nj2
    public final qy2 d() {
        return (qy2) this.f11943d.k();
    }
}
