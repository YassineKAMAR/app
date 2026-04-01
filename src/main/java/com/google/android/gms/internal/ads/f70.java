package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class f70 implements l2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ m60 f7658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g50 f7659b;

    f70(l70 l70Var, m60 m60Var, g50 g50Var) {
        this.f7658a = m60Var;
        this.f7659b = g50Var;
    }

    @Override // l2.d
    public final void a(z1.a aVar) {
        try {
            this.f7658a.a(aVar.d());
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
    }
}
