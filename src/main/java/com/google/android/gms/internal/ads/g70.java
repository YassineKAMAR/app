package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class g70 implements l2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ p60 f8245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g50 f8246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ l70 f8247c;

    g70(l70 l70Var, p60 p60Var, g50 g50Var) {
        this.f8247c = l70Var;
        this.f8245a = p60Var;
        this.f8246b = g50Var;
    }

    @Override // l2.d
    public final void a(z1.a aVar) {
        try {
            this.f8245a.a(aVar.d());
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
    }
}
