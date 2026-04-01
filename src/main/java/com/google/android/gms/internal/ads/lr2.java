package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class lr2 implements r2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h2.c2 f11017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ nr2 f11018b;

    lr2(nr2 nr2Var, h2.c2 c2Var) {
        this.f11018b = nr2Var;
        this.f11017a = c2Var;
    }

    @Override // r2.a
    public final void h() {
        if (this.f11018b.f12018i != null) {
            try {
                this.f11017a.m();
            } catch (RemoteException e8) {
                qg0.i("#007 Could not call remote method.", e8);
            }
        }
    }
}
