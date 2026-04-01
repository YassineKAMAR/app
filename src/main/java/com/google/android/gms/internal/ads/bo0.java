package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class bo0 implements tt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static bo0 f5912a;

    private static synchronized bo0 e(Context context, z40 z40Var, int i8, boolean z7, int i9, hp0 hp0Var) {
        bo0 bo0Var = f5912a;
        if (bo0Var != null) {
            return bo0Var;
        }
        ns.a(context);
        ot2 ot2VarD = ot2.d(context);
        wg0 wg0VarC = ot2VarD.c(233702000, false, i9);
        ot2VarD.f(z40Var);
        wq0 wq0Var = new wq0(null);
        co0 co0Var = new co0();
        co0Var.d(wg0VarC);
        co0Var.c(context);
        wq0Var.b(new eo0(co0Var, null));
        wq0Var.c(new ls0(hp0Var));
        bo0 bo0VarA = wq0Var.a();
        g2.t.q().s(context, wg0VarC);
        g2.t.e().i(context);
        g2.t.r().M(context);
        g2.t.r().L(context);
        j2.u1.a(context);
        g2.t.d().d(context);
        g2.t.x().b(context);
        bo0VarA.f().c();
        te0.d(context);
        if (((Boolean) h2.y.c().b(ns.f12073f6)).booleanValue()) {
            if (!((Boolean) h2.y.c().b(ns.f12201u0)).booleanValue()) {
                vn vnVar = new vn(new bo(context));
                i02 i02Var = new i02(new e02(context), bo0VarA.b());
                g2.t.r();
                new f12(context, wg0VarC, vnVar, i02Var, UUID.randomUUID().toString(), bo0VarA.C()).b(g2.t.q().h().F0());
            }
        }
        f5912a = bo0VarA;
        return bo0VarA;
    }

    public static bo0 g(Context context, z40 z40Var, int i8) {
        return e(context, z40Var, 233702000, false, i8, new hp0());
    }

    public abstract ht2 A();

    public abstract rt2 B();

    public abstract mx2 C();

    public abstract ty2 D();

    @Override // com.google.android.gms.internal.ads.tt0
    public final nj2 a(ya0 ya0Var, int i8) {
        return v(new rl2(ya0Var, i8));
    }

    public abstract lg3 b();

    public abstract Executor c();

    public abstract ScheduledExecutorService d();

    public abstract j2.i1 f();

    public abstract vs0 h();

    public abstract ww0 i();

    public abstract gy0 j();

    public abstract z61 k();

    public abstract be1 l();

    public abstract xe1 m();

    public abstract om1 n();

    public abstract or1 o();

    public abstract ft1 p();

    public abstract au1 q();

    public abstract b22 r();

    public abstract p2.v s();

    public abstract p2.z t();

    public abstract p2.c u();

    protected abstract nj2 v(rl2 rl2Var);

    public abstract nm2 w();

    public abstract fo2 x();

    public abstract zp2 y();

    public abstract pr2 z();
}
