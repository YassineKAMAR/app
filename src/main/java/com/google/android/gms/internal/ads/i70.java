package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class i70 implements l2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ j60 f9085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g50 f9086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ l70 f9087c;

    i70(l70 l70Var, j60 j60Var, g50 g50Var) {
        this.f9087c = l70Var;
        this.f9085a = j60Var;
        this.f9086b = g50Var;
    }

    @Override // l2.d
    public final void a(z1.a aVar) {
        try {
            this.f9085a.a(aVar.d());
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
    }
}
