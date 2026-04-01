package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class wr1 implements fr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f16862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kr1 f16863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nr2 f16864c;

    wr1(long j8, Context context, kr1 kr1Var, bo0 bo0Var, String str) {
        this.f16862a = j8;
        this.f16863b = kr1Var;
        pr2 pr2VarZ = bo0Var.z();
        pr2VarZ.b(context);
        pr2VarZ.a(str);
        this.f16864c = pr2VarZ.l().j();
    }

    @Override // com.google.android.gms.internal.ads.fr1
    public final void a(h2.r4 r4Var) {
        try {
            this.f16864c.x2(r4Var, new ur1(this));
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.fr1
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.fr1
    public final void l() {
        try {
            this.f16864c.S2(new vr1(this));
            this.f16864c.j0(g3.b.k3(null));
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }
}
