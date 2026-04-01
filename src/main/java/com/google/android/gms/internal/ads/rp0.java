package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
final class rp0 extends dk2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kl2 f14257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zp0 f14258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rp0 f14259c = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f14260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f14261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f14262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f14263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w84 f14264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w84 f14265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w84 f14266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w84 f14267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w84 f14268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final w84 f14269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w84 f14270n;

    /* synthetic */ rp0(zp0 zp0Var, kl2 kl2Var, qp0 qp0Var) {
        this.f14258b = zp0Var;
        this.f14257a = kl2Var;
        ml2 ml2Var = new ml2(kl2Var);
        this.f14260d = ml2Var;
        w84 w84VarB = i84.b(cp1.a());
        this.f14261e = w84VarB;
        w84 w84VarB2 = i84.b(ap1.a());
        this.f14262f = w84VarB2;
        w84 w84VarB3 = i84.b(ep1.a());
        this.f14263g = w84VarB3;
        w84 w84VarB4 = i84.b(gp1.a());
        this.f14264h = w84VarB4;
        m84 m84VarB = n84.b(4);
        m84VarB.b(vw2.GMS_SIGNALS, w84VarB);
        m84VarB.b(vw2.BUILD_URL, w84VarB2);
        m84VarB.b(vw2.HTTP, w84VarB3);
        m84VarB.b(vw2.PRE_PROCESS, w84VarB4);
        n84 n84VarC = m84VarB.c();
        this.f14265i = n84VarC;
        w84 w84VarB5 = i84.b(new hp1(ml2Var, zp0Var.f18324h, vv2.a(), n84VarC));
        this.f14266j = w84VarB5;
        t84 t84VarA = u84.a(0, 1);
        t84VarA.a(w84VarB5);
        u84 u84VarC = t84VarA.c();
        this.f14267k = u84VarC;
        ex2 ex2Var = new ex2(u84VarC);
        this.f14268l = ex2Var;
        this.f14269m = i84.b(new dx2(vv2.a(), zp0Var.f18336n, ex2Var));
        this.f14270n = i84.b(new ry2(zp0Var.H));
    }

    @Override // com.google.android.gms.internal.ads.dk2
    public final ri2 a() {
        Context contextA = this.f14258b.f18312b.a();
        r84.b(contextA);
        lf0 lf0Var = new lf0();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        el2 el2Var = new el2(lf0Var, lg3Var, ll2.a(this.f14257a));
        r84.b(lg3Var);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f14258b.f18336n.k();
        qy2 qy2Var = (qy2) this.f14270n.k();
        eq1 eq1Var = (eq1) this.f14258b.f18311a0.k();
        HashSet hashSet = new HashSet();
        hashSet.add(new vg2(el2Var, 0L, scheduledExecutorService));
        return new ri2(contextA, lg3Var, hashSet, qy2Var, eq1Var);
    }

    @Override // com.google.android.gms.internal.ads.dk2
    public final bx2 b() {
        return (bx2) this.f14269m.k();
    }
}
