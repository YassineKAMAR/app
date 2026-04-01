package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class e62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f7140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f7141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rz0 f7142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v62 f7143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fz2 f7144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final tg3 f7145f = tg3.C();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f7146g = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f62 f7147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ks2 f7148i;

    e62(Executor executor, ScheduledExecutorService scheduledExecutorService, rz0 rz0Var, v62 v62Var, fz2 fz2Var) {
        this.f7140a = executor;
        this.f7141b = scheduledExecutorService;
        this.f7142c = rz0Var;
        this.f7143d = v62Var;
        this.f7144e = fz2Var;
    }

    private final synchronized x3.d d(wr2 wr2Var) {
        Iterator it = wr2Var.f16865a.iterator();
        while (it.hasNext()) {
            x22 x22VarF = this.f7142c.f(wr2Var.f16867b, (String) it.next());
            if (x22VarF != null && x22VarF.b(this.f7148i, wr2Var)) {
                return zf3.o(x22VarF.a(this.f7148i, wr2Var), wr2Var.T, TimeUnit.MILLISECONDS, this.f7141b);
            }
        }
        return zf3.g(new gu1(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(wr2 wr2Var) {
        if (wr2Var == null) {
            return;
        }
        x3.d dVarD = d(wr2Var);
        this.f7143d.f(this.f7148i, wr2Var, dVarD, this.f7144e);
        zf3.r(dVarD, new d62(this, wr2Var), this.f7140a);
    }

    public final synchronized x3.d b(ks2 ks2Var) {
        if (!this.f7146g.getAndSet(true)) {
            if (ks2Var.f10323b.f9792a.isEmpty()) {
                this.f7145f.g(new y62(3, b72.d(ks2Var)));
            } else {
                this.f7148i = ks2Var;
                this.f7147h = new f62(ks2Var, this.f7143d, this.f7145f);
                this.f7143d.k(ks2Var.f10323b.f9792a);
                while (this.f7147h.e()) {
                    e(this.f7147h.a());
                }
            }
        }
        return this.f7145f;
    }
}
