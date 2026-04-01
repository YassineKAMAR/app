package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ri2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f14144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f14145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qy2 f14146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final eq1 f14147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f14148f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f14149g = 0;

    public ri2(Context context, Executor executor, Set set, qy2 qy2Var, eq1 eq1Var) {
        this.f14143a = context;
        this.f14145c = executor;
        this.f14144b = set;
        this.f14146d = qy2Var;
        this.f14147e = eq1Var;
    }

    public final x3.d a(final Object obj) {
        ey2 ey2VarA = dy2.a(this.f14143a, 8);
        ey2VarA.o();
        final ArrayList arrayList = new ArrayList(this.f14144b.size());
        List arrayList2 = new ArrayList();
        fs fsVar = ns.La;
        if (!((String) h2.y.c().b(fsVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) h2.y.c().b(fsVar)).split(com.amazon.a.a.o.b.f.f3942a));
        }
        this.f14148f = g2.t.b().b();
        for (final oi2 oi2Var : this.f14144b) {
            if (!arrayList2.contains(String.valueOf(oi2Var.j()))) {
                final long jB = g2.t.b().b();
                x3.d dVarK = oi2Var.k();
                dVarK.c(new Runnable() { // from class: com.google.android.gms.internal.ads.pi2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f12900a.b(jB, oi2Var);
                    }
                }, eh0.f7327f);
                arrayList.add(dVarK);
            }
        }
        x3.d dVarA = zf3.b(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.qi2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Iterator it = arrayList.iterator();
                while (true) {
                    Object obj2 = obj;
                    if (!it.hasNext()) {
                        return obj2;
                    }
                    ni2 ni2Var = (ni2) ((x3.d) it.next()).get();
                    if (ni2Var != null) {
                        ni2Var.a(obj2);
                    }
                }
            }
        }, this.f14145c);
        if (ty2.a()) {
            py2.a(dVarA, this.f14146d, ey2VarA);
        }
        return dVarA;
    }

    public final void b(long j8, oi2 oi2Var) {
        long jB = g2.t.b().b() - j8;
        if (((Boolean) mu.f11540a.e()).booleanValue()) {
            j2.v1.k("Signal runtime (ms) : " + b93.c(oi2Var.getClass().getCanonicalName()) + " = " + jB);
        }
        if (((Boolean) h2.y.c().b(ns.Y1)).booleanValue()) {
            dq1 dq1VarA = this.f14147e.a();
            dq1VarA.b("action", "lat_ms");
            dq1VarA.b("lat_grp", "sig_lat_grp");
            dq1VarA.b("lat_id", String.valueOf(oi2Var.j()));
            dq1VarA.b("clat_ms", String.valueOf(jB));
            if (((Boolean) h2.y.c().b(ns.Z1)).booleanValue()) {
                synchronized (this) {
                    this.f14149g++;
                }
                dq1VarA.b("seq_num", g2.t.q().g().d());
                synchronized (this) {
                    if (this.f14149g == this.f14144b.size() && this.f14148f != 0) {
                        this.f14149g = 0;
                        dq1VarA.b((oi2Var.j() <= 39 || oi2Var.j() >= 52) ? "lat_clsg" : "lat_gmssg", String.valueOf(g2.t.b().b() - this.f14148f));
                    }
                }
            }
            dq1VarA.h();
        }
    }
}
