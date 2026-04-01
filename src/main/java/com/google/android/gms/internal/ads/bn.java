package com.google.android.gms.internal.ads;

import a3.c;
import android.os.Bundle;
import android.os.DeadObjectException;

/* JADX INFO: loaded from: classes.dex */
final class bn implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ dn f5887a;

    bn(dn dnVar) {
        this.f5887a = dnVar;
    }

    @Override // a3.c.a
    public final void H0(Bundle bundle) {
        dn dnVar;
        synchronized (this.f5887a.f6818c) {
            try {
                dnVar = this.f5887a;
            } catch (DeadObjectException e8) {
                qg0.e("Unable to obtain a cache service instance.", e8);
                dn.h(this.f5887a);
            }
            if (dnVar.f6819d != null) {
                dnVar.f6821f = dnVar.f6819d.k0();
                this.f5887a.f6818c.notifyAll();
            } else {
                this.f5887a.f6818c.notifyAll();
            }
        }
    }

    @Override // a3.c.a
    public final void v0(int i8) {
        synchronized (this.f5887a.f6818c) {
            this.f5887a.f6821f = null;
            this.f5887a.f6818c.notifyAll();
        }
    }
}
