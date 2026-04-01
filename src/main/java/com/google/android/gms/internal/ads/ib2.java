package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class ib2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bh1 f9129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final va2 f9130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j41 f9131c;

    public ib2(bh1 bh1Var, mx2 mx2Var) {
        this.f9129a = bh1Var;
        final va2 va2Var = new va2(mx2Var);
        this.f9130b = va2Var;
        final b20 b20VarG = bh1Var.g();
        this.f9131c = new j41() { // from class: com.google.android.gms.internal.ads.hb2
            @Override // com.google.android.gms.internal.ads.j41
            public final void A(h2.z2 z2Var) {
                va2Var.A(z2Var);
                b20 b20Var = b20VarG;
                if (b20Var != null) {
                    try {
                        b20Var.a(z2Var);
                    } catch (RemoteException e8) {
                        qg0.i("#007 Could not call remote method.", e8);
                    }
                }
                if (b20Var != null) {
                    try {
                        b20Var.g(z2Var.f22383a);
                    } catch (RemoteException e9) {
                        qg0.i("#007 Could not call remote method.", e9);
                    }
                }
            }
        };
    }

    public final j41 a() {
        return this.f9131c;
    }

    public final v51 b() {
        return this.f9130b;
    }

    public final te1 c() {
        return new te1(this.f9129a, this.f9130b.h());
    }

    public final va2 d() {
        return this.f9130b;
    }

    public final void e(h2.f0 f0Var) {
        this.f9130b.q(f0Var);
    }
}
