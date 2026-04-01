package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class sc0 implements r2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fc0 f14603a;

    public sc0(fc0 fc0Var) {
        this.f14603a = fc0Var;
    }

    @Override // r2.b
    public final int a() {
        fc0 fc0Var = this.f14603a;
        if (fc0Var != null) {
            try {
                return fc0Var.m();
            } catch (RemoteException e8) {
                qg0.h("Could not forward getAmount to RewardItem", e8);
            }
        }
        return 0;
    }

    @Override // r2.b
    public final String getType() {
        fc0 fc0Var = this.f14603a;
        if (fc0Var != null) {
            try {
                return fc0Var.n();
            } catch (RemoteException e8) {
                qg0.h("Could not forward getType to RewardItem", e8);
            }
        }
        return null;
    }
}
