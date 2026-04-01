package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class v50 implements l2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g50 f15984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a60 f15985b;

    v50(a60 a60Var, g50 g50Var) {
        this.f15985b = a60Var;
        this.f15984a = g50Var;
    }

    @Override // l2.d
    public final void a(z1.a aVar) {
        try {
            qg0.b(this.f15985b.f5029a.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + aVar.a() + ". ErrorMessage = " + aVar.c() + ". ErrorDomain = " + aVar.b());
            this.f15984a.O2(aVar.d());
            this.f15984a.h1(aVar.a(), aVar.c());
            this.f15984a.F(aVar.a());
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
    }
}
