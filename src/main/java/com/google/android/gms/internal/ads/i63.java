package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class i63 extends a73 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c63 f9080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ r63 f9081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ s3.i f9082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ l63 f9083e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i63(l63 l63Var, s3.i iVar, c63 c63Var, r63 r63Var, s3.i iVar2) {
        super(iVar);
        this.f9083e = l63Var;
        this.f9080b = c63Var;
        this.f9081c = r63Var;
        this.f9082d = iVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.w63] */
    @Override // com.google.android.gms.internal.ads.a73
    protected final void a() {
        try {
            ?? E = this.f9083e.f10476a.e();
            c63 c63Var = this.f9080b;
            String str = this.f9083e.f10477b;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", c63Var.b());
            bundle.putString("callerPackage", str);
            bundle.putString("appId", c63Var.a());
            E.d3(bundle, new k63(this.f9083e, this.f9081c));
        } catch (RemoteException e8) {
            l63.f10474c.b(e8, "dismiss overlay display from: %s", this.f9083e.f10477b);
            this.f9082d.d(new RuntimeException(e8));
        }
    }
}
