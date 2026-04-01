package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f6078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f6079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x3.d f6080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f6081d = true;

    public c01(Executor executor, ScheduledExecutorService scheduledExecutorService, x3.d dVar) {
        this.f6078a = executor;
        this.f6079b = scheduledExecutorService;
        this.f6080c = dVar;
    }

    static /* bridge */ /* synthetic */ void b(final c01 c01Var, List list, final vf3 vf3Var) {
        if (list == null || list.isEmpty()) {
            c01Var.f6078a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xz0
                @Override // java.lang.Runnable
                public final void run() {
                    vf3Var.a(new gu1(3));
                }
            });
            return;
        }
        x3.d dVarH = zf3.h(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final x3.d dVar = (x3.d) it.next();
            dVarH = zf3.n(zf3.f(dVarH, Throwable.class, new gf3() { // from class: com.google.android.gms.internal.ads.yz0
                @Override // com.google.android.gms.internal.ads.gf3
                public final x3.d a(Object obj) {
                    vf3Var.a((Throwable) obj);
                    return zf3.h(null);
                }
            }, c01Var.f6078a), new gf3() { // from class: com.google.android.gms.internal.ads.zz0
                @Override // com.google.android.gms.internal.ads.gf3
                public final x3.d a(Object obj) {
                    return this.f18518a.a(vf3Var, dVar, (nz0) obj);
                }
            }, c01Var.f6078a);
        }
        zf3.r(dVarH, new b01(c01Var, vf3Var), c01Var.f6078a);
    }

    final /* synthetic */ x3.d a(vf3 vf3Var, x3.d dVar, nz0 nz0Var) {
        if (nz0Var != null) {
            vf3Var.b(nz0Var);
        }
        return zf3.o(dVar, ((Long) wu.f16949b.e()).longValue(), TimeUnit.MILLISECONDS, this.f6079b);
    }

    final /* synthetic */ void d() {
        this.f6081d = false;
    }

    public final void e(vf3 vf3Var) {
        zf3.r(this.f6080c, new a01(this, vf3Var), this.f6078a);
    }

    public final boolean f() {
        return this.f6081d;
    }
}
