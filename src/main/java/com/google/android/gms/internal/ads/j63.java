package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class j63 extends a73 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t63 f9502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f9503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ r63 f9504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ s3.i f9505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ l63 f9506f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j63(l63 l63Var, s3.i iVar, t63 t63Var, int i8, r63 r63Var, s3.i iVar2) {
        super(iVar);
        this.f9506f = l63Var;
        this.f9502b = t63Var;
        this.f9503c = i8;
        this.f9504d = r63Var;
        this.f9505e = iVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.w63] */
    @Override // com.google.android.gms.internal.ads.a73
    protected final void a() {
        try {
            ?? E = this.f9506f.f10476a.e();
            t63 t63Var = this.f9502b;
            String str = this.f9506f.f10477b;
            int i8 = this.f9503c;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", t63Var.b());
            bundle.putInt("displayMode", i8);
            bundle.putString("callerPackage", str);
            bundle.putString("appId", t63Var.a());
            E.N1(bundle, new k63(this.f9506f, this.f9504d));
        } catch (RemoteException e8) {
            l63.f10474c.b(e8, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.f9503c), this.f9506f.f10477b);
            this.f9505e.d(new RuntimeException(e8));
        }
    }
}
