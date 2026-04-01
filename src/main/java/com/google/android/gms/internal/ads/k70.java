package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class k70 implements l2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ v60 f9961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g50 f9962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ l70 f9963c;

    k70(l70 l70Var, v60 v60Var, g50 g50Var) {
        this.f9963c = l70Var;
        this.f9961a = v60Var;
        this.f9962b = g50Var;
    }

    @Override // l2.d
    public final void a(z1.a aVar) {
        try {
            this.f9961a.a(aVar.d());
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
    }
}
