package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class y02 implements cx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m02 f17535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q02 f17536b;

    y02(m02 m02Var, q02 q02Var) {
        this.f17535a = m02Var;
        this.f17536b = q02Var;
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void C(vw2 vw2Var, String str) {
        if (((Boolean) h2.y.c().b(ns.f12073f6)).booleanValue()) {
            if (vw2.RENDERER == vw2Var) {
                this.f17535a.g(g2.t.b().b());
                return;
            }
            if (vw2.PRELOADED_LOADER == vw2Var || vw2.SERVER_TRANSACTION == vw2Var) {
                this.f17535a.h(g2.t.b().b());
                final q02 q02Var = this.f17536b;
                final long jD = this.f17535a.d();
                q02Var.f15949b.a(new dw2() { // from class: com.google.android.gms.internal.ads.p02
                    @Override // com.google.android.gms.internal.ads.dw2
                    public final Object a(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (q02Var.a()) {
                            return null;
                        }
                        long j8 = jD;
                        gq gqVarU = hq.U();
                        gqVarU.B(j8);
                        byte[] bArrG = ((hq) gqVarU.q()).g();
                        x02.g(sQLiteDatabase, false, false);
                        x02.d(sQLiteDatabase, j8, bArrG);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void e(vw2 vw2Var, String str) {
        if (((Boolean) h2.y.c().b(ns.f12073f6)).booleanValue() && vw2.RENDERER == vw2Var && this.f17535a.c() != 0) {
            this.f17535a.f(g2.t.b().b() - this.f17535a.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void h(vw2 vw2Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void o(vw2 vw2Var, String str, Throwable th) {
        if (((Boolean) h2.y.c().b(ns.f12073f6)).booleanValue() && vw2.RENDERER == vw2Var && this.f17535a.c() != 0) {
            this.f17535a.f(g2.t.b().b() - this.f17535a.c());
        }
    }
}
