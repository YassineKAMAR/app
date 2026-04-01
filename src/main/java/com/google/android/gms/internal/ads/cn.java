package com.google.android.gms.internal.ads;

import a3.c;

/* JADX INFO: loaded from: classes.dex */
final class cn implements c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ dn f6402a;

    cn(dn dnVar) {
        this.f6402a = dnVar;
    }

    @Override // a3.c.b
    public final void k0(x2.b bVar) {
        synchronized (this.f6402a.f6818c) {
            this.f6402a.f6821f = null;
            dn dnVar = this.f6402a;
            if (dnVar.f6819d != null) {
                dnVar.f6819d = null;
            }
            this.f6402a.f6818c.notifyAll();
        }
    }
}
