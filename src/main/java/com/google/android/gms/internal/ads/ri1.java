package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ri1 implements b51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qg1 f14139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vg1 f14140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f14141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f14142d;

    public ri1(qg1 qg1Var, vg1 vg1Var, Executor executor, Executor executor2) {
        this.f14139a = qg1Var;
        this.f14140b = vg1Var;
        this.f14141c = executor;
        this.f14142d = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final fm0 fm0Var) {
        this.f14141c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.pi1
            @Override // java.lang.Runnable
            public final void run() {
                fm0Var.U("onSdkImpression", new p.a());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.b51
    public final void z() {
        if (this.f14140b.d()) {
            qg1 qg1Var = this.f14139a;
            qz2 qz2VarH0 = qg1Var.h0();
            if (qz2VarH0 == null && qg1Var.j0() != null && ((Boolean) h2.y.c().b(ns.Y4)).booleanValue()) {
                qg1 qg1Var2 = this.f14139a;
                x3.d dVarJ0 = qg1Var2.j0();
                jh0 jh0VarC0 = qg1Var2.c0();
                if (dVarJ0 == null || jh0VarC0 == null) {
                    return;
                }
                zf3.r(zf3.l(dVarJ0, jh0VarC0), new qi1(this), this.f14142d);
                return;
            }
            if (qz2VarH0 == null) {
                return;
            }
            qg1 qg1Var3 = this.f14139a;
            fm0 fm0VarE0 = qg1Var3.e0();
            fm0 fm0VarF0 = qg1Var3.f0();
            if (fm0VarE0 == null) {
                fm0VarE0 = fm0VarF0 != null ? fm0VarF0 : null;
            }
            if (fm0VarE0 != null) {
                b(fm0VarE0);
            }
        }
    }
}
