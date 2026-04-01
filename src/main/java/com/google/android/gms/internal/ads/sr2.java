package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class sr2 implements r2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h2.w0 f14800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ tr2 f14801b;

    sr2(tr2 tr2Var, h2.w0 w0Var) {
        this.f14801b = tr2Var;
        this.f14800a = w0Var;
    }

    @Override // r2.a
    public final void h() {
        if (this.f14801b.f15254d != null) {
            try {
                this.f14800a.m();
            } catch (RemoteException e8) {
                qg0.i("#007 Could not call remote method.", e8);
            }
        }
    }
}
