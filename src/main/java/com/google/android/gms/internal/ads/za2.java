package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class za2 implements h2.a, hc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h2.c0 f18130a;

    @Override // com.google.android.gms.internal.ads.hc1
    public final synchronized void C() {
    }

    @Override // h2.a
    public final synchronized void Z() {
        h2.c0 c0Var = this.f18130a;
        if (c0Var != null) {
            try {
                c0Var.k();
            } catch (RemoteException e8) {
                qg0.h("Remote Exception at onAdClicked.", e8);
            }
        }
    }

    public final synchronized void a(h2.c0 c0Var) {
        this.f18130a = c0Var;
    }

    @Override // com.google.android.gms.internal.ads.hc1
    public final synchronized void f0() {
        h2.c0 c0Var = this.f18130a;
        if (c0Var != null) {
            try {
                c0Var.k();
            } catch (RemoteException e8) {
                qg0.h("Remote Exception at onPhysicalClick.", e8);
            }
        }
    }
}
