package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class c9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f19869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.w1 f19870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ v8 f19871c;

    c9(v8 v8Var, lb lbVar, com.google.android.gms.internal.measurement.w1 w1Var) {
        this.f19871c = v8Var;
        this.f19869a = lbVar;
        this.f19870b = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strY1 = null;
        try {
            try {
                if (this.f19871c.e().J().y()) {
                    p3.i iVar = this.f19871c.f20564d;
                    if (iVar == null) {
                        this.f19871c.t().G().a("Failed to get app instance id");
                    } else {
                        a3.o.j(this.f19869a);
                        strY1 = iVar.Y1(this.f19869a);
                        if (strY1 != null) {
                            this.f19871c.o().R(strY1);
                            this.f19871c.e().f20701g.b(strY1);
                        }
                        this.f19871c.g0();
                    }
                } else {
                    this.f19871c.t().M().a("Analytics storage consent denied; will not get app instance id");
                    this.f19871c.o().R(null);
                    this.f19871c.e().f20701g.b(null);
                }
            } catch (RemoteException e8) {
                this.f19871c.t().G().b("Failed to get app instance id", e8);
            }
        } finally {
            this.f19871c.f().R(this.f19870b, null);
        }
    }
}
