package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class te0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static te0 f15070a;

    public static synchronized te0 d(Context context) {
        te0 te0Var = f15070a;
        if (te0Var != null) {
            return te0Var;
        }
        Context applicationContext = context.getApplicationContext();
        ns.a(applicationContext);
        j2.x1 x1VarH = g2.t.q().h();
        x1VarH.F(applicationContext);
        xd0 xd0Var = new xd0(null);
        xd0Var.b(applicationContext);
        xd0Var.c(g2.t.b());
        xd0Var.a(x1VarH);
        xd0Var.d(g2.t.p());
        te0 te0VarE = xd0Var.e();
        f15070a = te0VarE;
        te0VarE.a().a();
        f15070a.b().c();
        ye0 ye0VarC = f15070a.c();
        if (((Boolean) h2.y.c().b(ns.f12166q0)).booleanValue()) {
            g2.t.r();
            Map mapV = j2.k2.V((String) h2.y.c().b(ns.f12184s0));
            Iterator it = mapV.keySet().iterator();
            while (it.hasNext()) {
                ye0VarC.c((String) it.next());
            }
            ye0VarC.d(new we0(ye0VarC, mapV));
        }
        return f15070a;
    }

    abstract pd0 a();

    abstract ud0 b();

    abstract ye0 c();
}
