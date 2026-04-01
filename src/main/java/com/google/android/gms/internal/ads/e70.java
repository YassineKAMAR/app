package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class e70 implements l2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ m60 f7160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g50 f7161b;

    e70(l70 l70Var, m60 m60Var, g50 g50Var) {
        this.f7160a = m60Var;
        this.f7161b = g50Var;
    }

    @Override // l2.d
    public final void a(z1.a aVar) {
        try {
            this.f7160a.a(aVar.d());
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
    }
}
