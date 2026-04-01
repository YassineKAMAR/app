package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class e52 implements ke1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wr2 f7128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y60 f7129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z1.b f7130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z41 f7131d = null;

    e52(wr2 wr2Var, y60 y60Var, z1.b bVar) {
        this.f7128a = wr2Var;
        this.f7129b = y60Var;
        this.f7130c = bVar;
    }

    @Override // com.google.android.gms.internal.ads.ke1
    public final void a(boolean z7, Context context, t41 t41Var) throws je1 {
        boolean zT0;
        try {
            z1.b bVar = z1.b.BANNER;
            int iOrdinal = this.f7130c.ordinal();
            if (iOrdinal == 1) {
                zT0 = this.f7129b.t0(g3.b.k3(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 6) {
                        zT0 = this.f7129b.a0(g3.b.k3(context));
                    }
                    throw new je1("Adapter failed to show.");
                }
                zT0 = this.f7129b.l2(g3.b.k3(context));
            }
            if (zT0) {
                if (this.f7131d == null) {
                    return;
                }
                if (((Boolean) h2.y.c().b(ns.f12202u1)).booleanValue() || this.f7128a.f16866a0 != 2) {
                    return;
                }
                this.f7131d.j();
                return;
            }
            throw new je1("Adapter failed to show.");
        } catch (Throwable th) {
            throw new je1(th);
        }
    }

    public final void b(z41 z41Var) {
        this.f7131d = z41Var;
    }
}
