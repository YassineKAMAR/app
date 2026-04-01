package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class y50 implements l2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g50 f17592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a60 f17593b;

    y50(a60 a60Var, g50 g50Var) {
        this.f17593b = a60Var;
        this.f17592a = g50Var;
    }

    @Override // l2.d
    public final void a(z1.a aVar) {
        try {
            qg0.b(this.f17593b.f5029a.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + aVar.a() + ". ErrorMessage = " + aVar.c() + ". ErrorDomain = " + aVar.b());
            this.f17592a.O2(aVar.d());
            this.f17592a.h1(aVar.a(), aVar.c());
            this.f17592a.F(aVar.a());
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
    }
}
