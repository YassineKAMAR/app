package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class h70 implements l2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ s60 f8662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g50 f8663b;

    h70(l70 l70Var, s60 s60Var, g50 g50Var) {
        this.f8662a = s60Var;
        this.f8663b = g50Var;
    }

    @Override // l2.d
    public final void a(z1.a aVar) {
        try {
            this.f8662a.a(aVar.d());
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
    }
}
