package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class ex0 extends nm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dx0 f7528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h2.s0 f7529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final on2 f7530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7531d = ((Boolean) h2.y.c().b(ns.F0)).booleanValue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final eq1 f7532e;

    public ex0(dx0 dx0Var, h2.s0 s0Var, on2 on2Var, eq1 eq1Var) {
        this.f7528a = dx0Var;
        this.f7529b = s0Var;
        this.f7530c = on2Var;
        this.f7532e = eq1Var;
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void Z2(g3.a aVar, vm vmVar) {
        try {
            this.f7530c.n(vmVar);
            this.f7528a.j((Activity) g3.b.H0(aVar), vmVar, this.f7531d);
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.om
    public final h2.s0 m() {
        return this.f7529b;
    }

    @Override // com.google.android.gms.internal.ads.om
    public final h2.m2 n() {
        if (((Boolean) h2.y.c().b(ns.J6)).booleanValue()) {
            return this.f7528a.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void w2(h2.f2 f2Var) {
        a3.o.e("setOnPaidEventListener must be called on the main UI thread.");
        if (this.f7530c != null) {
            try {
                if (!f2Var.n()) {
                    this.f7532e.e();
                }
            } catch (RemoteException e8) {
                qg0.c("Error in making CSI ping for reporting paid event callback", e8);
            }
            this.f7530c.l(f2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void w5(boolean z7) {
        this.f7531d = z7;
    }
}
