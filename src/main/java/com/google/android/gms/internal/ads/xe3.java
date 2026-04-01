package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
abstract class xe3 extends df3 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Logger f17196o = Logger.getLogger(xe3.class.getName());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private eb3 f17197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f17198m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f17199n;

    xe3(eb3 eb3Var, boolean z7, boolean z8) {
        super(eb3Var.size());
        this.f17197l = eb3Var;
        this.f17198m = z7;
        this.f17199n = z8;
    }

    private final void K(int i8, Future future) {
        try {
            P(i8, zf3.p(future));
        } catch (Error e8) {
            e = e8;
            M(e);
        } catch (RuntimeException e9) {
            e = e9;
            M(e);
        } catch (ExecutionException e10) {
            M(e10.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void T(eb3 eb3Var) {
        int iC = C();
        int i8 = 0;
        l83.j(iC >= 0, "Less than 0 remaining futures");
        if (iC == 0) {
            if (eb3Var != null) {
                kd3 it = eb3Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        K(i8, future);
                    }
                    i8++;
                }
            }
            H();
            Q();
            U(2);
        }
    }

    private final void M(Throwable th) {
        th.getClass();
        if (this.f17198m && !g(th) && O(E(), th)) {
            N(th);
        } else if (th instanceof Error) {
            N(th);
        }
    }

    private static void N(Throwable th) {
        f17196o.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean O(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.df3
    final void I(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thA = a();
        thA.getClass();
        O(set, thA);
    }

    abstract void P(int i8, Object obj);

    abstract void Q();

    final void R() {
        eb3 eb3Var = this.f17197l;
        eb3Var.getClass();
        if (eb3Var.isEmpty()) {
            Q();
            return;
        }
        if (!this.f17198m) {
            final eb3 eb3Var2 = this.f17199n ? this.f17197l : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.we3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16706a.T(eb3Var2);
                }
            };
            kd3 it = this.f17197l.iterator();
            while (it.hasNext()) {
                ((x3.d) it.next()).c(runnable, nf3.INSTANCE);
            }
            return;
        }
        kd3 it2 = this.f17197l.iterator();
        final int i8 = 0;
        while (it2.hasNext()) {
            final x3.d dVar = (x3.d) it2.next();
            dVar.c(new Runnable() { // from class: com.google.android.gms.internal.ads.ve3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16122a.S(dVar, i8);
                }
            }, nf3.INSTANCE);
            i8++;
        }
    }

    final /* synthetic */ void S(x3.d dVar, int i8) {
        try {
            if (dVar.isCancelled()) {
                this.f17197l = null;
                cancel(false);
            } else {
                K(i8, dVar);
            }
        } finally {
            T(null);
        }
    }

    void U(int i8) {
        this.f17197l = null;
    }

    @Override // com.google.android.gms.internal.ads.le3
    protected final String d() {
        eb3 eb3Var = this.f17197l;
        return eb3Var != null ? "futures=".concat(eb3Var.toString()) : super.d();
    }

    @Override // com.google.android.gms.internal.ads.le3
    protected final void e() {
        eb3 eb3Var = this.f17197l;
        U(1);
        if ((eb3Var != null) && isCancelled()) {
            boolean zV = v();
            kd3 it = eb3Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zV);
            }
        }
    }
}
